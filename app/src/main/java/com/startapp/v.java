package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v implements x9 {

    /* renamed from: a  reason: collision with root package name */
    public final double f23451a;

    /* renamed from: b  reason: collision with root package name */
    public final double f23452b;

    /* renamed from: c  reason: collision with root package name */
    public final double f23453c;

    /* renamed from: d  reason: collision with root package name */
    public final double f23454d;

    /* renamed from: e  reason: collision with root package name */
    public final double f23455e;

    /* renamed from: f  reason: collision with root package name */
    public final double f23456f;

    /* renamed from: g  reason: collision with root package name */
    public double f23457g;

    /* renamed from: h  reason: collision with root package name */
    public long f23458h;

    /* renamed from: i  reason: collision with root package name */
    public double f23459i;

    public v(double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 + d11;
        this.f23451a = d10 / d15;
        this.f23452b = d11 / d15;
        this.f23453c = d12;
        this.f23454d = d13;
        this.f23455e = d14;
        this.f23456f = p9.a(0.0d, d13, d14);
    }

    public final void a(double d10, long j10) {
        double a10;
        double d11 = this.f23457g;
        long j11 = this.f23458h;
        double d12 = this.f23453c;
        double d13 = this.f23454d;
        double d14 = this.f23455e;
        double d15 = this.f23456f;
        double max = Math.max(0L, j10 - j11) / d12;
        if (d14 > 0.0d) {
            a10 = (p9.a(max, d13, d14) - d15) / (1.0d - d15);
        } else if (d14 < 0.0d) {
            a10 = p9.a(max, d13, d14) / d15;
        } else {
            a10 = p9.a(max, d13, d14);
        }
        double d16 = d11 * a10;
        double d17 = (this.f23452b * d10) + (this.f23451a * d16);
        this.f23459i = d17;
        if (d16 < d17) {
            this.f23457g = d17;
            this.f23458h = j10;
        }
    }

    @Override // com.startapp.x9
    public final double getValue() {
        return this.f23459i;
    }
}
