package g9;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SharingStarted.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class i0 implements g0 {

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<f<? super e0>, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f25902a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f25903b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j0<Integer> f25904c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SharingStarted.kt */
        /* renamed from: g9.i0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0283a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.w f25905a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f<e0> f25906b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SharingStarted.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            /* renamed from: g9.i0$a$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public static final class C0284a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f25907a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C0283a<T> f25908b;

                /* renamed from: c  reason: collision with root package name */
                int f25909c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0284a(C0283a<? super T> c0283a, m8.d<? super C0284a> dVar) {
                    super(dVar);
                    this.f25908b = c0283a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f25907a = obj;
                    this.f25909c |= RecyclerView.UNDEFINED_DURATION;
                    return this.f25908b.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0283a(kotlin.jvm.internal.w wVar, f<? super e0> fVar) {
                this.f25905a = wVar;
                this.f25906b = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, m8.d<? super i8.w> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof g9.i0.a.C0283a.C0284a
                    if (r0 == 0) goto L13
                    r0 = r6
                    g9.i0$a$a$a r0 = (g9.i0.a.C0283a.C0284a) r0
                    int r1 = r0.f25909c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f25909c = r1
                    goto L18
                L13:
                    g9.i0$a$a$a r0 = new g9.i0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f25907a
                    java.lang.Object r1 = n8.b.c()
                    int r2 = r0.f25909c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    i8.p.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    i8.p.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.w r5 = r4.f25905a
                    boolean r6 = r5.f27381a
                    if (r6 != 0) goto L4e
                    r5.f27381a = r3
                    g9.f<g9.e0> r5 = r4.f25906b
                    g9.e0 r6 = g9.e0.START
                    r0.f25909c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    i8.w r5 = i8.w.f26638a
                    return r5
                L4e:
                    i8.w r5 = i8.w.f26638a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: g9.i0.a.C0283a.a(int, m8.d):java.lang.Object");
            }

            @Override // g9.f
            public /* bridge */ /* synthetic */ Object emit(Object obj, m8.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0<Integer> j0Var, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f25904c = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            a aVar = new a(this.f25904c, dVar);
            aVar.f25903b = obj;
            return aVar;
        }

        @Override // t8.p
        public final Object invoke(f<? super e0> fVar, m8.d<? super i8.w> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f25902a;
            if (i10 == 0) {
                i8.p.b(obj);
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                j0<Integer> j0Var = this.f25904c;
                C0283a c0283a = new C0283a(wVar, (f) this.f25903b);
                this.f25902a = 1;
                if (j0Var.collect(c0283a, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            throw new i8.d();
        }
    }

    @Override // g9.g0
    public e<e0> a(j0<Integer> j0Var) {
        return g.t(new a(j0Var, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
