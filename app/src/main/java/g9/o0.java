package g9;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.j3;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class o0<T> implements a0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final a0<T> f25993a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.p<f<? super T>, m8.d<? super i8.w>, Object> f25994b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {j3.a.b.f17904i}, m = "collect")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f25995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0<T> f25996b;

        /* renamed from: c  reason: collision with root package name */
        int f25997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o0<T> o0Var, m8.d<? super a> dVar) {
            super(dVar);
            this.f25996b = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25995a = obj;
            this.f25997c |= RecyclerView.UNDEFINED_DURATION;
            return this.f25996b.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0(a0<? extends T> a0Var, t8.p<? super f<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        this.f25993a = a0Var;
        this.f25994b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // g9.a0, g9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(g9.f<? super T> r6, m8.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g9.o0.a
            if (r0 == 0) goto L13
            r0 = r7
            g9.o0$a r0 = (g9.o0.a) r0
            int r1 = r0.f25997c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25997c = r1
            goto L18
        L13:
            g9.o0$a r0 = new g9.o0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25995a
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f25997c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            i8.p.b(r7)
            goto L46
        L31:
            i8.p.b(r7)
            g9.a0<T> r7 = r5.f25993a
            g9.n0 r2 = new g9.n0
            t8.p<g9.f<? super T>, m8.d<? super i8.w>, java.lang.Object> r4 = r5.f25994b
            r2.<init>(r6, r4)
            r0.f25997c = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            i8.d r6 = new i8.d
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.o0.collect(g9.f, m8.d):java.lang.Object");
    }
}
