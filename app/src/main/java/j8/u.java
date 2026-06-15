package j8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollectionsJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class u extends t {
    public static <T> void m(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.n.f(list, "<this>");
        kotlin.jvm.internal.n.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
