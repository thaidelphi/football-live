package com.google.android.datatransport.cct;

import a3.j;
import a3.k;
import a3.l;
import a3.m;
import a3.n;
import a3.o;
import a3.p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import b3.h;
import b3.i;
import c3.f;
import c3.g;
import c3.m;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.datatransport.cct.d;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.fe;
import com.ironsource.in;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CctTransportBackend.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    private final j6.a f10418a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f10419b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f10420c;

    /* renamed from: d  reason: collision with root package name */
    final URL f10421d;

    /* renamed from: e  reason: collision with root package name */
    private final l3.a f10422e;

    /* renamed from: f  reason: collision with root package name */
    private final l3.a f10423f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10424g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f10425a;

        /* renamed from: b  reason: collision with root package name */
        final j f10426b;

        /* renamed from: c  reason: collision with root package name */
        final String f10427c;

        a(URL url, j jVar, String str) {
            this.f10425a = url;
            this.f10426b = jVar;
            this.f10427c = str;
        }

        a a(URL url) {
            return new a(url, this.f10426b, this.f10427c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f10428a;

        /* renamed from: b  reason: collision with root package name */
        final URL f10429b;

        /* renamed from: c  reason: collision with root package name */
        final long f10430c;

        b(int i10, URL url, long j10) {
            this.f10428a = i10;
            this.f10429b = url;
            this.f10430c = j10;
        }
    }

    d(Context context, l3.a aVar, l3.a aVar2, int i10) {
        this.f10418a = j.b();
        this.f10420c = context;
        this.f10419b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10421d = n(com.google.android.datatransport.cct.a.f10408c);
        this.f10422e = aVar2;
        this.f10423f = aVar;
        this.f10424g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        f3.a.f("CctTransportBackend", "Making request to: %s", aVar.f10425a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f10425a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f10424g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(in.f17849b);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", cc.L);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f10427c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f10418a.a(aVar.f10426b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                f3.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                f3.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                f3.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m7 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(m7))).c());
                    if (m7 != null) {
                        m7.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (j6.b e8) {
            e = e8;
            f3.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(CommonGatewayClient.CODE_400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            f3.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            f3.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, null, 0L);
        } catch (IOException e12) {
            e = e12;
            f3.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(CommonGatewayClient.CODE_400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.b();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.b();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            f3.a.d("CctTransportBackend", "Unable to find version code for package", e8);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a j10;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j11 = iVar.j();
            if (!hashMap.containsKey(j11)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j11, arrayList);
            } else {
                ((List) hashMap.get(j11)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b10 = a3.m.a().f(p.DEFAULT).g(this.f10423f.a()).h(this.f10422e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(a3.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b(fe.B)).f(iVar2.b("hardware")).d(iVar2.b(b9.h.G)).l(iVar2.b(AppLovinEventTypes.USER_VIEWED_PRODUCT)).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY)).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e8 = iVar3.e();
                z2.b b11 = e8.b();
                if (b11.equals(z2.b.b("proto"))) {
                    j10 = l.j(e8.a());
                } else if (b11.equals(z2.b.b("json"))) {
                    j10 = l.i(new String(e8.a(), Charset.forName("UTF-8")));
                } else {
                    f3.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                j10.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j10.b(iVar3.d());
                }
                arrayList3.add(j10.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f10429b;
        if (url != null) {
            f3.a.b("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.f10429b);
        }
        return null;
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException("Invalid url: " + str, e8);
        }
    }

    @Override // c3.m
    public g a(f fVar) {
        j i10 = i(fVar);
        URL url = this.f10421d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a c10 = com.google.android.datatransport.cct.a.c(fVar.c());
                r3 = c10.d() != null ? c10.d() : null;
                if (c10.e() != null) {
                    url = n(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) g3.b.a(5, new a(url, i10, r3), new g3.a() { // from class: com.google.android.datatransport.cct.b
                @Override // g3.a
                public final Object apply(Object obj) {
                    d.b e8;
                    e8 = d.this.e((d.a) obj);
                    return e8;
                }
            }, new g3.c() { // from class: com.google.android.datatransport.cct.c
                @Override // g3.c
                public final Object a(Object obj, Object obj2) {
                    d.a l10;
                    l10 = d.l((d.a) obj, (d.b) obj2);
                    return l10;
                }
            });
            int i11 = bVar.f10428a;
            if (i11 == 200) {
                return g.e(bVar.f10430c);
            }
            if (i11 < 500 && i11 != 404) {
                if (i11 == 400) {
                    return g.d();
                }
                return g.a();
            }
            return g.f();
        } catch (IOException e8) {
            f3.a.d("CctTransportBackend", "Could not make request to the backend", e8);
            return g.f();
        }
    }

    @Override // c3.m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f10419b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c(fe.B, Build.MODEL).c("hardware", Build.HARDWARE).c(b9.h.G, Build.DEVICE).c(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f10420c).getSimOperator()).c("application_build", Integer.toString(h(this.f10420c))).d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, l3.a aVar, l3.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
