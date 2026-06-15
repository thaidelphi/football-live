package d9;

import i8.o;
/* compiled from: DispatchedTask.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class c1<T> extends k9.h {

    /* renamed from: c  reason: collision with root package name */
    public int f24419c;

    public c1(int i10) {
        this.f24419c = i10;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract m8.d<T> c();

    public Throwable i(Object obj) {
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null) {
            return b0Var.f24413a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T j(Object obj) {
        return obj;
    }

    public final void k(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            i8.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.n.c(th);
        l0.a(c().getContext(), new r0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object l();

    @Override // java.lang.Runnable
    public final void run() {
        Object b10;
        Object b11;
        if (s0.a()) {
            if (!(this.f24419c != -1)) {
                throw new AssertionError();
            }
        }
        k9.i iVar = this.f27339b;
        try {
            m8.d<T> c10 = c();
            kotlin.jvm.internal.n.d(c10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            i9.k kVar = (i9.k) c10;
            m8.d<T> dVar = kVar.f26666e;
            Object obj = kVar.f26668g;
            m8.g context = dVar.getContext();
            Object c11 = i9.o0.c(context, obj);
            b3<?> g10 = c11 != i9.o0.f26682a ? i0.g(dVar, context, c11) : null;
            m8.g context2 = dVar.getContext();
            Object l10 = l();
            Throwable i10 = i(l10);
            z1 z1Var = (i10 == null && d1.b(this.f24419c)) ? (z1) context2.get(z1.f24533t0) : null;
            if (z1Var != null && !z1Var.isActive()) {
                Throwable t10 = z1Var.t();
                a(l10, t10);
                o.a aVar = i8.o.f26626b;
                if (s0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                    t10 = i9.j0.a(t10, (kotlin.coroutines.jvm.internal.e) dVar);
                }
                dVar.resumeWith(i8.o.b(i8.p.a(t10)));
            } else if (i10 != null) {
                o.a aVar2 = i8.o.f26626b;
                dVar.resumeWith(i8.o.b(i8.p.a(i10)));
            } else {
                o.a aVar3 = i8.o.f26626b;
                dVar.resumeWith(i8.o.b(j(l10)));
            }
            i8.w wVar = i8.w.f26638a;
            if (g10 == null || g10.T0()) {
                i9.o0.a(context, c11);
            }
            try {
                o.a aVar4 = i8.o.f26626b;
                iVar.a();
                b11 = i8.o.b(wVar);
            } catch (Throwable th) {
                o.a aVar5 = i8.o.f26626b;
                b11 = i8.o.b(i8.p.a(th));
            }
            k(null, i8.o.d(b11));
        } catch (Throwable th2) {
            try {
                o.a aVar6 = i8.o.f26626b;
                iVar.a();
                b10 = i8.o.b(i8.w.f26638a);
            } catch (Throwable th3) {
                o.a aVar7 = i8.o.f26626b;
                b10 = i8.o.b(i8.p.a(th3));
            }
            k(th2, i8.o.d(b10));
        }
    }
}
