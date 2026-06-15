package com.appnext.actionssdk;

import com.appnext.core.p;
import java.util.HashMap;
import org.json.JSONException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f extends p {
    private static f bl;
    private HashMap<String, String> bm = null;

    private f() {
    }

    public static synchronized f y() {
        f fVar;
        synchronized (f.class) {
            if (bl == null) {
                bl = new f();
            }
            fVar = bl;
        }
        return fVar;
    }

    protected final HashMap<String, String> A() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("polling_status", "on");
        hashMap.put("polling_sample", "600000");
        hashMap.put("ads_caching_time_minutes", "10");
        hashMap.put("list_timeout", "168");
        hashMap.put("template_back", com.ironsource.mediationsdk.metadata.a.f18924g);
        hashMap.put(AdData.SPONSORED, "1");
        hashMap.put("gdpr", "false");
        hashMap.put("pair_sawmo", "salmu,spag,sapop");
        hashMap.put("pair_salmu", "sawmo,spag,sapop");
        hashMap.put("pair_sabv", "sabh,saot,sapt,sand,safpe,sapop");
        hashMap.put("pair_sabh", "sabv,saot,sapt,sand,safpe,sapop");
        hashMap.put("pair_spag", "salmu,sawmo,sapop");
        hashMap.put("pair_saso", "samnp,salmu,sawmo,saof,sastr,sapop");
        hashMap.put("pair_saof", "safpe,sapop");
        hashMap.put("pair_safpe", "saof,saot,sand,sapt,sapop");
        hashMap.put("pair_saop", "saei,sapop");
        hashMap.put("pair_saei", "saop,sapop");
        hashMap.put("pair_sapt", "saot,sand,sapop");
        hashMap.put("pair_saot", "sapt,sand,sapop");
        hashMap.put("pair_samnp", "saei,safpe,sapop");
        hashMap.put("pair_sand", "saot,sapt,sapop");
        hashMap.put("pair_sastr", "salmu,sapop");
        hashMap.put("pair_sare", "sapop");
        return hashMap;
    }

    public final void a(String str, String str2) {
        if (str.equals("q")) {
            super.a(str, str2);
        }
    }

    public final void b(HashMap<String, String> hashMap) {
        this.bm = hashMap;
    }

    protected final String getUrl() {
        return "https://cdn.appnext.com/tools/sdk/confign/actions/" + com.appnext.core.f.cH() + "/actions_config.json";
    }

    protected final HashMap<String, Object> n(String str) throws JSONException {
        return super.n(str);
    }

    protected final HashMap<String, String> z() {
        return this.bm;
    }
}
