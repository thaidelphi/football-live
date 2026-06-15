package n9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealCall.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class x implements e {

    /* renamed from: a  reason: collision with root package name */
    final v f28997a;

    /* renamed from: b  reason: collision with root package name */
    final r9.j f28998b;

    /* renamed from: c  reason: collision with root package name */
    final y9.a f28999c;

    /* renamed from: d  reason: collision with root package name */
    private p f29000d;

    /* renamed from: e  reason: collision with root package name */
    final y f29001e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f29002f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f29003g;

    /* compiled from: RealCall.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a extends y9.a {
        a() {
        }

        @Override // y9.a
        protected void t() {
            x.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealCall.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class b extends o9.b {

        /* renamed from: b  reason: collision with root package name */
        private final f f29005b;

        b(f fVar) {
            super("OkHttp %s", x.this.j());
            this.f29005b = fVar;
        }

        @Override // o9.b
        protected void k() {
            boolean z10;
            Throwable th;
            IOException e8;
            x.this.f28999c.k();
            try {
                try {
                    z10 = true;
                    try {
                        this.f29005b.onResponse(x.this, x.this.g());
                    } catch (IOException e10) {
                        e8 = e10;
                        IOException k10 = x.this.k(e8);
                        if (!z10) {
                            x.this.f29000d.b(x.this, k10);
                            this.f29005b.onFailure(x.this, k10);
                        } else {
                            v9.g.l().t(4, "Callback failure for " + x.this.l(), k10);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        x.this.d();
                        if (!z10) {
                            this.f29005b.onFailure(x.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } finally {
                    x.this.f28997a.l().e(this);
                }
            } catch (IOException e11) {
                z10 = false;
                e8 = e11;
            } catch (Throwable th3) {
                z10 = false;
                th = th3;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void l(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e8) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e8);
                    x.this.f29000d.b(x.this, interruptedIOException);
                    this.f29005b.onFailure(x.this, interruptedIOException);
                    x.this.f28997a.l().e(this);
                }
            } catch (Throwable th) {
                x.this.f28997a.l().e(this);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public x m() {
            return x.this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String n() {
            return x.this.f29001e.i().l();
        }
    }

    private x(v vVar, y yVar, boolean z10) {
        this.f28997a = vVar;
        this.f29001e = yVar;
        this.f29002f = z10;
        this.f28998b = new r9.j(vVar, z10);
        a aVar = new a();
        this.f28999c = aVar;
        aVar.g(vVar.f(), TimeUnit.MILLISECONDS);
    }

    private void e() {
        this.f28998b.k(v9.g.l().p("response.body().close()"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x i(v vVar, y yVar, boolean z10) {
        x xVar = new x(vVar, yVar, z10);
        xVar.f29000d = vVar.n().a(xVar);
        return xVar;
    }

    @Override // n9.e
    public void a(f fVar) {
        synchronized (this) {
            if (!this.f29003g) {
                this.f29003g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        e();
        this.f29000d.c(this);
        this.f28997a.l().a(new b(fVar));
    }

    @Override // n9.e
    public a0 b() throws IOException {
        synchronized (this) {
            if (!this.f29003g) {
                this.f29003g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        e();
        this.f28999c.k();
        this.f29000d.c(this);
        try {
            try {
                this.f28997a.l().b(this);
                a0 g10 = g();
                if (g10 != null) {
                    return g10;
                }
                throw new IOException("Canceled");
            } catch (IOException e8) {
                IOException k10 = k(e8);
                this.f29000d.b(this, k10);
                throw k10;
            }
        } finally {
            this.f28997a.l().f(this);
        }
    }

    public void d() {
        this.f28998b.b();
    }

    /* renamed from: f */
    public x clone() {
        return i(this.f28997a, this.f29001e, this.f29002f);
    }

    a0 g() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f28997a.r());
        arrayList.add(this.f28998b);
        arrayList.add(new r9.a(this.f28997a.k()));
        arrayList.add(new p9.a(this.f28997a.s()));
        arrayList.add(new q9.a(this.f28997a));
        if (!this.f29002f) {
            arrayList.addAll(this.f28997a.t());
        }
        arrayList.add(new r9.b(this.f29002f));
        a0 e8 = new r9.g(arrayList, null, null, null, 0, this.f29001e, this, this.f29000d, this.f28997a.h(), this.f28997a.B(), this.f28997a.F()).e(this.f29001e);
        if (this.f28998b.e()) {
            o9.c.g(e8);
            throw new IOException("Canceled");
        }
        return e8;
    }

    public boolean h() {
        return this.f28998b.e();
    }

    String j() {
        return this.f29001e.i().z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IOException k(IOException iOException) {
        if (this.f28999c.n()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
            return interruptedIOException;
        }
        return iOException;
    }

    String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(h() ? "canceled " : "");
        sb.append(this.f29002f ? "web socket" : "call");
        sb.append(" to ");
        sb.append(j());
        return sb.toString();
    }
}
