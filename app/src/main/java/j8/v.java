package j8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollections.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class v extends u {
    public static <T> boolean n(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        kotlin.jvm.internal.n.f(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        boolean z10 = false;
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> T o(List<T> list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }
}
