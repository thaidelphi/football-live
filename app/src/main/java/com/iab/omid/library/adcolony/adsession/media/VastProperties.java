package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.d.c;
import com.iab.omid.library.adcolony.d.e;
import com.ironsource.b9;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15579a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f15580b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15581c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f15582d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f15579a = z10;
        this.f15580b = f10;
        this.f15581c = z11;
        this.f15582d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f15579a);
            if (this.f15579a) {
                jSONObject.put("skipOffset", this.f15580b);
            }
            jSONObject.put("autoPlay", this.f15581c);
            jSONObject.put(b9.h.L, this.f15582d);
        } catch (JSONException e8) {
            c.a("VastProperties: JSON error", e8);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f15582d;
    }

    public Float getSkipOffset() {
        return this.f15580b;
    }

    public boolean isAutoPlay() {
        return this.f15581c;
    }

    public boolean isSkippable() {
        return this.f15579a;
    }
}
