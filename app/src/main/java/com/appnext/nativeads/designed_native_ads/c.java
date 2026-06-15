package com.appnext.nativeads.designed_native_ads;

import com.appnext.core.SettingsManager;
import com.appnext.core.i;
import com.ironsource.b9;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c extends SettingsManager {
    private static c fR;

    /* renamed from: v  reason: collision with root package name */
    private String f10070v = "https://cdn.appnext.com/tools/sdk/confign/suggested_apps/" + i.Y() + "/suggested_apps_config.txt";

    public static synchronized c aK() {
        c cVar;
        synchronized (c.class) {
            if (fR == null) {
                fR = new c();
            }
            cVar = fR;
        }
        return cVar;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String j() {
        return this.f10070v;
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
        hashMap.put("min_internet_connection_video", "3G");
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("gdpr", "false");
        hashMap.put("cpiActiveFlow", "d");
        hashMap.put("cpcActiveFlow", "b");
        hashMap.put("didPrivacy", "false");
        hashMap.put("min_imp_precentage", "50");
        hashMap.put("repeat_viewable_criteria", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("min_vta_precentage", "50");
        hashMap.put("repeat_vta_viewable_criteria", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("stp_flag", "false");
        hashMap.put("report_vta_instead_of_impresssion", "false");
        hashMap.put(b9.h.D0, "Suggested Apps For You");
        hashMap.put("title_text_color", "#D0D0D0");
        hashMap.put("amount_of_icons", "5");
        hashMap.put("present_titles", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put("app_title_text_color", "#000000");
        hashMap.put("local_direction", "false");
        hashMap.put("background_color", "#FFFFFF");
        hashMap.put("transparency", "100");
        hashMap.put("score_refresh_time_min", "20160");
        hashMap.put("dlEnable", "false");
        hashMap.put("n_clusters", "3");
        return hashMap;
    }

    @Override // com.appnext.core.SettingsManager
    protected final String m() {
        return "DesignNativeAdsSettings";
    }
}
