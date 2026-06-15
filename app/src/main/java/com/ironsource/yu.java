package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class yu {

    /* renamed from: a  reason: collision with root package name */
    protected long f21592a;

    /* renamed from: b  reason: collision with root package name */
    protected long f21593b;

    /* renamed from: c  reason: collision with root package name */
    protected long f21594c;

    public long a() {
        return Math.max(0L, this.f21592a - System.currentTimeMillis());
    }

    public void a(long j10) {
        this.f21592a = System.currentTimeMillis() + j10;
    }

    public void b() {
        this.f21592a = 0L;
        this.f21593b = 0L;
        this.f21594c = 0L;
    }

    public void b(long j10) {
        this.f21594c = j10;
        this.f21592a += j10 - this.f21593b;
    }

    public void c(long j10) {
        this.f21593b = j10;
        this.f21594c = 0L;
    }
}
