package d9;

import i8.o;
/* compiled from: CompletionState.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f0 {
    public static final <T> Object a(Object obj, m8.d<? super T> dVar) {
        if (obj instanceof b0) {
            o.a aVar = i8.o.f26626b;
            Throwable th = ((b0) obj).f24413a;
            if (s0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                th = i9.j0.i(th, (kotlin.coroutines.jvm.internal.e) dVar);
            }
            return i8.o.b(i8.p.a(th));
        }
        o.a aVar2 = i8.o.f26626b;
        return i8.o.b(obj);
    }

    public static final <T> Object b(Object obj, n<?> nVar) {
        Throwable d10 = i8.o.d(obj);
        if (d10 != null) {
            if (s0.d() && (nVar instanceof kotlin.coroutines.jvm.internal.e)) {
                d10 = i9.j0.i(d10, (kotlin.coroutines.jvm.internal.e) nVar);
            }
            obj = new b0(d10, false, 2, null);
        }
        return obj;
    }

    public static final <T> Object c(Object obj, t8.l<? super Throwable, i8.w> lVar) {
        Throwable d10 = i8.o.d(obj);
        if (d10 == null) {
            return lVar != null ? new c0(obj, lVar) : obj;
        }
        return new b0(d10, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, t8.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
