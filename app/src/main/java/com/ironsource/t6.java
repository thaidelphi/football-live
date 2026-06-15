package com.ironsource;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t6 {

    /* renamed from: a  reason: collision with root package name */
    private final b f20817a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b> f20818b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.l<JSONObject, b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20819a = new a();

        a() {
            super(1);
        }

        @Override // t8.l
        /* renamed from: a */
        public final b invoke(JSONObject it) {
            kotlin.jvm.internal.n.f(it, "it");
            return new b(it);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Integer f20820a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f20821b;

        /* renamed from: c  reason: collision with root package name */
        private final Boolean f20822c;

        /* renamed from: d  reason: collision with root package name */
        private final float f20823d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f20824e;

        public b(JSONObject features) {
            kotlin.jvm.internal.n.f(features, "features");
            this.f20820a = features.has(v6.f21106a) ? Integer.valueOf(features.optInt(v6.f21106a)) : null;
            this.f20821b = features.has(v6.f21107b) ? Boolean.valueOf(features.optBoolean(v6.f21107b)) : null;
            this.f20822c = features.has("isLoadWhileShow") ? Boolean.valueOf(features.optBoolean("isLoadWhileShow")) : null;
            this.f20823d = features.has(v6.f21109d) ? features.optInt(v6.f21109d) / 100.0f : 0.15f;
            List<String> b10 = features.has(v6.f21110e) ? mk.b(features.getJSONArray(v6.f21110e)) : j8.q.f("BANNER", com.ironsource.mediationsdk.l.f18873d);
            kotlin.jvm.internal.n.e(b10, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f20824e = b10;
        }

        public final List<String> a() {
            return this.f20824e;
        }

        public final Integer b() {
            return this.f20820a;
        }

        public final float c() {
            return this.f20823d;
        }

        public final Boolean d() {
            return this.f20821b;
        }

        public final Boolean e() {
            return this.f20822c;
        }
    }

    public t6(JSONObject bannerConfigurations) {
        kotlin.jvm.internal.n.f(bannerConfigurations, "bannerConfigurations");
        this.f20817a = new b(bannerConfigurations);
        this.f20818b = new y2(bannerConfigurations).a(a.f20819a);
    }

    public final Map<String, b> a() {
        return this.f20818b;
    }

    public final b b() {
        return this.f20817a;
    }
}
