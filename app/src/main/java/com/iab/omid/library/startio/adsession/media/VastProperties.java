package com.iab.omid.library.startio.adsession.media;

import com.iab.omid.library.startio.utils.d;
import com.iab.omid.library.startio.utils.g;
import com.ironsource.b9;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15955a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f15956b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15957c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f15958d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f15955a = z10;
        this.f15956b = f10;
        this.f15957c = z11;
        this.f15958d = position;
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
            jSONObject.put("skippable", this.f15955a);
            if (this.f15955a) {
                jSONObject.put("skipOffset", this.f15956b);
            }
            jSONObject.put("autoPlay", this.f15957c);
            jSONObject.put(b9.h.L, this.f15958d);
        } catch (JSONException e8) {
            d.a("VastProperties: JSON error", e8);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f15958d;
    }

    public Float getSkipOffset() {
        return this.f15956b;
    }

    public boolean isAutoPlay() {
        return this.f15957c;
    }

    public boolean isSkippable() {
        return this.f15955a;
    }
}
