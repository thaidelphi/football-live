package j8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collections.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class q extends p {
    public static final <T> Collection<T> c(T[] tArr) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        return new g(tArr, false);
    }

    public static <T> List<T> d() {
        return a0.f27080a;
    }

    public static <T> int e(List<? extends T> list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> f(T... elements) {
        List<T> d10;
        List<T> b10;
        kotlin.jvm.internal.n.f(elements, "elements");
        if (elements.length > 0) {
            b10 = l.b(elements);
            return b10;
        }
        d10 = d();
        return d10;
    }

    public static <T> List<T> g(T... elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new g(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> h(List<? extends T> list) {
        List<T> d10;
        List<T> b10;
        kotlin.jvm.internal.n.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            d10 = d();
            return d10;
        } else if (size != 1) {
            return list;
        } else {
            b10 = p.b(list.get(0));
            return b10;
        }
    }

    public static void i() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void j() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
