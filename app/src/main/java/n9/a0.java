package n9;

import java.io.Closeable;
import n9.r;
/* compiled from: Response.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a0 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    final y f28687a;

    /* renamed from: b  reason: collision with root package name */
    final w f28688b;

    /* renamed from: c  reason: collision with root package name */
    final int f28689c;

    /* renamed from: d  reason: collision with root package name */
    final String f28690d;

    /* renamed from: e  reason: collision with root package name */
    final q f28691e;

    /* renamed from: f  reason: collision with root package name */
    final r f28692f;

    /* renamed from: g  reason: collision with root package name */
    final b0 f28693g;

    /* renamed from: h  reason: collision with root package name */
    final a0 f28694h;

    /* renamed from: i  reason: collision with root package name */
    final a0 f28695i;

    /* renamed from: j  reason: collision with root package name */
    final a0 f28696j;

    /* renamed from: k  reason: collision with root package name */
    final long f28697k;

    /* renamed from: l  reason: collision with root package name */
    final long f28698l;

    /* renamed from: m  reason: collision with root package name */
    private volatile d f28699m;

    a0(a aVar) {
        this.f28687a = aVar.f28700a;
        this.f28688b = aVar.f28701b;
        this.f28689c = aVar.f28702c;
        this.f28690d = aVar.f28703d;
        this.f28691e = aVar.f28704e;
        this.f28692f = aVar.f28705f.d();
        this.f28693g = aVar.f28706g;
        this.f28694h = aVar.f28707h;
        this.f28695i = aVar.f28708i;
        this.f28696j = aVar.f28709j;
        this.f28697k = aVar.f28710k;
        this.f28698l = aVar.f28711l;
    }

    public boolean E() {
        int i10 = this.f28689c;
        return i10 >= 200 && i10 < 300;
    }

    public String F() {
        return this.f28690d;
    }

    public a0 G() {
        return this.f28694h;
    }

    public a J() {
        return new a(this);
    }

    public a0 K() {
        return this.f28696j;
    }

    public w L() {
        return this.f28688b;
    }

    public long P() {
        return this.f28698l;
    }

    public y R() {
        return this.f28687a;
    }

    public long S() {
        return this.f28697k;
    }

    public b0 a() {
        return this.f28693g;
    }

    public d b() {
        d dVar = this.f28699m;
        if (dVar != null) {
            return dVar;
        }
        d k10 = d.k(this.f28692f);
        this.f28699m = k10;
        return k10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f28693g;
        if (b0Var != null) {
            b0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public a0 f() {
        return this.f28695i;
    }

    public int j() {
        return this.f28689c;
    }

    public q k() {
        return this.f28691e;
    }

    public String t(String str) {
        return w(str, null);
    }

    public String toString() {
        return "Response{protocol=" + this.f28688b + ", code=" + this.f28689c + ", message=" + this.f28690d + ", url=" + this.f28687a.i() + '}';
    }

    public String w(String str, String str2) {
        String c10 = this.f28692f.c(str);
        return c10 != null ? c10 : str2;
    }

    public r z() {
        return this.f28692f;
    }

    /* compiled from: Response.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        y f28700a;

        /* renamed from: b  reason: collision with root package name */
        w f28701b;

        /* renamed from: c  reason: collision with root package name */
        int f28702c;

        /* renamed from: d  reason: collision with root package name */
        String f28703d;

        /* renamed from: e  reason: collision with root package name */
        q f28704e;

        /* renamed from: f  reason: collision with root package name */
        r.a f28705f;

        /* renamed from: g  reason: collision with root package name */
        b0 f28706g;

        /* renamed from: h  reason: collision with root package name */
        a0 f28707h;

        /* renamed from: i  reason: collision with root package name */
        a0 f28708i;

        /* renamed from: j  reason: collision with root package name */
        a0 f28709j;

        /* renamed from: k  reason: collision with root package name */
        long f28710k;

        /* renamed from: l  reason: collision with root package name */
        long f28711l;

        public a() {
            this.f28702c = -1;
            this.f28705f = new r.a();
        }

        private void e(a0 a0Var) {
            if (a0Var.f28693g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, a0 a0Var) {
            if (a0Var.f28693g == null) {
                if (a0Var.f28694h == null) {
                    if (a0Var.f28695i == null) {
                        if (a0Var.f28696j == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public a a(String str, String str2) {
            this.f28705f.a(str, str2);
            return this;
        }

        public a b(b0 b0Var) {
            this.f28706g = b0Var;
            return this;
        }

        public a0 c() {
            if (this.f28700a != null) {
                if (this.f28701b != null) {
                    if (this.f28702c >= 0) {
                        if (this.f28703d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f28702c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public a d(a0 a0Var) {
            if (a0Var != null) {
                f("cacheResponse", a0Var);
            }
            this.f28708i = a0Var;
            return this;
        }

        public a g(int i10) {
            this.f28702c = i10;
            return this;
        }

        public a h(q qVar) {
            this.f28704e = qVar;
            return this;
        }

        public a i(String str, String str2) {
            this.f28705f.g(str, str2);
            return this;
        }

        public a j(r rVar) {
            this.f28705f = rVar.f();
            return this;
        }

        public a k(String str) {
            this.f28703d = str;
            return this;
        }

        public a l(a0 a0Var) {
            if (a0Var != null) {
                f("networkResponse", a0Var);
            }
            this.f28707h = a0Var;
            return this;
        }

        public a m(a0 a0Var) {
            if (a0Var != null) {
                e(a0Var);
            }
            this.f28709j = a0Var;
            return this;
        }

        public a n(w wVar) {
            this.f28701b = wVar;
            return this;
        }

        public a o(long j10) {
            this.f28711l = j10;
            return this;
        }

        public a p(y yVar) {
            this.f28700a = yVar;
            return this;
        }

        public a q(long j10) {
            this.f28710k = j10;
            return this;
        }

        a(a0 a0Var) {
            this.f28702c = -1;
            this.f28700a = a0Var.f28687a;
            this.f28701b = a0Var.f28688b;
            this.f28702c = a0Var.f28689c;
            this.f28703d = a0Var.f28690d;
            this.f28704e = a0Var.f28691e;
            this.f28705f = a0Var.f28692f.f();
            this.f28706g = a0Var.f28693g;
            this.f28707h = a0Var.f28694h;
            this.f28708i = a0Var.f28695i;
            this.f28709j = a0Var.f28696j;
            this.f28710k = a0Var.f28697k;
            this.f28711l = a0Var.f28698l;
        }
    }
}
