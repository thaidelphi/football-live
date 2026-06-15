package d9;

import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class e2 {
    public static final z a(z1 z1Var) {
        return new c2(z1Var);
    }

    public static /* synthetic */ z b(z1 z1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z1Var = null;
        }
        return d2.a(z1Var);
    }

    public static final void c(m8.g gVar, CancellationException cancellationException) {
        z1 z1Var = (z1) gVar.get(z1.f24533t0);
        if (z1Var != null) {
            z1Var.a(cancellationException);
        }
    }

    public static /* synthetic */ void d(m8.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d2.c(gVar, cancellationException);
    }

    public static final g1 e(z1 z1Var, g1 g1Var) {
        return z1Var.K(new i1(g1Var));
    }

    public static final void f(z1 z1Var) {
        if (!z1Var.isActive()) {
            throw z1Var.t();
        }
    }

    public static final void g(m8.g gVar) {
        z1 z1Var = (z1) gVar.get(z1.f24533t0);
        if (z1Var != null) {
            d2.f(z1Var);
        }
    }
}
