package j8;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class o0 extends n0 {
    public static <T> Set<T> b() {
        return c0.f27086a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        kotlin.jvm.internal.n.f(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : m0.a(set.iterator().next());
        }
        return m0.b();
    }

    public static <T> Set<T> d(T... elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        return elements.length > 0 ? m.w(elements) : m0.b();
    }
}
