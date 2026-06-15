package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ha {

    /* renamed from: a  reason: collision with root package name */
    public final b f22041a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final long f22042b;

    /* renamed from: c  reason: collision with root package name */
    public final double f22043c;

    /* renamed from: d  reason: collision with root package name */
    public final x9 f22044d;

    /* renamed from: e  reason: collision with root package name */
    public double f22045e;

    /* renamed from: f  reason: collision with root package name */
    public double f22046f;

    /* renamed from: g  reason: collision with root package name */
    public double f22047g;

    /* renamed from: h  reason: collision with root package name */
    public long f22048h;

    /* renamed from: i  reason: collision with root package name */
    public long f22049i;

    /* renamed from: j  reason: collision with root package name */
    public double f22050j;

    /* renamed from: k  reason: collision with root package name */
    public long f22051k;

    /* renamed from: l  reason: collision with root package name */
    public long f22052l;

    /* renamed from: m  reason: collision with root package name */
    public a f22053m;

    /* renamed from: n  reason: collision with root package name */
    public a f22054n;

    /* renamed from: o  reason: collision with root package name */
    public int f22055o;

    /* renamed from: p  reason: collision with root package name */
    public double f22056p;

    /* renamed from: q  reason: collision with root package name */
    public double f22057q;

    /* renamed from: r  reason: collision with root package name */
    public double f22058r;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public a f22059a;

        /* renamed from: b  reason: collision with root package name */
        public long f22060b;

        /* renamed from: c  reason: collision with root package name */
        public long f22061c;

        /* renamed from: d  reason: collision with root package name */
        public int f22062d;

        /* renamed from: e  reason: collision with root package name */
        public double f22063e;
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public a f22064a;
    }

    public ha(double d10, double d11, a3 a3Var) {
        this.f22042b = (long) (d10 * 1.0E9d);
        this.f22043c = d11;
        this.f22044d = a3Var;
    }

    public final void a(double d10, long j10) {
        a aVar;
        this.f22045e = this.f22046f;
        this.f22046f = this.f22047g;
        this.f22047g = d10;
        this.f22048h = this.f22049i;
        this.f22049i = j10;
        long j11 = j10 - this.f22042b;
        while (true) {
            a aVar2 = this.f22053m;
            if (aVar2 == null || aVar2.f22060b >= j11 || (aVar = aVar2.f22059a) == null || aVar.f22060b >= j11) {
                break;
            }
            this.f22053m = aVar;
            this.f22055o -= aVar2.f22062d;
            this.f22058r -= aVar2.f22063e;
            b bVar = this.f22041a;
            aVar2.f22059a = bVar.f22064a;
            bVar.f22064a = aVar2;
        }
        b bVar2 = this.f22041a;
        a aVar3 = bVar2.f22064a;
        if (aVar3 == null) {
            aVar3 = new a();
        } else {
            bVar2.f22064a = aVar3.f22059a;
            aVar3.f22059a = null;
            aVar3.f22060b = 0L;
            aVar3.f22061c = 0L;
            aVar3.f22062d = 0;
            aVar3.f22063e = 0.0d;
        }
        aVar3.f22060b = this.f22049i;
        aVar3.f22061c = this.f22052l;
        double value = this.f22044d.getValue();
        double d11 = this.f22045e;
        double d12 = this.f22046f;
        if (d11 < d12 && d12 > this.f22047g) {
            double d13 = d12 - value;
            if (d13 > this.f22043c) {
                this.f22050j = d13;
                this.f22051k = this.f22048h;
            }
        }
        if (d12 > value && value > this.f22047g && this.f22051k > this.f22052l) {
            this.f22052l = this.f22049i;
            aVar3.f22062d = 1;
            aVar3.f22063e = this.f22050j;
        }
        int i10 = this.f22055o + aVar3.f22062d;
        this.f22055o = i10;
        double d14 = this.f22058r + aVar3.f22063e;
        this.f22058r = d14;
        a aVar4 = this.f22054n;
        if (aVar4 != null) {
            aVar4.f22059a = aVar3;
        }
        this.f22054n = aVar3;
        if (this.f22053m == null) {
            this.f22053m = aVar3;
        }
        long j12 = this.f22052l - this.f22053m.f22061c;
        if (j12 > 0) {
            this.f22056p = i10 / (j12 / 1.0E9d);
        }
        if (i10 > 0) {
            this.f22057q = d14 / i10;
        } else {
            this.f22057q = 0.0d;
        }
    }
}
