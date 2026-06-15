package j8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class p {
    public static final <T> Object[] a(T[] tArr, boolean z10) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        if (z10 && kotlin.jvm.internal.n.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.n.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <T> List<T> b(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        kotlin.jvm.internal.n.e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
