package y5;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* compiled from: Iterables.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t {
    public static <T> boolean a(Iterable<T> iterable, x5.h<? super T> hVar) {
        return u.b(iterable.iterator(), hVar);
    }

    public static <T> T b(Iterable<? extends T> iterable, T t10) {
        return (T) u.k(iterable.iterator(), t10);
    }

    public static <T> T c(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) e(list);
            }
            throw new NoSuchElementException();
        }
        return (T) u.i(iterable.iterator());
    }

    public static <T> T d(Iterable<? extends T> iterable, T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) e(w.a(iterable));
            }
        }
        return (T) u.j(iterable.iterator(), t10);
    }

    private static <T> T e(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> boolean f(Iterable<T> iterable, x5.h<? super T> hVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            return g((List) iterable, (x5.h) x5.g.i(hVar));
        }
        return u.o(iterable.iterator(), hVar);
    }

    private static <T> boolean g(List<T> list, x5.h<? super T> hVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!hVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        h(list, hVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        h(list, hVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static <T> void h(List<T> list, x5.h<? super T> hVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (hVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }
}
