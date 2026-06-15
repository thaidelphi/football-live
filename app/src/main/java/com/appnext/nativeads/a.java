package com.appnext.nativeads;

import com.appnext.core.SettingsManager;
import com.appnext.core.i;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends SettingsManager {
    private static a fz;

    /* renamed from: v  reason: collision with root package name */
    private String f10068v = "https://cdn.appnext.com/tools/sdk/confign/nativeads_new/" + i.Y() + "/native_ads_config.txt";

    public static synchronized a aG() {
        a aVar;
        synchronized (a.class) {
            if (fz == null) {
                fz = new a();
            }
            aVar = fz;
        }
        return aVar;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String j() {
        return this.f10068v;
    }

    @Override // com.appnext.core.SettingsManager
    protected final HashMap<String, String> k() {
        return null;
    }

    @Override // com.appnext.core.SettingsManager
    protected final HashMap<String, String> l() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("resolve_timeout", "8");
        hashMap.put("urlApp_protection", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("pview", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("postpone_vta_sec", "0");
        hashMap.put("postpone_impression_sec", "0");
        hashMap.put("default_caching_policy", "3");
        hashMap.put("default_video_quality", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        hashMap.put("num_saved_videos", "5");
        hashMap.put("default_video_length", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        hashMap.put("min_internet_connection_video", "3G");
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("gdpr", "false");
        hashMap.put("cpiActiveFlow", "d");
        hashMap.put("cpcActiveFlow", "b");
        hashMap.put("didPrivacy", "false");
        hashMap.put("min_imp_precentage", "50");
        hashMap.put("repeat_viewable_criteria", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("min_vta_precentage", "50");
        hashMap.put("repeat_vta_viewable_criteria", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("stp_flag", "false");
        hashMap.put("score_refresh_time_min", "20160");
        hashMap.put("dlEnable", "false");
        hashMap.put("n_clusters", "3");
        return hashMap;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String m() {
        return "NativeAdSettings";
    }
}
