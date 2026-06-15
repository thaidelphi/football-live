package com.appnext.ads.interstitial;

import android.content.Context;
import android.util.Pair;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.SettingsManager;
import com.appnext.core.d;
import com.appnext.core.i;
import com.appnext.core.j;
import com.appnext.core.webview.AppnextWebView;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends d {
    private static a aL;
    private String aq;

    private a() {
    }

    public static synchronized a C() {
        a aVar;
        synchronized (a.class) {
            if (aL == null) {
                aL = new a();
            }
            aVar = aL;
        }
        return aVar;
    }

    private static boolean hasVideo(AppnextAd appnextAd) {
        return (appnextAd.getVideoUrl().equals("") && appnextAd.getVideoUrlHigh().equals("") && appnextAd.getVideoUrl30Sec().equals("") && appnextAd.getVideoUrlHigh30Sec().equals("")) ? false : true;
    }

    public final void a(Context context, Ad ad, String str, d.a aVar, String str2) {
        try {
            this.aq = str2;
            super.a(context, ad, str, aVar);
        } catch (Throwable unused) {
        }
    }

    @Override // com.appnext.core.d
    protected final void a(Ad ad, String str, String str2) {
    }

    @Override // com.appnext.core.d
    protected final <T> void a(String str, Ad ad, T t10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList<AppnextAd> b(Context context, Ad ad, String str) {
        ArrayList ads;
        AppnextAd a10;
        if (j(ad) == null || (ads = j(ad).getAds()) == null || (a10 = a(context, ads, str, ad)) == null) {
            return null;
        }
        ads.remove(a10);
        ads.add(0, a10);
        return ads;
    }

    @Override // com.appnext.core.d
    protected final SettingsManager c(Ad ad) {
        return c.E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f(Ad ad) {
        return h(ad) && j(ad).getAds() != null && j(ad).getAds().size() > 0 && j(ad).O().longValue() + 300000 > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(Ad ad) {
        if (ad != null) {
            try {
                Q().remove(new com.appnext.core.b(ad));
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialAdsManager$CleanContainer", th);
            }
        }
    }

    @Override // com.appnext.core.d
    protected final String a(Context context, Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        try {
            StringBuilder sb = new StringBuilder("&auid=");
            sb.append(ad != null ? ad.getAUID() : "600");
            sb.append("&vidmin=");
            sb.append(ad == null ? "" : Integer.valueOf(ad.getMinVideoLength()));
            sb.append("&vidmax=");
            sb.append(ad == null ? "" : Integer.valueOf(ad.getMaxVideoLength()));
            sb.append(this.aq.equals("static") ? "&creative=0" : "");
            return sb.toString();
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialAdsManager$urlSuffix", th);
            return "";
        }
    }

    private static boolean b(AppnextAd appnextAd) {
        return !appnextAd.getWideImageURL().equals("");
    }

    @Override // com.appnext.core.d
    protected final void a(Context context, Ad ad, com.appnext.core.a aVar) throws Exception {
        try {
            AppnextWebView.t(context).a(((Interstitial) ad).getPageUrl(), (AppnextWebView.c) null);
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialAdsManager$customAdLoad", th);
        }
    }

    @Override // com.appnext.core.d
    protected final int a(Context context, j jVar) {
        int i10;
        try {
            InterstitialAd interstitialAd = new InterstitialAd((AppnextAd) jVar);
            if (interstitialAd.getCampaignGoal().equals("new") && i.b(context, interstitialAd.getAdPackage())) {
                i10 = 1;
            } else {
                i10 = (!interstitialAd.getCampaignGoal().equals("existing") || i.b(context, interstitialAd.getAdPackage())) ? 0 : 2;
            }
            int a10 = a(context, (AppnextAd) jVar);
            if (i10 == 0 && a10 == 0) {
                return 0;
            }
            return i10 != 0 ? i10 : a10;
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialAdsManager$adFilter", th);
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.d
    public final String a(ArrayList<AppnextAd> arrayList) {
        return super.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.d
    public final void a(Context context, String str, Ad ad) {
        super.a(context, str, ad);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AppnextAd a(Context context, ArrayList<AppnextAd> arrayList, String str, Ad ad) {
        Iterator<AppnextAd> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd next = it.next();
            if (a(next, str, ad)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r0 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r0 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (b(r7) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        r7.getBannerID();
        r9.getPlacementID();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
        if (hasVideo(r7) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        r7.getBannerID();
        r9.getPlacementID();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.appnext.core.AppnextAd r7, java.lang.String r8, com.appnext.core.Ad r9) {
        /*
            r6 = this;
            r0 = -1
            r1 = 0
            int r2 = r8.hashCode()     // Catch: java.lang.Throwable -> L69
            r3 = -892481938(0xffffffffcacdce6e, float:-6743863.0)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L2c
            r3 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r2 == r3) goto L22
            r3 = 835260319(0x31c90f9f, float:5.851646E-9)
            if (r2 == r3) goto L18
            goto L35
        L18:
            java.lang.String r2 = "managed"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L35
            r0 = r1
            goto L35
        L22:
            java.lang.String r2 = "video"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L35
            r0 = r5
            goto L35
        L2c:
            java.lang.String r2 = "static"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L35
            r0 = r4
        L35:
            if (r0 == 0) goto L56
            if (r0 == r5) goto L49
            if (r0 == r4) goto L3c
            goto L6f
        L3c:
            boolean r8 = b(r7)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L6f
            r7.getBannerID()     // Catch: java.lang.Throwable -> L69
            r9.getPlacementID()     // Catch: java.lang.Throwable -> L69
            return r5
        L49:
            boolean r8 = hasVideo(r7)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L6f
            r7.getBannerID()     // Catch: java.lang.Throwable -> L69
            r9.getPlacementID()     // Catch: java.lang.Throwable -> L69
            return r5
        L56:
            boolean r8 = b(r7)     // Catch: java.lang.Throwable -> L69
            if (r8 != 0) goto L62
            boolean r8 = hasVideo(r7)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L6f
        L62:
            r7.getBannerID()     // Catch: java.lang.Throwable -> L69
            r9.getPlacementID()     // Catch: java.lang.Throwable -> L69
            return r5
        L69:
            r7 = move-exception
            java.lang.String r8 = "InterstitialAdsManager$isMatchToCreativeAndNotShown"
            com.appnext.base.a.a(r8, r7)
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.interstitial.a.a(com.appnext.core.AppnextAd, java.lang.String, com.appnext.core.Ad):boolean");
    }

    private static int a(Context context, AppnextAd appnextAd) {
        try {
            InterstitialAd interstitialAd = new InterstitialAd(appnextAd);
            if (!interstitialAd.getCptList().equals("") && !interstitialAd.getCptList().equals("[]")) {
                JSONArray jSONArray = new JSONArray(interstitialAd.getCptList());
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i.b(context, jSONArray.getString(i10))) {
                        return 0;
                    }
                }
                return 3;
            }
            return 0;
        } catch (JSONException e8) {
            com.appnext.base.a.a("InterstitialAdsManager$checkCPT", e8);
            return 0;
        }
    }
}
