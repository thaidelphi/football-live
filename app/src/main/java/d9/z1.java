package d9;

import java.util.concurrent.CancellationException;
import m8.g;
/* compiled from: Job.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface z1 extends g.b {

    /* renamed from: t0  reason: collision with root package name */
    public static final b f24533t0 = b.f24534a;

    /* compiled from: Job.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        public static /* synthetic */ void a(z1 z1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            z1Var.a(cancellationException);
        }

        public static <R> R b(z1 z1Var, R r10, t8.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(z1Var, r10, pVar);
        }

        public static <E extends g.b> E c(z1 z1Var, g.c<E> cVar) {
            return (E) g.b.a.b(z1Var, cVar);
        }

        public static /* synthetic */ g1 d(z1 z1Var, boolean z10, boolean z11, t8.l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return z1Var.z0(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static m8.g e(z1 z1Var, g.c<?> cVar) {
            return g.b.a.c(z1Var, cVar);
        }

        public static m8.g f(z1 z1Var, m8.g gVar) {
            return g.b.a.d(z1Var, gVar);
        }
    }

    /* compiled from: Job.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b implements g.c<z1> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f24534a = new b();

        private b() {
        }
    }

    t E(v vVar);

    g1 K(t8.l<? super Throwable, i8.w> lVar);

    void a(CancellationException cancellationException);

    boolean b();

    z1 getParent();

    boolean isActive();

    boolean isCancelled();

    Object n0(m8.d<? super i8.w> dVar);

    boolean start();

    CancellationException t();

    g1 z0(boolean z10, boolean z11, t8.l<? super Throwable, i8.w> lVar);
}
