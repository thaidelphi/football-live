package androidx.work;

import android.os.Build;
/* compiled from: Constraints.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f4623i = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private q f4624a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4625b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4626c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4627d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4628e;

    /* renamed from: f  reason: collision with root package name */
    private long f4629f;

    /* renamed from: g  reason: collision with root package name */
    private long f4630g;

    /* renamed from: h  reason: collision with root package name */
    private d f4631h;

    /* compiled from: Constraints.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f4632a = false;

        /* renamed from: b  reason: collision with root package name */
        boolean f4633b = false;

        /* renamed from: c  reason: collision with root package name */
        q f4634c = q.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f4635d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f4636e = false;

        /* renamed from: f  reason: collision with root package name */
        long f4637f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f4638g = -1;

        /* renamed from: h  reason: collision with root package name */
        d f4639h = new d();

        public c a() {
            return new c(this);
        }

        public a b(q qVar) {
            this.f4634c = qVar;
            return this;
        }
    }

    public c() {
        this.f4624a = q.NOT_REQUIRED;
        this.f4629f = -1L;
        this.f4630g = -1L;
        this.f4631h = new d();
    }

    public d a() {
        return this.f4631h;
    }

    public q b() {
        return this.f4624a;
    }

    public long c() {
        return this.f4629f;
    }

    public long d() {
        return this.f4630g;
    }

    public boolean e() {
        return this.f4631h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4625b == cVar.f4625b && this.f4626c == cVar.f4626c && this.f4627d == cVar.f4627d && this.f4628e == cVar.f4628e && this.f4629f == cVar.f4629f && this.f4630g == cVar.f4630g && this.f4624a == cVar.f4624a) {
            return this.f4631h.equals(cVar.f4631h);
        }
        return false;
    }

    public boolean f() {
        return this.f4627d;
    }

    public boolean g() {
        return this.f4625b;
    }

    public boolean h() {
        return this.f4626c;
    }

    public int hashCode() {
        long j10 = this.f4629f;
        long j11 = this.f4630g;
        return (((((((((((((this.f4624a.hashCode() * 31) + (this.f4625b ? 1 : 0)) * 31) + (this.f4626c ? 1 : 0)) * 31) + (this.f4627d ? 1 : 0)) * 31) + (this.f4628e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f4631h.hashCode();
    }

    public boolean i() {
        return this.f4628e;
    }

    public void j(d dVar) {
        this.f4631h = dVar;
    }

    public void k(q qVar) {
        this.f4624a = qVar;
    }

    public void l(boolean z10) {
        this.f4627d = z10;
    }

    public void m(boolean z10) {
        this.f4625b = z10;
    }

    public void n(boolean z10) {
        this.f4626c = z10;
    }

    public void o(boolean z10) {
        this.f4628e = z10;
    }

    public void p(long j10) {
        this.f4629f = j10;
    }

    public void q(long j10) {
        this.f4630g = j10;
    }

    c(a aVar) {
        this.f4624a = q.NOT_REQUIRED;
        this.f4629f = -1L;
        this.f4630g = -1L;
        this.f4631h = new d();
        this.f4625b = aVar.f4632a;
        int i10 = Build.VERSION.SDK_INT;
        this.f4626c = i10 >= 23 && aVar.f4633b;
        this.f4624a = aVar.f4634c;
        this.f4627d = aVar.f4635d;
        this.f4628e = aVar.f4636e;
        if (i10 >= 24) {
            this.f4631h = aVar.f4639h;
            this.f4629f = aVar.f4637f;
            this.f4630g = aVar.f4638g;
        }
    }

    public c(c cVar) {
        this.f4624a = q.NOT_REQUIRED;
        this.f4629f = -1L;
        this.f4630g = -1L;
        this.f4631h = new d();
        this.f4625b = cVar.f4625b;
        this.f4626c = cVar.f4626c;
        this.f4624a = cVar.f4624a;
        this.f4627d = cVar.f4627d;
        this.f4628e = cVar.f4628e;
        this.f4631h = cVar.f4631h;
    }
}
