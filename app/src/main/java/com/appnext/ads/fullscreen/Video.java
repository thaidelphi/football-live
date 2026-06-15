package com.appnext.ads.fullscreen;

import android.content.Context;
import android.content.Intent;
import com.appnext.ads.AdsError;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.ECPM;
import com.appnext.core.SettingsManager;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.appnext.core.d;
import com.appnext.core.p;
import com.google.android.gms.common.api.Api;
import com.ironsource.ug;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class Video extends Ad {
    protected static final int FULL_SCREEN_VIDEO = 1;
    protected static final int REWARDED_VIDEO = 2;
    protected static final String TID = "301";
    protected static final String VID = "2.7.6.473";
    public static final String VIDEO_LENGTH_LONG = "30";
    public static final String VIDEO_LENGTH_SHORT = "15";
    private static boolean cacheVideo = true;
    protected static Video currentAd = null;
    private static boolean init = false;
    private static boolean streamingEnable = false;
    private boolean canClose;
    private OnAdError internalOnAdError;
    private String language;
    protected long rnd;
    private int rollCaptionTime;
    private boolean showCta;
    private int type;
    private OnAdError userOnAdError;
    private WeakReference<OnAdError> userOnAdErrorWR;
    private OnVideoEnded videoEnded;
    private String videoLength;

    public Video(Context context, int i10, String str) {
        super(context, str);
        this.videoLength = "15";
        this.showCta = true;
        this.rollCaptionTime = -2;
        this.language = "";
        this.canClose = true;
        try {
            this.type = i10;
            this.rnd = new Random(System.currentTimeMillis()).nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            init();
        } catch (Throwable th) {
            com.appnext.base.a.a("Video$Video", th);
        }
    }

    public static boolean getCacheVideo() {
        return cacheVideo;
    }

    private void init() {
        try {
            getConfig().g(ScarConstants.TOKEN_ID_KEY, getTID());
            getConfig().a(this.context, getPlacementID(), new SettingsManager.ConfigCallback() { // from class: com.appnext.ads.fullscreen.Video.1
                @Override // com.appnext.core.SettingsManager.ConfigCallback
                public final void error(String str) {
                }

                @Override // com.appnext.core.SettingsManager.ConfigCallback
                public final void loaded(HashMap<String, Object> hashMap) {
                }
            });
            p.ac().a(new Runnable() { // from class: com.appnext.ads.fullscreen.Video.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (Video.init) {
                            return;
                        }
                        Video.init = true;
                        com.appnext.core.i.a(new File(((Ad) Video.this).context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/tmp/"));
                    } catch (Throwable th) {
                        com.appnext.base.a.a("Video$init", th);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean isStreamingModeEnabled() {
        return streamingEnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load() {
        try {
            b.f().a(this.context, this, getPlacementID(), new d.a() { // from class: com.appnext.ads.fullscreen.Video.4
                @Override // com.appnext.core.d.a
                public final <T> void a(T t10) {
                    try {
                        AppnextAd a10 = b.f().a(((Ad) Video.this).context, Video.this);
                        if (a10 == null) {
                            OnAdError onAdErrorCallback = Video.this.getOnAdErrorCallback();
                            if (onAdErrorCallback != null) {
                                onAdErrorCallback.adError(AppnextError.NO_ADS);
                                return;
                            }
                            return;
                        }
                        OnAdLoaded onAdLoadedCallback = Video.this.getOnAdLoadedCallback();
                        if (onAdLoadedCallback != null) {
                            onAdLoadedCallback.adLoaded(a10.getBannerID(), a10.getCreativeType());
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("Video$load", th);
                    }
                }

                @Override // com.appnext.core.d.a
                public final void error(String str) {
                    try {
                        OnAdError onAdErrorCallback = Video.this.getOnAdErrorCallback();
                        if (onAdErrorCallback != null) {
                            onAdErrorCallback.adError(str);
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("Video$load", th);
                    }
                }
            });
        } catch (Throwable th) {
            com.appnext.base.a.a("Video$load", th);
        }
    }

    public static void setCacheVideo(boolean z10) {
        cacheVideo = z10;
    }

    public static void setStreamingMode(boolean z10) {
        streamingEnable = z10;
    }

    @Override // com.appnext.core.Ad
    public void destroy() {
        super.destroy();
        this.videoEnded = null;
        try {
            Context context = this.context;
            if (context == null || context.getFilesDir() == null) {
                return;
            }
            com.appnext.core.i.a(new File(this.context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/tmp/vid" + this.rnd + "/"));
        } catch (Throwable th) {
            com.appnext.base.a.a("Video$destroy", th);
        }
    }

    protected void finalize() throws Throwable {
        try {
            destroy();
        } catch (Throwable th) {
            try {
                com.appnext.base.a.a("Video$finalize", th);
            } finally {
                super.finalize();
            }
        }
    }

    protected SettingsManager getConfig() {
        int i10 = this.type;
        if (i10 == 2) {
            return f.o();
        }
        if (i10 == 1) {
            return c.h();
        }
        return null;
    }

    @Override // com.appnext.core.Ad
    public void getECPM(final OnECPMLoaded onECPMLoaded) {
        if (onECPMLoaded != null) {
            b.f().a(this.context, this, getPlacementID(), new d.a() { // from class: com.appnext.ads.fullscreen.Video.5
                @Override // com.appnext.core.d.a
                public final <T> void a(T t10) {
                    AppnextAd a10 = b.f().a(((Ad) Video.this).context, Video.this);
                    if (a10 != null) {
                        onECPMLoaded.ecpm(new ECPM(a10.getECPM(), a10.getPPR(), a10.getBannerID()));
                    } else {
                        onECPMLoaded.error(AppnextError.NO_ADS);
                    }
                }

                @Override // com.appnext.core.d.a
                public final void error(String str) {
                    onECPMLoaded.error(str);
                }
            }, false);
            return;
        }
        throw new IllegalArgumentException("Callback cannot be null");
    }

    public String getLanguage() {
        return this.language;
    }

    @Override // com.appnext.core.Ad
    public OnAdError getOnAdErrorCallback() {
        return super.getOnAdErrorCallback();
    }

    public OnVideoEnded getOnVideoEndedCallback() {
        return this.videoEnded;
    }

    public int getRollCaptionTime() {
        return this.rollCaptionTime;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.Ad
    public String getSessionId() {
        return super.getSessionId();
    }

    @Override // com.appnext.core.Ad
    public String getTID() {
        return TID;
    }

    @Override // com.appnext.core.Ad
    public String getVID() {
        return VID;
    }

    public String getVideoLength() {
        return this.videoLength;
    }

    @Override // com.appnext.core.Ad
    public boolean isAdLoaded() {
        if (getPlacementID().equals("")) {
            return false;
        }
        return b.f().b(this);
    }

    public boolean isBackButtonCanClose() {
        return this.canClose;
    }

    public boolean isShowCta() {
        return this.showCta;
    }

    @Override // com.appnext.core.Ad
    public void loadAd() {
        try {
            if (!getPlacementID().equals("")) {
                if (com.appnext.core.i.c(this.context, "android.permission.INTERNET") && com.appnext.core.i.h(this.context)) {
                    getConfig().a(this.context, getPlacementID(), new SettingsManager.ConfigCallback() { // from class: com.appnext.ads.fullscreen.Video.3
                        @Override // com.appnext.core.SettingsManager.ConfigCallback
                        public final void error(String str) {
                            Video.this.load();
                        }

                        @Override // com.appnext.core.SettingsManager.ConfigCallback
                        public final void loaded(HashMap<String, Object> hashMap) {
                            Video.this.load();
                        }
                    });
                    return;
                }
                OnAdError onAdErrorCallback = getOnAdErrorCallback();
                if (onAdErrorCallback != null) {
                    onAdErrorCallback.adError(AppnextError.CONNECTION_ERROR);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Placement ID cannot be empty");
        } catch (Throwable th) {
            com.appnext.base.a.a("Video$loadAd", th);
        }
    }

    public void setBackButtonCanClose(boolean z10) {
        this.canClose = z10;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    @Override // com.appnext.core.Ad
    public void setOnAdErrorCallback(OnAdError onAdError) {
        if (onAdError == null) {
            return;
        }
        OnAdError onAdError2 = new OnAdError() { // from class: com.appnext.ads.fullscreen.Video.6
            @Override // com.appnext.core.callbacks.OnAdError
            public final void adError(String str) {
                String str2;
                OnAdError onAdError3;
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -2026653947:
                        if (str.equals("Internal error")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1958363695:
                        if (str.equals(AppnextError.NO_ADS)) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1477010874:
                        if (str.equals(AppnextError.CONNECTION_ERROR)) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -507110949:
                        if (str.equals(AppnextError.NO_MARKET)) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 297538105:
                        if (str.equals(AdsError.AD_NOT_READY)) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 350741825:
                        if (str.equals("Timeout")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 844170097:
                        if (str.equals(AppnextError.SLOW_CONNECTION)) {
                            c10 = 6;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        str2 = "error_internal_error";
                        break;
                    case 1:
                        str2 = "error_no_ads";
                        break;
                    case 2:
                        str2 = "error_connection_error";
                        break;
                    case 3:
                        str2 = "error_no_market";
                        break;
                    case 4:
                        str2 = "error_ad_not_ready";
                        break;
                    case 5:
                        str2 = "error_timeout";
                        break;
                    case 6:
                        str2 = "error_slow_connection";
                        break;
                    default:
                        str2 = "";
                        break;
                }
                com.appnext.core.i.a(((Ad) Video.this).context, Video.this.getTID(), Video.this.getVID(), Video.this.getAUID(), Video.this.getPlacementID(), Video.this.getSessionId(), str2, "current_interstitial", "", "");
                if (Video.this.userOnAdErrorWR == null || (onAdError3 = (OnAdError) Video.this.userOnAdErrorWR.get()) == null) {
                    return;
                }
                onAdError3.adError(str);
            }
        };
        this.internalOnAdError = onAdError2;
        super.setOnAdErrorCallback(onAdError2);
        this.userOnAdErrorWR = new WeakReference<>(onAdError);
    }

    public void setOnVideoEndedCallback(OnVideoEnded onVideoEnded) {
        this.videoEnded = onVideoEnded;
    }

    public void setParams(String str, String str2) {
        getConfig().i(str, str2);
    }

    public void setRollCaptionTime(int i10) {
        if (i10 == -1 || (i10 >= 3 && i10 <= 10)) {
            this.rollCaptionTime = i10;
        }
    }

    public void setShowCta(boolean z10) {
        this.showCta = z10;
    }

    public void setVideoLength(String str) {
        if (str.equals("15") || str.equals("30")) {
            this.videoLength = str;
        }
    }

    @Override // com.appnext.core.Ad
    public void showAd() {
        try {
            if (!getPlacementID().equals("")) {
                if (!com.appnext.core.i.c(this.context, "android.permission.INTERNET")) {
                    OnAdError onAdErrorCallback = getOnAdErrorCallback();
                    if (onAdErrorCallback != null) {
                        onAdErrorCallback.adError(AppnextError.CONNECTION_ERROR);
                        return;
                    }
                    return;
                }
                int q10 = com.appnext.core.i.q(getConfig().t("min_internet_connection_video"));
                int q11 = com.appnext.core.i.q(com.appnext.core.i.d(this.context));
                if (q11 == -1) {
                    OnAdError onAdErrorCallback2 = getOnAdErrorCallback();
                    if (onAdErrorCallback2 != null) {
                        onAdErrorCallback2.adError(AppnextError.CONNECTION_ERROR);
                        return;
                    }
                    return;
                } else if (q11 < q10) {
                    OnAdError onAdErrorCallback3 = getOnAdErrorCallback();
                    if (onAdErrorCallback3 != null) {
                        onAdErrorCallback3.adError(AppnextError.SLOW_CONNECTION);
                        return;
                    }
                    return;
                } else {
                    com.appnext.core.i.a(this.context, getTID(), getVID(), getAUID(), getPlacementID(), getSessionId(), "show_request", this.type == 1 ? "fullscreen" : "rewarded", "", "");
                    if (b.f().b(this)) {
                        Intent intent = new Intent(this.context, FullscreenActivity.class);
                        intent.setFlags(268435456);
                        intent.putExtra(ug.f21009x, getPlacementID());
                        intent.putExtra("type", this.type);
                        currentAd = this;
                        this.context.startActivity(intent);
                        return;
                    }
                    OnAdError onAdErrorCallback4 = getOnAdErrorCallback();
                    if (onAdErrorCallback4 != null) {
                        onAdErrorCallback4.adError(AdsError.AD_NOT_READY);
                    }
                    b.f().a(this.context, this, getPlacementID(), (d.a) null);
                    com.appnext.core.i.a(this.context, getTID(), getVID(), getAUID(), getPlacementID(), getSessionId(), "ad_not_ready", this.type == 1 ? "fullscreen" : "rewarded", "", "");
                    return;
                }
            }
            throw new IllegalArgumentException("Placement ID cannot be empty");
        } catch (Throwable th) {
            com.appnext.base.a.a("Video$showAd", th);
        }
    }

    public Video(Context context, int i10, String str, VideoConfig videoConfig) {
        super(context, str);
        this.videoLength = "15";
        this.showCta = true;
        this.rollCaptionTime = -2;
        this.language = "";
        this.canClose = true;
        this.type = i10;
        this.rnd = new Random(System.currentTimeMillis()).nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        init();
        if (videoConfig != null) {
            setPostback(videoConfig.getPostback());
            setCategories(videoConfig.getCategories());
            setSpecificCategories(videoConfig.getSpecificCategories());
            setOrientation(videoConfig.getOrientation());
            if (videoConfig.showCta != null) {
                setShowCta(videoConfig.isShowCta());
            }
            setRollCaptionTime(videoConfig.getRollCaptionTime());
            setVideoLength(videoConfig.getVideoLength());
            if (videoConfig.mute != null) {
                setMute(videoConfig.getMute());
            }
            setMinVideoLength(videoConfig.getMinVideoLength());
            setMaxVideoLength(videoConfig.getMaxVideoLength());
            setLanguage(videoConfig.getLanguage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Video(Context context, Video video) {
        super(context, video.getPlacementID());
        this.videoLength = "15";
        this.showCta = true;
        this.rollCaptionTime = -2;
        this.language = "";
        this.canClose = true;
        try {
            this.type = video.type;
            this.rnd = video.rnd;
            setPostback(video.getPostback());
            setCategories(video.getCategories());
            setSpecificCategories(video.getSpecificCategories());
            setOrientation(video.getOrientation());
            setVideoLength(video.getVideoLength());
            setMute(video.getMute());
            setMinVideoLength(video.getMinVideoLength());
            setMaxVideoLength(video.getMaxVideoLength());
            setRollCaptionTime(video.getRollCaptionTime());
            setShowCta(video.isShowCta());
            setLanguage(video.getLanguage());
            setOnVideoEndedCallback(video.getOnVideoEndedCallback());
            setOnAdClosedCallback(video.getOnAdClosedCallback());
            setOnAdErrorCallback(video.getOnAdErrorCallback());
            setOnAdClickedCallback(video.getOnAdClickedCallback());
            setOnAdOpenedCallback(video.getOnAdOpenedCallback());
            setOnAdLoadedCallback(video.getOnAdLoadedCallback());
            setSessionId(video.getSessionId());
        } catch (Throwable th) {
            com.appnext.base.a.a("Video$Video", th);
        }
    }
}
