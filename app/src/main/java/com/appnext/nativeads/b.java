package com.appnext.nativeads;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.SettingsManager;
import com.appnext.core.d;
import com.appnext.core.i;
import com.appnext.core.j;
import com.appnext.nativeads.NativeAdRequest;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends d {
    private static b fD;

    /* renamed from: r  reason: collision with root package name */
    private final int f10069r = 200;

    public static synchronized b aI() {
        b bVar;
        synchronized (b.class) {
            if (fD == null) {
                fD = new b();
            }
            bVar = fD;
        }
        return bVar;
    }

    protected static String b(String str) {
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
            com.appnext.base.a.a("NativeAdsManager$extractFileNameFromPath", th);
            return substring;
        }
    }

    public final void a(Context context, Ad ad, String str, d.a aVar, NativeAdRequest nativeAdRequest) {
        ((NativeAdObject) ad).setAdRequest(new NativeAdRequest(nativeAdRequest));
        super.a(context, ad, str, aVar, true);
    }

    @Override // com.appnext.core.d
    protected final void a(Ad ad, String str, String str2) {
    }

    @Override // com.appnext.core.d
    protected final <T> void a(String str, Ad ad, T t10) {
    }

    @Override // com.appnext.core.d
    protected SettingsManager c(Ad ad) {
        return a.aG();
    }

    public final ArrayList<AppnextAd> e(Ad ad) {
        return j(ad).getAds();
    }

    @Override // com.appnext.core.d
    protected final String a(Context context, Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        try {
            StringBuilder sb = new StringBuilder("&auid=");
            sb.append(ad != null ? ad.getAUID() : "1000");
            sb.append("&creative=");
            sb.append(ad != null ? Integer.valueOf(((NativeAdRequest) ((NativeAdObject) ad).getAdRequest()).getCreativeType().ordinal()) : NativeAdRequest.CreativeType.ALL);
            sb.append("&vidmin=");
            sb.append(ad == null ? "" : Integer.valueOf(ad.getMinVideoLength()));
            sb.append("&vidmax=");
            sb.append(ad == null ? "" : Integer.valueOf(ad.getMaxVideoLength()));
            return sb.toString();
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAdsManager$urlSuffix", th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static String a(NativeAdRequest nativeAdRequest, AppnextAd appnextAd) {
        NativeAdRequest.VideoQuality videoQuality;
        NativeAdRequest.VideoQuality videoQuality2;
        String videoUrl;
        String str = "";
        try {
            videoQuality = nativeAdRequest.getVideoQuality();
            videoQuality2 = NativeAdRequest.VideoQuality.HIGH;
        } catch (Throwable th) {
            th = th;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            str = nativeAdRequest;
            com.appnext.base.a.a("NativeAdsManager$getVideoUrl", th);
            return str;
        }
        if (videoQuality == videoQuality2 && nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.LONG) {
            videoUrl = appnextAd.getVideoUrlHigh30Sec();
            if (videoUrl.equals("")) {
                return appnextAd.getVideoUrl30Sec();
            }
        } else {
            NativeAdRequest.VideoQuality videoQuality3 = nativeAdRequest.getVideoQuality();
            NativeAdRequest.VideoQuality videoQuality4 = NativeAdRequest.VideoQuality.LOW;
            if (videoQuality3 == videoQuality4 && nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.LONG) {
                videoUrl = appnextAd.getVideoUrl30Sec();
                if (videoUrl.equals("")) {
                    return appnextAd.getVideoUrlHigh30Sec();
                }
            } else if (nativeAdRequest.getVideoQuality() == videoQuality2 && nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.SHORT) {
                videoUrl = appnextAd.getVideoUrlHigh();
                if (videoUrl.equals("")) {
                    return appnextAd.getVideoUrl();
                }
            } else {
                if (nativeAdRequest.getVideoQuality() == videoQuality4 && nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.SHORT) {
                    videoUrl = appnextAd.getVideoUrl();
                    if (videoUrl.equals("")) {
                        str = appnextAd.getVideoUrlHigh();
                    }
                }
                return str;
            }
        }
        str = videoUrl;
        return str;
    }

    static boolean b(AppnextAd appnextAd) {
        return !appnextAd.getWideImageURL().equals("");
    }

    @Override // com.appnext.core.d
    protected final int a(Context context, j jVar) {
        try {
            NativeAdData nativeAdData = new NativeAdData((AppnextAd) jVar);
            int a10 = a(context, nativeAdData);
            if (a10 != 0) {
                return a10;
            }
            boolean z10 = true;
            if (nativeAdData.getCampaignGoal().equals("new") && i.b(context, nativeAdData.getAdPackage())) {
                return 1;
            }
            if (!nativeAdData.getCampaignGoal().equals("existing") || i.b(context, nativeAdData.getAdPackage())) {
                if (!b((AppnextAd) jVar)) {
                    AppnextAd appnextAd = (AppnextAd) jVar;
                    if (appnextAd.getVideoUrl().equals("") && appnextAd.getVideoUrlHigh().equals("") && appnextAd.getVideoUrl30Sec().equals("")) {
                        if (appnextAd.getVideoUrlHigh30Sec().equals("")) {
                            z10 = false;
                        }
                    }
                    if (!z10) {
                        return 3;
                    }
                }
                return 0;
            }
            return 2;
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAdsManager$adFilter", th);
            return 3;
        }
    }

    public final ArrayList<AppnextAd> a(String str, NativeAdRequest nativeAdRequest, ArrayList<AppnextAd> arrayList) {
        ArrayList<AppnextAd> arrayList2 = new ArrayList<>();
        Iterator<AppnextAd> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd next = it.next();
            if (a(next, nativeAdRequest)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    protected final AppnextAd a(Context context, Ad ad, ArrayList<AppnextAd> arrayList, NativeAdRequest nativeAdRequest) {
        try {
            Iterator<AppnextAd> it = arrayList.iterator();
            while (it.hasNext()) {
                AppnextAd next = it.next();
                if (a(next, nativeAdRequest)) {
                    next.getBannerID();
                    ad.getAUID();
                    return next;
                }
            }
            return null;
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAdsManager$getFirst", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public final AppnextAd a(Context context, Ad ad, NativeAdRequest nativeAdRequest) {
        ArrayList<?> ads;
        if (j(ad) == null || (ads = j(ad).getAds()) == null) {
            return null;
        }
        return a(context, ad, (ArrayList<AppnextAd>) ads, nativeAdRequest);
    }

    private boolean a(AppnextAd appnextAd, NativeAdRequest nativeAdRequest) {
        if (nativeAdRequest.getCreativeType() == NativeAdRequest.CreativeType.ALL) {
            return b(appnextAd) || !a(nativeAdRequest, appnextAd).equals("");
        } else if (nativeAdRequest.getCreativeType() == NativeAdRequest.CreativeType.STATIC_ONLY) {
            return b(appnextAd);
        } else {
            return nativeAdRequest.getCreativeType() == NativeAdRequest.CreativeType.VIDEO_ONLY && !a(nativeAdRequest, appnextAd).equals("");
        }
    }

    private static int a(Context context, NativeAdData nativeAdData) {
        try {
            if (!nativeAdData.getCptList().equals("") && !nativeAdData.getCptList().equals("[]")) {
                try {
                    JSONArray jSONArray = new JSONArray(nativeAdData.getCptList());
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        if (i.b(context, jSONArray.getString(i10))) {
                            return 0;
                        }
                    }
                    return 3;
                } catch (JSONException e8) {
                    com.appnext.base.a.a("NativeAdsManager$checkCPT", e8);
                }
            }
            return 0;
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAdsManager$checkCPT", th);
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.d
    public final boolean a(Ad ad) {
        return super.a(ad);
    }

    @Override // com.appnext.core.d
    protected final void a(Context context, Ad ad, com.appnext.core.a aVar) throws Exception {
        try {
            File[] listFiles = new File(context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/").listFiles();
            if (listFiles != null && listFiles.length != 0) {
                Arrays.sort(listFiles, new Comparator<File>() { // from class: com.appnext.nativeads.b.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(File file, File file2) {
                        return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                    }
                });
                int parseInt = Integer.parseInt(a.aG().t("num_saved_videos")) - 1;
                if (listFiles.length > parseInt) {
                    for (int i10 = 0; i10 < listFiles.length - parseInt; i10++) {
                        listFiles[i10].delete();
                    }
                }
            }
            NativeAdRequest nativeAdRequest = (NativeAdRequest) ((NativeAdObject) ad).getAdRequest();
            if (nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.DEFAULT) {
                ((NativeAdRequest) ((NativeAdObject) ad).getAdRequest()).setVideoLength(NativeAdRequest.VideoLength.fromInt(Integer.parseInt(a.aG().t("default_video_length"))));
            }
            if (nativeAdRequest.getVideoQuality() == NativeAdRequest.VideoQuality.DEFAULT) {
                nativeAdRequest.setVideoQuality(NativeAdRequest.VideoQuality.fromInt(Integer.parseInt(a.aG().t("default_video_quality"))));
            }
            AppnextAd a10 = aI().a(context, ad, nativeAdRequest);
            if (a10 == null || nativeAdRequest.getCreativeType() == NativeAdRequest.CreativeType.STATIC_ONLY) {
                return;
            }
            if (nativeAdRequest.getCachingPolicy() != NativeAdRequest.CachingPolicy.ALL && nativeAdRequest.getCachingPolicy() != NativeAdRequest.CachingPolicy.VIDEO_ONLY) {
                return;
            }
            String a11 = a(nativeAdRequest, a10);
            if (a11.equals("")) {
                return;
            }
            String b10 = b(a11);
            String str = context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
            File file = new File(str + b10);
            if (file.exists()) {
                file.setLastModified(System.currentTimeMillis());
                file.getPath();
                return;
            }
            new File(str).mkdirs();
            URL url = new URL(a11);
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
                    return;
                }
            }
        }
    }
}
