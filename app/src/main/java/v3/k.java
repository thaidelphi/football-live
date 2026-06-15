package v3;

import a5.c0;
import java.io.IOException;
/* compiled from: TrackFragment.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class k {

    /* renamed from: a  reason: collision with root package name */
    public c f31854a;

    /* renamed from: b  reason: collision with root package name */
    public long f31855b;

    /* renamed from: c  reason: collision with root package name */
    public long f31856c;

    /* renamed from: d  reason: collision with root package name */
    public long f31857d;

    /* renamed from: e  reason: collision with root package name */
    public int f31858e;

    /* renamed from: f  reason: collision with root package name */
    public int f31859f;

    /* renamed from: l  reason: collision with root package name */
    public boolean f31865l;

    /* renamed from: n  reason: collision with root package name */
    public j f31867n;

    /* renamed from: p  reason: collision with root package name */
    public boolean f31869p;

    /* renamed from: q  reason: collision with root package name */
    public long f31870q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f31871r;

    /* renamed from: g  reason: collision with root package name */
    public long[] f31860g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f31861h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f31862i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public long[] f31863j = new long[0];

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f31864k = new boolean[0];

    /* renamed from: m  reason: collision with root package name */
    public boolean[] f31866m = new boolean[0];

    /* renamed from: o  reason: collision with root package name */
    public final c0 f31868o = new c0();

    public void a(c0 c0Var) {
        c0Var.j(this.f31868o.d(), 0, this.f31868o.f());
        this.f31868o.K(0);
        this.f31869p = false;
    }

    public void b(s3.j jVar) throws IOException {
        jVar.readFully(this.f31868o.d(), 0, this.f31868o.f());
        this.f31868o.K(0);
        this.f31869p = false;
    }

    public long c(int i10) {
        return this.f31863j[i10];
    }

    public void d(int i10) {
        this.f31868o.G(i10);
        this.f31865l = true;
        this.f31869p = true;
    }

    public void e(int i10, int i11) {
        this.f31858e = i10;
        this.f31859f = i11;
        if (this.f31861h.length < i10) {
            this.f31860g = new long[i10];
            this.f31861h = new int[i10];
        }
        if (this.f31862i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f31862i = new int[i12];
            this.f31863j = new long[i12];
            this.f31864k = new boolean[i12];
            this.f31866m = new boolean[i12];
        }
    }

    public void f() {
        this.f31858e = 0;
        this.f31870q = 0L;
        this.f31871r = false;
        this.f31865l = false;
        this.f31869p = false;
        this.f31867n = null;
    }

    public boolean g(int i10) {
        return this.f31865l && this.f31866m[i10];
    }
}
