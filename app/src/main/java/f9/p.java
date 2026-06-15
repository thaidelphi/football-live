package f9;

import androidx.recyclerview.widget.RecyclerView;
import d9.i0;
import d9.o0;
import d9.q0;
import i8.o;
import i8.w;
/* compiled from: Produce.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class p {

    /* compiled from: Produce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f25565a;

        /* renamed from: b */
        Object f25566b;

        /* renamed from: c */
        /* synthetic */ Object f25567c;

        /* renamed from: d */
        int f25568d;

        a(m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25567c = obj;
            this.f25568d |= RecyclerView.UNDEFINED_DURATION;
            return p.a(null, null, this);
        }
    }

    /* compiled from: Produce.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b extends kotlin.jvm.internal.o implements t8.l<Throwable, w> {

        /* renamed from: a */
        final /* synthetic */ d9.n<w> f25569a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d9.n<? super w> nVar) {
            super(1);
            this.f25569a = nVar;
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f26638a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th) {
            d9.n<w> nVar = this.f25569a;
            o.a aVar = i8.o.f26626b;
            nVar.resumeWith(i8.o.b(w.f26638a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(f9.r<?> r4, t8.a<i8.w> r5, m8.d<? super i8.w> r6) {
        /*
            boolean r0 = r6 instanceof f9.p.a
            if (r0 == 0) goto L13
            r0 = r6
            f9.p$a r0 = (f9.p.a) r0
            int r1 = r0.f25568d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25568d = r1
            goto L18
        L13:
            f9.p$a r0 = new f9.p$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25567c
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f25568d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f25566b
            r5 = r4
            t8.a r5 = (t8.a) r5
            java.lang.Object r4 = r0.f25565a
            f9.r r4 = (f9.r) r4
            i8.p.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r4 = move-exception
            goto L80
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            i8.p.b(r6)
            m8.g r6 = r0.getContext()
            d9.z1$b r2 = d9.z1.f24533t0
            m8.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L4d
            r6 = r3
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L84
            r0.f25565a = r4     // Catch: java.lang.Throwable -> L32
            r0.f25566b = r5     // Catch: java.lang.Throwable -> L32
            r0.f25568d = r3     // Catch: java.lang.Throwable -> L32
            d9.o r6 = new d9.o     // Catch: java.lang.Throwable -> L32
            m8.d r2 = n8.b.b(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.C()     // Catch: java.lang.Throwable -> L32
            f9.p$b r2 = new f9.p$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.c(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.z()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = n8.b.c()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L77
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L77:
            if (r4 != r1) goto L7a
            return r1
        L7a:
            r5.invoke()
            i8.w r4 = i8.w.f26638a
            return r4
        L80:
            r5.invoke()
            throw r4
        L84:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.p.a(f9.r, t8.a, m8.d):java.lang.Object");
    }

    public static final <E> t<E> b(o0 o0Var, m8.g gVar, int i10, f9.a aVar, q0 q0Var, t8.l<? super Throwable, w> lVar, t8.p<? super r<? super E>, ? super m8.d<? super w>, ? extends Object> pVar) {
        q qVar = new q(i0.d(o0Var, gVar), g.b(i10, aVar, null, 4, null));
        if (lVar != null) {
            qVar.K(lVar);
        }
        qVar.S0(q0Var, qVar, pVar);
        return qVar;
    }

    public static final <E> t<E> c(o0 o0Var, m8.g gVar, int i10, t8.p<? super r<? super E>, ? super m8.d<? super w>, ? extends Object> pVar) {
        return b(o0Var, gVar, i10, f9.a.SUSPEND, q0.DEFAULT, null, pVar);
    }

    public static /* synthetic */ t d(o0 o0Var, m8.g gVar, int i10, f9.a aVar, q0 q0Var, t8.l lVar, t8.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = m8.h.f27797a;
        }
        m8.g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            aVar = f9.a.SUSPEND;
        }
        f9.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            q0Var = q0.DEFAULT;
        }
        q0 q0Var2 = q0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return b(o0Var, gVar2, i12, aVar2, q0Var2, lVar, pVar);
    }

    public static /* synthetic */ t e(o0 o0Var, m8.g gVar, int i10, t8.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = m8.h.f27797a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(o0Var, gVar, i10, pVar);
    }
}
