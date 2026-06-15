package com.appnext.core;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.appnext.core.d;
import com.ironsource.fe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class d {
    private Context aO;
    protected final int cg = 0;
    protected final int ch = 1;
    protected final int ci = 2;
    protected final int cj = 3;
    private final HashMap<b, com.appnext.core.a> ck = new HashMap<>();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        <T> void a(T t10);

        void error(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(Context context, Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        String str2;
        StringBuilder sb = new StringBuilder("https://globalcdnapi.appnext.com/offerWallApi.aspx?ext=t&pimp=1&igroup=sdk&m=1&osid=100&s2s=1&type=json&id=");
        sb.append(str);
        sb.append("&cnt=200");
        sb.append("&tid=");
        sb.append(ad != null ? ad.getTID() : "301");
        sb.append("&vid=");
        sb.append(ad != null ? ad.getVID() : "2.7.6.473");
        sb.append("&cat=");
        String str3 = "";
        sb.append(ad != null ? ad.getCategories() : "");
        sb.append("&lockcat=");
        sb.append(ad != null ? ad.getSpecificCategories() : "");
        sb.append("&did=");
        sb.append(i.a(context, false));
        sb.append("&devn=");
        sb.append(i.X());
        sb.append("&dosv=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&dct=");
        sb.append(i.q(i.d(context)));
        sb.append("&lang=");
        sb.append(Locale.getDefault().getLanguage());
        sb.append("&dcc=");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() == 5) {
            String simOperator = telephonyManager.getSimOperator();
            str2 = simOperator.substring(0, 3) + "_" + simOperator.substring(3);
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("&dds=0");
        sb.append("&packageId=");
        sb.append(context.getPackageName());
        sb.append("&g=");
        sb.append(b(context));
        sb.append("&opt=");
        sb.append(AdsIDHelper.isOptOut(context) ? 1 : 0);
        sb.append("&rnd=");
        sb.append(new Random().nextInt());
        if (!TextUtils.isEmpty(ad.getPackageName())) {
            str3 = "&sp=" + ad.getPackageName();
        }
        sb.append(str3);
        return sb.toString();
    }

    public static String c(AppnextAd appnextAd) {
        return appnextAd.getAdJSON();
    }

    protected static boolean m(String str) {
        try {
            return new JSONObject(str).has("rnd");
        } catch (Throwable unused) {
            return true;
        }
    }

    public static j parseAd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AppnextAd appnextAd = (AppnextAd) m.a(AppnextAd.class, jSONObject);
            if (appnextAd != null) {
                appnextAd.setAdJSON(jSONObject.toString());
                if (jSONObject.has(fe.Y0)) {
                    appnextAd.setSession(jSONObject.getString(fe.Y0));
                }
                if (TextUtils.isEmpty(appnextAd.getStoreRating())) {
                    appnextAd.setStoreRating("0");
                }
            }
            return appnextAd;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HashMap<b, com.appnext.core.a> Q() {
        return this.ck;
    }

    protected abstract int a(Context context, j jVar);

    protected abstract String a(Context context, Ad ad, String str, ArrayList<Pair<String, String>> arrayList);

    protected abstract void a(Context context, Ad ad, com.appnext.core.a aVar) throws Exception;

    public final void a(Context context, Ad ad, String str, a aVar) {
        a(context, ad, str, aVar, true);
    }

    protected abstract void a(Ad ad, String str, String str2);

    protected abstract <T> void a(String str, Ad ad, T t10);

    protected abstract SettingsManager c(Ad ad);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context getContext() {
        return this.aO;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h(Ad ad) {
        try {
            if (this.ck != null && j(ad) != null && j(ad).P() == 2) {
                if (j(ad).getAds() != null) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    protected final boolean i(Ad ad) {
        try {
            if (this.ck != null && j(ad) != null && j(ad).getAds().size() == 0) {
                if (j(ad).O().longValue() + 60000 > System.currentTimeMillis()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.appnext.core.a j(Ad ad) {
        return this.ck.get(new b(ad));
    }

    public final String k(Ad ad) {
        return j(ad).w();
    }

    public final void a(Context context, Ad ad, String str, a aVar, boolean z10) {
        try {
            this.aO = context.getApplicationContext();
            if (i.h(context)) {
                b(context, ad, str, aVar, z10);
            } else if (aVar != null) {
                aVar.error(AppnextError.CONNECTION_ERROR);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("AdsManager$getAdList", th);
            if (aVar != null) {
                aVar.error(AppnextError.NO_ADS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(Ad ad) {
        try {
            if (h(ad)) {
                if (i(ad)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.appnext.base.a.a("AdsManager$isLoadedAndUpdated", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(Ad ad, String str) {
        try {
            return Long.valueOf(c(ad).t(str)).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<AppnextAd> a(Context context, ArrayList<AppnextAd> arrayList, String str, String str2) {
        try {
            if (arrayList == null) {
                return new ArrayList<>();
            }
            List<String> w10 = com.appnext.core.adswatched.a.m(context).w(str2);
            if (w10 != null && !w10.isEmpty()) {
                arrayList.size();
                ArrayList<AppnextAd> arrayList2 = new ArrayList<>();
                ListIterator<AppnextAd> listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    AppnextAd next = listIterator.next();
                    if (next != null && !w10.contains(next.getBannerID())) {
                        arrayList2.add(next);
                        listIterator.remove();
                    }
                }
                if (arrayList2.isEmpty()) {
                    com.appnext.core.adswatched.a.m(context).k(str, str2);
                }
                arrayList2.addAll(arrayList);
                arrayList.toString();
                return arrayList2;
            }
            return arrayList;
        } catch (Throwable unused) {
            return new ArrayList<>();
        }
    }

    private void b(final Context context, final Ad ad, final String str, final a aVar, final boolean z10) {
        try {
            p.ac().a(new Runnable() { // from class: com.appnext.core.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ad.setSessionId(i.f(context));
                    } catch (Throwable unused) {
                    }
                    try {
                        synchronized (d.this.ck) {
                            if (d.this.j(ad) != null && d.this.j(ad).P() == 1) {
                                if (aVar != null) {
                                    d.this.j(ad).a(aVar);
                                }
                                return;
                            }
                            com.appnext.core.a aVar2 = new com.appnext.core.a();
                            aVar2.a(aVar);
                            aVar2.setPlacementID(str);
                            aVar2.b(1);
                            d.this.ck.remove(new b(ad));
                            d.this.a(ad, aVar2);
                            String str2 = "";
                            if (Boolean.valueOf(d.this.b(ad, "dlEnable")).booleanValue()) {
                                str2 = com.appnext.core.a.b.o(context).a(context, Long.valueOf(d.this.a(ad, "score_refresh_time_min")).longValue(), Long.valueOf(d.this.a(ad, "n_clusters")).longValue());
                            }
                            if (!n.i(context).a(AdsIDHelper.CONSENT, true)) {
                                str2 = "";
                            }
                            ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
                            String str3 = d.this.b(context, ad, str, arrayList) + d.this.a(context, ad, str, arrayList);
                            if (!str2.isEmpty()) {
                                str3 = str3 + str2;
                            }
                            e.R();
                            String a10 = e.a(context, str, ad.getAUID(), d.this.a(ad, "ads_caching_time_minutes"), str3, ad.getSpecificCategories(), ad.getCategories());
                            if (!TextUtils.isEmpty(a10) && !a10.equals("{\"apps\":[]}") && !a10.equals(JsonUtils.EMPTY_JSON) && !d.m(a10)) {
                                if (!TextUtils.isEmpty(ad.getPostback())) {
                                    a10 = a10.replaceAll("&q=", "&q=" + ad.getPostback());
                                }
                                ArrayList<?> a11 = d.a(context, d.this.a(context, ad, a10, 200), str, ad.getAUID());
                                if (a11 != null && !a11.isEmpty()) {
                                    d.this.j(ad).c(a11);
                                    if (z10) {
                                        try {
                                            d dVar = d.this;
                                            Context context2 = context;
                                            Ad ad2 = ad;
                                            dVar.a(context2, ad2, dVar.j(ad2));
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    d.this.j(ad).b(2);
                                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.core.d.1.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            try {
                                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                                final com.appnext.core.a j10 = d.this.j(ad);
                                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                                final ArrayList<?> ads = d.this.j(ad).getAds();
                                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.core.a.1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        try {
                                                            synchronized (a.this.bX) {
                                                                ListIterator listIterator = a.this.bX.listIterator();
                                                                while (listIterator.hasNext()) {
                                                                    ((d.a) listIterator.next()).a(ads);
                                                                    listIterator.remove();
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            com.appnext.base.a.a("AdContainer$notifyListenersSuccess", th);
                                                        }
                                                    }
                                                });
                                                AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                                                d dVar2 = d.this;
                                                String str4 = str;
                                                Ad ad3 = ad;
                                                dVar2.a(str4, ad3, (Ad) dVar2.j(ad3).getAds());
                                            } catch (Throwable unused3) {
                                                AnonymousClass1 anonymousClass14 = AnonymousClass1.this;
                                                d.this.a("Internal error", ad);
                                            }
                                        }
                                    });
                                    return;
                                }
                                d.this.a(AppnextError.NO_ADS, a10, ad);
                                return;
                            }
                            d.this.a(AppnextError.NO_ADS, a10, ad);
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("AdsManager$updateAdList", th);
                        d.this.a(th.getMessage(), ad);
                    }
                }
            });
        } catch (Throwable unused) {
            a("Internal error", ad);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Ad ad, String str) {
        try {
            return Boolean.parseBoolean(c(ad).t(str));
        } catch (Throwable unused) {
            return false;
        }
    }

    @SuppressLint({"MissingPermission"})
    protected static int b(Context context) {
        try {
            if (i.c(context, "android.permission.READ_CONTACTS") && i.c(context, "android.permission.GET_ACCOUNTS")) {
                return AccountManager.get(context).getAccountsByType("com.google").length > 0 ? 0 : 1;
            }
        } catch (Throwable unused) {
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
        if (r2.getRevenueType().equals("cpc") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.appnext.core.AppnextAd> a(android.content.Context r6, com.appnext.core.Ad r7, java.lang.String r8, int r9) throws org.json.JSONException {
        /*
            r5 = this;
            com.appnext.core.a r9 = r5.j(r7)
            r9.k(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            java.lang.String r8 = "apps"
            org.json.JSONArray r8 = r0.getJSONArray(r8)
            r0 = 0
        L18:
            int r1 = r8.length()
            if (r0 >= r1) goto La5
            org.json.JSONObject r1 = r8.getJSONObject(r0)
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La1
            com.appnext.core.j r1 = parseAd(r1)     // Catch: java.lang.Throwable -> La1
            com.appnext.core.AppnextAd r1 = (com.appnext.core.AppnextAd) r1     // Catch: java.lang.Throwable -> La1
            int r2 = r9.size()     // Catch: java.lang.Throwable -> La1
            r1.setAdID(r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r7.getPlacementID()     // Catch: java.lang.Throwable -> La1
            r1.setPlacementID(r2)     // Catch: java.lang.Throwable -> La1
            int r2 = r5.a(r6, r1)     // Catch: java.lang.Throwable -> La1
            if (r2 != 0) goto L91
            com.appnext.core.AppnextAd r2 = a(r9, r1)     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L8d
            r9.remove(r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r2.getRevenueType()     // Catch: java.lang.Throwable -> La1
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L76
            java.lang.String r3 = r2.getRevenueType()     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = r1.getRevenueType()     // Catch: java.lang.Throwable -> La1
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L76
            java.lang.String r3 = r2.getRevenueRate()     // Catch: java.lang.Throwable -> La1
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = r1.getRevenueRate()     // Catch: java.lang.Throwable -> La1
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.Throwable -> La1
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L8d
            goto L8c
        L76:
            java.lang.String r3 = r2.getRevenueType()     // Catch: java.lang.Throwable -> La1
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L8d
            java.lang.String r3 = r2.getRevenueType()     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = "cpc"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L8d
        L8c:
            r1 = r2
        L8d:
            r9.add(r1)     // Catch: java.lang.Throwable -> La1
            goto L98
        L91:
            r1.getBannerID()     // Catch: java.lang.Throwable -> La1
            r1 = 1
            if (r2 == r1) goto L98
            r1 = 2
        L98:
            int r1 = r9.size()     // Catch: java.lang.Throwable -> La1
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto La1
            goto La5
        La1:
            int r0 = r0 + 1
            goto L18
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.d.a(android.content.Context, com.appnext.core.Ad, java.lang.String, int):java.util.ArrayList");
    }

    private static AppnextAd a(ArrayList<AppnextAd> arrayList, AppnextAd appnextAd) {
        try {
            Iterator<AppnextAd> it = arrayList.iterator();
            while (it.hasNext()) {
                AppnextAd next = it.next();
                if (next.getAdPackage().equals(appnextAd.getAdPackage())) {
                    return next;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(ArrayList<AppnextAd> arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<AppnextAd> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(it.next().getAdJSON()));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apps", jSONArray);
            return jSONObject.toString().replace("\u2028", "\\u2028").replace("\u2029", "\\u2029");
        } catch (Throwable unused) {
            return "";
        }
    }

    protected final void a(String str, Ad ad) {
        a(str, "", ad);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str, String str2, Ad ad) {
        a(str, str2, ad, 2);
    }

    protected final void a(final String str, final String str2, final Ad ad, final int i10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.core.d.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.appnext.core.a j10 = d.this.j(ad);
                    if (j10 != null) {
                        if (j10.getAds() == null) {
                            j10.c(new ArrayList<>());
                        } else {
                            j10.c(j10.getAds());
                        }
                        j10.b(i10);
                        j10.l(str);
                        d dVar = d.this;
                        Ad ad2 = ad;
                        dVar.a(ad2, str + " " + str2, j10.getPlacementID());
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("AdKey$notifyError", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Ad ad, com.appnext.core.a aVar) {
        this.ck.put(new b(ad), aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final Context context, final String str, final Ad ad) {
        p.ac().a(new Runnable() { // from class: com.appnext.core.d.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.appnext.core.adswatched.a.m(context).j(str, ad.getAUID());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
