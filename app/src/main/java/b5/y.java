package b5;

import a5.p0;
import android.os.Handler;
import android.os.SystemClock;
import b5.y;
import n3.m1;
/* compiled from: VideoRendererEventListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface y {

    /* compiled from: VideoRendererEventListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f5234a;

        /* renamed from: b  reason: collision with root package name */
        private final y f5235b;

        public a(Handler handler, y yVar) {
            this.f5234a = yVar != null ? (Handler) a5.a.e(handler) : null;
            this.f5235b = yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((y) p0.j(this.f5235b)).d(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((y) p0.j(this.f5235b)).c(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(q3.e eVar) {
            eVar.c();
            ((y) p0.j(this.f5235b)).o(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((y) p0.j(this.f5235b)).q(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(q3.e eVar) {
            ((y) p0.j(this.f5235b)).j(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(m1 m1Var, q3.i iVar) {
            ((y) p0.j(this.f5235b)).D(m1Var);
            ((y) p0.j(this.f5235b)).l(m1Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((y) p0.j(this.f5235b)).r(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((y) p0.j(this.f5235b)).y(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((y) p0.j(this.f5235b)).k(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(a0 a0Var) {
            ((y) p0.j(this.f5235b)).u(a0Var);
        }

        public void A(final Object obj) {
            if (this.f5234a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f5234a.post(new Runnable() { // from class: b5.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.w(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j10, final int i10) {
            Handler handler = this.f5234a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b5.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.x(j10, i10);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f5234a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b5.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.y(exc);
                    }
                });
            }
        }

        public void D(final a0 a0Var) {
            Handler handler = this.f5234a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b5.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.z(a0Var);
                    }
                });
            }
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f5234a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b5.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.q(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f5234a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b5.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.r(str);
                    }
                });
            }
        }

        public void m(final q3.e eVar) {
            eVar.c();
            Handler handler = this.f5234a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b5.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.s(eVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f5234a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b5.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.t(i10, j10);
                    }
                });
            }
        }

        public void o(final q3.e eVar) {
            Handler handler = this.f5234a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b5.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.u(eVar);
                    }
                });
            }
        }

        public void p(final m1 m1Var, final q3.i iVar) {
            Handler handler = this.f5234a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b5.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.v(m1Var, iVar);
                    }
                });
            }
        }
    }

    @Deprecated
    void D(m1 m1Var);

    void c(String str);

    void d(String str, long j10, long j11);

    void j(q3.e eVar);

    void k(Exception exc);

    void l(m1 m1Var, q3.i iVar);

    void o(q3.e eVar);

    void q(int i10, long j10);

    void r(Object obj, long j10);

    void u(a0 a0Var);

    void y(long j10, int i10);
}
