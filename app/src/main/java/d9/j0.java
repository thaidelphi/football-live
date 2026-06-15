package d9;

import m8.e;
import m8.g;
/* compiled from: CoroutineDispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class j0 extends m8.a implements m8.e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24469a = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends m8.b<m8.e, j0> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: d9.j0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        static final class C0266a extends kotlin.jvm.internal.o implements t8.l<g.b, j0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0266a f24470a = new C0266a();

            C0266a() {
                super(1);
            }

            @Override // t8.l
            /* renamed from: a */
            public final j0 invoke(g.b bVar) {
                if (bVar instanceof j0) {
                    return (j0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(m8.e.f27794v0, C0266a.f24470a);
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public j0() {
        super(m8.e.f27794v0);
    }

    public abstract void G0(m8.g gVar, Runnable runnable);

    public void H0(m8.g gVar, Runnable runnable) {
        G0(gVar, runnable);
    }

    public boolean I0(m8.g gVar) {
        return true;
    }

    public j0 J0(int i10) {
        i9.s.a(i10);
        return new i9.r(this, i10);
    }

    @Override // m8.a, m8.g.b, m8.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // m8.a, m8.g
    public m8.g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return t0.a(this) + '@' + t0.b(this);
    }

    @Override // m8.e
    public final <T> m8.d<T> w(m8.d<? super T> dVar) {
        return new i9.k(this, dVar);
    }

    @Override // m8.e
    public final void z(m8.d<?> dVar) {
        kotlin.jvm.internal.n.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((i9.k) dVar).v();
    }
}
