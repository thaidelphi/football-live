package b0;

import com.google.android.gms.common.api.Api;
import d9.o0;
import d9.z1;
import f9.h;
import i8.w;
import java.util.concurrent.atomic.AtomicInteger;
import t8.p;
/* compiled from: SimpleActor.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f4868a;

    /* renamed from: b  reason: collision with root package name */
    private final p<T, m8.d<? super w>, Object> f4869b;

    /* renamed from: c  reason: collision with root package name */
    private final f9.d<T> f4870c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f4871d;

    /* compiled from: SimpleActor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.l<Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t8.l<Throwable, w> f4872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<T> f4873b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, w> f4874c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(t8.l<? super Throwable, w> lVar, l<T> lVar2, p<? super T, ? super Throwable, w> pVar) {
            super(1);
            this.f4872a = lVar;
            this.f4873b = lVar2;
            this.f4874c = pVar;
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f26638a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            w wVar;
            this.f4872a.invoke(th);
            ((l) this.f4873b).f4870c.q(th);
            do {
                Object f10 = f9.h.f(((l) this.f4873b).f4870c.o());
                if (f10 == null) {
                    wVar = null;
                    continue;
                } else {
                    this.f4874c.invoke(f10, th);
                    wVar = w.f26638a;
                    continue;
                }
            } while (wVar != null);
        }
    }

    /* compiled from: SimpleActor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<o0, m8.d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f4875a;

        /* renamed from: b  reason: collision with root package name */
        int f4876b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l<T> f4877c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<T> lVar, m8.d<? super b> dVar) {
            super(2, dVar);
            this.f4877c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<w> create(Object obj, m8.d<?> dVar) {
            return new b(this.f4877c, dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(w.f26638a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:24:0x006e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = n8.b.c()
                int r1 = r7.f4876b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                i8.p.b(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f4875a
                t8.p r1 = (t8.p) r1
                i8.p.b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                i8.p.b(r8)
                b0.l<T> r8 = r7.f4877c
                java.util.concurrent.atomic.AtomicInteger r8 = b0.l.c(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L37
                r8 = r3
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                b0.l<T> r1 = r8.f4877c
                d9.o0 r1 = b0.l.d(r1)
                d9.p0.f(r1)
                b0.l<T> r1 = r8.f4877c
                t8.p r1 = b0.l.a(r1)
                b0.l<T> r4 = r8.f4877c
                f9.d r4 = b0.l.b(r4)
                r8.f4875a = r1
                r8.f4876b = r3
                java.lang.Object r4 = r4.e(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.f4875a = r5
                r0.f4876b = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                b0.l<T> r1 = r8.f4877c
                java.util.concurrent.atomic.AtomicInteger r1 = b0.l.c(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3b
                i8.w r8 = i8.w.f26638a
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(o0 scope, t8.l<? super Throwable, w> onComplete, p<? super T, ? super Throwable, w> onUndeliveredElement, p<? super T, ? super m8.d<? super w>, ? extends Object> consumeMessage) {
        kotlin.jvm.internal.n.f(scope, "scope");
        kotlin.jvm.internal.n.f(onComplete, "onComplete");
        kotlin.jvm.internal.n.f(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.n.f(consumeMessage, "consumeMessage");
        this.f4868a = scope;
        this.f4869b = consumeMessage;
        this.f4870c = f9.g.b(Api.BaseClientBuilder.API_PRIORITY_OTHER, null, null, 6, null);
        this.f4871d = new AtomicInteger(0);
        z1 z1Var = (z1) scope.getCoroutineContext().get(z1.f24533t0);
        if (z1Var == null) {
            return;
        }
        z1Var.K(new a(onComplete, this, onUndeliveredElement));
    }

    public final void e(T t10) {
        Object l10 = this.f4870c.l(t10);
        if (l10 instanceof h.a) {
            Throwable e8 = f9.h.e(l10);
            if (e8 != null) {
                throw e8;
            }
            throw new f9.n("Channel was closed normally");
        } else if (f9.h.i(l10)) {
            if (this.f4871d.getAndIncrement() == 0) {
                d9.k.d(this.f4868a, null, null, new b(this, null), 3, null);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
