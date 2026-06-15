package j8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterables.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class r extends q {
    public static <T> int k(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static <T> List<T> l(Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable<? extends T> iterable2 : iterable) {
            o.n(arrayList, iterable2);
        }
        return arrayList;
    }
}
