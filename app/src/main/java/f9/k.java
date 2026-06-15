package f9;

import d9.o0;
import f9.h;
import i8.o;
import i8.w;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Channels.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final /* synthetic */ class k {

    /* compiled from: Channels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super h<? extends w>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f25559a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f25560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u<E> f25561c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E f25562d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(u<? super E> uVar, E e8, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f25561c = uVar;
            this.f25562d = e8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<w> create(Object obj, m8.d<?> dVar) {
            a aVar = new a(this.f25561c, this.f25562d, dVar);
            aVar.f25560b = obj;
            return aVar;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(o0 o0Var, m8.d<? super h<w>> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, m8.d<? super h<? extends w>> dVar) {
            return invoke2(o0Var, (m8.d<? super h<w>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            Object b10;
            c10 = n8.d.c();
            int i10 = this.f25559a;
            try {
                if (i10 == 0) {
                    i8.p.b(obj);
                    o0 o0Var = (o0) this.f25560b;
                    u<E> uVar = this.f25561c;
                    E e8 = this.f25562d;
                    o.a aVar = i8.o.f26626b;
                    this.f25559a = 1;
                    if (uVar.i(e8, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                b10 = i8.o.b(w.f26638a);
            } catch (Throwable th) {
                o.a aVar2 = i8.o.f26626b;
                b10 = i8.o.b(i8.p.a(th));
            }
            return h.b(i8.o.g(b10) ? h.f25553b.c(w.f26638a) : h.f25553b.a(i8.o.d(b10)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object a(u<? super E> uVar, E e8) {
        Object b10;
        Object l10 = uVar.l(e8);
        if (l10 instanceof h.c) {
            b10 = d9.j.b(null, new a(uVar, e8, null), 1, null);
            return ((h) b10).k();
        }
        w wVar = (w) l10;
        return h.f25553b.c(w.f26638a);
    }
}
