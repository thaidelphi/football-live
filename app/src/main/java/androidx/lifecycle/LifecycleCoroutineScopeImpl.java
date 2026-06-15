package androidx.lifecycle;

import androidx.lifecycle.i;
import d9.d2;
import d9.f1;
/* compiled from: Lifecycle.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class LifecycleCoroutineScopeImpl extends j implements m {

    /* renamed from: a  reason: collision with root package name */
    private final i f3538a;

    /* renamed from: b  reason: collision with root package name */
    private final m8.g f3539b;

    /* compiled from: Lifecycle.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<d9.o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f3540a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f3541b;

        a(m8.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f3541b = obj;
            return aVar;
        }

        @Override // t8.p
        public final Object invoke(d9.o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n8.d.c();
            if (this.f3540a == 0) {
                i8.p.b(obj);
                d9.o0 o0Var = (d9.o0) this.f3541b;
                if (LifecycleCoroutineScopeImpl.this.g().b().compareTo(i.b.INITIALIZED) >= 0) {
                    LifecycleCoroutineScopeImpl.this.g().a(LifecycleCoroutineScopeImpl.this);
                } else {
                    d2.d(o0Var.getCoroutineContext(), null, 1, null);
                }
                return i8.w.f26638a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(i lifecycle, m8.g coroutineContext) {
        kotlin.jvm.internal.n.f(lifecycle, "lifecycle");
        kotlin.jvm.internal.n.f(coroutineContext, "coroutineContext");
        this.f3538a = lifecycle;
        this.f3539b = coroutineContext;
        if (g().b() == i.b.DESTROYED) {
            d2.d(getCoroutineContext(), null, 1, null);
        }
    }

    public i g() {
        return this.f3538a;
    }

    @Override // d9.o0
    public m8.g getCoroutineContext() {
        return this.f3539b;
    }

    public final void h() {
        d9.i.d(this, f1.c().K0(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p source, i.a event) {
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(event, "event");
        if (g().b().compareTo(i.b.DESTROYED) <= 0) {
            g().d(this);
            d2.d(getCoroutineContext(), null, 1, null);
        }
    }
}
