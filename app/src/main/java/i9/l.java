package i9;

import d9.b3;
import d9.k1;
import d9.w2;
import d9.z1;
import i8.o;
import java.util.concurrent.CancellationException;
/* compiled from: DispatchedContinuation.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class l {

    /* renamed from: a */
    private static final k0 f26670a = new k0("UNDEFINED");

    /* renamed from: b */
    public static final k0 f26671b = new k0("REUSABLE_CLAIMED");

    public static final <T> void b(m8.d<? super T> dVar, Object obj, t8.l<? super Throwable, i8.w> lVar) {
        boolean z10;
        if (dVar instanceof k) {
            k kVar = (k) dVar;
            Object c10 = d9.f0.c(obj, lVar);
            if (kVar.f26665d.I0(kVar.getContext())) {
                kVar.f26667f = c10;
                kVar.f24419c = 1;
                kVar.f26665d.G0(kVar.getContext(), kVar);
                return;
            }
            d9.s0.a();
            k1 b10 = w2.f24526a.b();
            if (b10.R0()) {
                kVar.f26667f = c10;
                kVar.f24419c = 1;
                b10.N0(kVar);
                return;
            }
            b10.P0(true);
            try {
                z1 z1Var = (z1) kVar.getContext().get(z1.f24533t0);
                if (z1Var == null || z1Var.isActive()) {
                    z10 = false;
                } else {
                    CancellationException t10 = z1Var.t();
                    kVar.a(c10, t10);
                    o.a aVar = i8.o.f26626b;
                    kVar.resumeWith(i8.o.b(i8.p.a(t10)));
                    z10 = true;
                }
                if (!z10) {
                    m8.d<T> dVar2 = kVar.f26666e;
                    Object obj2 = kVar.f26668g;
                    m8.g context = dVar2.getContext();
                    Object c11 = o0.c(context, obj2);
                    b3<?> g10 = c11 != o0.f26682a ? d9.i0.g(dVar2, context, c11) : null;
                    kVar.f26666e.resumeWith(obj);
                    i8.w wVar = i8.w.f26638a;
                    if (g10 == null || g10.T0()) {
                        o0.a(context, c11);
                    }
                }
                do {
                } while (b10.U0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static /* synthetic */ void c(m8.d dVar, Object obj, t8.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }

    public static final boolean d(k<? super i8.w> kVar) {
        i8.w wVar = i8.w.f26638a;
        d9.s0.a();
        k1 b10 = w2.f24526a.b();
        if (b10.S0()) {
            return false;
        }
        if (b10.R0()) {
            kVar.f26667f = wVar;
            kVar.f24419c = 1;
            b10.N0(kVar);
            return true;
        }
        b10.P0(true);
        try {
            kVar.run();
            do {
            } while (b10.U0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
