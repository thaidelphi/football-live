package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.o9;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class NativeAdProperties {
    private final AdOptionsPosition adOptionsPosition;
    private final AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(JSONObject config) {
        n.f(config, "config");
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(config);
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String position = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            n.e(position, "position");
            return AdOptionsPosition.valueOf(position);
        } catch (Exception e8) {
            o9.d().a(e8);
            return this.defaultAdOptionPosition;
        }
    }

    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }
}
