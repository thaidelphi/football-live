package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t8 {

    /* renamed from: a  reason: collision with root package name */
    private final t f20826a;

    /* renamed from: b  reason: collision with root package name */
    private final t f20827b;

    /* renamed from: c  reason: collision with root package name */
    private final t6 f20828c;

    /* renamed from: d  reason: collision with root package name */
    private final sm f20829d;

    /* renamed from: e  reason: collision with root package name */
    private final z3 f20830e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, t> f20831f;

    public t8(JSONObject configurations) {
        Map<LevelPlay.AdFormat, t> g10;
        kotlin.jvm.internal.n.f(configurations, "configurations");
        t tVar = new t(a(configurations, "rewarded"));
        this.f20826a = tVar;
        t tVar2 = new t(a(configurations, "interstitial"));
        this.f20827b = tVar2;
        this.f20828c = new t6(a(configurations, "banner"));
        this.f20829d = new sm(a(configurations, "nativeAd"));
        JSONObject optJSONObject = configurations.optJSONObject("application");
        this.f20830e = new z3(optJSONObject == null ? new JSONObject() : optJSONObject);
        g10 = j8.j0.g(i8.s.a(LevelPlay.AdFormat.INTERSTITIAL, tVar2), i8.s.a(LevelPlay.AdFormat.REWARDED, tVar));
        this.f20831f = g10;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
        return optJSONObject2 == null ? new JSONObject() : optJSONObject2;
    }

    public final Map<LevelPlay.AdFormat, t> a() {
        return this.f20831f;
    }

    public final z3 b() {
        return this.f20830e;
    }

    public final t6 c() {
        return this.f20828c;
    }

    public final sm d() {
        return this.f20829d;
    }
}
