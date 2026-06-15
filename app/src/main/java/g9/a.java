package g9;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: Flow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class a<T> implements e<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Flow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: g9.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class C0281a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f25841a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f25842b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a<T> f25843c;

        /* renamed from: d  reason: collision with root package name */
        int f25844d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0281a(a<T> aVar, m8.d<? super C0281a> dVar) {
            super(dVar);
            this.f25843c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25842b = obj;
            this.f25844d |= RecyclerView.UNDEFINED_DURATION;
            return this.f25843c.collect(null, this);
        }
    }

    public abstract Object b(f<? super T> fVar, m8.d<? super i8.w> dVar);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // g9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(g9.f<? super T> r6, m8.d<? super i8.w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g9.a.C0281a
            if (r0 == 0) goto L13
            r0 = r7
            g9.a$a r0 = (g9.a.C0281a) r0
            int r1 = r0.f25844d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25844d = r1
            goto L18
        L13:
            g9.a$a r0 = new g9.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25842b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f25844d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f25841a
            h9.t r6 = (h9.t) r6
            i8.p.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            i8.p.b(r7)
            h9.t r7 = new h9.t
            m8.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f25841a = r7     // Catch: java.lang.Throwable -> L55
            r0.f25844d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            i8.w r6 = i8.w.f26638a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.a.collect(g9.f, m8.d):java.lang.Object");
    }
}
