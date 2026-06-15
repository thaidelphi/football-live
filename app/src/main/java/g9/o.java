package g9;

import androidx.recyclerview.widget.RecyclerView;
import d9.s0;
import d9.z1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Errors.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f25977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t8.q f25978b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
        /* renamed from: g9.o$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0287a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f25979a;

            /* renamed from: b  reason: collision with root package name */
            int f25980b;

            /* renamed from: d  reason: collision with root package name */
            Object f25982d;

            /* renamed from: e  reason: collision with root package name */
            Object f25983e;

            public C0287a(m8.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25979a = obj;
                this.f25980b |= RecyclerView.UNDEFINED_DURATION;
                return a.this.collect(null, this);
            }
        }

        public a(e eVar, t8.q qVar) {
            this.f25977a = eVar;
            this.f25978b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
        @Override // g9.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(g9.f<? super T> r6, m8.d<? super i8.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof g9.o.a.C0287a
                if (r0 == 0) goto L13
                r0 = r7
                g9.o$a$a r0 = (g9.o.a.C0287a) r0
                int r1 = r0.f25980b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25980b = r1
                goto L18
            L13:
                g9.o$a$a r0 = new g9.o$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f25979a
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f25980b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                i8.p.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f25983e
                g9.f r6 = (g9.f) r6
                java.lang.Object r2 = r0.f25982d
                g9.o$a r2 = (g9.o.a) r2
                i8.p.b(r7)
                goto L53
            L40:
                i8.p.b(r7)
                g9.e r7 = r5.f25977a
                r0.f25982d = r5
                r0.f25983e = r6
                r0.f25980b = r4
                java.lang.Object r7 = g9.g.g(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                t8.q r2 = r2.f25978b
                r4 = 0
                r0.f25982d = r4
                r0.f25983e = r4
                r0.f25980b = r3
                r3 = 6
                kotlin.jvm.internal.m.a(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.m.a(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                i8.w r6 = i8.w.f26638a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.o.a.collect(g9.f, m8.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Errors.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {156}, m = "catchImpl")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f25984a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f25985b;

        /* renamed from: c  reason: collision with root package name */
        int f25986c;

        b(m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25985b = obj;
            this.f25986c |= RecyclerView.UNDEFINED_DURATION;
            return g.g(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Errors.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f<T> f25987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.a0<Throwable> f25988b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Errors.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f25989a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f25990b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c<T> f25991c;

            /* renamed from: d  reason: collision with root package name */
            int f25992d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, m8.d<? super a> dVar) {
                super(dVar);
                this.f25991c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25990b = obj;
                this.f25992d |= RecyclerView.UNDEFINED_DURATION;
                return this.f25991c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(f<? super T> fVar, kotlin.jvm.internal.a0<Throwable> a0Var) {
            this.f25987a = fVar;
            this.f25988b = a0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // g9.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, m8.d<? super i8.w> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof g9.o.c.a
                if (r0 == 0) goto L13
                r0 = r6
                g9.o$c$a r0 = (g9.o.c.a) r0
                int r1 = r0.f25992d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25992d = r1
                goto L18
            L13:
                g9.o$c$a r0 = new g9.o$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f25990b
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f25992d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f25989a
                g9.o$c r5 = (g9.o.c) r5
                i8.p.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                i8.p.b(r6)
                g9.f<T> r6 = r4.f25987a     // Catch: java.lang.Throwable -> L4a
                r0.f25989a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f25992d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                i8.w r5 = i8.w.f26638a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.a0<java.lang.Throwable> r5 = r5.f25988b
                r5.f27364a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.o.c.emit(java.lang.Object, m8.d):java.lang.Object");
        }
    }

    public static final <T> e<T> a(e<? extends T> eVar, t8.q<? super f<? super T>, ? super Throwable, ? super m8.d<? super i8.w>, ? extends Object> qVar) {
        return new a(eVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(g9.e<? extends T> r4, g9.f<? super T> r5, m8.d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof g9.o.b
            if (r0 == 0) goto L13
            r0 = r6
            g9.o$b r0 = (g9.o.b) r0
            int r1 = r0.f25986c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25986c = r1
            goto L18
        L13:
            g9.o$b r0 = new g9.o$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25985b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f25986c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f25984a
            kotlin.jvm.internal.a0 r4 = (kotlin.jvm.internal.a0) r4
            i8.p.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            i8.p.b(r6)
            kotlin.jvm.internal.a0 r6 = new kotlin.jvm.internal.a0
            r6.<init>()
            g9.o$c r2 = new g9.o$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f25984a = r6     // Catch: java.lang.Throwable -> L51
            r0.f25986c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f27364a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            m8.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            i8.a.a(r4, r5)
            throw r4
        L72:
            i8.a.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.o.b(g9.e, g9.f, m8.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, m8.g gVar) {
        z1 z1Var = (z1) gVar.get(z1.f24533t0);
        if (z1Var == null || !z1Var.isCancelled()) {
            return false;
        }
        return d(th, z1Var.t());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (s0.d()) {
                th2 = i9.j0.l(th2);
            }
            if (s0.d()) {
                th = i9.j0.l(th);
            }
            if (kotlin.jvm.internal.n.a(th2, th)) {
                return true;
            }
        }
        return false;
    }
}
