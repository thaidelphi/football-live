package g9;

import androidx.recyclerview.widget.RecyclerView;
import com.adcolony.sdk.AdColonyUserMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> implements g9.f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.a0 f26039a;

        public a(kotlin.jvm.internal.a0 a0Var) {
            this.f26039a = a0Var;
        }

        @Override // g9.f
        public Object emit(T t10, m8.d<? super i8.w> dVar) {
            this.f26039a.f27364a = t10;
            throw new h9.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b<T> implements g9.f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t8.p f26040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.a0 f26041b;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f26042a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f26043b;

            /* renamed from: c  reason: collision with root package name */
            int f26044c;

            /* renamed from: e  reason: collision with root package name */
            Object f26046e;

            public a(m8.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f26043b = obj;
                this.f26044c |= RecyclerView.UNDEFINED_DURATION;
                return b.this.emit(null, this);
            }
        }

        public b(t8.p pVar, kotlin.jvm.internal.a0 a0Var) {
            this.f26040a = pVar;
            this.f26041b = a0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // g9.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, m8.d<? super i8.w> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof g9.r.b.a
                if (r0 == 0) goto L13
                r0 = r6
                g9.r$b$a r0 = (g9.r.b.a) r0
                int r1 = r0.f26044c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26044c = r1
                goto L18
            L13:
                g9.r$b$a r0 = new g9.r$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f26043b
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f26044c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f26046e
                java.lang.Object r0 = r0.f26042a
                g9.r$b r0 = (g9.r.b) r0
                i8.p.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                i8.p.b(r6)
                t8.p r6 = r4.f26040a
                r0.f26042a = r4
                r0.f26046e = r5
                r0.f26044c = r3
                r2 = 6
                kotlin.jvm.internal.m.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.m.a(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                kotlin.jvm.internal.a0 r6 = r0.f26041b
                r6.f27364a = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                i8.w r5 = i8.w.f26638a
                return r5
            L64:
                h9.a r5 = new h9.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.r.b.emit(java.lang.Object, m8.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f26047a;

        /* renamed from: b  reason: collision with root package name */
        Object f26048b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f26049c;

        /* renamed from: d  reason: collision with root package name */
        int f26050d;

        c(m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26049c = obj;
            this.f26050d |= RecyclerView.UNDEFINED_DURATION;
            return g.r(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f26051a;

        /* renamed from: b  reason: collision with root package name */
        Object f26052b;

        /* renamed from: c  reason: collision with root package name */
        Object f26053c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f26054d;

        /* renamed from: e  reason: collision with root package name */
        int f26055e;

        d(m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26054d = obj;
            this.f26055e |= RecyclerView.UNDEFINED_DURATION;
            return g.s(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {57}, m = AdColonyUserMetadata.USER_SINGLE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f26056a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26057b;

        /* renamed from: c  reason: collision with root package name */
        int f26058c;

        e(m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26057b = obj;
            this.f26058c |= RecyclerView.UNDEFINED_DURATION;
            return g.D(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class f<T> implements g9.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.a0<Object> f26059a;

        f(kotlin.jvm.internal.a0<Object> a0Var) {
            this.f26059a = a0Var;
        }

        @Override // g9.f
        public final Object emit(T t10, m8.d<? super i8.w> dVar) {
            kotlin.jvm.internal.a0<Object> a0Var = this.f26059a;
            if (a0Var.f27364a == h9.s.f26336a) {
                a0Var.f27364a = t10;
                return i8.w.f26638a;
            }
            throw new IllegalArgumentException("Flow has more than one element".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(g9.e<? extends T> r4, m8.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof g9.r.c
            if (r0 == 0) goto L13
            r0 = r5
            g9.r$c r0 = (g9.r.c) r0
            int r1 = r0.f26050d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26050d = r1
            goto L18
        L13:
            g9.r$c r0 = new g9.r$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26049c
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f26050d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f26048b
            g9.r$a r4 = (g9.r.a) r4
            java.lang.Object r0 = r0.f26047a
            kotlin.jvm.internal.a0 r0 = (kotlin.jvm.internal.a0) r0
            i8.p.b(r5)     // Catch: h9.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            i8.p.b(r5)
            kotlin.jvm.internal.a0 r5 = new kotlin.jvm.internal.a0
            r5.<init>()
            i9.k0 r2 = h9.s.f26336a
            r5.f27364a = r2
            g9.r$a r2 = new g9.r$a
            r2.<init>(r5)
            r0.f26047a = r5     // Catch: h9.a -> L5b
            r0.f26048b = r2     // Catch: h9.a -> L5b
            r0.f26050d = r3     // Catch: h9.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: h9.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            h9.o.a(r5, r4)
        L62:
            T r4 = r0.f27364a
            i9.k0 r5 = h9.s.f26336a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.r.a(g9.e, m8.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(g9.e<? extends T> r4, t8.p<? super T, ? super m8.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, m8.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof g9.r.d
            if (r0 == 0) goto L13
            r0 = r6
            g9.r$d r0 = (g9.r.d) r0
            int r1 = r0.f26055e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26055e = r1
            goto L18
        L13:
            g9.r$d r0 = new g9.r$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26054d
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f26055e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f26053c
            g9.r$b r4 = (g9.r.b) r4
            java.lang.Object r5 = r0.f26052b
            kotlin.jvm.internal.a0 r5 = (kotlin.jvm.internal.a0) r5
            java.lang.Object r0 = r0.f26051a
            t8.p r0 = (t8.p) r0
            i8.p.b(r6)     // Catch: h9.a -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            i8.p.b(r6)
            kotlin.jvm.internal.a0 r6 = new kotlin.jvm.internal.a0
            r6.<init>()
            i9.k0 r2 = h9.s.f26336a
            r6.f27364a = r2
            g9.r$b r2 = new g9.r$b
            r2.<init>(r5, r6)
            r0.f26051a = r5     // Catch: h9.a -> L62
            r0.f26052b = r6     // Catch: h9.a -> L62
            r0.f26053c = r2     // Catch: h9.a -> L62
            r0.f26055e = r3     // Catch: h9.a -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: h9.a -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            h9.o.a(r6, r4)
        L6a:
            T r4 = r5.f27364a
            i9.k0 r5 = h9.s.f26336a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.r.b(g9.e, t8.p, m8.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(g9.e<? extends T> r4, m8.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof g9.r.e
            if (r0 == 0) goto L13
            r0 = r5
            g9.r$e r0 = (g9.r.e) r0
            int r1 = r0.f26058c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26058c = r1
            goto L18
        L13:
            g9.r$e r0 = new g9.r$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26057b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f26058c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f26056a
            kotlin.jvm.internal.a0 r4 = (kotlin.jvm.internal.a0) r4
            i8.p.b(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            i8.p.b(r5)
            kotlin.jvm.internal.a0 r5 = new kotlin.jvm.internal.a0
            r5.<init>()
            i9.k0 r2 = h9.s.f26336a
            r5.f27364a = r2
            g9.r$f r2 = new g9.r$f
            r2.<init>(r5)
            r0.f26056a = r5
            r0.f26058c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.f27364a
            i9.k0 r5 = h9.s.f26336a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.r.c(g9.e, m8.d):java.lang.Object");
    }
}
