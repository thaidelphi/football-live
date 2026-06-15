package d9;

import m8.e;
/* compiled from: Builders.common.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class k {
    public static final <T> w0<T> a(o0 o0Var, m8.g gVar, q0 q0Var, t8.p<? super o0, ? super m8.d<? super T>, ? extends Object> pVar) {
        x0 x0Var;
        m8.g d10 = i0.d(o0Var, gVar);
        if (q0Var.c()) {
            x0Var = new i2(d10, pVar);
        } else {
            x0Var = new x0(d10, true);
        }
        ((a) x0Var).S0(q0Var, x0Var, pVar);
        return x0Var;
    }

    public static /* synthetic */ w0 b(o0 o0Var, m8.g gVar, q0 q0Var, t8.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m8.h.f27797a;
        }
        if ((i10 & 2) != 0) {
            q0Var = q0.DEFAULT;
        }
        return i.a(o0Var, gVar, q0Var, pVar);
    }

    public static final z1 c(o0 o0Var, m8.g gVar, q0 q0Var, t8.p<? super o0, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        a s2Var;
        m8.g d10 = i0.d(o0Var, gVar);
        if (q0Var.c()) {
            s2Var = new j2(d10, pVar);
        } else {
            s2Var = new s2(d10, true);
        }
        s2Var.S0(q0Var, s2Var, pVar);
        return s2Var;
    }

    public static /* synthetic */ z1 d(o0 o0Var, m8.g gVar, q0 q0Var, t8.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m8.h.f27797a;
        }
        if ((i10 & 2) != 0) {
            q0Var = q0.DEFAULT;
        }
        return i.c(o0Var, gVar, q0Var, pVar);
    }

    public static final <T> Object e(m8.g gVar, t8.p<? super o0, ? super m8.d<? super T>, ? extends Object> pVar, m8.d<? super T> dVar) {
        Object T0;
        Object c10;
        m8.g context = dVar.getContext();
        m8.g e8 = i0.e(context, gVar);
        d2.g(e8);
        if (e8 == context) {
            i9.g0 g0Var = new i9.g0(e8, dVar);
            T0 = j9.b.b(g0Var, g0Var, pVar);
        } else {
            e.b bVar = m8.e.f27794v0;
            if (kotlin.jvm.internal.n.a(e8.get(bVar), context.get(bVar))) {
                b3 b3Var = new b3(e8, dVar);
                m8.g context2 = b3Var.getContext();
                Object c11 = i9.o0.c(context2, null);
                try {
                    Object b10 = j9.b.b(b3Var, b3Var, pVar);
                    i9.o0.a(context2, c11);
                    T0 = b10;
                } catch (Throwable th) {
                    i9.o0.a(context2, c11);
                    throw th;
                }
            } else {
                b1 b1Var = new b1(e8, dVar);
                j9.a.d(pVar, b1Var, b1Var, null, 4, null);
                T0 = b1Var.T0();
            }
        }
        c10 = n8.d.c();
        if (T0 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return T0;
    }
}
