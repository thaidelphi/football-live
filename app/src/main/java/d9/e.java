package d9;

import i8.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Await.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f24423b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* renamed from: a  reason: collision with root package name */
    private final w0<T>[] f24424a;
    private volatile int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Await.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class a extends f2 {

        /* renamed from: h  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f24425h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: e  reason: collision with root package name */
        private final n<List<? extends T>> f24426e;

        /* renamed from: f  reason: collision with root package name */
        public g1 f24427f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super List<? extends T>> nVar) {
            this.f24426e = nVar;
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
            r(th);
            return i8.w.f26638a;
        }

        @Override // d9.d0
        public void r(Throwable th) {
            if (th != null) {
                Object f10 = this.f24426e.f(th);
                if (f10 != null) {
                    this.f24426e.u(f10);
                    e<T>.b u10 = u();
                    if (u10 != null) {
                        u10.h();
                    }
                }
            } else if (e.f24423b.decrementAndGet(e.this) == 0) {
                n<List<? extends T>> nVar = this.f24426e;
                w0[] w0VarArr = ((e) e.this).f24424a;
                ArrayList arrayList = new ArrayList(w0VarArr.length);
                for (w0 w0Var : w0VarArr) {
                    arrayList.add(w0Var.j());
                }
                o.a aVar = i8.o.f26626b;
                nVar.resumeWith(i8.o.b(arrayList));
            }
        }

        public final e<T>.b u() {
            return (b) f24425h.get(this);
        }

        public final g1 v() {
            g1 g1Var = this.f24427f;
            if (g1Var != null) {
                return g1Var;
            }
            kotlin.jvm.internal.n.u("handle");
            return null;
        }

        public final void w(e<T>.b bVar) {
            f24425h.set(this, bVar);
        }

        public final void x(g1 g1Var) {
            this.f24427f = g1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Await.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        private final e<T>.a[] f24429a;

        public b(e<T>.a[] aVarArr) {
            this.f24429a = aVarArr;
        }

        @Override // d9.m
        public void g(Throwable th) {
            h();
        }

        public final void h() {
            for (e<T>.a aVar : this.f24429a) {
                aVar.v().d();
            }
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
            g(th);
            return i8.w.f26638a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f24429a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(w0<? extends T>[] w0VarArr) {
        this.f24424a = w0VarArr;
        this.notCompletedCount = w0VarArr.length;
    }

    public final Object c(m8.d<? super List<? extends T>> dVar) {
        m8.d b10;
        Object c10;
        b10 = n8.c.b(dVar);
        o oVar = new o(b10, 1);
        oVar.C();
        int length = this.f24424a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            w0 w0Var = this.f24424a[i10];
            w0Var.start();
            a aVar = new a(oVar);
            aVar.x(w0Var.K(aVar));
            i8.w wVar = i8.w.f26638a;
            aVarArr[i10] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].w(bVar);
        }
        if (oVar.b()) {
            bVar.h();
        } else {
            oVar.r(bVar);
        }
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z10;
    }
}
