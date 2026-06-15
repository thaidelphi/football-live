package g9;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b<T> extends c<T> {

    /* renamed from: e  reason: collision with root package name */
    private final t8.p<f9.r<? super T>, m8.d<? super i8.w>, Object> f25845e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Builders.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {334}, m = "collectTo")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f25846a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f25847b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b<T> f25848c;

        /* renamed from: d  reason: collision with root package name */
        int f25849d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, m8.d<? super a> dVar) {
            super(dVar);
            this.f25848c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25847b = obj;
            this.f25849d |= RecyclerView.UNDEFINED_DURATION;
            return this.f25848c.f(null, this);
        }
    }

    public /* synthetic */ b(t8.p pVar, m8.g gVar, int i10, f9.a aVar, int i11, kotlin.jvm.internal.h hVar) {
        this(pVar, (i11 & 2) != 0 ? m8.h.f27797a : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? f9.a.SUSPEND : aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // g9.c, h9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(f9.r<? super T> r5, m8.d<? super i8.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g9.b.a
            if (r0 == 0) goto L13
            r0 = r6
            g9.b$a r0 = (g9.b.a) r0
            int r1 = r0.f25849d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25849d = r1
            goto L18
        L13:
            g9.b$a r0 = new g9.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25847b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f25849d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f25846a
            f9.r r5 = (f9.r) r5
            i8.p.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            i8.p.b(r6)
            r0.f25846a = r5
            r0.f25849d = r3
            java.lang.Object r6 = super.f(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.s()
            if (r5 == 0) goto L4c
            i8.w r5 = i8.w.f26638a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.b.f(f9.r, m8.d):java.lang.Object");
    }

    @Override // g9.c, h9.e
    protected h9.e<T> g(m8.g gVar, int i10, f9.a aVar) {
        return new b(this.f25845e, gVar, i10, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(t8.p<? super f9.r<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar, m8.g gVar, int i10, f9.a aVar) {
        super(pVar, gVar, i10, aVar);
        this.f25845e = pVar;
    }
}
