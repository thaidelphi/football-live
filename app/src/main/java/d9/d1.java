package d9;

import i8.o;
/* compiled from: DispatchedTask.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d1 {
    public static final <T> void a(c1<? super T> c1Var, int i10) {
        if (s0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        m8.d<? super T> c10 = c1Var.c();
        boolean z10 = i10 == 4;
        if (!z10 && (c10 instanceof i9.k) && b(i10) == b(c1Var.f24419c)) {
            j0 j0Var = ((i9.k) c10).f26665d;
            m8.g context = c10.getContext();
            if (j0Var.I0(context)) {
                j0Var.G0(context, c1Var);
                return;
            } else {
                e(c1Var);
                return;
            }
        }
        d(c1Var, c10, z10);
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(c1<? super T> c1Var, m8.d<? super T> dVar, boolean z10) {
        Object j10;
        boolean T0;
        Object l10 = c1Var.l();
        Throwable i10 = c1Var.i(l10);
        if (i10 != null) {
            o.a aVar = i8.o.f26626b;
            j10 = i8.p.a(i10);
        } else {
            o.a aVar2 = i8.o.f26626b;
            j10 = c1Var.j(l10);
        }
        Object b10 = i8.o.b(j10);
        if (z10) {
            kotlin.jvm.internal.n.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            i9.k kVar = (i9.k) dVar;
            m8.d<T> dVar2 = kVar.f26666e;
            Object obj = kVar.f26668g;
            m8.g context = dVar2.getContext();
            Object c10 = i9.o0.c(context, obj);
            b3<?> g10 = c10 != i9.o0.f26682a ? i0.g(dVar2, context, c10) : null;
            try {
                kVar.f26666e.resumeWith(b10);
                i8.w wVar = i8.w.f26638a;
                if (g10 != null) {
                    if (!T0) {
                        return;
                    }
                }
                return;
            } finally {
                if (g10 == null || g10.T0()) {
                    i9.o0.a(context, c10);
                }
            }
        }
        dVar.resumeWith(b10);
    }

    private static final void e(c1<?> c1Var) {
        k1 b10 = w2.f24526a.b();
        if (b10.R0()) {
            b10.N0(c1Var);
            return;
        }
        b10.P0(true);
        try {
            d(c1Var, c1Var.c(), true);
            do {
            } while (b10.U0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
