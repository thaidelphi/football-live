package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n3 {

    /* renamed from: a  reason: collision with root package name */
    public final double f22315a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22316b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22317c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f22318d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22319e;

    /* renamed from: f  reason: collision with root package name */
    public final long f22320f;

    /* renamed from: g  reason: collision with root package name */
    public final List<p3> f22321g;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f22322a = 1.0d;

        /* renamed from: b  reason: collision with root package name */
        public int f22323b;

        /* renamed from: c  reason: collision with root package name */
        public int f22324c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f22325d;

        /* renamed from: e  reason: collision with root package name */
        public String f22326e;

        /* renamed from: f  reason: collision with root package name */
        public String f22327f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList f22328g;

        public final double a() {
            return this.f22322a;
        }

        public final ArrayList b() {
            return this.f22328g;
        }

        public final String c() {
            return this.f22327f;
        }

        public final int d() {
            return this.f22323b;
        }

        public final int e() {
            return this.f22324c;
        }

        public final String f() {
            return this.f22326e;
        }

        public final boolean g() {
            return this.f22325d;
        }

        public final a a(p3 p3Var) {
            if (this.f22328g == null) {
                this.f22328g = new ArrayList();
            }
            this.f22328g.add(p3Var);
            return this;
        }
    }

    public n3(a aVar) {
        this.f22315a = aVar.a();
        this.f22316b = aVar.d();
        this.f22317c = aVar.e();
        this.f22318d = aVar.g();
        this.f22319e = Math.max(60000L, o9.c(aVar.f()));
        this.f22320f = Math.max(0L, o9.c(aVar.c()));
        this.f22321g = o9.a(aVar.b());
    }

    public static <T> T a(T t10, T t11) {
        return t11 != null ? t11 : t10;
    }

    public final double a() {
        return this.f22315a;
    }

    public final List<p3> b() {
        return this.f22321g;
    }

    public final long c() {
        return this.f22320f;
    }

    public final int d() {
        return this.f22316b;
    }

    public final int e() {
        return this.f22317c;
    }

    public final long f() {
        return this.f22319e;
    }

    public final boolean g() {
        return this.f22318d;
    }

    public n3(n3 n3Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        this.f22315a = ((Double) a(Double.valueOf(n3Var.a()), analyticsCategoryConfig.a())).doubleValue();
        this.f22316b = ((Integer) a(Integer.valueOf(n3Var.d()), analyticsCategoryConfig.d())).intValue();
        this.f22317c = ((Integer) a(Integer.valueOf(n3Var.e()), analyticsCategoryConfig.e())).intValue();
        this.f22318d = ((Boolean) a(Boolean.valueOf(n3Var.g()), analyticsCategoryConfig.f())).booleanValue();
        this.f22319e = analyticsCategoryConfig.g() == null ? n3Var.f() : Math.max(60000L, o9.c(analyticsCategoryConfig.g()));
        this.f22320f = analyticsCategoryConfig.c() == null ? n3Var.c() : Math.max(0L, o9.c(analyticsCategoryConfig.c()));
        this.f22321g = (List) a(n3Var.b(), p3.a(analyticsCategoryConfig.b()));
    }
}
