package com.appnext.banners;

import com.appnext.core.SettingsManager;
import com.appnext.core.i;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d extends SettingsManager {
    private static d bF;

    private d() {
    }

    public static synchronized d K() {
        d dVar;
        synchronized (d.class) {
            if (bF == null) {
                bF = new d();
            }
            dVar = bF;
        }
        return dVar;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String j() {
        return "https://cdn.appnext.com/tools/sdk/confign/banner/" + i.Y() + "/banner_config.txt";
    }

    @Override // com.appnext.core.SettingsManager
    protected final HashMap<String, String> k() {
        return null;
    }

    @Override // com.appnext.core.SettingsManager
    protected final HashMap<String, String> l() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("urlApp_protection", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("resolve_timeout", "8");
        hashMap.put("postpone_impression_sec", "0");
        hashMap.put("postpone_vta_sec", "0");
        hashMap.put("pview", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("gdpr", "false");
        hashMap.put("BANNER_cpiActiveFlow", "d");
        hashMap.put("BANNER_cpcActiveFlow", "b");
        hashMap.put("LARGE_BANNER_cpiActiveFlow", "d");
        hashMap.put("LARGE_BANNER_cpcActiveFlow", "b");
        hashMap.put("MEDIUM_RECTANGLE_cpiActiveFlow", "d");
        hashMap.put("MEDIUM_RECTANGLE_cpcActiveFlow", "b");
        hashMap.put("didPrivacy", "false");
        hashMap.put("impOne", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("_arFlag", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("banner_ar", "10");
        hashMap.put("large_banner_ar", "10");
        hashMap.put("medium_rectangle_ar", "10");
        hashMap.put("stp_flag", "false");
        hashMap.put("score_refresh_time_min", "20160");
        hashMap.put("dlEnable", "false");
        hashMap.put("n_clusters", "3");
        return hashMap;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String m() {
        return "BannerSettings";
    }
}
