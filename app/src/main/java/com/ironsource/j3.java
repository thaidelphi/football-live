package com.ironsource;

import com.ironsource.m3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface j3 {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0224a f17895a = new C0224a(null);

        /* renamed from: com.ironsource.j3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class C0224a {
            private C0224a() {
            }

            public /* synthetic */ C0224a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final j3 a() {
                return new b(b.f17901f, new ArrayList());
            }

            public final j3 a(m3.j errorCode, m3.k errorReason) {
                List g10;
                kotlin.jvm.internal.n.f(errorCode, "errorCode");
                kotlin.jvm.internal.n.f(errorReason, "errorReason");
                g10 = j8.q.g(errorCode, errorReason);
                return new b(b.f17898c, g10);
            }

            public final j3 a(boolean z10) {
                return z10 ? new b(b.f17905j, new ArrayList()) : new b(b.f17906k, new ArrayList());
            }

            public final j3 a(n3... entity) {
                List g10;
                kotlin.jvm.internal.n.f(entity, "entity");
                g10 = j8.q.g(Arrays.copyOf(entity, entity.length));
                return new b(b.f17902g, g10);
            }

            public final j3 b(n3... entity) {
                List g10;
                kotlin.jvm.internal.n.f(entity, "entity");
                g10 = j8.q.g(Arrays.copyOf(entity, entity.length));
                return new b(b.f17899d, g10);
            }

            public final j3 c(n3... entity) {
                List g10;
                kotlin.jvm.internal.n.f(entity, "entity");
                g10 = j8.q.g(Arrays.copyOf(entity, entity.length));
                return new b(b.f17904i, g10);
            }

            public final j3 d(n3... entity) {
                List g10;
                kotlin.jvm.internal.n.f(entity, "entity");
                g10 = j8.q.g(Arrays.copyOf(entity, entity.length));
                return new b(b.f17897b, g10);
            }

            public final j3 e(n3... entity) {
                List g10;
                kotlin.jvm.internal.n.f(entity, "entity");
                g10 = j8.q.g(Arrays.copyOf(entity, entity.length));
                return new b(b.f17903h, g10);
            }

            public final j3 f(n3... entity) {
                List g10;
                kotlin.jvm.internal.n.f(entity, "entity");
                g10 = j8.q.g(Arrays.copyOf(entity, entity.length));
                return new b(b.f17900e, g10);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            public static final b f17896a = new b();

            /* renamed from: b  reason: collision with root package name */
            public static final int f17897b = 401;

            /* renamed from: c  reason: collision with root package name */
            public static final int f17898c = 403;

            /* renamed from: d  reason: collision with root package name */
            public static final int f17899d = 404;

            /* renamed from: e  reason: collision with root package name */
            public static final int f17900e = 405;

            /* renamed from: f  reason: collision with root package name */
            public static final int f17901f = 406;

            /* renamed from: g  reason: collision with root package name */
            public static final int f17902g = 407;

            /* renamed from: h  reason: collision with root package name */
            public static final int f17903h = 408;

            /* renamed from: i  reason: collision with root package name */
            public static final int f17904i = 409;

            /* renamed from: j  reason: collision with root package name */
            public static final int f17905j = 410;

            /* renamed from: k  reason: collision with root package name */
            public static final int f17906k = 411;

            private b() {
            }
        }

        public static final j3 a() {
            return f17895a.a();
        }

        public static final j3 a(m3.j jVar, m3.k kVar) {
            return f17895a.a(jVar, kVar);
        }

        public static final j3 a(boolean z10) {
            return f17895a.a(z10);
        }

        public static final j3 a(n3... n3VarArr) {
            return f17895a.a(n3VarArr);
        }

        public static final j3 b(n3... n3VarArr) {
            return f17895a.b(n3VarArr);
        }

        public static final j3 c(n3... n3VarArr) {
            return f17895a.c(n3VarArr);
        }

        public static final j3 d(n3... n3VarArr) {
            return f17895a.d(n3VarArr);
        }

        public static final j3 e(n3... n3VarArr) {
            return f17895a.e(n3VarArr);
        }

        public static final j3 f(n3... n3VarArr) {
            return f17895a.f(n3VarArr);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements j3 {

        /* renamed from: a  reason: collision with root package name */
        private final int f17907a;

        /* renamed from: b  reason: collision with root package name */
        private final List<n3> f17908b;

        public b(int i10, List<n3> arrayList) {
            kotlin.jvm.internal.n.f(arrayList, "arrayList");
            this.f17907a = i10;
            this.f17908b = arrayList;
        }

        @Override // com.ironsource.j3
        public void a(q3 analytics) {
            kotlin.jvm.internal.n.f(analytics, "analytics");
            analytics.a(this.f17907a, this.f17908b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17909a = new a(null);

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final j3 a() {
                return new b(b.f17911b, new ArrayList());
            }

            public final j3 a(m3.j errorCode, m3.k errorReason, m3.f duration) {
                List g10;
                kotlin.jvm.internal.n.f(errorCode, "errorCode");
                kotlin.jvm.internal.n.f(errorReason, "errorReason");
                kotlin.jvm.internal.n.f(duration, "duration");
                g10 = j8.q.g(errorCode, errorReason, duration);
                return new b(b.f17913d, g10);
            }

            public final j3 a(n3 duration) {
                List g10;
                kotlin.jvm.internal.n.f(duration, "duration");
                g10 = j8.q.g(duration);
                return new b(b.f17912c, g10);
            }

            public final j3 a(n3... entity) {
                List g10;
                kotlin.jvm.internal.n.f(entity, "entity");
                g10 = j8.q.g(Arrays.copyOf(entity, entity.length));
                return new b(204, g10);
            }

            public final j3 b() {
                return new b(b.f17916g, new ArrayList());
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            public static final b f17910a = new b();

            /* renamed from: b  reason: collision with root package name */
            public static final int f17911b = 201;

            /* renamed from: c  reason: collision with root package name */
            public static final int f17912c = 202;

            /* renamed from: d  reason: collision with root package name */
            public static final int f17913d = 203;

            /* renamed from: e  reason: collision with root package name */
            public static final int f17914e = 204;

            /* renamed from: f  reason: collision with root package name */
            public static final int f17915f = 205;

            /* renamed from: g  reason: collision with root package name */
            public static final int f17916g = 206;

            private b() {
            }
        }

        public static final j3 a() {
            return f17909a.a();
        }

        public static final j3 a(m3.j jVar, m3.k kVar, m3.f fVar) {
            return f17909a.a(jVar, kVar, fVar);
        }

        public static final j3 a(n3 n3Var) {
            return f17909a.a(n3Var);
        }

        public static final j3 a(n3... n3VarArr) {
            return f17909a.a(n3VarArr);
        }

        public static final j3 b() {
            return f17909a.b();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17917a = new a(null);

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final j3 a() {
                return new b(101, new ArrayList());
            }

            public final j3 a(m3.f duration) {
                List g10;
                kotlin.jvm.internal.n.f(duration, "duration");
                g10 = j8.q.g(duration);
                return new b(103, g10);
            }

            public final j3 a(m3.j errorCode, m3.k errorReason) {
                List g10;
                kotlin.jvm.internal.n.f(errorCode, "errorCode");
                kotlin.jvm.internal.n.f(errorReason, "errorReason");
                g10 = j8.q.g(errorCode, errorReason);
                return new b(109, g10);
            }

            public final j3 a(m3.j errorCode, m3.k errorReason, m3.f duration, m3.l loaderState) {
                List g10;
                kotlin.jvm.internal.n.f(errorCode, "errorCode");
                kotlin.jvm.internal.n.f(errorReason, "errorReason");
                kotlin.jvm.internal.n.f(duration, "duration");
                kotlin.jvm.internal.n.f(loaderState, "loaderState");
                g10 = j8.q.g(errorCode, errorReason, duration, loaderState);
                return new b(104, g10);
            }

            public final j3 a(n3 ext1) {
                List g10;
                kotlin.jvm.internal.n.f(ext1, "ext1");
                g10 = j8.q.g(ext1);
                return new b(111, g10);
            }

            public final j3 a(n3... entity) {
                List g10;
                kotlin.jvm.internal.n.f(entity, "entity");
                g10 = j8.q.g(Arrays.copyOf(entity, entity.length));
                return new b(102, g10);
            }

            public final j3 b() {
                return new b(112, new ArrayList());
            }

            public final j3 b(n3... entity) {
                List g10;
                kotlin.jvm.internal.n.f(entity, "entity");
                g10 = j8.q.g(Arrays.copyOf(entity, entity.length));
                return new b(110, g10);
            }

            public final b c() {
                return new b(105, new ArrayList());
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            public static final b f17918a = new b();

            /* renamed from: b  reason: collision with root package name */
            public static final int f17919b = 101;

            /* renamed from: c  reason: collision with root package name */
            public static final int f17920c = 102;

            /* renamed from: d  reason: collision with root package name */
            public static final int f17921d = 103;

            /* renamed from: e  reason: collision with root package name */
            public static final int f17922e = 104;

            /* renamed from: f  reason: collision with root package name */
            public static final int f17923f = 105;

            /* renamed from: g  reason: collision with root package name */
            public static final int f17924g = 109;

            /* renamed from: h  reason: collision with root package name */
            public static final int f17925h = 110;

            /* renamed from: i  reason: collision with root package name */
            public static final int f17926i = 111;

            /* renamed from: j  reason: collision with root package name */
            public static final int f17927j = 112;

            private b() {
            }
        }

        public static final j3 a() {
            return f17917a.a();
        }

        public static final j3 a(m3.f fVar) {
            return f17917a.a(fVar);
        }

        public static final j3 a(m3.j jVar, m3.k kVar) {
            return f17917a.a(jVar, kVar);
        }

        public static final j3 a(m3.j jVar, m3.k kVar, m3.f fVar, m3.l lVar) {
            return f17917a.a(jVar, kVar, fVar, lVar);
        }

        public static final j3 a(n3 n3Var) {
            return f17917a.a(n3Var);
        }

        public static final j3 a(n3... n3VarArr) {
            return f17917a.a(n3VarArr);
        }

        public static final j3 b() {
            return f17917a.b();
        }

        public static final j3 b(n3... n3VarArr) {
            return f17917a.b(n3VarArr);
        }

        public static final b c() {
            return f17917a.c();
        }
    }

    void a(q3 q3Var);
}
