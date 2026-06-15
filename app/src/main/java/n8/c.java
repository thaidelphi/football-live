package n8;

import i8.w;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import m8.g;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class c {

    /* compiled from: IntrinsicsJvm.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends j {

        /* renamed from: a  reason: collision with root package name */
        private int f28670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f28671b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f28672c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m8.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f28671b = pVar;
            this.f28672c = obj;
            n.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f28670a;
            if (i10 == 0) {
                this.f28670a = 1;
                i8.p.b(obj);
                n.d(this.f28671b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) e0.a(this.f28671b, 2)).invoke(this.f28672c, this);
            } else if (i10 == 1) {
                this.f28670a = 2;
                i8.p.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        private int f28673a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f28674b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f28675c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m8.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f28674b = pVar;
            this.f28675c = obj;
            n.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f28673a;
            if (i10 == 0) {
                this.f28673a = 1;
                i8.p.b(obj);
                n.d(this.f28674b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) e0.a(this.f28674b, 2)).invoke(this.f28675c, this);
            } else if (i10 == 1) {
                this.f28673a = 2;
                i8.p.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> m8.d<w> a(p<? super R, ? super m8.d<? super T>, ? extends Object> pVar, R r10, m8.d<? super T> completion) {
        n.f(pVar, "<this>");
        n.f(completion, "completion");
        m8.d<?> a10 = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, a10);
        }
        g context = a10.getContext();
        if (context == m8.h.f27797a) {
            return new a(a10, pVar, r10);
        }
        return new b(a10, context, pVar, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> m8.d<T> b(m8.d<? super T> dVar) {
        m8.d<T> dVar2;
        n.f(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar3 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar3 == null || (dVar2 = (m8.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }
}
