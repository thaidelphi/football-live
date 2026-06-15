package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i9 {

    /* renamed from: a  reason: collision with root package name */
    public final z2 f22099a;

    /* renamed from: b  reason: collision with root package name */
    public final z2 f22100b;

    /* renamed from: c  reason: collision with root package name */
    public final a3 f22101c;

    /* renamed from: d  reason: collision with root package name */
    public final ga f22102d;

    /* renamed from: e  reason: collision with root package name */
    public final z9 f22103e;

    /* renamed from: f  reason: collision with root package name */
    public final a3 f22104f;

    /* renamed from: g  reason: collision with root package name */
    public final v f22105g;

    /* renamed from: h  reason: collision with root package name */
    public final y9 f22106h;

    /* renamed from: i  reason: collision with root package name */
    public final v f22107i;

    /* renamed from: j  reason: collision with root package name */
    public final x6 f22108j;

    /* renamed from: k  reason: collision with root package name */
    public final v f22109k;

    /* renamed from: l  reason: collision with root package name */
    public long f22110l;

    /* renamed from: m  reason: collision with root package name */
    public long f22111m;

    public i9(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, double d25) {
        z2 z2Var = new z2(new a3(d10), new a3(d10), new a3(d10));
        this.f22099a = z2Var;
        this.f22100b = new z2(new a3(d11), new a3(d11), new a3(d11));
        this.f22101c = new a3(d12);
        this.f22102d = new ga(new ha(d14, d15, z2Var.a()), new ha(d14, d15, z2Var.b()), new ha(d14, d15, z2Var.c()));
        this.f22103e = new z9();
        this.f22104f = new a3(d13);
        this.f22105g = new v(d21, d22, d23, d24, d25);
        this.f22106h = new y9();
        this.f22107i = new v(d21, d22, d23, d24, d25);
        this.f22108j = new x6();
        this.f22109k = new v(d16, d17, d18, d19, d20);
    }

    public final void a(double d10, long j10) {
        this.f22109k.f23457g = Math.min(Math.max(0.0d, d10), 1.0d);
        this.f22109k.f23458h = j10;
    }

    public final void a(long j10, long j11, double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double exp;
        double d16;
        double d17;
        double exp2;
        if (this.f22111m >= j11) {
            return;
        }
        if (this.f22110l <= 0) {
            this.f22110l = j11;
        }
        z2 z2Var = this.f22099a;
        a3 a3Var = z2Var.f23656a;
        double d18 = a3Var.f21754c;
        a3 a3Var2 = z2Var.f23657b;
        double d19 = a3Var2.f21754c;
        a3 a3Var3 = z2Var.f23658c;
        double d20 = a3Var3.f21754c;
        a3Var.f21754c = (a3Var.f21753b * d10) + (a3Var.f21752a * d18);
        a3Var2.f21754c = (a3Var2.f21753b * d11) + (a3Var2.f21752a * a3Var2.f21754c);
        double d21 = (a3Var3.f21753b * d12) + (a3Var3.f21752a * a3Var3.f21754c);
        a3Var3.f21754c = d21;
        double d22 = a3Var.f21754c;
        double d23 = a3Var2.f21754c;
        z2Var.f23659d = Math.sqrt((d21 * d21) + (d23 * d23) + (d22 * d22));
        z2 z2Var2 = this.f22099a;
        double d24 = z2Var2.f23656a.f21754c - d18;
        double d25 = z2Var2.f23657b.f21754c - d19;
        double d26 = z2Var2.f23658c.f21754c - d20;
        double d27 = (d26 * d26) + (d25 * d25) + (d24 * d24);
        this.f22105g.a(p9.a(d27, 1.5d, 4.0d), j10);
        double d28 = 1.0d - this.f22105g.f23459i;
        this.f22107i.a(p9.a(d27, 0.01d, 1000.0d), j10);
        z2 z2Var3 = this.f22100b;
        z2 z2Var4 = this.f22099a;
        a3 a3Var4 = z2Var3.f23656a;
        a3Var4.f21754c = ((d10 - z2Var4.f23656a.f21754c) * a3Var4.f21753b) + (a3Var4.f21752a * a3Var4.f21754c);
        a3 a3Var5 = z2Var3.f23657b;
        a3Var5.f21754c = ((d11 - z2Var4.f23657b.f21754c) * a3Var5.f21753b) + (a3Var5.f21752a * a3Var5.f21754c);
        a3 a3Var6 = z2Var3.f23658c;
        double d29 = ((d12 - z2Var4.f23658c.f21754c) * a3Var6.f21753b) + (a3Var6.f21752a * a3Var6.f21754c);
        a3Var6.f21754c = d29;
        double d30 = a3Var4.f21754c;
        double d31 = a3Var5.f21754c;
        z2Var3.f23659d = Math.sqrt((d29 * d29) + (d31 * d31) + (d30 * d30));
        a3 a3Var7 = this.f22101c;
        a3Var7.f21754c = (this.f22100b.f23659d * a3Var7.f21753b) + (a3Var7.f21752a * a3Var7.f21754c);
        ga gaVar = this.f22102d;
        gaVar.f21994a.a(d10, j11);
        gaVar.f21995b.a(d11, j11);
        gaVar.f21996c.a(d12, j11);
        ha haVar = gaVar.f21994a;
        double d32 = haVar.f22057q;
        ha haVar2 = gaVar.f21995b;
        double d33 = haVar2.f22057q;
        ha haVar3 = gaVar.f21996c;
        double d34 = haVar3.f22057q;
        double d35 = d32 + d33 + d34;
        if (d35 > 0.0d) {
            gaVar.f21997d = ((haVar.f22056p * d32) / d35) + ((haVar2.f22056p * d33) / d35) + ((haVar3.f22056p * d34) / d35);
            gaVar.f21998e = d35 / 3.0d;
            d13 = 0.0d;
        } else {
            d13 = 0.0d;
            gaVar.f21997d = 0.0d;
            gaVar.f21998e = 0.0d;
        }
        double a10 = p9.a((j11 - this.f22110l) / 1.0E9d, 10.0d, 1.0d);
        z9 z9Var = this.f22103e;
        ga gaVar2 = this.f22102d;
        double d36 = gaVar2.f21997d;
        double d37 = gaVar2.f21998e;
        double d38 = this.f22101c.f21754c;
        z9Var.f23681a = (Math.min(Math.exp((-Math.pow(d36 - 7.0d, 2.0d)) / 1.0d) * 2.0d, 1.0d) * 1.0d) + (z9Var.f23681a * d13);
        double d39 = z9Var.f23682b * 0.0d;
        if (d37 < 0.0d) {
            d14 = 1.0d;
            d15 = 0.0d;
        } else {
            if (d37 < 0.5d) {
                exp = Math.pow(d37 * 2.0d, 4.0d);
            } else if (d37 > 2.0d) {
                exp = Math.exp((2.0d - d37) * 6.0d);
            } else {
                d14 = 1.0d;
                d15 = 1.0d;
            }
            d15 = exp;
            d14 = 1.0d;
        }
        z9Var.f23682b = (d15 * d14) + d39;
        double d40 = z9Var.f23683c * 0.0d;
        if (d38 < 0.0d) {
            d16 = 1.0d;
            d17 = 0.0d;
        } else {
            if (d38 < 0.5d) {
                exp2 = Math.pow(d38 * 2.0d, 4.0d);
            } else if (d38 > 5.0d) {
                exp2 = Math.exp((5.0d - d38) * 4.0d);
            } else {
                d16 = 1.0d;
                d17 = 1.0d;
            }
            d17 = exp2;
            d16 = 1.0d;
        }
        double d41 = (d17 * d16) + d40;
        z9Var.f23683c = d41;
        z9Var.f23684d = ((d41 * 100.0d) / 270.0d) + ((z9Var.f23682b * 70.0d) / 270.0d) + ((z9Var.f23681a * 100.0d) / 270.0d);
        a3 a3Var8 = this.f22104f;
        double d42 = (a10 * d28 * this.f22103e.f23684d * a3Var8.f21753b) + (a3Var8.f21752a * a3Var8.f21754c);
        a3Var8.f21754c = d42;
        y9 y9Var = this.f22106h;
        ga gaVar3 = this.f22102d;
        double d43 = gaVar3.f21997d;
        double d44 = gaVar3.f21998e;
        this.f22108j.getClass();
        this.f22108j.getClass();
        y9Var.f23641a = (d43 * 0.050000000000000044d) + (y9Var.f23641a * 0.95d);
        y9Var.f23642b = (d44 * 0.050000000000000044d) + (y9Var.f23642b * 0.95d);
        y9Var.f23643c = (Math.abs(0.0d) * 0.0050000000000000044d) + (y9Var.f23643c * 0.995d);
        y9Var.f23644d = (Math.abs(0.0d) * 0.0050000000000000044d) + (y9Var.f23644d * 0.995d);
        double d45 = y9Var.f23641a;
        double d46 = y9.f23637f;
        double d47 = y9Var.f23642b;
        double d48 = y9.f23638g;
        double a11 = ((((p9.a(d47, 0.2d, 20.0d) - d48) / (1.0d - d48)) * 1000.0d) / 5000.0d) + ((((p9.a(d45, 8.0d, 2.0d) - d46) / (1.0d - d46)) * 2000.0d) / 5000.0d);
        double d49 = y9Var.f23643c;
        double d50 = y9.f23639h;
        double a12 = ((((p9.a(d49, 0.2d, 6.0d) - d50) / (1.0d - d50)) * 1000.0d) / 5000.0d) + a11;
        double d51 = y9Var.f23644d;
        double d52 = y9.f23640i;
        y9Var.f23645e = ((((((p9.a(d51, 0.4d, 5.0d) - d52) / (1.0d - d52)) * 1000.0d) / 5000.0d) + a12) * 4.999999999999449E-4d) + (y9Var.f23645e * 0.9995d);
        v vVar = this.f22109k;
        double d53 = this.f22107i.f23459i;
        vVar.a(((1.0d - d53) * a10 * this.f22106h.f23645e) + (d42 * d53), j10);
        this.f22111m = j11;
    }
}
