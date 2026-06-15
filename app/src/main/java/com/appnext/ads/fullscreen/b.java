package com.appnext.ads.fullscreen;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.SettingsManager;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import org.json.JSONArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends com.appnext.core.d {

    /* renamed from: q  reason: collision with root package name */
    private static b f10034q;

    /* renamed from: r  reason: collision with root package name */
    private final int f10035r = 30;

    /* renamed from: s  reason: collision with root package name */
    private HashMap<Ad, String> f10036s = new HashMap<>();

    private b() {
    }

    private boolean d(Ad ad) {
        try {
            if (Video.isStreamingModeEnabled()) {
                return true;
            }
            if (this.f10036s.containsKey(ad)) {
                return new File(this.f10036s.get(ad)).exists();
            }
            return false;
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenAdsManager$isVideoLoaded", th);
            return false;
        }
    }

    public static synchronized b f() {
        b bVar;
        synchronized (b.class) {
            if (f10034q == null) {
                f10034q = new b();
            }
            bVar = f10034q;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String getVideoUrl(AppnextAd appnextAd, String str) {
        String videoUrlHigh;
        if (str.equals("30")) {
            videoUrlHigh = appnextAd.getVideoUrlHigh30Sec();
            if (videoUrlHigh.equals("")) {
                videoUrlHigh = appnextAd.getVideoUrlHigh();
            }
        } else {
            videoUrlHigh = appnextAd.getVideoUrlHigh();
            if (videoUrlHigh.equals("")) {
                videoUrlHigh = appnextAd.getVideoUrlHigh30Sec();
            }
        }
        if (appnextAd != null) {
            appnextAd.getBannerID();
        }
        return videoUrlHigh;
    }

    @Override // com.appnext.core.d
    protected final String a(Context context, Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        try {
            StringBuilder sb = new StringBuilder("&auid=");
            sb.append(ad != null ? ad.getAUID() : "700");
            sb.append("&vidmin=");
            sb.append(ad == null ? "" : Integer.valueOf(ad.getMinVideoLength()));
            sb.append("&vidmax=");
            sb.append(ad == null ? "" : Integer.valueOf(ad.getMaxVideoLength()));
            return sb.toString();
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenAdsManager$urlSuffix", th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(Ad ad) {
        try {
            if (h(ad) && j(ad).O().longValue() + 0 + 300000 >= System.currentTimeMillis()) {
                if (d(ad)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenAdsManager$isReadyToShow", th);
            return false;
        }
    }

    @Override // com.appnext.core.d
    protected final SettingsManager c(Ad ad) {
        return ad instanceof RewardedVideo ? f.o() : c.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayList<AppnextAd> e(Ad ad) {
        return j(ad).getAds();
    }

    @Override // com.appnext.core.d
    protected final int a(Context context, com.appnext.core.j jVar) {
        int i10;
        AppnextAd appnextAd = (AppnextAd) jVar;
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        if (fullscreenAd.getCampaignGoal().equals("new") && com.appnext.core.i.b(context, fullscreenAd.getAdPackage())) {
            i10 = 1;
        } else {
            i10 = (!fullscreenAd.getCampaignGoal().equals("existing") || com.appnext.core.i.b(context, fullscreenAd.getAdPackage())) ? 0 : 2;
        }
        int a10 = a(context, appnextAd);
        if (i10 == 0 && a10 == 0) {
            return 0;
        }
        return i10 != 0 ? i10 : a10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String b(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (substring.contains("?")) {
            substring = substring.substring(0, substring.indexOf("?"));
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("rnd");
            if (queryParameter == null || queryParameter.equals("")) {
                return substring;
            }
            return substring.substring(0, substring.lastIndexOf(46)) + "_" + queryParameter + substring.substring(substring.lastIndexOf(46));
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenAdsManager$extractFileNameFromPath", th);
            return substring;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.d
    public final boolean a(Ad ad) {
        return super.a(ad) && d(ad);
    }

    private void a(Context context, Ad ad, AppnextAd appnextAd) throws Exception {
        String str;
        try {
            String videoUrl = getVideoUrl(appnextAd, ((Video) ad).getVideoLength());
            String b10 = b(videoUrl);
            if (Video.getCacheVideo()) {
                str = context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
            } else {
                str = context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/tmp/vid" + ((Video) ad).rnd + "/";
            }
            File file = new File(str + b10);
            if (file.exists()) {
                file.setLastModified(System.currentTimeMillis());
                file.getPath();
                this.f10036s.put(ad, file.getAbsolutePath());
            } else if (Video.isStreamingModeEnabled()) {
            } else {
                new File(str).mkdirs();
                URL url = new URL(videoUrl);
                url.openConnection().connect();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), 1024);
                FileOutputStream fileOutputStream = new FileOutputStream(str + b10 + ".tmp");
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        bufferedInputStream.close();
                        File file2 = new File(str + b10 + ".tmp");
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(b10);
                        file2.renameTo(new File(sb.toString()));
                        file2.delete();
                        this.f10036s.put(ad, file.getAbsolutePath());
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenAdsManager$downloadAssets", th);
        }
    }

    @Override // com.appnext.core.d
    protected final void a(Ad ad, String str, String str2) {
        if (ad != null) {
            com.appnext.core.i.a(getContext(), ad.getTID(), ad.getVID(), ad.getAUID(), str2, str, "caching_error", ServiceProvider.NAMED_SDK, "", "");
        } else {
            com.appnext.core.i.a(getContext(), "300", "2.7.6.473", "700", str2, str, "caching_error", ServiceProvider.NAMED_SDK, "", "");
        }
    }

    @Override // com.appnext.core.d
    protected final <T> void a(String str, Ad ad, T t10) {
        com.appnext.core.i.a(getContext(), ad.getTID(), ad.getVID(), ad.getAUID(), str, ((Video) ad).getSessionId(), "cache_ready", ServiceProvider.NAMED_SDK, "", "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.d
    public final void a(Context context, String str, Ad ad) {
        super.a(context, str, ad);
        if (this.f10036s.containsKey(ad)) {
            this.f10036s.remove(ad);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AppnextAd a(Context context, Ad ad) {
        return a(context, ad, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final AppnextAd a(Context context, Ad ad, String str) {
        ArrayList<?> ads;
        if (j(ad) == null || (ads = j(ad).getAds()) == null) {
            return null;
        }
        return a(context, ad, (ArrayList<AppnextAd>) ads, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0006 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.appnext.core.AppnextAd a(android.content.Context r3, com.appnext.core.Ad r4, java.util.ArrayList<com.appnext.core.AppnextAd> r5, java.lang.String r6) {
        /*
            r2 = this;
            java.lang.String r3 = ""
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3d
        L6:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L43
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L3d
            com.appnext.core.AppnextAd r0 = (com.appnext.core.AppnextAd) r0     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r0.getVideoUrlHigh()     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L29
            java.lang.String r1 = r0.getVideoUrlHigh30Sec()     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            if (r1 == 0) goto L6
            r0.getBannerID()     // Catch: java.lang.Throwable -> L3d
            r4.getPlacementID()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r0.getBannerID()     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.equals(r6)     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L6
            return r0
        L3d:
            r3 = move-exception
            java.lang.String r4 = "FullscreenAdsManager$getFirst"
            com.appnext.base.a.a(r4, r3)
        L43:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.b.a(android.content.Context, com.appnext.core.Ad, java.util.ArrayList, java.lang.String):com.appnext.core.AppnextAd");
    }

    private static int a(Context context, AppnextAd appnextAd) {
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        if (!fullscreenAd.getCptList().equals("") && !fullscreenAd.getCptList().equals("[]")) {
            try {
                JSONArray jSONArray = new JSONArray(fullscreenAd.getCptList());
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (com.appnext.core.i.b(context, jSONArray.getString(i10))) {
                        return 0;
                    }
                }
                return 3;
            } catch (Throwable th) {
                com.appnext.base.a.a("FullscreenAdsManager$checkCPT", th);
            }
        }
        return 0;
    }

    @Override // com.appnext.core.d
    protected final void a(Context context, Ad ad, com.appnext.core.a aVar) throws Exception {
        int i10;
        int parseInt;
        try {
            File[] listFiles = new File(context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/").listFiles();
            if (listFiles != null && listFiles.length != 0) {
                Arrays.sort(listFiles, new Comparator<File>() { // from class: com.appnext.ads.fullscreen.b.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(File file, File file2) {
                        return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                    }
                });
                if (Video.getCacheVideo()) {
                    if (ad instanceof FullScreenVideo) {
                        parseInt = Integer.parseInt(c.h().t("num_saved_videos"));
                    } else {
                        parseInt = Integer.parseInt(f.o().t("num_saved_videos"));
                    }
                    i10 = parseInt - 1;
                } else {
                    i10 = 0;
                }
                if (listFiles.length > i10) {
                    for (int i11 = 0; i11 < listFiles.length - i10; i11++) {
                        listFiles[i11].delete();
                    }
                }
            }
        } catch (Throwable th) {
            try {
                com.appnext.base.a.a("FullscreenAdsManager$deleteFiles", th);
            } catch (Throwable unused) {
            }
        }
        AppnextAd appnextAd = null;
        try {
            AppnextAd a10 = a(context, ad);
            if (a10 == null) {
                return;
            }
            a(context, ad, a10);
            if (ad instanceof RewardedVideo) {
                String mode = ((RewardedVideo) ad).getMode();
                if (mode.equals(RewardedVideo.VIDEO_MODE_DEFAULT)) {
                    mode = f.o().t("default_mode");
                }
                if (!mode.equals(RewardedVideo.VIDEO_MODE_MULTI) || (appnextAd = a(context, ad, a10.getBannerID())) == null) {
                    return;
                }
                a(context, ad, appnextAd);
            }
        } catch (Throwable th2) {
            com.appnext.base.a.a("FullscreenAdsManager$customAdLoad", th2);
            if (appnextAd != null) {
                a(context, appnextAd.getBannerID(), ad);
            }
        }
    }
}
