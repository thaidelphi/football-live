package g9;

import androidx.recyclerview.widget.RecyclerView;
import f9.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Delay.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> extends kotlin.jvm.internal.o implements t8.l<T, Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f25922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10) {
            super(1);
            this.f25922a = j10;
        }

        @Override // t8.l
        /* renamed from: a */
        public final Long invoke(T t10) {
            return Long.valueOf(this.f25922a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {221, 416}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.l implements t8.q<d9.o0, f<? super T>, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f25923a;

        /* renamed from: b  reason: collision with root package name */
        Object f25924b;

        /* renamed from: c  reason: collision with root package name */
        int f25925c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f25926d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f25927e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t8.l<T, Long> f25928f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e<T> f25929g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {232}, m = "invokeSuspend")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements t8.l<m8.d<? super i8.w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f25930a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f<T> f25931b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.a0<Object> f25932c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f<? super T> fVar, kotlin.jvm.internal.a0<Object> a0Var, m8.d<? super a> dVar) {
                super(1, dVar);
                this.f25931b = fVar;
                this.f25932c = a0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<i8.w> create(m8.d<?> dVar) {
                return new a(this.f25931b, this.f25932c, dVar);
            }

            @Override // t8.l
            public final Object invoke(m8.d<? super i8.w> dVar) {
                return ((a) create(dVar)).invokeSuspend(i8.w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f25930a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    f<T> fVar = this.f25931b;
                    i9.k0 k0Var = h9.s.f26336a;
                    T t10 = this.f25932c.f27364a;
                    if (t10 == k0Var) {
                        t10 = null;
                    }
                    this.f25930a = 1;
                    if (fVar.emit(t10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                this.f25932c.f27364a = null;
                return i8.w.f26638a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {242}, m = "invokeSuspend")
        /* renamed from: g9.l$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0285b extends kotlin.coroutines.jvm.internal.l implements t8.p<f9.h<? extends Object>, m8.d<? super i8.w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            Object f25933a;

            /* renamed from: b  reason: collision with root package name */
            int f25934b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f25935c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.a0<Object> f25936d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ f<T> f25937e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0285b(kotlin.jvm.internal.a0<Object> a0Var, f<? super T> fVar, m8.d<? super C0285b> dVar) {
                super(2, dVar);
                this.f25936d = a0Var;
                this.f25937e = fVar;
            }

            public final Object a(Object obj, m8.d<? super i8.w> dVar) {
                return ((C0285b) create(f9.h.b(obj), dVar)).invokeSuspend(i8.w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
                C0285b c0285b = new C0285b(this.f25936d, this.f25937e, dVar);
                c0285b.f25935c = obj;
                return c0285b;
            }

            @Override // t8.p
            public /* bridge */ /* synthetic */ Object invoke(f9.h<? extends Object> hVar, m8.d<? super i8.w> dVar) {
                return a(hVar.k(), dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                kotlin.jvm.internal.a0<Object> a0Var;
                kotlin.jvm.internal.a0<Object> a0Var2;
                c10 = n8.d.c();
                int i10 = this.f25934b;
                if (i10 == 0) {
                    i8.p.b(obj);
                    T t10 = (T) ((f9.h) this.f25935c).k();
                    a0Var = this.f25936d;
                    boolean z10 = t10 instanceof h.c;
                    if (!z10) {
                        a0Var.f27364a = t10;
                    }
                    f<T> fVar = this.f25937e;
                    if (z10) {
                        Throwable e8 = f9.h.e(t10);
                        if (e8 == null) {
                            Object obj2 = a0Var.f27364a;
                            if (obj2 != null) {
                                if (obj2 == h9.s.f26336a) {
                                    obj2 = null;
                                }
                                this.f25935c = t10;
                                this.f25933a = a0Var;
                                this.f25934b = 1;
                                if (fVar.emit(obj2, this) == c10) {
                                    return c10;
                                }
                                a0Var2 = a0Var;
                            }
                            a0Var.f27364a = (T) h9.s.f26338c;
                        } else {
                            throw e8;
                        }
                    }
                    return i8.w.f26638a;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    a0Var2 = (kotlin.jvm.internal.a0) this.f25933a;
                    i8.p.b(obj);
                }
                a0Var = a0Var2;
                a0Var.f27364a = (T) h9.s.f26338c;
                return i8.w.f26638a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {210}, m = "invokeSuspend")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements t8.p<f9.r<? super Object>, m8.d<? super i8.w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f25938a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f25939b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e<T> f25940c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Delay.kt */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public static final class a<T> implements f {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f9.r<Object> f25941a;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Delay.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {210}, m = "emit")
                /* renamed from: g9.l$b$c$a$a  reason: collision with other inner class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
                public static final class C0286a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f25942a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ a<T> f25943b;

                    /* renamed from: c  reason: collision with root package name */
                    int f25944c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0286a(a<? super T> aVar, m8.d<? super C0286a> dVar) {
                        super(dVar);
                        this.f25943b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f25942a = obj;
                        this.f25944c |= RecyclerView.UNDEFINED_DURATION;
                        return this.f25943b.emit(null, this);
                    }
                }

                a(f9.r<Object> rVar) {
                    this.f25941a = rVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, m8.d<? super i8.w> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof g9.l.b.c.a.C0286a
                        if (r0 == 0) goto L13
                        r0 = r6
                        g9.l$b$c$a$a r0 = (g9.l.b.c.a.C0286a) r0
                        int r1 = r0.f25944c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f25944c = r1
                        goto L18
                    L13:
                        g9.l$b$c$a$a r0 = new g9.l$b$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f25942a
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.f25944c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        i8.p.b(r6)
                        f9.r<java.lang.Object> r6 = r4.f25941a
                        if (r5 != 0) goto L3a
                        i9.k0 r5 = h9.s.f26336a
                    L3a:
                        r0.f25944c = r3
                        java.lang.Object r5 = r6.i(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        i8.w r5 = i8.w.f26638a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: g9.l.b.c.a.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(e<? extends T> eVar, m8.d<? super c> dVar) {
                super(2, dVar);
                this.f25940c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
                c cVar = new c(this.f25940c, dVar);
                cVar.f25939b = obj;
                return cVar;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(f9.r<Object> rVar, m8.d<? super i8.w> dVar) {
                return ((c) create(rVar, dVar)).invokeSuspend(i8.w.f26638a);
            }

            @Override // t8.p
            public /* bridge */ /* synthetic */ Object invoke(f9.r<? super Object> rVar, m8.d<? super i8.w> dVar) {
                return invoke2((f9.r<Object>) rVar, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f25938a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    e<T> eVar = this.f25940c;
                    a aVar = new a((f9.r) this.f25939b);
                    this.f25938a = 1;
                    if (eVar.collect(aVar, this) == c10) {
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
        b(t8.l<? super T, Long> lVar, e<? extends T> eVar, m8.d<? super b> dVar) {
            super(3, dVar);
            this.f25928f = lVar;
            this.f25929g = eVar;
        }

        @Override // t8.q
        /* renamed from: a */
        public final Object invoke(d9.o0 o0Var, f<? super T> fVar, m8.d<? super i8.w> dVar) {
            b bVar = new b(this.f25928f, this.f25929g, dVar);
            bVar.f25926d = o0Var;
            bVar.f25927e = fVar;
            return bVar.invokeSuspend(i8.w.f26638a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0119 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x011a -> B:11:0x006e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> e<T> a(e<? extends T> eVar, long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? eVar : b(eVar, new a(j10));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    private static final <T> e<T> b(e<? extends T> eVar, t8.l<? super T, Long> lVar) {
        return h9.n.b(new b(lVar, eVar, null));
    }
}
