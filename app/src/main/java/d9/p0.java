package d9;

import java.util.concurrent.CancellationException;
/* compiled from: CoroutineScope.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class p0 {
    public static final o0 a(m8.g gVar) {
        z b10;
        if (gVar.get(z1.f24533t0) == null) {
            b10 = e2.b(null, 1, null);
            gVar = gVar.plus(b10);
        }
        return new i9.f(gVar);
    }

    public static final o0 b() {
        return new i9.f(u2.b(null, 1, null).plus(f1.c()));
    }

    public static final void c(o0 o0Var, CancellationException cancellationException) {
        z1 z1Var = (z1) o0Var.getCoroutineContext().get(z1.f24533t0);
        if (z1Var != null) {
            z1Var.a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o0Var).toString());
    }

    public static /* synthetic */ void d(o0 o0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(o0Var, cancellationException);
    }

    public static final <R> Object e(t8.p<? super o0, ? super m8.d<? super R>, ? extends Object> pVar, m8.d<? super R> dVar) {
        Object c10;
        i9.g0 g0Var = new i9.g0(dVar.getContext(), dVar);
        Object b10 = j9.b.b(g0Var, g0Var, pVar);
        c10 = n8.d.c();
        if (b10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b10;
    }

    public static final void f(o0 o0Var) {
        d2.g(o0Var.getCoroutineContext());
    }

    public static final boolean g(o0 o0Var) {
        z1 z1Var = (z1) o0Var.getCoroutineContext().get(z1.f24533t0);
        if (z1Var != null) {
            return z1Var.isActive();
        }
        return true;
    }

    public static final o0 h(o0 o0Var, m8.g gVar) {
        return new i9.f(o0Var.getCoroutineContext().plus(gVar));
    }
}
