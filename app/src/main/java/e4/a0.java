package e4;

import a5.p0;
import android.os.Handler;
import e4.a0;
import e4.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n3.m1;
/* compiled from: MediaSourceEventListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface a0 {

    /* compiled from: MediaSourceEventListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f24975a;

        /* renamed from: b  reason: collision with root package name */
        public final t.b f24976b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0272a> f24977c;

        /* renamed from: d  reason: collision with root package name */
        private final long f24978d;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: e4.a0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class C0272a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f24979a;

            /* renamed from: b  reason: collision with root package name */
            public a0 f24980b;

            public C0272a(Handler handler, a0 a0Var) {
                this.f24979a = handler;
                this.f24980b = a0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private long h(long j10) {
            long Z0 = p0.Z0(j10);
            if (Z0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f24978d + Z0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(a0 a0Var, p pVar) {
            a0Var.f0(this.f24975a, this.f24976b, pVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(a0 a0Var, l lVar, p pVar) {
            a0Var.C(this.f24975a, this.f24976b, lVar, pVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(a0 a0Var, l lVar, p pVar) {
            a0Var.E(this.f24975a, this.f24976b, lVar, pVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(a0 a0Var, l lVar, p pVar, IOException iOException, boolean z10) {
            a0Var.c0(this.f24975a, this.f24976b, lVar, pVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(a0 a0Var, l lVar, p pVar) {
            a0Var.I(this.f24975a, this.f24976b, lVar, pVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(a0 a0Var, t.b bVar, p pVar) {
            a0Var.G(this.f24975a, bVar, pVar);
        }

        public void A(l lVar, int i10, int i11, m1 m1Var, int i12, Object obj, long j10, long j11) {
            B(lVar, new p(i10, i11, m1Var, i12, obj, h(j10), h(j11)));
        }

        public void B(final l lVar, final p pVar) {
            Iterator<C0272a> it = this.f24977c.iterator();
            while (it.hasNext()) {
                C0272a next = it.next();
                final a0 a0Var = next.f24980b;
                p0.L0(next.f24979a, new Runnable() { // from class: e4.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a.this.o(a0Var, lVar, pVar);
                    }
                });
            }
        }

        public void C(a0 a0Var) {
            Iterator<C0272a> it = this.f24977c.iterator();
            while (it.hasNext()) {
                C0272a next = it.next();
                if (next.f24980b == a0Var) {
                    this.f24977c.remove(next);
                }
            }
        }

        public void D(int i10, long j10, long j11) {
            E(new p(1, i10, null, 3, null, h(j10), h(j11)));
        }

        public void E(final p pVar) {
            final t.b bVar = (t.b) a5.a.e(this.f24976b);
            Iterator<C0272a> it = this.f24977c.iterator();
            while (it.hasNext()) {
                C0272a next = it.next();
                final a0 a0Var = next.f24980b;
                p0.L0(next.f24979a, new Runnable() { // from class: e4.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a.this.p(a0Var, bVar, pVar);
                    }
                });
            }
        }

        public a F(int i10, t.b bVar, long j10) {
            return new a(this.f24977c, i10, bVar, j10);
        }

        public void g(Handler handler, a0 a0Var) {
            a5.a.e(handler);
            a5.a.e(a0Var);
            this.f24977c.add(new C0272a(handler, a0Var));
        }

        public void i(int i10, m1 m1Var, int i11, Object obj, long j10) {
            j(new p(1, i10, m1Var, i11, obj, h(j10), -9223372036854775807L));
        }

        public void j(final p pVar) {
            Iterator<C0272a> it = this.f24977c.iterator();
            while (it.hasNext()) {
                C0272a next = it.next();
                final a0 a0Var = next.f24980b;
                p0.L0(next.f24979a, new Runnable() { // from class: e4.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a.this.k(a0Var, pVar);
                    }
                });
            }
        }

        public void q(l lVar, int i10) {
            r(lVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(l lVar, int i10, int i11, m1 m1Var, int i12, Object obj, long j10, long j11) {
            s(lVar, new p(i10, i11, m1Var, i12, obj, h(j10), h(j11)));
        }

        public void s(final l lVar, final p pVar) {
            Iterator<C0272a> it = this.f24977c.iterator();
            while (it.hasNext()) {
                C0272a next = it.next();
                final a0 a0Var = next.f24980b;
                p0.L0(next.f24979a, new Runnable() { // from class: e4.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a.this.l(a0Var, lVar, pVar);
                    }
                });
            }
        }

        public void t(l lVar, int i10) {
            u(lVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(l lVar, int i10, int i11, m1 m1Var, int i12, Object obj, long j10, long j11) {
            v(lVar, new p(i10, i11, m1Var, i12, obj, h(j10), h(j11)));
        }

        public void v(final l lVar, final p pVar) {
            Iterator<C0272a> it = this.f24977c.iterator();
            while (it.hasNext()) {
                C0272a next = it.next();
                final a0 a0Var = next.f24980b;
                p0.L0(next.f24979a, new Runnable() { // from class: e4.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a.this.m(a0Var, lVar, pVar);
                    }
                });
            }
        }

        public void w(l lVar, int i10, int i11, m1 m1Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            y(lVar, new p(i10, i11, m1Var, i12, obj, h(j10), h(j11)), iOException, z10);
        }

        public void x(l lVar, int i10, IOException iOException, boolean z10) {
            w(lVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void y(final l lVar, final p pVar, final IOException iOException, final boolean z10) {
            Iterator<C0272a> it = this.f24977c.iterator();
            while (it.hasNext()) {
                C0272a next = it.next();
                final a0 a0Var = next.f24980b;
                p0.L0(next.f24979a, new Runnable() { // from class: e4.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a.this.n(a0Var, lVar, pVar, iOException, z10);
                    }
                });
            }
        }

        public void z(l lVar, int i10) {
            A(lVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        private a(CopyOnWriteArrayList<C0272a> copyOnWriteArrayList, int i10, t.b bVar, long j10) {
            this.f24977c = copyOnWriteArrayList;
            this.f24975a = i10;
            this.f24976b = bVar;
            this.f24978d = j10;
        }
    }

    void C(int i10, t.b bVar, l lVar, p pVar);

    void E(int i10, t.b bVar, l lVar, p pVar);

    void G(int i10, t.b bVar, p pVar);

    void I(int i10, t.b bVar, l lVar, p pVar);

    void c0(int i10, t.b bVar, l lVar, p pVar, IOException iOException, boolean z10);

    void f0(int i10, t.b bVar, p pVar);
}
