package g9;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: Share.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n0<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f25970a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.p<f<? super T>, m8.d<? super i8.w>, Object> f25971b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f25972a;

        /* renamed from: b  reason: collision with root package name */
        Object f25973b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f25974c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n0<T> f25975d;

        /* renamed from: e  reason: collision with root package name */
        int f25976e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0<T> n0Var, m8.d<? super a> dVar) {
            super(dVar);
            this.f25975d = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25974c = obj;
            this.f25976e |= RecyclerView.UNDEFINED_DURATION;
            return this.f25975d.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(f<? super T> fVar, t8.p<? super f<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        this.f25970a = fVar;
        this.f25971b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h9.t] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(m8.d<? super i8.w> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof g9.n0.a
            if (r0 == 0) goto L13
            r0 = r7
            g9.n0$a r0 = (g9.n0.a) r0
            int r1 = r0.f25976e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25976e = r1
            goto L18
        L13:
            g9.n0$a r0 = new g9.n0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f25974c
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f25976e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            i8.p.b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f25973b
            h9.t r2 = (h9.t) r2
            java.lang.Object r4 = r0.f25972a
            g9.n0 r4 = (g9.n0) r4
            i8.p.b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            i8.p.b(r7)
            h9.t r2 = new h9.t
            g9.f<T> r7 = r6.f25970a
            m8.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            t8.p<g9.f<? super T>, m8.d<? super i8.w>, java.lang.Object> r7 = r6.f25971b     // Catch: java.lang.Throwable -> L7d
            r0.f25972a = r6     // Catch: java.lang.Throwable -> L7d
            r0.f25973b = r2     // Catch: java.lang.Throwable -> L7d
            r0.f25976e = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            g9.f<T> r7 = r4.f25970a
            boolean r2 = r7 instanceof g9.n0
            if (r2 == 0) goto L7a
            g9.n0 r7 = (g9.n0) r7
            r2 = 0
            r0.f25972a = r2
            r0.f25973b = r2
            r0.f25976e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            i8.w r7 = i8.w.f26638a
            return r7
        L7a:
            i8.w r7 = i8.w.f26638a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.n0.a(m8.d):java.lang.Object");
    }

    @Override // g9.f
    public Object emit(T t10, m8.d<? super i8.w> dVar) {
        return this.f25970a.emit(t10, dVar);
    }
}
