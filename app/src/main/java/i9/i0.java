package i9;

import i9.h0;
/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class i0<S extends h0<S>> {
    public static <S extends h0<S>> Object a(Object obj) {
        return obj;
    }

    public static final S b(Object obj) {
        if (obj != d.f26651a) {
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        return obj == d.f26651a;
    }
}
