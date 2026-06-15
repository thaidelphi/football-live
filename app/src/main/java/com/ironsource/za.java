package com.ironsource;

import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class za {

    /* renamed from: h  reason: collision with root package name */
    private static za f21637h;

    /* renamed from: a  reason: collision with root package name */
    private String f21638a;

    /* renamed from: b  reason: collision with root package name */
    private String f21639b;

    /* renamed from: c  reason: collision with root package name */
    private String f21640c;

    /* renamed from: d  reason: collision with root package name */
    private String f21641d;

    /* renamed from: e  reason: collision with root package name */
    private int f21642e;

    /* renamed from: f  reason: collision with root package name */
    private String f21643f;

    /* renamed from: g  reason: collision with root package name */
    private final nf f21644g;

    private za(Context context) {
        nf f10 = mm.S().f();
        this.f21644g = f10;
        this.f21638a = f10.g();
        this.f21639b = f10.e();
        this.f21640c = f10.m();
        this.f21641d = f10.p();
        this.f21642e = f10.l();
        this.f21643f = f10.j(context);
    }

    public static za b(Context context) {
        if (f21637h == null) {
            f21637h = new za(context);
        }
        return f21637h;
    }

    public static void g() {
        f21637h = null;
    }

    public float a(Context context) {
        return this.f21644g.m(context);
    }

    public int a() {
        return this.f21642e;
    }

    public String b() {
        return this.f21643f;
    }

    public String c() {
        return this.f21639b;
    }

    public String d() {
        return this.f21638a;
    }

    public String e() {
        return this.f21640c;
    }

    public String f() {
        return this.f21641d;
    }
}
