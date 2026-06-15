package y5;

import java.util.Comparator;
/* compiled from: Ordering.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class h0<T> implements Comparator<T> {
    public static <T> h0<T> a(Comparator<T> comparator) {
        if (comparator instanceof h0) {
            return (h0) comparator;
        }
        return new j(comparator);
    }

    public static <C extends Comparable> h0<C> b() {
        return e0.f33203a;
    }

    public <F> h0<F> c(x5.d<F, ? extends T> dVar) {
        return new g(dVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    public <S extends T> h0<S> d() {
        return new n0(this);
    }
}
