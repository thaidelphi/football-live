package g9;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Channels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {36, 37}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f25896a;

        /* renamed from: b  reason: collision with root package name */
        Object f25897b;

        /* renamed from: c  reason: collision with root package name */
        Object f25898c;

        /* renamed from: d  reason: collision with root package name */
        boolean f25899d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f25900e;

        /* renamed from: f  reason: collision with root package name */
        int f25901f;

        a(m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25900e = obj;
            this.f25901f |= RecyclerView.UNDEFINED_DURATION;
            return i.c(null, null, false, this);
        }
    }

    public static final <T> Object b(f<? super T> fVar, f9.t<? extends T> tVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object c11 = c(fVar, tVar, true, dVar);
        c10 = n8.d.c();
        return c11 == c10 ? c11 : i8.w.f26638a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:13:0x0036, B:22:0x0060, B:26:0x0075, B:28:0x007e, B:18:0x0052, B:21:0x005c), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:14:0x0039). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(g9.f<? super T> r7, f9.t<? extends T> r8, boolean r9, m8.d<? super i8.w> r10) {
        /*
            boolean r0 = r10 instanceof g9.i.a
            if (r0 == 0) goto L13
            r0 = r10
            g9.i$a r0 = (g9.i.a) r0
            int r1 = r0.f25901f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25901f = r1
            goto L18
        L13:
            g9.i$a r0 = new g9.i$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25900e
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f25901f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            boolean r9 = r0.f25899d
            java.lang.Object r7 = r0.f25898c
            f9.f r7 = (f9.f) r7
            java.lang.Object r8 = r0.f25897b
            f9.t r8 = (f9.t) r8
            java.lang.Object r2 = r0.f25896a
            g9.f r2 = (g9.f) r2
            i8.p.b(r10)     // Catch: java.lang.Throwable -> L9b
        L39:
            r10 = r7
            r7 = r2
            goto L60
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            boolean r9 = r0.f25899d
            java.lang.Object r7 = r0.f25898c
            f9.f r7 = (f9.f) r7
            java.lang.Object r8 = r0.f25897b
            f9.t r8 = (f9.t) r8
            java.lang.Object r2 = r0.f25896a
            g9.f r2 = (g9.f) r2
            i8.p.b(r10)     // Catch: java.lang.Throwable -> L9b
            goto L75
        L56:
            i8.p.b(r10)
            g9.g.p(r7)
            f9.f r10 = r8.iterator()     // Catch: java.lang.Throwable -> L9b
        L60:
            r0.f25896a = r7     // Catch: java.lang.Throwable -> L9b
            r0.f25897b = r8     // Catch: java.lang.Throwable -> L9b
            r0.f25898c = r10     // Catch: java.lang.Throwable -> L9b
            r0.f25899d = r9     // Catch: java.lang.Throwable -> L9b
            r0.f25901f = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L71
            return r1
        L71:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L75:
            r5 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L93
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L9b
            r0.f25896a = r2     // Catch: java.lang.Throwable -> L9b
            r0.f25897b = r8     // Catch: java.lang.Throwable -> L9b
            r0.f25898c = r7     // Catch: java.lang.Throwable -> L9b
            r0.f25899d = r9     // Catch: java.lang.Throwable -> L9b
            r0.f25901f = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L9b
            if (r10 != r1) goto L39
            return r1
        L93:
            if (r9 == 0) goto L98
            f9.j.a(r8, r5)
        L98:
            i8.w r7 = i8.w.f26638a
            return r7
        L9b:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r9 == 0) goto La3
            f9.j.a(r8, r7)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.i.c(g9.f, f9.t, boolean, m8.d):java.lang.Object");
    }
}
