package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t7 {

    /* renamed from: a  reason: collision with root package name */
    private final int f9288a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9289b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9290c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9291d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9292e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9293f;

    /* renamed from: g  reason: collision with root package name */
    private final int f9294g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9295h;

    /* renamed from: i  reason: collision with root package name */
    private final float f9296i;

    /* renamed from: j  reason: collision with root package name */
    private final float f9297j;

    public t7(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = jVar.I();
            I.d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f9288a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f9289b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f9290c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f9291d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f9292e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f9293f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        this.f9294g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        this.f9295h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        this.f9296i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f9297j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f9296i;
    }

    public long b() {
        return this.f9294g;
    }

    public float c() {
        return this.f9297j;
    }

    public long d() {
        return this.f9295h;
    }

    public int e() {
        return this.f9291d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return this.f9288a == t7Var.f9288a && this.f9289b == t7Var.f9289b && this.f9290c == t7Var.f9290c && this.f9291d == t7Var.f9291d && this.f9292e == t7Var.f9292e && this.f9293f == t7Var.f9293f && this.f9294g == t7Var.f9294g && this.f9295h == t7Var.f9295h && Float.compare(t7Var.f9296i, this.f9296i) == 0 && Float.compare(t7Var.f9297j, this.f9297j) == 0;
    }

    public int f() {
        return this.f9289b;
    }

    public int g() {
        return this.f9290c;
    }

    public long h() {
        return this.f9293f;
    }

    public int hashCode() {
        int i10 = ((((((((((((((this.f9288a * 31) + this.f9289b) * 31) + this.f9290c) * 31) + this.f9291d) * 31) + (this.f9292e ? 1 : 0)) * 31) + this.f9293f) * 31) + this.f9294g) * 31) + this.f9295h) * 31;
        float f10 = this.f9296i;
        int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f9297j;
        return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public int i() {
        return this.f9288a;
    }

    public boolean j() {
        return this.f9292e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f9288a + ", heightPercentOfScreen=" + this.f9289b + ", margin=" + this.f9290c + ", gravity=" + this.f9291d + ", tapToFade=" + this.f9292e + ", tapToFadeDurationMillis=" + this.f9293f + ", fadeInDurationMillis=" + this.f9294g + ", fadeOutDurationMillis=" + this.f9295h + ", fadeInDelay=" + this.f9296i + ", fadeOutDelay=" + this.f9297j + '}';
    }
}
