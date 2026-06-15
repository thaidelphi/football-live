package g9;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Emitters.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Emitters.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {216}, m = "invokeSafely$FlowKt__EmittersKt")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f25952a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f25953b;

        /* renamed from: c  reason: collision with root package name */
        int f25954c;

        a(m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25953b = obj;
            this.f25954c |= RecyclerView.UNDEFINED_DURATION;
            return n.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f25955a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t8.q f25956b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f25957a;

            /* renamed from: b  reason: collision with root package name */
            int f25958b;

            /* renamed from: d  reason: collision with root package name */
            Object f25960d;

            /* renamed from: e  reason: collision with root package name */
            Object f25961e;

            public a(m8.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25957a = obj;
                this.f25958b |= RecyclerView.UNDEFINED_DURATION;
                return b.this.collect(null, this);
            }
        }

        public b(e eVar, t8.q qVar) {
            this.f25955a = eVar;
            this.f25956b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // g9.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(g9.f<? super T> r9, m8.d<? super i8.w> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof g9.n.b.a
                if (r0 == 0) goto L13
                r0 = r10
                g9.n$b$a r0 = (g9.n.b.a) r0
                int r1 = r0.f25958b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25958b = r1
                goto L18
            L13:
                g9.n$b$a r0 = new g9.n$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f25957a
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f25958b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f25960d
                h9.t r9 = (h9.t) r9
                i8.p.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f25960d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                i8.p.b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f25961e
                g9.f r9 = (g9.f) r9
                java.lang.Object r2 = r0.f25960d
                g9.n$b r2 = (g9.n.b) r2
                i8.p.b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                i8.p.b(r10)
                g9.e r10 = r8.f25955a     // Catch: java.lang.Throwable -> L96
                r0.f25960d = r8     // Catch: java.lang.Throwable -> L96
                r0.f25961e = r9     // Catch: java.lang.Throwable -> L96
                r0.f25958b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                h9.t r10 = new h9.t
                m8.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                t8.q r9 = r2.f25956b     // Catch: java.lang.Throwable -> L8e
                r0.f25960d = r10     // Catch: java.lang.Throwable -> L8e
                r0.f25961e = r6     // Catch: java.lang.Throwable -> L8e
                r0.f25958b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.m.a(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.m.a(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                i8.w r9 = i8.w.f26638a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                g9.p0 r10 = new g9.p0
                r10.<init>(r9)
                t8.q r2 = r2.f25956b
                r0.f25960d = r9
                r0.f25961e = r6
                r0.f25958b = r4
                java.lang.Object r10 = g9.n.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.n.b.collect(g9.f, m8.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t8.p f25962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f25963b;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f25964a;

            /* renamed from: b  reason: collision with root package name */
            int f25965b;

            /* renamed from: d  reason: collision with root package name */
            Object f25967d;

            /* renamed from: e  reason: collision with root package name */
            Object f25968e;

            /* renamed from: f  reason: collision with root package name */
            Object f25969f;

            public a(m8.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25964a = obj;
                this.f25965b |= RecyclerView.UNDEFINED_DURATION;
                return c.this.collect(null, this);
            }
        }

        public c(t8.p pVar, e eVar) {
            this.f25962a = pVar;
            this.f25963b = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        @Override // g9.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(g9.f<? super T> r7, m8.d<? super i8.w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof g9.n.c.a
                if (r0 == 0) goto L13
                r0 = r8
                g9.n$c$a r0 = (g9.n.c.a) r0
                int r1 = r0.f25965b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25965b = r1
                goto L18
            L13:
                g9.n$c$a r0 = new g9.n$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f25964a
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f25965b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                i8.p.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f25969f
                h9.t r7 = (h9.t) r7
                java.lang.Object r2 = r0.f25968e
                g9.f r2 = (g9.f) r2
                java.lang.Object r4 = r0.f25967d
                g9.n$c r4 = (g9.n.c) r4
                i8.p.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                i8.p.b(r8)
                h9.t r8 = new h9.t
                m8.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                t8.p r2 = r6.f25962a     // Catch: java.lang.Throwable -> L86
                r0.f25967d = r6     // Catch: java.lang.Throwable -> L86
                r0.f25968e = r7     // Catch: java.lang.Throwable -> L86
                r0.f25969f = r8     // Catch: java.lang.Throwable -> L86
                r0.f25965b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.m.a(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.m.a(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                g9.e r7 = r4.f25963b
                r8 = 0
                r0.f25967d = r8
                r0.f25968e = r8
                r0.f25969f = r8
                r0.f25965b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                i8.w r7 = i8.w.f26638a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.n.c.collect(g9.f, m8.d):java.lang.Object");
        }
    }

    public static final void b(f<?> fVar) {
        if (fVar instanceof p0) {
            throw ((p0) fVar).f26033a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(g9.f<? super T> r4, t8.q<? super g9.f<? super T>, ? super java.lang.Throwable, ? super m8.d<? super i8.w>, ? extends java.lang.Object> r5, java.lang.Throwable r6, m8.d<? super i8.w> r7) {
        /*
            boolean r0 = r7 instanceof g9.n.a
            if (r0 == 0) goto L13
            r0 = r7
            g9.n$a r0 = (g9.n.a) r0
            int r1 = r0.f25954c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25954c = r1
            goto L18
        L13:
            g9.n$a r0 = new g9.n$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25953b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f25954c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f25952a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            i8.p.b(r7)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            i8.p.b(r7)
            r0.f25952a = r6     // Catch: java.lang.Throwable -> L47
            r0.f25954c = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            i8.w r4 = i8.w.f26638a
            return r4
        L47:
            r4 = move-exception
            if (r6 == 0) goto L4f
            if (r6 == r4) goto L4f
            i8.a.a(r4, r6)
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.n.c(g9.f, t8.q, java.lang.Throwable, m8.d):java.lang.Object");
    }

    public static final <T> e<T> d(e<? extends T> eVar, t8.q<? super f<? super T>, ? super Throwable, ? super m8.d<? super i8.w>, ? extends Object> qVar) {
        return new b(eVar, qVar);
    }

    public static final <T> e<T> e(e<? extends T> eVar, t8.p<? super f<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        return new c(pVar, eVar);
    }
}
