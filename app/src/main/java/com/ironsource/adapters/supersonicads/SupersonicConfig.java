package com.ironsource.adapters.supersonicads;

import android.text.TextUtils;
import com.ironsource.cq;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.o9;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class SupersonicConfig {
    private static SupersonicConfig mInstance;
    private final String CUSTOM_PARAM_PREFIX = "custom_";
    private final String CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
    private final String DYNAMIC_CONTROLLER_URL = "controllerUrl";
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
    NetworkSettings mProviderSettings = new NetworkSettings(cq.c().b("Mediation"));

    private SupersonicConfig() {
    }

    private Map<String, String> convertCustomParams(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            try {
                Set<String> keySet = map.keySet();
                if (keySet != null) {
                    for (String str : keySet) {
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = map.get(str);
                            if (!TextUtils.isEmpty(str2)) {
                                hashMap.put("custom_" + str, str2);
                            }
                        }
                    }
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, ":convertCustomParams()", e8);
            }
        }
        return hashMap;
    }

    public static SupersonicConfig getConfigObj() {
        if (mInstance == null) {
            mInstance = new SupersonicConfig();
        }
        return mInstance;
    }

    public boolean getClientSideCallbacks() {
        NetworkSettings networkSettings = this.mProviderSettings;
        if (networkSettings == null || networkSettings.getRewardedVideoSettings() == null || !this.mProviderSettings.getRewardedVideoSettings().has("useClientSideCallbacks")) {
            return false;
        }
        return this.mProviderSettings.getRewardedVideoSettings().optBoolean("useClientSideCallbacks", false);
    }

    public void setClientSideCallbacks(boolean z10) {
        this.mProviderSettings.setRewardedVideoSettings("useClientSideCallbacks", String.valueOf(z10));
    }

    public void setCustomControllerUrl(String str) {
        this.mProviderSettings.setRewardedVideoSettings("controllerUrl", str);
        this.mProviderSettings.setInterstitialSettings("controllerUrl", str);
        this.mProviderSettings.setBannerSettings("controllerUrl", str);
        this.mProviderSettings.setNativeAdSettings("controllerUrl", str);
    }

    public void setDebugMode(int i10) {
        this.mProviderSettings.setRewardedVideoSettings("debugMode", Integer.valueOf(i10));
        this.mProviderSettings.setInterstitialSettings("debugMode", Integer.valueOf(i10));
        this.mProviderSettings.setBannerSettings("debugMode", Integer.valueOf(i10));
        this.mProviderSettings.setNativeAdSettings("debugMode", Integer.valueOf(i10));
    }
}
