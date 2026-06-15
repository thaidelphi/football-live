package j9;

import d9.b0;
import d9.h2;
import d9.s0;
import d9.x2;
import i8.o;
import i9.g0;
import i9.j0;
import i9.o0;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.e0;
import m8.d;
import m8.g;
import t8.p;
/* compiled from: Undispatched.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        Object c10;
        d a10 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c11 = o0.c(context, null);
            Object invoke = ((p) e0.a(pVar, 2)).invoke(r10, a10);
            o0.a(context, c11);
            c10 = n8.d.c();
            if (invoke != c10) {
                o.a aVar = o.f26626b;
                a10.resumeWith(o.b(invoke));
            }
        } catch (Throwable th) {
            o.a aVar2 = o.f26626b;
            a10.resumeWith(o.b(i8.p.a(th)));
        }
    }

    public static final <T, R> Object b(g0<? super T> g0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object b0Var;
        Object c10;
        Throwable i10;
        Object c11;
        Object c12;
        try {
            b0Var = ((p) e0.a(pVar, 2)).invoke(r10, g0Var);
        } catch (Throwable th) {
            b0Var = new b0(th, false, 2, null);
        }
        c10 = n8.d.c();
        if (b0Var == c10) {
            c12 = n8.d.c();
            return c12;
        }
        Object m02 = g0Var.m0(b0Var);
        if (m02 == h2.f24457b) {
            c11 = n8.d.c();
            return c11;
        } else if (m02 instanceof b0) {
            Throwable th2 = ((b0) m02).f24413a;
            d<? super T> dVar = g0Var.f26657d;
            if (s0.d() && (dVar instanceof e)) {
                i10 = j0.i(th2, (e) dVar);
                throw i10;
            }
            throw th2;
        } else {
            return h2.h(m02);
        }
    }

    public static final <T, R> Object c(g0<? super T> g0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object b0Var;
        Object c10;
        Throwable i10;
        Throwable i11;
        Object c11;
        Object c12;
        boolean z10 = false;
        try {
            b0Var = ((p) e0.a(pVar, 2)).invoke(r10, g0Var);
        } catch (Throwable th) {
            b0Var = new b0(th, false, 2, null);
        }
        c10 = n8.d.c();
        if (b0Var == c10) {
            c12 = n8.d.c();
            return c12;
        }
        Object m02 = g0Var.m0(b0Var);
        if (m02 == h2.f24457b) {
            c11 = n8.d.c();
            return c11;
        }
        if (m02 instanceof b0) {
            Throwable th2 = ((b0) m02).f24413a;
            if (((th2 instanceof x2) && ((x2) th2).f24530a == g0Var) ? true : true) {
                d<? super T> dVar = g0Var.f26657d;
                if (s0.d() && (dVar instanceof e)) {
                    i11 = j0.i(th2, (e) dVar);
                    throw i11;
                }
                throw th2;
            } else if (b0Var instanceof b0) {
                Throwable th3 = ((b0) b0Var).f24413a;
                d<? super T> dVar2 = g0Var.f26657d;
                if (s0.d() && (dVar2 instanceof e)) {
                    i10 = j0.i(th3, (e) dVar2);
                    throw i10;
                }
                throw th3;
            }
        } else {
            b0Var = h2.h(m02);
        }
        return b0Var;
    }
}
