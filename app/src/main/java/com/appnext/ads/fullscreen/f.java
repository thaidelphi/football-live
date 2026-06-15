package com.appnext.ads.fullscreen;

import com.appnext.core.SettingsManager;
import com.ironsource.x8;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f extends SettingsManager {
    private static f O;

    /* renamed from: v  reason: collision with root package name */
    private String f10044v = "https://cdn.appnext.com/tools/sdk/confign/rewarded/" + com.appnext.core.i.Y() + "/rewarded_config.txt";

    /* renamed from: w  reason: collision with root package name */
    private HashMap<String, String> f10045w = null;

    private f() {
    }

    public static synchronized f o() {
        f fVar;
        synchronized (f.class) {
            if (O == null) {
                O = new f();
            }
            fVar = O;
        }
        return fVar;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String j() {
        return this.f10044v;
    }

    @Override // com.appnext.core.SettingsManager
    protected final HashMap<String, String> k() {
        return this.f10045w;
    }

    @Override // com.appnext.core.SettingsManager
    protected final HashMap<String, String> l() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("can_close", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("show_close", "false");
        hashMap.put("video_length", "15");
        hashMap.put("mute", "false");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("pview", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("min_internet_connection_video", x8.f21378a);
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("default_mode", RewardedVideo.VIDEO_MODE_NORMAL);
        hashMap.put("postpone_vta_sec", "0");
        hashMap.put("postpone_impression_sec", "0");
        hashMap.put("resolve_timeout", "8");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("caption_text_time", "3");
        hashMap.put("pre_title_string1", "Which Ad");
        hashMap.put("pre_title_string2", "Would you like to watch?");
        hashMap.put("pre_cta_string", "Play this ad");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_a", "0");
        hashMap.put("clickType_b", "0");
        hashMap.put("didPrivacy", "false");
        hashMap.put("stp_flag", "false");
        hashMap.put("score_refresh_time_min", "20160");
        hashMap.put("dlEnable", "false");
        hashMap.put("n_clusters", "3");
        return hashMap;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String m() {
        return "RewardedSettings";
    }
}
