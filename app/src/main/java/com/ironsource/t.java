package com.ironsource;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static final c f20745d = new c(null);

    /* renamed from: e  reason: collision with root package name */
    public static final String f20746e = "capping";

    /* renamed from: f  reason: collision with root package name */
    public static final String f20747f = "pacing";

    /* renamed from: g  reason: collision with root package name */
    public static final String f20748g = "delivery";

    /* renamed from: h  reason: collision with root package name */
    public static final String f20749h = "progressiveLoadingConfig";

    /* renamed from: i  reason: collision with root package name */
    public static final String f20750i = "expiredDurationInMinutes";

    /* renamed from: j  reason: collision with root package name */
    public static final String f20751j = "reward";

    /* renamed from: k  reason: collision with root package name */
    public static final String f20752k = "name";

    /* renamed from: l  reason: collision with root package name */
    public static final String f20753l = "amount";

    /* renamed from: m  reason: collision with root package name */
    public static final String f20754m = "virtualItemName";

    /* renamed from: n  reason: collision with root package name */
    public static final String f20755n = "virtualItemCount";

    /* renamed from: o  reason: collision with root package name */
    public static final long f20756o = 60;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, d> f20757a;

    /* renamed from: b  reason: collision with root package name */
    private final d f20758b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, d> f20759c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.l<JSONObject, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20760a = new a();

        a() {
            super(1);
        }

        @Override // t8.l
        /* renamed from: a */
        public final d invoke(JSONObject it) {
            kotlin.jvm.internal.n.f(it, "it");
            return new d(it);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class b extends kotlin.jvm.internal.o implements t8.l<JSONObject, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f20761a = new b();

        b() {
            super(1);
        }

        @Override // t8.l
        /* renamed from: a */
        public final d invoke(JSONObject it) {
            kotlin.jvm.internal.n.f(it, "it");
            return new d(it);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final h8 f20762a;

        /* renamed from: b  reason: collision with root package name */
        private final cp f20763b;

        /* renamed from: c  reason: collision with root package name */
        private final oa f20764c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f20765d;

        /* renamed from: e  reason: collision with root package name */
        private final gq f20766e;

        /* renamed from: f  reason: collision with root package name */
        private final gq f20767f;

        /* renamed from: g  reason: collision with root package name */
        private final wp f20768g;

        public d(JSONObject features) {
            h8 h8Var;
            cp cpVar;
            kotlin.jvm.internal.n.f(features, "features");
            wp wpVar = null;
            if (features.has(t.f20746e)) {
                JSONObject jSONObject = features.getJSONObject(t.f20746e);
                kotlin.jvm.internal.n.e(jSONObject, "features.getJSONObject(key)");
                h8Var = new h8(jSONObject);
            } else {
                h8Var = null;
            }
            this.f20762a = h8Var;
            if (features.has(t.f20747f)) {
                JSONObject jSONObject2 = features.getJSONObject(t.f20747f);
                kotlin.jvm.internal.n.e(jSONObject2, "features.getJSONObject(key)");
                cpVar = new cp(jSONObject2);
            } else {
                cpVar = null;
            }
            this.f20763b = cpVar;
            this.f20764c = features.has(t.f20748g) ? new oa(features.getBoolean(t.f20748g)) : null;
            this.f20765d = features.has(t.f20750i) ? Long.valueOf(features.getLong(t.f20750i)) : null;
            JSONObject optJSONObject = features.optJSONObject(t.f20751j);
            this.f20766e = optJSONObject != null ? new gq(optJSONObject, "name", "amount") : null;
            gq gqVar = new gq(features, t.f20754m, t.f20755n);
            String b10 = gqVar.b();
            boolean z10 = false;
            if (!(b10 == null || b10.length() == 0) && gqVar.a() != null) {
                z10 = true;
            }
            this.f20767f = z10 ? gqVar : null;
            if (features.has(t.f20749h)) {
                JSONObject jSONObject3 = features.getJSONObject(t.f20749h);
                kotlin.jvm.internal.n.e(jSONObject3, "features.getJSONObject(key)");
                wpVar = new wp(jSONObject3);
            }
            this.f20768g = wpVar;
        }

        public final gq a() {
            return this.f20766e;
        }

        public final h8 b() {
            return this.f20762a;
        }

        public final oa c() {
            return this.f20764c;
        }

        public final Long d() {
            return this.f20765d;
        }

        public final cp e() {
            return this.f20763b;
        }

        public final gq f() {
            return this.f20767f;
        }

        public final wp g() {
            return this.f20768g;
        }
    }

    public t(JSONObject configurations) {
        kotlin.jvm.internal.n.f(configurations, "configurations");
        this.f20757a = new sp(configurations).a(b.f20761a);
        this.f20758b = new d(configurations);
        this.f20759c = new y2(configurations).a(a.f20760a);
    }

    public final Map<String, d> a() {
        return this.f20759c;
    }

    public final d b() {
        return this.f20758b;
    }

    public final Map<String, d> c() {
        return this.f20757a;
    }
}
