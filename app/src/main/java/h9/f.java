package h9;

import i9.o0;
import kotlin.jvm.internal.e0;
/* compiled from: ChannelFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f {
    public static final /* synthetic */ g9.f a(g9.f fVar, m8.g gVar) {
        return d(fVar, gVar);
    }

    public static final <T, V> Object b(m8.g gVar, V v10, Object obj, t8.p<? super V, ? super m8.d<? super T>, ? extends Object> pVar, m8.d<? super T> dVar) {
        Object c10;
        Object c11 = o0.c(gVar, obj);
        try {
            Object invoke = ((t8.p) e0.a(pVar, 2)).invoke(v10, new x(dVar, gVar));
            o0.a(gVar, c11);
            c10 = n8.d.c();
            if (invoke == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return invoke;
        } catch (Throwable th) {
            o0.a(gVar, c11);
            throw th;
        }
    }

    public static /* synthetic */ Object c(m8.g gVar, Object obj, Object obj2, t8.p pVar, m8.d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = o0.b(gVar);
        }
        return b(gVar, obj, obj2, pVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g9.f<T> d(g9.f<? super T> fVar, m8.g gVar) {
        return fVar instanceof w ? true : fVar instanceof r ? fVar : new z(fVar, gVar);
    }
}
