package com.appnext.ads.interstitial;

import com.appnext.core.SettingsManager;
import com.appnext.core.i;
import com.ironsource.x8;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c extends SettingsManager {
    private static c aN;

    /* renamed from: v  reason: collision with root package name */
    private String f10049v = "https://cdn.appnext.com/tools/sdk/confign/interstitial/" + i.Y() + "/interstitial_config.txt";

    /* renamed from: w  reason: collision with root package name */
    private HashMap<String, String> f10050w = null;

    private c() {
    }

    public static synchronized c E() {
        c cVar;
        synchronized (c.class) {
            if (aN == null) {
                aN = new c();
            }
            cVar = aN;
        }
        return cVar;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String j() {
        return this.f10049v;
    }

    @Override // com.appnext.core.SettingsManager
    protected final HashMap<String, String> k() {
        return this.f10050w;
    }

    @Override // com.appnext.core.SettingsManager
    protected final HashMap<String, String> l() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("creative", Interstitial.TYPE_MANAGED);
        hashMap.put("auto_play", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("mute", "false");
        hashMap.put("pview", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("min_internet_connection", "2g");
        hashMap.put("min_internet_connection_video", x8.f21378a);
        hashMap.put("urlApp_protection", "false");
        hashMap.put("can_close", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("video_length", "15");
        hashMap.put("button_text", "");
        hashMap.put("button_color", "");
        hashMap.put("skip_title", "");
        hashMap.put("remove_poster_on_auto_play", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("show_rating", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("show_desc", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("postpone_vta_sec", "0");
        hashMap.put("postpone_impression_sec", "0");
        hashMap.put("resolve_timeout", "8");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_A", "0");
        hashMap.put("didPrivacy", "false");
        hashMap.put("S1", "[{\"id\":\"multi\",\"p\":50},{\"id\":\"single\",\"p\":50}]");
        hashMap.put("stp_flag", "false");
        hashMap.put("score_refresh_time_min", "20160");
        hashMap.put("dlEnable", "false");
        hashMap.put("n_clusters", "3");
        return hashMap;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String m() {
        return "InterstitialSettings";
    }
}
