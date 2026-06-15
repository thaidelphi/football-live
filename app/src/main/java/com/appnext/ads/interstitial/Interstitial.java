package com.appnext.ads.interstitial;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.appnext.ads.AdsError;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.ECPM;
import com.appnext.core.SettingsManager;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.appnext.core.d;
import com.appnext.core.i;
import com.appnext.core.p;
import com.appnext.core.webview.AppnextWebView;
import com.ironsource.ug;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Interstitial extends Ad {
    private static final String JS_URL = "https://cdn.appnext.com/tools/sdk/interstitial/v75/script.min.js";
    protected static final String TID = "301";
    public static final String TYPE_MANAGED = "managed";
    public static final String TYPE_STATIC = "static";
    public static final String TYPE_VIDEO = "video";
    protected static final String VID = "2.7.6.473";
    protected static Interstitial currentAd;
    private boolean autoPlay;
    private String buttonColor;
    private boolean calledShow;
    private Boolean canClose;
    private boolean configLoaded;
    private String creativeType;
    private OnAdError internalOnAdError;
    private String language;
    private boolean setAutoPlay;
    private boolean setCanClose;
    private String skipText;
    private String titleText;
    private WeakReference<OnAdError> userOnAdErrorWR;

    public Interstitial(Context context, String str) {
        super(context, str);
        this.creativeType = TYPE_MANAGED;
        this.titleText = "";
        this.skipText = "";
        this.autoPlay = true;
        this.setAutoPlay = false;
        this.setCanClose = false;
        this.configLoaded = false;
        this.calledShow = false;
        this.buttonColor = "";
        this.language = "";
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCreative() {
        int q10 = i.q(getConfig().t("min_internet_connection"));
        int q11 = i.q(getConfig().t("min_internet_connection_video"));
        int q12 = i.q(i.d(this.context));
        return (q12 < q10 || q12 >= q11) ? getCreativeType() : "static";
    }

    private boolean hasVideo(AppnextAd appnextAd) {
        return (appnextAd.getVideoUrl().equals("") && appnextAd.getVideoUrlHigh().equals("") && appnextAd.getVideoUrl30Sec().equals("") && appnextAd.getVideoUrlHigh30Sec().equals("")) ? false : true;
    }

    private void init() {
        try {
            loadConfig();
            AppnextWebView.t(this.context).a(getPageUrl(), (AppnextWebView.c) null);
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$init", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load() {
        a.C().a(this.context, this, getPlacementID(), new d.a() { // from class: com.appnext.ads.interstitial.Interstitial.2
            @Override // com.appnext.core.d.a
            public final <T> void a(T t10) {
                try {
                    AppnextAd a10 = a.C().a(((Ad) Interstitial.this).context, (ArrayList) t10, Interstitial.this.getCreative(), Interstitial.this);
                    if (a10 != null) {
                        OnAdLoaded onAdLoadedCallback = Interstitial.this.getOnAdLoadedCallback();
                        if (onAdLoadedCallback != null) {
                            onAdLoadedCallback.adLoaded(a10.getBannerID(), a10.getCreativeType());
                            return;
                        }
                        return;
                    }
                    OnAdError onAdErrorCallback = Interstitial.this.getOnAdErrorCallback();
                    if (onAdErrorCallback != null) {
                        onAdErrorCallback.adError(AppnextError.NO_ADS);
                    }
                }
            }

            @Override // com.appnext.core.d.a
            public final void error(String str) {
                try {
                    OnAdError onAdErrorCallback = Interstitial.this.getOnAdErrorCallback();
                    if (onAdErrorCallback != null) {
                        onAdErrorCallback.adError(str);
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("Interstitial$error", th);
                }
            }
        }, getCreative());
    }

    private void loadConfig() {
        getConfig().g(ScarConstants.TOKEN_ID_KEY, getTID());
        getConfig().a(this.context, getPlacementID(), new SettingsManager.ConfigCallback() { // from class: com.appnext.ads.interstitial.Interstitial.5
            @Override // com.appnext.core.SettingsManager.ConfigCallback
            public final void error(String str) {
                try {
                    Interstitial.this.configLoaded = true;
                    if (Interstitial.this.calledShow) {
                        Interstitial.this.showAd();
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("Interstitial$error", th);
                }
            }

            @Override // com.appnext.core.SettingsManager.ConfigCallback
            public final void loaded(HashMap<String, Object> hashMap) {
                try {
                    Interstitial.this.configLoaded = true;
                    if (Interstitial.this.calledShow) {
                        Interstitial.this.showAd();
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("Interstitial$loadConfig", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInterstitialActivity() {
        try {
            Intent activityIntent = getActivityIntent();
            if (activityIntent != null) {
                this.context.startActivity(activityIntent);
                return;
            }
            throw new IllegalArgumentException("null intent");
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$startInterstitialActivity", th);
        }
    }

    @Override // com.appnext.core.Ad
    public void destroy() {
        super.destroy();
        currentAd = null;
    }

    @Override // com.appnext.core.Ad
    public String getAUID() {
        return "600";
    }

    protected Intent getActivityIntent() {
        Intent intent = new Intent(this.context, InterstitialActivity.class);
        try {
            intent.setFlags(268435456);
            intent.addFlags(67108864);
            intent.putExtra(ug.f21009x, getPlacementID());
            if (this.setAutoPlay) {
                intent.putExtra("auto_play", this.autoPlay);
            }
            if (this.setCanClose) {
                intent.putExtra("can_close", isBackButtonCanClose());
            }
            if (this.setMute) {
                intent.putExtra("mute", getMute());
            }
            intent.putExtra("cat", getCategories());
            intent.putExtra("lockcat", getSpecificCategories());
            intent.putExtra("pbk", getPostback());
            intent.putExtra("b_color", getButtonColor());
            intent.putExtra("skip_title", getSkipText());
            intent.putExtra("creative", getCreative());
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$getActivityIntent", th);
        }
        return intent;
    }

    public String getButtonColor() {
        return this.buttonColor;
    }

    protected SettingsManager getConfig() {
        return c.E();
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    @Override // com.appnext.core.Ad
    public void getECPM(final OnECPMLoaded onECPMLoaded) {
        try {
            if (onECPMLoaded != null) {
                a.C().a(this.context, (Ad) this, getPlacementID(), new d.a() { // from class: com.appnext.ads.interstitial.Interstitial.4
                    @Override // com.appnext.core.d.a
                    public final <T> void a(T t10) {
                        try {
                            AppnextAd a10 = a.C().a(((Ad) Interstitial.this).context, (ArrayList) t10, Interstitial.this.getCreative(), Interstitial.this);
                            if (a10 != null) {
                                onECPMLoaded.ecpm(new ECPM(a10.getECPM(), a10.getPPR(), a10.getBannerID()));
                            } else {
                                onECPMLoaded.error(AppnextError.NO_ADS);
                            }
                        } catch (Throwable unused) {
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
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$getECPM", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.appnext.core.webview.a getFallback() {
        return new b();
    }

    public String getLanguage() {
        return this.language;
    }

    @Override // com.appnext.core.Ad
    public OnAdError getOnAdErrorCallback() {
        return super.getOnAdErrorCallback();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getPageUrl() {
        return JS_URL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.Ad
    public String getSessionId() {
        return super.getSessionId();
    }

    public String getSkipText() {
        return this.skipText;
    }

    @Override // com.appnext.core.Ad
    public String getTID() {
        return TID;
    }

    @Override // com.appnext.core.Ad
    public String getVID() {
        return VID;
    }

    @Override // com.appnext.core.Ad
    public boolean isAdLoaded() {
        try {
            if (getPlacementID().equals("")) {
                return false;
            }
            return a.C().f(this);
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$isAdLoaded", th);
            return true;
        }
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    @Deprecated
    public boolean isBackButtonCanClose() {
        Boolean bool = this.canClose;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Override // com.appnext.core.Ad
    public void loadAd() {
        try {
            if (getPlacementID().equals("")) {
                com.appnext.base.a.a("Interstitial$init", new Throwable("Placement ID cannot be empty"));
            }
            if (i.c(this.context, "android.permission.INTERNET") && i.h(this.context)) {
                p.ac().a(new Runnable() { // from class: com.appnext.ads.interstitial.Interstitial.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (((Ad) Interstitial.this).context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                                i.a(((Ad) Interstitial.this).context, "http://www.appnext.com/myid.html", null);
                            } else {
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Ad) Interstitial.this).context.getSystemService("connectivity")).getActiveNetworkInfo();
                                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                                    return;
                                }
                            }
                            Interstitial.this.getConfig().a(((Ad) Interstitial.this).context, Interstitial.this.getPlacementID(), new SettingsManager.ConfigCallback() { // from class: com.appnext.ads.interstitial.Interstitial.1.2
                                @Override // com.appnext.core.SettingsManager.ConfigCallback
                                public final void error(String str) {
                                    Interstitial.this.load();
                                }

                                @Override // com.appnext.core.SettingsManager.ConfigCallback
                                public final void loaded(HashMap<String, Object> hashMap) {
                                    Interstitial.this.load();
                                }
                            });
                        } catch (Throwable th) {
                            com.appnext.base.a.a("Interstitial$init", th);
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.ads.interstitial.Interstitial.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    OnAdError onAdErrorCallback = Interstitial.this.getOnAdErrorCallback();
                                    if (onAdErrorCallback != null) {
                                        onAdErrorCallback.adError(AppnextError.CONNECTION_ERROR);
                                    }
                                }
                            });
                        }
                    }
                });
                return;
            }
            OnAdError onAdErrorCallback = getOnAdErrorCallback();
            if (onAdErrorCallback != null) {
                onAdErrorCallback.adError(AppnextError.CONNECTION_ERROR);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$loadAd", th);
        }
    }

    public void setAutoPlay(boolean z10) {
        this.setAutoPlay = true;
        this.autoPlay = z10;
    }

    @Deprecated
    public void setBackButtonCanClose(boolean z10) {
        this.setCanClose = true;
        this.canClose = Boolean.valueOf(z10);
    }

    public void setButtonColor(String str) {
        if (str != null && !str.equals("")) {
            if (!str.startsWith("#")) {
                str = "#" + str;
            }
            Color.parseColor(str);
            this.buttonColor = str;
            return;
        }
        this.buttonColor = "";
    }

    public void setCreativeType(String str) {
        try {
            if (str != null) {
                if (!str.equals(TYPE_MANAGED) && !str.equals("static") && !str.equals("video")) {
                    throw new IllegalArgumentException("Wrong creative type");
                }
                this.creativeType = str;
                return;
            }
            throw new IllegalArgumentException("Wrong creative type");
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$setCreativeType", th);
        }
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    @Override // com.appnext.core.Ad
    public void setOnAdErrorCallback(OnAdError onAdError) {
        if (onAdError == null) {
            return;
        }
        try {
            OnAdError onAdError2 = new OnAdError() { // from class: com.appnext.ads.interstitial.Interstitial.6
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
                    i.a(((Ad) Interstitial.this).context, Interstitial.this.getTID(), Interstitial.this.getVID(), Interstitial.this.getAUID(), Interstitial.this.getPlacementID(), Interstitial.this.getSessionId(), str2, "current_interstitial", "", "");
                    if (Interstitial.this.userOnAdErrorWR == null || (onAdError3 = (OnAdError) Interstitial.this.userOnAdErrorWR.get()) == null) {
                        return;
                    }
                    onAdError3.adError(str);
                }
            };
            this.internalOnAdError = onAdError2;
            super.setOnAdErrorCallback(onAdError2);
            this.userOnAdErrorWR = new WeakReference<>(onAdError);
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$setOnAdErrorCallback", th);
        }
    }

    @Override // com.appnext.core.Ad
    @Deprecated
    public void setOrientation(String str) {
    }

    public void setParams(String str, String str2) {
        getConfig().i(str, str2);
    }

    public void setSkipText(String str) {
        if (str == null) {
            str = "";
        }
        this.skipText = str;
    }

    @Override // com.appnext.core.Ad
    public void showAd() {
        try {
            if (!getPlacementID().equals("")) {
                if (!i.c(this.context, "android.permission.INTERNET")) {
                    OnAdError onAdErrorCallback = getOnAdErrorCallback();
                    if (onAdErrorCallback != null) {
                        onAdErrorCallback.adError(AppnextError.CONNECTION_ERROR);
                        return;
                    }
                    return;
                }
                int q10 = i.q(getConfig().t("min_internet_connection"));
                int q11 = i.q(i.d(this.context));
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
                    currentAd = this;
                    if (a.C().f(this)) {
                        startInterstitialActivity();
                        return;
                    } else {
                        a.C().a(this.context, this, getPlacementID(), new d.a() { // from class: com.appnext.ads.interstitial.Interstitial.3
                            @Override // com.appnext.core.d.a
                            public final <T> void a(T t10) {
                                Interstitial.this.startInterstitialActivity();
                            }

                            @Override // com.appnext.core.d.a
                            public final void error(final String str) {
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.ads.interstitial.Interstitial.3.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        try {
                                            OnAdError onAdErrorCallback4 = Interstitial.this.getOnAdErrorCallback();
                                            if (onAdErrorCallback4 != null) {
                                                onAdErrorCallback4.adError(str);
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                });
                            }
                        }, getCreative());
                        return;
                    }
                }
            }
            throw new IllegalArgumentException("Placement ID cannot be empty");
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$showAd", th);
        }
    }

    public Interstitial(Context context, String str, InterstitialConfig interstitialConfig) {
        super(context, str);
        this.creativeType = TYPE_MANAGED;
        this.titleText = "";
        this.skipText = "";
        boolean z10 = true;
        this.autoPlay = true;
        this.setAutoPlay = false;
        this.setCanClose = false;
        this.configLoaded = false;
        this.calledShow = false;
        this.buttonColor = "";
        this.language = "";
        try {
            init();
            if (interstitialConfig != null) {
                setPostback(interstitialConfig.getPostback());
                setCategories(interstitialConfig.getCategories());
                setSpecificCategories(interstitialConfig.getSpecificCategories());
                setButtonColor(interstitialConfig.getButtonColor());
                if (interstitialConfig.backButtonCanClose != null) {
                    setBackButtonCanClose(interstitialConfig.isBackButtonCanClose());
                }
                setSkipText(interstitialConfig.getSkipText());
                if (interstitialConfig.autoPlay != null) {
                    setAutoPlay(interstitialConfig.isAutoPlay());
                }
                setCreativeType(interstitialConfig.getCreativeType());
                setOrientation(interstitialConfig.getOrientation());
                if (interstitialConfig.mute == null) {
                    z10 = false;
                }
                if (z10) {
                    setMute(interstitialConfig.getMute());
                }
                setMinVideoLength(interstitialConfig.getMinVideoLength());
                setMaxVideoLength(interstitialConfig.getMaxVideoLength());
                setLanguage(interstitialConfig.getLanguage());
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$Interstitial", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Interstitial(Interstitial interstitial) {
        super(interstitial);
        this.creativeType = TYPE_MANAGED;
        this.titleText = "";
        this.skipText = "";
        this.autoPlay = true;
        this.setAutoPlay = false;
        this.setCanClose = false;
        this.configLoaded = false;
        this.calledShow = false;
        this.buttonColor = "";
        this.language = "";
        try {
            this.creativeType = interstitial.creativeType;
            this.titleText = interstitial.titleText;
            this.skipText = interstitial.skipText;
            this.autoPlay = interstitial.autoPlay;
            this.setAutoPlay = interstitial.setAutoPlay;
            this.setCanClose = interstitial.setCanClose;
            this.configLoaded = interstitial.configLoaded;
            this.calledShow = interstitial.calledShow;
            this.canClose = interstitial.canClose;
            this.buttonColor = interstitial.buttonColor;
            this.language = interstitial.language;
            this.userOnAdErrorWR = interstitial.userOnAdErrorWR;
        } catch (Throwable th) {
            com.appnext.base.a.a("Interstitial$Interstitial", th);
        }
    }
}
