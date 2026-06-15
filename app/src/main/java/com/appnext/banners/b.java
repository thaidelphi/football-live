package com.appnext.banners;

import android.content.Context;
import android.util.Pair;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.SettingsManager;
import com.appnext.core.d;
import com.appnext.core.i;
import com.appnext.core.j;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends com.appnext.core.d {
    private static b bE;

    /* renamed from: r  reason: collision with root package name */
    private final int f10051r = 200;

    private b() {
    }

    public static synchronized b J() {
        b bVar;
        synchronized (b.class) {
            if (bE == null) {
                bE = new b();
            }
            bVar = bE;
        }
        return bVar;
    }

    static boolean b(AppnextAd appnextAd) {
        try {
            return !appnextAd.getWideImageURL().equals("");
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdsManager$hasWideImage", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasVideo(AppnextAd appnextAd) {
        try {
            if (appnextAd.getVideoUrl().equals("") && appnextAd.getVideoUrlHigh().equals("") && appnextAd.getVideoUrl30Sec().equals("")) {
                return !appnextAd.getVideoUrlHigh30Sec().equals("");
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.appnext.core.d
    protected final String a(Context context, Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        StringBuilder sb = new StringBuilder("&auid=");
        sb.append(ad != null ? ad.getAUID() : "1000");
        return sb.toString();
    }

    @Override // com.appnext.core.d
    protected final void a(Context context, Ad ad, com.appnext.core.a aVar) {
    }

    @Override // com.appnext.core.d
    protected final void a(Ad ad, String str, String str2) {
    }

    @Override // com.appnext.core.d
    protected final <T> void a(String str, Ad ad, T t10) {
    }

    @Override // com.appnext.core.d
    protected final SettingsManager c(Ad ad) {
        return d.K();
    }

    public final ArrayList<AppnextAd> e(Ad ad) {
        return j(ad).getAds();
    }

    public final void a(Context context, Ad ad, String str, d.a aVar, BannerAdRequest bannerAdRequest) {
        ((BannerAd) ad).setAdRequest(new BannerAdRequest(bannerAdRequest));
        super.a(context, ad, str, aVar);
    }

    @Override // com.appnext.core.d
    protected final int a(Context context, j jVar) {
        try {
            BannerAdData bannerAdData = new BannerAdData((AppnextAd) jVar);
            int a10 = a(context, bannerAdData);
            if (a10 != 0) {
                return a10;
            }
            if (bannerAdData.getCampaignGoal().equals("new") && i.b(context, bannerAdData.getAdPackage())) {
                return 2;
            }
            if (bannerAdData.getCampaignGoal().equals("existing")) {
                return !i.b(context, bannerAdData.getAdPackage()) ? 1 : 0;
            }
            return 0;
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdsManager$radFilter", th);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AppnextAd a(Context context, Ad ad, ArrayList<?> arrayList, String str, ArrayList<String> arrayList2) {
        if (arrayList == null) {
            return null;
        }
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd appnextAd = (AppnextAd) it.next();
            try {
                if (a(ad, appnextAd, str)) {
                    appnextAd.getBannerID();
                    ad.getPlacementID();
                    if (!arrayList2.contains(appnextAd.getBannerID())) {
                        return appnextAd;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("BannerAdsManager$getFirst", th);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AppnextAd a(Context context, Ad ad, ArrayList<?> arrayList, String str) {
        return a(context, ad, arrayList, str, new ArrayList<>());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AppnextAd a(Context context, Ad ad, String str) {
        ArrayList<?> ads;
        try {
            if (j(ad) == null || (ads = j(ad).getAds()) == null) {
                return null;
            }
            return a(context, ad, ads, str);
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdsManager$getFirst", th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r5 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
        if (r5 == 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        return hasVideo(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
        return b(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.appnext.core.Ad r5, com.appnext.core.AppnextAd r6, java.lang.String r7) {
        /*
            r0 = 0
            boolean r5 = r5 instanceof com.appnext.banners.MediumRectangleAd     // Catch: java.lang.Throwable -> L59
            r1 = 1
            if (r5 == 0) goto L58
            r5 = -1
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L59
            r3 = -892481938(0xffffffffcacdce6e, float:-6743863.0)
            r4 = 2
            if (r2 == r3) goto L30
            r3 = 96673(0x179a1, float:1.35468E-40)
            if (r2 == r3) goto L26
            r3 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r2 == r3) goto L1c
            goto L39
        L1c:
            java.lang.String r2 = "video"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L59
            if (r7 == 0) goto L39
            r5 = r4
            goto L39
        L26:
            java.lang.String r2 = "all"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L59
            if (r7 == 0) goto L39
            r5 = r0
            goto L39
        L30:
            java.lang.String r2 = "static"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L59
            if (r7 == 0) goto L39
            r5 = r1
        L39:
            if (r5 == 0) goto L4a
            if (r5 == r1) goto L45
            if (r5 == r4) goto L40
            return r0
        L40:
            boolean r5 = hasVideo(r6)     // Catch: java.lang.Throwable -> L59
            return r5
        L45:
            boolean r5 = b(r6)     // Catch: java.lang.Throwable -> L59
            return r5
        L4a:
            boolean r5 = b(r6)     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L58
            boolean r5 = hasVideo(r6)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L57
            goto L58
        L57:
            return r0
        L58:
            return r1
        L59:
            r5 = move-exception
            java.lang.String r6 = "BannerAdsManager$checkCreative"
            com.appnext.base.a.a(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.b.a(com.appnext.core.Ad, com.appnext.core.AppnextAd, java.lang.String):boolean");
    }

    private static int a(Context context, BannerAdData bannerAdData) {
        try {
            if (!bannerAdData.getCptList().equals("") && !bannerAdData.getCptList().equals("[]")) {
                try {
                    JSONArray jSONArray = new JSONArray(bannerAdData.getCptList());
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        if (i.b(context, jSONArray.getString(i10))) {
                            return 0;
                        }
                    }
                    return 3;
                } catch (JSONException e8) {
                    com.appnext.base.a.a("BannerAdsManager$checkCreative", e8);
                }
            }
            return 0;
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerAdsManager$checkCreative", th);
            return 3;
        }
    }
}
