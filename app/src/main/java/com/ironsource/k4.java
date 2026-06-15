package com.ironsource;

import com.ironsource.b9;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k4 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f18021a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f18022b;

    /* renamed from: c  reason: collision with root package name */
    private final String f18023c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18024d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18025e;

    /* renamed from: f  reason: collision with root package name */
    private final int f18026f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f18027g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f18028h;

    /* renamed from: i  reason: collision with root package name */
    private final int f18029i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f18030j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f18031k;

    /* renamed from: l  reason: collision with root package name */
    private final JSONObject f18032l;

    public k4(JSONObject config) {
        kotlin.jvm.internal.n.f(config, "config");
        this.f18021a = config;
        this.f18022b = config.optBoolean("isExternalArmEventsEnabled", true);
        String optString = config.optString("externalArmEventsUrl", pc.f19710j);
        kotlin.jvm.internal.n.e(optString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f18023c = optString;
        this.f18024d = config.optBoolean(fe.Y0, true);
        this.f18025e = config.optBoolean("radvid", false);
        this.f18026f = config.optInt("uaeh", 0);
        this.f18027g = config.optBoolean("sharedThreadPool", false);
        this.f18028h = config.optBoolean("sharedThreadPoolADP", true);
        this.f18029i = config.optInt(fe.O0, -1);
        this.f18030j = config.optBoolean("axal", false);
        this.f18031k = config.optBoolean("psrt", false);
        this.f18032l = config.optJSONObject(b9.a.f16532c);
    }

    public static /* synthetic */ k4 a(k4 k4Var, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = k4Var.f18021a;
        }
        return k4Var.a(jSONObject);
    }

    private final JSONObject a() {
        return this.f18021a;
    }

    public final k4 a(JSONObject config) {
        kotlin.jvm.internal.n.f(config, "config");
        return new k4(config);
    }

    public final int b() {
        return this.f18029i;
    }

    public final JSONObject c() {
        return this.f18032l;
    }

    public final String d() {
        return this.f18023c;
    }

    public final boolean e() {
        return this.f18031k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4) && kotlin.jvm.internal.n.a(this.f18021a, ((k4) obj).f18021a);
    }

    public final boolean f() {
        return this.f18025e;
    }

    public final boolean g() {
        return this.f18024d;
    }

    public final boolean h() {
        return this.f18027g;
    }

    public int hashCode() {
        return this.f18021a.hashCode();
    }

    public final boolean i() {
        return this.f18028h;
    }

    public final int j() {
        return this.f18026f;
    }

    public final boolean k() {
        return this.f18030j;
    }

    public final boolean l() {
        return this.f18022b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f18021a + ')';
    }
}
