package a5;

import n3.o2;
/* compiled from: StandaloneMediaClock.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h0 implements v {

    /* renamed from: a  reason: collision with root package name */
    private final d f434a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f435b;

    /* renamed from: c  reason: collision with root package name */
    private long f436c;

    /* renamed from: d  reason: collision with root package name */
    private long f437d;

    /* renamed from: e  reason: collision with root package name */
    private o2 f438e = o2.f28260d;

    public h0(d dVar) {
        this.f434a = dVar;
    }

    public void a(long j10) {
        this.f436c = j10;
        if (this.f435b) {
            this.f437d = this.f434a.b();
        }
    }

    @Override // a5.v
    public o2 b() {
        return this.f438e;
    }

    public void c() {
        if (this.f435b) {
            return;
        }
        this.f437d = this.f434a.b();
        this.f435b = true;
    }

    @Override // a5.v
    public void d(o2 o2Var) {
        if (this.f435b) {
            a(o());
        }
        this.f438e = o2Var;
    }

    public void e() {
        if (this.f435b) {
            a(o());
            this.f435b = false;
        }
    }

    @Override // a5.v
    public long o() {
        long b10;
        long j10 = this.f436c;
        if (this.f435b) {
            long b11 = this.f434a.b() - this.f437d;
            o2 o2Var = this.f438e;
            if (o2Var.f28262a == 1.0f) {
                b10 = p0.C0(b11);
            } else {
                b10 = o2Var.b(b11);
            }
            return j10 + b10;
        }
        return j10;
    }
}
