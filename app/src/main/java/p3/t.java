package p3;

import a5.p0;
import android.os.Handler;
import n3.m1;
import p3.t;
/* compiled from: AudioRendererEventListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface t {

    /* compiled from: AudioRendererEventListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f29788a;

        /* renamed from: b  reason: collision with root package name */
        private final t f29789b;

        public a(Handler handler, t tVar) {
            this.f29788a = tVar != null ? (Handler) a5.a.e(handler) : null;
            this.f29789b = tVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((t) p0.j(this.f29789b)).x(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((t) p0.j(this.f29789b)).v(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((t) p0.j(this.f29789b)).b(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j10, long j11) {
            ((t) p0.j(this.f29789b)).f(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((t) p0.j(this.f29789b)).e(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(q3.e eVar) {
            eVar.c();
            ((t) p0.j(this.f29789b)).p(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(q3.e eVar) {
            ((t) p0.j(this.f29789b)).m(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(m1 m1Var, q3.i iVar) {
            ((t) p0.j(this.f29789b)).E(m1Var);
            ((t) p0.j(this.f29789b)).s(m1Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(long j10) {
            ((t) p0.j(this.f29789b)).i(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(boolean z10) {
            ((t) p0.j(this.f29789b)).a(z10);
        }

        public void B(final long j10) {
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.y(j10);
                    }
                });
            }
        }

        public void C(final boolean z10) {
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.z(z10);
                    }
                });
            }
        }

        public void D(final int i10, final long j10, final long j11) {
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.A(i10, j10, j11);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j10, final long j11) {
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.t(str, j10, j11);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.u(str);
                    }
                });
            }
        }

        public void o(final q3.e eVar) {
            eVar.c();
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.v(eVar);
                    }
                });
            }
        }

        public void p(final q3.e eVar) {
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.w(eVar);
                    }
                });
            }
        }

        public void q(final m1 m1Var, final q3.i iVar) {
            Handler handler = this.f29788a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p3.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.x(m1Var, iVar);
                    }
                });
            }
        }
    }

    @Deprecated
    void E(m1 m1Var);

    void a(boolean z10);

    void b(Exception exc);

    void e(String str);

    void f(String str, long j10, long j11);

    void i(long j10);

    void m(q3.e eVar);

    void p(q3.e eVar);

    void s(m1 m1Var, q3.i iVar);

    void v(Exception exc);

    void x(int i10, long j10, long j11);
}
