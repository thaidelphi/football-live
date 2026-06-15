package androidx.lifecycle;

import androidx.lifecycle.i;
import d9.z1;
import i8.o;
/* compiled from: RepeatOnLifecycle.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i.a f3564a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.a0<z1> f3565b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d9.o0 f3566c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.a f3567d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ d9.n<i8.w> f3568e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ m9.a f3569f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ t8.p<d9.o0, m8.d<? super i8.w>, Object> f3570g;

    /* compiled from: RepeatOnLifecycle.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<d9.o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f3571a;

        /* renamed from: b  reason: collision with root package name */
        Object f3572b;

        /* renamed from: c  reason: collision with root package name */
        int f3573c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m9.a f3574d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t8.p<d9.o0, m8.d<? super i8.w>, Object> f3575e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RepeatOnLifecycle.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class C0060a extends kotlin.coroutines.jvm.internal.l implements t8.p<d9.o0, m8.d<? super i8.w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f3576a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f3577b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ t8.p<d9.o0, m8.d<? super i8.w>, Object> f3578c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0060a(t8.p<? super d9.o0, ? super m8.d<? super i8.w>, ? extends Object> pVar, m8.d<? super C0060a> dVar) {
                super(2, dVar);
                this.f3578c = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
                C0060a c0060a = new C0060a(this.f3578c, dVar);
                c0060a.f3577b = obj;
                return c0060a;
            }

            @Override // t8.p
            public final Object invoke(d9.o0 o0Var, m8.d<? super i8.w> dVar) {
                return ((C0060a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f3576a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    t8.p<d9.o0, m8.d<? super i8.w>, Object> pVar = this.f3578c;
                    this.f3576a = 1;
                    if (pVar.invoke((d9.o0) this.f3577b, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return i8.w.f26638a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(m9.a aVar, t8.p<? super d9.o0, ? super m8.d<? super i8.w>, ? extends Object> pVar, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f3574d = aVar;
            this.f3575e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            return new a(this.f3574d, this.f3575e, dVar);
        }

        @Override // t8.p
        public final Object invoke(d9.o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            m9.a aVar;
            t8.p<d9.o0, m8.d<? super i8.w>, Object> pVar;
            m9.a aVar2;
            Throwable th;
            c10 = n8.d.c();
            int i10 = this.f3573c;
            try {
                if (i10 == 0) {
                    i8.p.b(obj);
                    aVar = this.f3574d;
                    pVar = this.f3575e;
                    this.f3571a = aVar;
                    this.f3572b = pVar;
                    this.f3573c = 1;
                    if (aVar.b(null, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        aVar2 = (m9.a) this.f3571a;
                        try {
                            i8.p.b(obj);
                            i8.w wVar = i8.w.f26638a;
                            aVar2.a(null);
                            return wVar;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.a(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    pVar = (t8.p) this.f3572b;
                    i8.p.b(obj);
                    aVar = (m9.a) this.f3571a;
                }
                C0060a c0060a = new C0060a(pVar, null);
                this.f3571a = aVar;
                this.f3572b = null;
                this.f3573c = 2;
                if (d9.p0.e(c0060a, this) == c10) {
                    return c10;
                }
                aVar2 = aVar;
                i8.w wVar2 = i8.w.f26638a;
                aVar2.a(null);
                return wVar2;
            } catch (Throwable th3) {
                aVar2 = aVar;
                th = th3;
                aVar2.a(null);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [T, d9.z1] */
    @Override // androidx.lifecycle.m
    public final void onStateChanged(p pVar, i.a event) {
        ?? d10;
        kotlin.jvm.internal.n.f(pVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.n.f(event, "event");
        if (event == this.f3564a) {
            kotlin.jvm.internal.a0<z1> a0Var = this.f3565b;
            d10 = d9.k.d(this.f3566c, null, null, new a(this.f3569f, this.f3570g, null), 3, null);
            a0Var.f27364a = d10;
            return;
        }
        if (event == this.f3567d) {
            z1 z1Var = this.f3565b.f27364a;
            if (z1Var != null) {
                z1.a.a(z1Var, null, 1, null);
            }
            this.f3565b.f27364a = null;
        }
        if (event == i.a.ON_DESTROY) {
            d9.n<i8.w> nVar = this.f3568e;
            o.a aVar = i8.o.f26626b;
            nVar.resumeWith(i8.o.b(i8.w.f26638a));
        }
    }
}
