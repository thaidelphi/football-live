package j8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Arrays.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class m extends l {
    public static boolean i(char[] cArr, char c10) {
        kotlin.jvm.internal.n.f(cArr, "<this>");
        return p(cArr, c10) >= 0;
    }

    public static <T> boolean j(T[] tArr, T t10) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        return q(tArr, t10) >= 0;
    }

    public static <T> List<T> k(T[] tArr) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        return (List) l(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C l(T[] tArr, C destination) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static <T> T m(T[] tArr) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> int n(T[] tArr) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T o(T[] tArr, int i10) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        if (i10 < 0 || i10 > n(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    public static final int p(char[] cArr, char c10) {
        kotlin.jvm.internal.n.f(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T> int q(T[] tArr, T t10) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (kotlin.jvm.internal.n.a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static char r(char[] cArr) {
        kotlin.jvm.internal.n.f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T s(T[] tArr) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T, C extends Collection<? super T>> C t(T[] tArr, C destination) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    public static <T> List<T> u(T[] tArr) {
        List<T> d10;
        List<T> b10;
        List<T> v10;
        kotlin.jvm.internal.n.f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            d10 = q.d();
            return d10;
        } else if (length != 1) {
            v10 = v(tArr);
            return v10;
        } else {
            b10 = p.b(tArr[0]);
            return b10;
        }
    }

    public static <T> List<T> v(T[] tArr) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        return new ArrayList(q.c(tArr));
    }

    public static final <T> Set<T> w(T[] tArr) {
        Set<T> b10;
        Set<T> a10;
        int c10;
        kotlin.jvm.internal.n.f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            b10 = o0.b();
            return b10;
        } else if (length != 1) {
            c10 = i0.c(tArr.length);
            return (Set) t(tArr, new LinkedHashSet(c10));
        } else {
            a10 = n0.a(tArr[0]);
            return a10;
        }
    }
}
