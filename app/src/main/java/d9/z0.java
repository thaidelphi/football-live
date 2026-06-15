package d9;

import m8.g;
/* compiled from: Delay.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class z0 {
    public static final Object a(long j10, m8.d<? super i8.w> dVar) {
        m8.d b10;
        Object c10;
        Object c11;
        if (j10 <= 0) {
            return i8.w.f26638a;
        }
        b10 = n8.c.b(dVar);
        o oVar = new o(b10, 1);
        oVar.C();
        if (j10 < Long.MAX_VALUE) {
            b(oVar.getContext()).R(j10, oVar);
        }
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        c11 = n8.d.c();
        return z10 == c11 ? z10 : i8.w.f26638a;
    }

    public static final y0 b(m8.g gVar) {
        g.b bVar = gVar.get(m8.e.f27794v0);
        y0 y0Var = bVar instanceof y0 ? (y0) bVar : null;
        return y0Var == null ? v0.a() : y0Var;
    }
}
