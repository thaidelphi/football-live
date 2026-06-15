package h9;

import androidx.recyclerview.widget.RecyclerView;
import d9.o0;
import f9.u;
import j8.d0;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Combine.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Combine.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {54, 76, 79}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f26306a;

        /* renamed from: b  reason: collision with root package name */
        Object f26307b;

        /* renamed from: c  reason: collision with root package name */
        int f26308c;

        /* renamed from: d  reason: collision with root package name */
        int f26309d;

        /* renamed from: e  reason: collision with root package name */
        int f26310e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f26311f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g9.e<T>[] f26312g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ t8.a<T[]> f26313h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ t8.q<g9.f<? super R>, T[], m8.d<? super i8.w>, Object> f26314i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g9.f<R> f26315j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Combine.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {31}, m = "invokeSuspend")
        /* renamed from: h9.k$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0299a extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super i8.w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f26316a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g9.e<T>[] f26317b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f26318c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AtomicInteger f26319d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ f9.d<d0<Object>> f26320e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Combine.kt */
            /* renamed from: h9.k$a$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public static final class C0300a<T> implements g9.f {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f9.d<d0<Object>> f26321a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f26322b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Combine.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {32, 33}, m = "emit")
                /* renamed from: h9.k$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
                public static final class C0301a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f26323a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C0300a<T> f26324b;

                    /* renamed from: c  reason: collision with root package name */
                    int f26325c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0301a(C0300a<? super T> c0300a, m8.d<? super C0301a> dVar) {
                        super(dVar);
                        this.f26324b = c0300a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f26323a = obj;
                        this.f26325c |= RecyclerView.UNDEFINED_DURATION;
                        return this.f26324b.emit(null, this);
                    }
                }

                C0300a(f9.d<d0<Object>> dVar, int i10) {
                    this.f26321a = dVar;
                    this.f26322b = i10;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, m8.d<? super i8.w> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof h9.k.a.C0299a.C0300a.C0301a
                        if (r0 == 0) goto L13
                        r0 = r8
                        h9.k$a$a$a$a r0 = (h9.k.a.C0299a.C0300a.C0301a) r0
                        int r1 = r0.f26325c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f26325c = r1
                        goto L18
                    L13:
                        h9.k$a$a$a$a r0 = new h9.k$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f26323a
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.f26325c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        i8.p.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        i8.p.b(r8)
                        goto L4d
                    L38:
                        i8.p.b(r8)
                        f9.d<j8.d0<java.lang.Object>> r8 = r6.f26321a
                        j8.d0 r2 = new j8.d0
                        int r5 = r6.f26322b
                        r2.<init>(r5, r7)
                        r0.f26325c = r4
                        java.lang.Object r7 = r8.i(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f26325c = r3
                        java.lang.Object r7 = d9.f3.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        i8.w r7 = i8.w.f26638a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: h9.k.a.C0299a.C0300a.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0299a(g9.e<? extends T>[] eVarArr, int i10, AtomicInteger atomicInteger, f9.d<d0<Object>> dVar, m8.d<? super C0299a> dVar2) {
                super(2, dVar2);
                this.f26317b = eVarArr;
                this.f26318c = i10;
                this.f26319d = atomicInteger;
                this.f26320e = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
                return new C0299a(this.f26317b, this.f26318c, this.f26319d, this.f26320e, dVar);
            }

            @Override // t8.p
            public final Object invoke(o0 o0Var, m8.d<? super i8.w> dVar) {
                return ((C0299a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                AtomicInteger atomicInteger;
                c10 = n8.d.c();
                int i10 = this.f26316a;
                try {
                    if (i10 == 0) {
                        i8.p.b(obj);
                        g9.e[] eVarArr = this.f26317b;
                        int i11 = this.f26318c;
                        g9.e eVar = eVarArr[i11];
                        C0300a c0300a = new C0300a(this.f26320e, i11);
                        this.f26316a = 1;
                        if (eVar.collect(c0300a, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i8.p.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        u.a.a(this.f26320e, null, 1, null);
                    }
                    return i8.w.f26638a;
                } finally {
                    if (this.f26319d.decrementAndGet() == 0) {
                        u.a.a(this.f26320e, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g9.e<? extends T>[] eVarArr, t8.a<T[]> aVar, t8.q<? super g9.f<? super R>, ? super T[], ? super m8.d<? super i8.w>, ? extends Object> qVar, g9.f<? super R> fVar, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f26312g = eVarArr;
            this.f26313h = aVar;
            this.f26314i = qVar;
            this.f26315j = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            a aVar = new a(this.f26312g, this.f26313h, this.f26314i, this.f26315j, dVar);
            aVar.f26311f = obj;
            return aVar;
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ec A[LOOP:0: B:28:0x00ec->B:34:0x010f, LOOP_START, PHI: r3 r10 
          PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e7, B:34:0x010f] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v5 j8.d0) = (r10v4 j8.d0), (r10v18 j8.d0) binds: [B:25:0x00e7, B:34:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r7v0, types: [g9.e<T>[]] */
        /* JADX WARN: Type inference failed for: r7v4, types: [g9.e[], g9.e<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0134 -> B:20:0x00c7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0169 -> B:45:0x0165). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h9.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <R, T> Object a(g9.f<? super R> fVar, g9.e<? extends T>[] eVarArr, t8.a<T[]> aVar, t8.q<? super g9.f<? super R>, ? super T[], ? super m8.d<? super i8.w>, ? extends Object> qVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object a10 = n.a(new a(eVarArr, aVar, qVar, fVar, null), dVar);
        c10 = n8.d.c();
        return a10 == c10 ? a10 : i8.w.f26638a;
    }
}
