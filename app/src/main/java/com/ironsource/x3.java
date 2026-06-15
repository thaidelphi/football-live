package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class x3 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, q> f21356a;

    public x3(JSONObject applicationAuctionSettings) {
        int c10;
        int a10;
        kotlin.jvm.internal.n.f(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        c10 = j8.i0.c(values.length);
        a10 = y8.i.a(c10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = applicationAuctionSettings.optJSONObject(vt.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                kotlin.jvm.internal.n.e(optJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new q(optJSONObject));
        }
        this.f21356a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, q> a() {
        return this.f21356a;
    }
}
