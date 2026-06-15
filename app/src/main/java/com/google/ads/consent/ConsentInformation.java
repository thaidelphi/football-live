package com.google.ads.consent;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import b7.e;
import c7.c;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ConsentInformation {
    private static final String CONSENT_DATA_KEY = "consent_string";
    private static final String MOBILE_ADS_SERVER_URL = "https://adservice.google.com/getconfig/pubvendors";
    private static final String PREFERENCES_FILE_KEY = "mobileads_consent";
    private static final String TAG = "ConsentInformation";
    private static ConsentInformation instance;
    private final Context context;
    private DebugGeography debugGeography = DebugGeography.DEBUG_GEOGRAPHY_DISABLED;
    private List<String> testDevices = new ArrayList();
    private String hashedDeviceId = d();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class AdNetworkLookupResponse {
        @c("company_ids")
        private List<String> companyIds;
        @c("ad_network_id")
        private String id;
        @c("is_npa")
        private boolean isNPA;
        @c("lookup_failed")
        private boolean lookupFailed;
        @c("not_found")
        private boolean notFound;

        private AdNetworkLookupResponse() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class ConsentInfoUpdateResponse {
        String responseInfo;
        boolean success;

        ConsentInfoUpdateResponse(boolean z10, String str) {
            this.success = z10;
            this.responseInfo = str;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class ConsentInfoUpdateTask extends AsyncTask<Void, Void, ConsentInfoUpdateResponse> {
        private static final String UPDATE_SUCCESS = "Consent update successful.";
        private final ConsentInformation consentInformation;
        private final ConsentInfoUpdateListener listener;
        private final List<String> publisherIds;
        private final String url;

        private ConsentInfoUpdateResponse b(String str) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                if (httpURLConnection.getResponseCode() == 200) {
                    String d10 = d(httpURLConnection.getInputStream());
                    httpURLConnection.disconnect();
                    this.consentInformation.n(d10, this.publisherIds);
                    return new ConsentInfoUpdateResponse(true, UPDATE_SUCCESS);
                }
                return new ConsentInfoUpdateResponse(false, httpURLConnection.getResponseMessage());
            } catch (Exception e8) {
                return new ConsentInfoUpdateResponse(false, e8.getLocalizedMessage());
            }
        }

        private String d(InputStream inputStream) {
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            while (true) {
                try {
                    try {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            sb.append(new String(bArr, 0, read));
                        } else {
                            try {
                                break;
                            } catch (IOException e8) {
                                Log.e(ConsentInformation.TAG, e8.getLocalizedMessage());
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e10) {
                            Log.e(ConsentInformation.TAG, e10.getLocalizedMessage());
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    Log.e(ConsentInformation.TAG, e11.getLocalizedMessage());
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e12) {
                        Log.e(ConsentInformation.TAG, e12.getLocalizedMessage());
                    }
                    return null;
                }
            }
            bufferedInputStream.close();
            return sb.toString();
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public ConsentInfoUpdateResponse doInBackground(Void... voidArr) {
            String join = TextUtils.join(",", this.publisherIds);
            ConsentData j10 = this.consentInformation.j();
            Uri.Builder appendQueryParameter = Uri.parse(this.url).buildUpon().appendQueryParameter("pubs", join).appendQueryParameter("es", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION).appendQueryParameter("plat", j10.d()).appendQueryParameter("v", j10.e());
            if (this.consentInformation.i() && this.consentInformation.c() != DebugGeography.DEBUG_GEOGRAPHY_DISABLED) {
                appendQueryParameter = appendQueryParameter.appendQueryParameter("debug_geo", this.consentInformation.c().a().toString());
            }
            return b(appendQueryParameter.build().toString());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(ConsentInfoUpdateResponse consentInfoUpdateResponse) {
            if (consentInfoUpdateResponse.success) {
                this.listener.a(this.consentInformation.b());
            } else {
                this.listener.b(consentInfoUpdateResponse.responseInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class ServerResponse {
        @c("ad_network_ids")
        List<AdNetworkLookupResponse> adNetworkLookupResponses;
        List<AdProvider> companies;
        @c("is_request_in_eea_or_unknown")
        Boolean isRequestLocationInEeaOrUnknown;

        protected ServerResponse() {
        }
    }

    private ConsentInformation(Context context) {
        this.context = context.getApplicationContext();
    }

    public static synchronized ConsentInformation e(Context context) {
        ConsentInformation consentInformation;
        synchronized (ConsentInformation.class) {
            if (instance == null) {
                instance = new ConsentInformation(context);
            }
            consentInformation = instance;
        }
        return consentInformation;
    }

    private HashSet<AdProvider> f(List<AdProvider> list, HashSet<String> hashSet) {
        ArrayList arrayList = new ArrayList();
        for (AdProvider adProvider : list) {
            if (hashSet.contains(adProvider.a())) {
                arrayList.add(adProvider);
            }
        }
        return new HashSet<>(arrayList);
    }

    private boolean g() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                return false;
            }
        }
        return true;
    }

    private String k(String str) {
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private void l(ConsentData consentData) {
        SharedPreferences.Editor edit = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).edit();
        edit.putString(CONSENT_DATA_KEY, new e().r(consentData));
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void n(String str, List<String> list) throws Exception {
        boolean z10;
        HashSet<AdProvider> hashSet;
        ServerResponse serverResponse = (ServerResponse) new e().i(str, ServerResponse.class);
        o(serverResponse);
        HashSet<String> hashSet2 = new HashSet<>();
        List<AdNetworkLookupResponse> list2 = serverResponse.adNetworkLookupResponses;
        boolean z11 = true;
        if (list2 != null) {
            z10 = false;
            for (AdNetworkLookupResponse adNetworkLookupResponse : list2) {
                if (adNetworkLookupResponse.isNPA) {
                    List list3 = adNetworkLookupResponse.companyIds;
                    if (list3 != null) {
                        hashSet2.addAll(list3);
                    }
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        List<AdProvider> list4 = serverResponse.companies;
        if (list4 == null) {
            hashSet = new HashSet<>();
        } else if (z10) {
            hashSet = f(list4, hashSet2);
        } else {
            hashSet = new HashSet<>(serverResponse.companies);
        }
        ConsentData j10 = j();
        if (j10.f() == z10) {
            z11 = false;
        }
        j10.l(z10);
        j10.n(str);
        j10.m(new HashSet<>(list));
        j10.h(hashSet);
        j10.o(serverResponse.isRequestLocationInEeaOrUnknown.booleanValue());
        if (!serverResponse.isRequestLocationInEeaOrUnknown.booleanValue()) {
            l(j10);
            return;
        }
        if (!j10.a().equals(j10.c()) || z11) {
            j10.i(ServiceProvider.NAMED_SDK);
            j10.j(ConsentStatus.UNKNOWN);
            j10.k(new HashSet<>());
        }
        l(j10);
    }

    private void o(ServerResponse serverResponse) throws Exception {
        Boolean bool = serverResponse.isRequestLocationInEeaOrUnknown;
        if (bool != null) {
            if (serverResponse.companies == null && bool.booleanValue()) {
                throw new Exception("Could not parse Event FE preflight response.");
            }
            if (serverResponse.isRequestLocationInEeaOrUnknown.booleanValue()) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (AdNetworkLookupResponse adNetworkLookupResponse : serverResponse.adNetworkLookupResponses) {
                    if (adNetworkLookupResponse.lookupFailed) {
                        hashSet.add(adNetworkLookupResponse.id);
                    }
                    if (adNetworkLookupResponse.notFound) {
                        hashSet2.add(adNetworkLookupResponse.id);
                    }
                }
                if (hashSet.isEmpty() && hashSet2.isEmpty()) {
                    return;
                }
                StringBuilder sb = new StringBuilder("Response error.");
                if (!hashSet.isEmpty()) {
                    sb.append(String.format(" Lookup failure for: %s.", TextUtils.join(",", hashSet)));
                }
                if (!hashSet2.isEmpty()) {
                    sb.append(String.format(" Publisher Ids not found: %s", TextUtils.join(",", hashSet2)));
                }
                throw new Exception(sb.toString());
            }
            return;
        }
        throw new Exception("Could not parse Event FE preflight response.");
    }

    public synchronized ConsentStatus b() {
        return j().b();
    }

    public DebugGeography c() {
        return this.debugGeography;
    }

    protected String d() {
        ContentResolver contentResolver = this.context.getContentResolver();
        return k(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || g()) ? "emulator" : "emulator");
    }

    public boolean h() {
        return j().g();
    }

    public boolean i() {
        return g() || this.testDevices.contains(this.hashedDeviceId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ConsentData j() {
        String string = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).getString(CONSENT_DATA_KEY, "");
        if (TextUtils.isEmpty(string)) {
            return new ConsentData();
        }
        return (ConsentData) new e().i(string, ConsentData.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void m(ConsentStatus consentStatus, String str) {
        ConsentData j10 = j();
        if (consentStatus == ConsentStatus.UNKNOWN) {
            j10.k(new HashSet<>());
        } else {
            j10.k(j10.a());
        }
        j10.i(str);
        j10.j(consentStatus);
        l(j10);
    }
}
