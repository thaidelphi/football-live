package g9;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Limit.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> implements g9.e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g9.e f25998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t8.p f25999b;

        public a(g9.e eVar, t8.p pVar) {
            this.f25998a = eVar;
            this.f25999b = pVar;
        }

        @Override // g9.e
        public Object collect(g9.f<? super T> fVar, m8.d<? super i8.w> dVar) {
            Object c10;
            Object collect = this.f25998a.collect(new b(new kotlin.jvm.internal.w(), fVar, this.f25999b), dVar);
            c10 = n8.d.c();
            return collect == c10 ? collect : i8.w.f26638a;
        }
    }

    /* compiled from: Limit.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class b<T> implements g9.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.w f26000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g9.f<T> f26001b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t8.p<T, m8.d<? super Boolean>, Object> f26002c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f26003a;

            /* renamed from: b  reason: collision with root package name */
            Object f26004b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f26005c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b<T> f26006d;

            /* renamed from: e  reason: collision with root package name */
            int f26007e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, m8.d<? super a> dVar) {
                super(dVar);
                this.f26006d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f26005c = obj;
                this.f26007e |= RecyclerView.UNDEFINED_DURATION;
                return this.f26006d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.jvm.internal.w wVar, g9.f<? super T> fVar, t8.p<? super T, ? super m8.d<? super Boolean>, ? extends Object> pVar) {
            this.f26000a = wVar;
            this.f26001b = fVar;
            this.f26002c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // g9.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, m8.d<? super i8.w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof g9.p.b.a
                if (r0 == 0) goto L13
                r0 = r8
                g9.p$b$a r0 = (g9.p.b.a) r0
                int r1 = r0.f26007e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26007e = r1
                goto L18
            L13:
                g9.p$b$a r0 = new g9.p$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f26005c
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f26007e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                i8.p.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f26004b
                java.lang.Object r2 = r0.f26003a
                g9.p$b r2 = (g9.p.b) r2
                i8.p.b(r8)
                goto L6c
            L41:
                i8.p.b(r8)
                goto L59
            L45:
                i8.p.b(r8)
                kotlin.jvm.internal.w r8 = r6.f26000a
                boolean r8 = r8.f27381a
                if (r8 == 0) goto L5c
                g9.f<T> r8 = r6.f26001b
                r0.f26007e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                i8.w r7 = i8.w.f26638a
                return r7
            L5c:
                t8.p<T, m8.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f26002c
                r0.f26003a = r6
                r0.f26004b = r7
                r0.f26007e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.w r8 = r2.f26000a
                r8.f27381a = r5
                g9.f<T> r8 = r2.f26001b
                r2 = 0
                r0.f26003a = r2
                r0.f26004b = r2
                r0.f26007e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                i8.w r7 = i8.w.f26638a
                return r7
            L8b:
                i8.w r7 = i8.w.f26638a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.p.b.emit(java.lang.Object, m8.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Limit.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {73}, m = "emitAbort$FlowKt__LimitKt")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f26008a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26009b;

        /* renamed from: c  reason: collision with root package name */
        int f26010c;

        c(m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26009b = obj;
            this.f26010c |= RecyclerView.UNDEFINED_DURATION;
            return p.c(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class d<T> implements g9.e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g9.e f26011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f26012b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {115}, m = "collect")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f26013a;

            /* renamed from: b  reason: collision with root package name */
            int f26014b;

            /* renamed from: d  reason: collision with root package name */
            Object f26016d;

            public a(m8.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f26013a = obj;
                this.f26014b |= RecyclerView.UNDEFINED_DURATION;
                return d.this.collect(null, this);
            }
        }

        public d(g9.e eVar, int i10) {
            this.f26011a = eVar;
            this.f26012b = i10;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
            h9.o.a(r8, r7);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        @Override // g9.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(g9.f<? super T> r7, m8.d<? super i8.w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof g9.p.d.a
                if (r0 == 0) goto L13
                r0 = r8
                g9.p$d$a r0 = (g9.p.d.a) r0
                int r1 = r0.f26014b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26014b = r1
                goto L18
            L13:
                g9.p$d$a r0 = new g9.p$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f26013a
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f26014b
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f26016d
                g9.f r7 = (g9.f) r7
                i8.p.b(r8)     // Catch: h9.a -> L51
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                i8.p.b(r8)
                kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
                r8.<init>()
                g9.e r2 = r6.f26011a     // Catch: h9.a -> L51
                g9.p$e r4 = new g9.p$e     // Catch: h9.a -> L51
                int r5 = r6.f26012b     // Catch: h9.a -> L51
                r4.<init>(r8, r5, r7)     // Catch: h9.a -> L51
                r0.f26016d = r7     // Catch: h9.a -> L51
                r0.f26014b = r3     // Catch: h9.a -> L51
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: h9.a -> L51
                if (r7 != r1) goto L55
                return r1
            L51:
                r8 = move-exception
                h9.o.a(r8, r7)
            L55:
                i8.w r7 = i8.w.f26638a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.p.d.collect(g9.f, m8.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Limit.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class e<T> implements g9.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.y f26017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f26018b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g9.f<T> f26019c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {61, 63}, m = "emit")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f26020a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e<T> f26021b;

            /* renamed from: c  reason: collision with root package name */
            int f26022c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e<? super T> eVar, m8.d<? super a> dVar) {
                super(dVar);
                this.f26021b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f26020a = obj;
                this.f26022c |= RecyclerView.UNDEFINED_DURATION;
                return this.f26021b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(kotlin.jvm.internal.y yVar, int i10, g9.f<? super T> fVar) {
            this.f26017a = yVar;
            this.f26018b = i10;
            this.f26019c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // g9.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, m8.d<? super i8.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof g9.p.e.a
                if (r0 == 0) goto L13
                r0 = r7
                g9.p$e$a r0 = (g9.p.e.a) r0
                int r1 = r0.f26022c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26022c = r1
                goto L18
            L13:
                g9.p$e$a r0 = new g9.p$e$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f26020a
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f26022c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                i8.p.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                i8.p.b(r7)
                goto L51
            L38:
                i8.p.b(r7)
                kotlin.jvm.internal.y r7 = r5.f26017a
                int r2 = r7.f27383a
                int r2 = r2 + r4
                r7.f27383a = r2
                int r7 = r5.f26018b
                if (r2 >= r7) goto L54
                g9.f<T> r7 = r5.f26019c
                r0.f26022c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                i8.w r6 = i8.w.f26638a
                return r6
            L54:
                g9.f<T> r7 = r5.f26019c
                r0.f26022c = r3
                java.lang.Object r6 = g9.p.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                i8.w r6 = i8.w.f26638a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.p.e.emit(java.lang.Object, m8.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Limit.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class f<R> extends kotlin.coroutines.jvm.internal.l implements t8.p<g9.f<? super R>, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26023a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f26024b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g9.e<T> f26025c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t8.q<g9.f<? super R>, T, m8.d<? super Boolean>, Object> f26026d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Limit.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a<T> implements g9.f<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t8.q f26027a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g9.f f26028b;

            /* compiled from: Limit.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {142}, m = "emit")
            /* renamed from: g9.p$f$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public static final class C0288a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                Object f26029a;

                /* renamed from: b  reason: collision with root package name */
                /* synthetic */ Object f26030b;

                /* renamed from: c  reason: collision with root package name */
                int f26031c;

                public C0288a(m8.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f26030b = obj;
                    this.f26031c |= RecyclerView.UNDEFINED_DURATION;
                    return a.this.emit(null, this);
                }
            }

            public a(t8.q qVar, g9.f fVar) {
                this.f26027a = qVar;
                this.f26028b = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
            @Override // g9.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r5, m8.d<? super i8.w> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof g9.p.f.a.C0288a
                    if (r0 == 0) goto L13
                    r0 = r6
                    g9.p$f$a$a r0 = (g9.p.f.a.C0288a) r0
                    int r1 = r0.f26031c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f26031c = r1
                    goto L18
                L13:
                    g9.p$f$a$a r0 = new g9.p$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f26030b
                    java.lang.Object r1 = n8.b.c()
                    int r2 = r0.f26031c
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f26029a
                    g9.p$f$a r5 = (g9.p.f.a) r5
                    i8.p.b(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    i8.p.b(r6)
                    t8.q r6 = r4.f26027a
                    g9.f r2 = r4.f26028b
                    r0.f26029a = r4
                    r0.f26031c = r3
                    r3 = 6
                    kotlin.jvm.internal.m.a(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.m.a(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    i8.w r5 = i8.w.f26638a
                    return r5
                L5b:
                    h9.a r6 = new h9.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: g9.p.f.a.emit(java.lang.Object, m8.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(g9.e<? extends T> eVar, t8.q<? super g9.f<? super R>, ? super T, ? super m8.d<? super Boolean>, ? extends Object> qVar, m8.d<? super f> dVar) {
            super(2, dVar);
            this.f26025c = eVar;
            this.f26026d = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            f fVar = new f(this.f26025c, this.f26026d, dVar);
            fVar.f26024b = obj;
            return fVar;
        }

        public final Object invoke(g9.f<? super R> fVar, m8.d<? super i8.w> dVar) {
            return ((f) create(fVar, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, m8.d<? super i8.w> dVar) {
            return invoke((g9.f) ((g9.f) obj), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            a aVar;
            c10 = n8.d.c();
            int i10 = this.f26023a;
            if (i10 == 0) {
                i8.p.b(obj);
                g9.e<T> eVar = this.f26025c;
                a aVar2 = new a(this.f26026d, (g9.f) this.f26024b);
                try {
                    this.f26024b = aVar2;
                    this.f26023a = 1;
                    if (eVar.collect(aVar2, this) == c10) {
                        return c10;
                    }
                } catch (h9.a e8) {
                    e = e8;
                    aVar = aVar2;
                    h9.o.a(e, aVar);
                    return i8.w.f26638a;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                aVar = (a) this.f26024b;
                try {
                    i8.p.b(obj);
                } catch (h9.a e10) {
                    e = e10;
                    h9.o.a(e, aVar);
                    return i8.w.f26638a;
                }
            }
            return i8.w.f26638a;
        }
    }

    public static final <T> g9.e<T> b(g9.e<? extends T> eVar, t8.p<? super T, ? super m8.d<? super Boolean>, ? extends Object> pVar) {
        return new a(eVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(g9.f<? super T> r4, T r5, m8.d<? super i8.w> r6) {
        /*
            boolean r0 = r6 instanceof g9.p.c
            if (r0 == 0) goto L13
            r0 = r6
            g9.p$c r0 = (g9.p.c) r0
            int r1 = r0.f26010c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26010c = r1
            goto L18
        L13:
            g9.p$c r0 = new g9.p$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26009b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f26010c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f26008a
            g9.f r4 = (g9.f) r4
            i8.p.b(r6)
            goto L43
        L35:
            i8.p.b(r6)
            r0.f26008a = r4
            r0.f26010c = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            h9.a r5 = new h9.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.p.c(g9.f, java.lang.Object, m8.d):java.lang.Object");
    }

    public static final <T> g9.e<T> d(g9.e<? extends T> eVar, int i10) {
        if (i10 > 0) {
            return new d(eVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final <T, R> g9.e<R> e(g9.e<? extends T> eVar, t8.q<? super g9.f<? super R>, ? super T, ? super m8.d<? super Boolean>, ? extends Object> qVar) {
        return g.t(new f(eVar, qVar, null));
    }
}
