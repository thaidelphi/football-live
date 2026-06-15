package j8;

import java.util.LinkedHashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sets.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class p0 extends o0 {
    public static <T> Set<T> e(Set<? extends T> set, T t10) {
        int c10;
        kotlin.jvm.internal.n.f(set, "<this>");
        c10 = i0.c(set.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(c10);
        boolean z10 = false;
        for (T t11 : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.n.a(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> f(Set<? extends T> set, T t10) {
        int c10;
        kotlin.jvm.internal.n.f(set, "<this>");
        c10 = i0.c(set.size() + 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet(c10);
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }
}
