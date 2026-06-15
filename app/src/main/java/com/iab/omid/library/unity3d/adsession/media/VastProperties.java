package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.utils.d;
import com.iab.omid.library.unity3d.utils.g;
import com.ironsource.b9;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16083a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f16084b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16085c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f16086d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f16083a = z10;
        this.f16084b = f10;
        this.f16085c = z11;
        this.f16086d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f16083a);
            if (this.f16083a) {
                jSONObject.put("skipOffset", this.f16084b);
            }
            jSONObject.put("autoPlay", this.f16085c);
            jSONObject.put(b9.h.L, this.f16086d);
        } catch (JSONException e8) {
            d.a("VastProperties: JSON error", e8);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f16086d;
    }

    public Float getSkipOffset() {
        return this.f16084b;
    }

    public boolean isAutoPlay() {
        return this.f16085c;
    }

    public boolean isSkippable() {
        return this.f16083a;
    }
}
