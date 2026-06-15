package g9;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Distinct.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e<T> f25872a;

    /* renamed from: b  reason: collision with root package name */
    public final t8.l<T, Object> f25873b;

    /* renamed from: c  reason: collision with root package name */
    public final t8.p<Object, Object, Boolean> f25874c;

    /* compiled from: Distinct.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d<T> f25875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.a0<Object> f25876b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T> f25877c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Distinct.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {77}, m = "emit")
        /* renamed from: g9.d$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0282a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f25878a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a<T> f25879b;

            /* renamed from: c  reason: collision with root package name */
            int f25880c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0282a(a<? super T> aVar, m8.d<? super C0282a> dVar) {
                super(dVar);
                this.f25879b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25878a = obj;
                this.f25880c |= RecyclerView.UNDEFINED_DURATION;
                return this.f25879b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(d<T> dVar, kotlin.jvm.internal.a0<Object> a0Var, f<? super T> fVar) {
            this.f25875a = dVar;
            this.f25876b = a0Var;
            this.f25877c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // g9.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, m8.d<? super i8.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof g9.d.a.C0282a
                if (r0 == 0) goto L13
                r0 = r7
                g9.d$a$a r0 = (g9.d.a.C0282a) r0
                int r1 = r0.f25880c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25880c = r1
                goto L18
            L13:
                g9.d$a$a r0 = new g9.d$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f25878a
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f25880c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                i8.p.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                i8.p.b(r7)
                g9.d<T> r7 = r5.f25875a
                t8.l<T, java.lang.Object> r7 = r7.f25873b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.a0<java.lang.Object> r2 = r5.f25876b
                T r2 = r2.f27364a
                i9.k0 r4 = h9.s.f26336a
                if (r2 == r4) goto L58
                g9.d<T> r4 = r5.f25875a
                t8.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f25874c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                i8.w r6 = i8.w.f26638a
                return r6
            L58:
                kotlin.jvm.internal.a0<java.lang.Object> r2 = r5.f25876b
                r2.f27364a = r7
                g9.f<T> r7 = r5.f25877c
                r0.f25880c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                i8.w r6 = i8.w.f26638a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.d.a.emit(java.lang.Object, m8.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(e<? extends T> eVar, t8.l<? super T, ? extends Object> lVar, t8.p<Object, Object, Boolean> pVar) {
        this.f25872a = eVar;
        this.f25873b = lVar;
        this.f25874c = pVar;
    }

    @Override // g9.e
    public Object collect(f<? super T> fVar, m8.d<? super i8.w> dVar) {
        Object c10;
        kotlin.jvm.internal.a0 a0Var = new kotlin.jvm.internal.a0();
        a0Var.f27364a = (T) h9.s.f26336a;
        Object collect = this.f25872a.collect(new a(this, a0Var, fVar), dVar);
        c10 = n8.d.c();
        return collect == c10 ? collect : i8.w.f26638a;
    }
}
