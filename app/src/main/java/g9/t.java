package g9;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transform.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f26073a;

        /* compiled from: Emitters.kt */
        /* renamed from: g9.t$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0291a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f26074a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223}, m = "emit")
            /* renamed from: g9.t$a$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public static final class C0292a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f26075a;

                /* renamed from: b  reason: collision with root package name */
                int f26076b;

                public C0292a(m8.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f26075a = obj;
                    this.f26076b |= RecyclerView.UNDEFINED_DURATION;
                    return C0291a.this.emit(null, this);
                }
            }

            public C0291a(f fVar) {
                this.f26074a = fVar;
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
                    boolean r0 = r6 instanceof g9.t.a.C0291a.C0292a
                    if (r0 == 0) goto L13
                    r0 = r6
                    g9.t$a$a$a r0 = (g9.t.a.C0291a.C0292a) r0
                    int r1 = r0.f26076b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f26076b = r1
                    goto L18
                L13:
                    g9.t$a$a$a r0 = new g9.t$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f26075a
                    java.lang.Object r1 = n8.b.c()
                    int r2 = r0.f26076b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    i8.p.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    i8.p.b(r6)
                    g9.f r6 = r4.f26074a
                    if (r5 == 0) goto L41
                    r0.f26076b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    i8.w r5 = i8.w.f26638a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: g9.t.a.C0291a.emit(java.lang.Object, m8.d):java.lang.Object");
            }
        }

        public a(e eVar) {
            this.f26073a = eVar;
        }

        @Override // g9.e
        public Object collect(f fVar, m8.d dVar) {
            Object c10;
            Object collect = this.f26073a.collect(new C0291a(fVar), dVar);
            c10 = n8.d.c();
            return collect == c10 ? collect : i8.w.f26638a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f26078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t8.p f26079b;

        /* compiled from: Emitters.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f26080a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ t8.p f26081b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
            /* renamed from: g9.t$b$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public static final class C0293a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f26082a;

                /* renamed from: b  reason: collision with root package name */
                int f26083b;

                /* renamed from: d  reason: collision with root package name */
                Object f26085d;

                /* renamed from: e  reason: collision with root package name */
                Object f26086e;

                public C0293a(m8.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f26082a = obj;
                    this.f26083b |= RecyclerView.UNDEFINED_DURATION;
                    return a.this.emit(null, this);
                }
            }

            public a(f fVar, t8.p pVar) {
                this.f26080a = fVar;
                this.f26081b = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // g9.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, m8.d<? super i8.w> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof g9.t.b.a.C0293a
                    if (r0 == 0) goto L13
                    r0 = r7
                    g9.t$b$a$a r0 = (g9.t.b.a.C0293a) r0
                    int r1 = r0.f26083b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f26083b = r1
                    goto L18
                L13:
                    g9.t$b$a$a r0 = new g9.t$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f26082a
                    java.lang.Object r1 = n8.b.c()
                    int r2 = r0.f26083b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    i8.p.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f26086e
                    g9.f r6 = (g9.f) r6
                    java.lang.Object r2 = r0.f26085d
                    i8.p.b(r7)
                    goto L5c
                L3e:
                    i8.p.b(r7)
                    g9.f r7 = r5.f26080a
                    t8.p r2 = r5.f26081b
                    r0.f26085d = r6
                    r0.f26086e = r7
                    r0.f26083b = r4
                    r4 = 6
                    kotlin.jvm.internal.m.a(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.m.a(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f26085d = r7
                    r0.f26086e = r7
                    r0.f26083b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    i8.w r6 = i8.w.f26638a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: g9.t.b.a.emit(java.lang.Object, m8.d):java.lang.Object");
            }
        }

        public b(e eVar, t8.p pVar) {
            this.f26078a = eVar;
            this.f26079b = pVar;
        }

        @Override // g9.e
        public Object collect(f fVar, m8.d dVar) {
            Object c10;
            Object collect = this.f26078a.collect(new a(fVar, this.f26079b), dVar);
            c10 = n8.d.c();
            return collect == c10 ? collect : i8.w.f26638a;
        }
    }

    public static final <T> e<T> a(e<? extends T> eVar) {
        return new a(eVar);
    }

    public static final <T> e<T> b(e<? extends T> eVar, t8.p<? super T, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        return new b(eVar, pVar);
    }
}
