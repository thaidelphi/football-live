package j8;

import java.lang.reflect.Array;
/* compiled from: ArraysJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
class j {
    public static final <T> T[] a(T[] reference, int i10) {
        kotlin.jvm.internal.n.f(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        kotlin.jvm.internal.n.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }
}
