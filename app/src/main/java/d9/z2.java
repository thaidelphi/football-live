package d9;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: Timeout.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class z2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Timeout.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {104}, m = "withTimeoutOrNull")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        long f24535a;

        /* renamed from: b  reason: collision with root package name */
        Object f24536b;

        /* renamed from: c  reason: collision with root package name */
        Object f24537c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f24538d;

        /* renamed from: e  reason: collision with root package name */
        int f24539e;

        a(m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24538d = obj;
            this.f24539e |= RecyclerView.UNDEFINED_DURATION;
            return z2.d(0L, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r4 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d9.x2 a(long r2, d9.y0 r4, d9.z1 r5) {
        /*
            boolean r0 = r4 instanceof d9.a1
            if (r0 == 0) goto L7
            d9.a1 r4 = (d9.a1) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            c9.b$a r0 = c9.b.f5600b
            c9.e r0 = c9.e.MILLISECONDS
            long r0 = c9.d.o(r2, r0)
            java.lang.String r4 = r4.P(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            d9.x2 r2 = new d9.x2
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.z2.a(long, d9.y0, d9.z1):d9.x2");
    }

    private static final <U, T extends U> Object b(y2<U, ? super T> y2Var, t8.p<? super o0, ? super m8.d<? super T>, ? extends Object> pVar) {
        d2.e(y2Var, z0.b(y2Var.f26657d.getContext()).X(y2Var.f24532e, y2Var, y2Var.getContext()));
        return j9.b.c(y2Var, y2Var, pVar);
    }

    public static final <T> Object c(long j10, t8.p<? super o0, ? super m8.d<? super T>, ? extends Object> pVar, m8.d<? super T> dVar) {
        Object c10;
        if (j10 > 0) {
            Object b10 = b(new y2(j10, dVar), pVar);
            c10 = n8.d.c();
            if (b10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return b10;
        }
        throw new x2("Timed out immediately");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, d9.y2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(long r7, t8.p<? super d9.o0, ? super m8.d<? super T>, ? extends java.lang.Object> r9, m8.d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof d9.z2.a
            if (r0 == 0) goto L13
            r0 = r10
            d9.z2$a r0 = (d9.z2.a) r0
            int r1 = r0.f24539e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24539e = r1
            goto L18
        L13:
            d9.z2$a r0 = new d9.z2$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f24538d
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f24539e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f24537c
            kotlin.jvm.internal.a0 r7 = (kotlin.jvm.internal.a0) r7
            java.lang.Object r8 = r0.f24536b
            t8.p r8 = (t8.p) r8
            i8.p.b(r10)     // Catch: d9.x2 -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            i8.p.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.a0 r10 = new kotlin.jvm.internal.a0
            r10.<init>()
            r0.f24536b = r9     // Catch: d9.x2 -> L6c
            r0.f24537c = r10     // Catch: d9.x2 -> L6c
            r0.f24535a = r7     // Catch: d9.x2 -> L6c
            r0.f24539e = r4     // Catch: d9.x2 -> L6c
            d9.y2 r2 = new d9.y2     // Catch: d9.x2 -> L6c
            r2.<init>(r7, r0)     // Catch: d9.x2 -> L6c
            r10.f27364a = r2     // Catch: d9.x2 -> L6c
            java.lang.Object r7 = b(r2, r9)     // Catch: d9.x2 -> L6c
            java.lang.Object r8 = n8.b.c()     // Catch: d9.x2 -> L6c
            if (r7 != r8) goto L67
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: d9.x2 -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r8 = move-exception
            r7 = r10
        L6e:
            d9.z1 r9 = r8.f24530a
            T r7 = r7.f27364a
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.z2.d(long, t8.p, m8.d):java.lang.Object");
    }
}
