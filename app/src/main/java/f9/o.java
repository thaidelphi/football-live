package f9;

import d9.d3;
import f9.h;
import i8.w;
import i9.c0;
import i9.k0;
import i9.t0;
import kotlin.jvm.internal.b0;
/* compiled from: ConflatedBufferedChannel.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class o<E> extends b<E> {

    /* renamed from: m  reason: collision with root package name */
    private final int f25563m;

    /* renamed from: n  reason: collision with root package name */
    private final a f25564n;

    public o(int i10, a aVar, t8.l<? super E, w> lVar) {
        super(i10, lVar);
        this.f25563m = i10;
        this.f25564n = aVar;
        if (!(aVar != a.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + b0.b(b.class).b() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ <E> Object T0(o<E> oVar, E e8, m8.d<? super w> dVar) {
        t0 d10;
        Object W0 = oVar.W0(e8, true);
        if (W0 instanceof h.a) {
            h.e(W0);
            t8.l<E, w> lVar = oVar.f25506b;
            if (lVar != null && (d10 = c0.d(lVar, e8, null, 2, null)) != null) {
                i8.b.a(d10, oVar.T());
                throw d10;
            }
            throw oVar.T();
        }
        return w.f26638a;
    }

    private final Object U0(E e8, boolean z10) {
        t8.l<E, w> lVar;
        t0 d10;
        Object l10 = super.l(e8);
        if (h.i(l10) || h.h(l10)) {
            return l10;
        }
        if (z10 && (lVar = this.f25506b) != null && (d10 = c0.d(lVar, e8, null, 2, null)) != null) {
            throw d10;
        }
        return h.f25553b.c(w.f26638a);
    }

    private final Object V0(E e8) {
        i iVar;
        k0 k0Var = c.f25532d;
        i iVar2 = (i) b.f25500h.get(this);
        while (true) {
            long andIncrement = b.f25496d.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean d02 = d0(andIncrement);
            int i10 = c.f25530b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (iVar2.f26659c != j11) {
                i O = O(j11, iVar2);
                if (O != null) {
                    iVar = O;
                } else if (d02) {
                    return h.f25553b.a(T());
                }
            } else {
                iVar = iVar2;
            }
            int O0 = O0(iVar, i11, e8, j10, k0Var, d02);
            if (O0 == 0) {
                iVar.b();
                return h.f25553b.c(w.f26638a);
            } else if (O0 == 1) {
                return h.f25553b.c(w.f26638a);
            } else {
                if (O0 == 2) {
                    if (d02) {
                        iVar.p();
                        return h.f25553b.a(T());
                    }
                    d3 d3Var = k0Var instanceof d3 ? (d3) k0Var : null;
                    if (d3Var != null) {
                        u0(d3Var, iVar, i11);
                    }
                    K((iVar.f26659c * i10) + i11);
                    return h.f25553b.c(w.f26638a);
                } else if (O0 == 3) {
                    throw new IllegalStateException("unexpected".toString());
                } else {
                    if (O0 == 4) {
                        if (j10 < S()) {
                            iVar.b();
                        }
                        return h.f25553b.a(T());
                    }
                    if (O0 == 5) {
                        iVar.b();
                    }
                    iVar2 = iVar;
                }
            }
        }
    }

    private final Object W0(E e8, boolean z10) {
        return this.f25564n == a.DROP_LATEST ? U0(e8, z10) : V0(e8);
    }

    @Override // f9.b
    protected boolean e0() {
        return this.f25564n == a.DROP_OLDEST;
    }

    @Override // f9.b, f9.u
    public Object i(E e8, m8.d<? super w> dVar) {
        return T0(this, e8, dVar);
    }

    @Override // f9.b, f9.u
    public Object l(E e8) {
        return W0(e8, false);
    }
}
