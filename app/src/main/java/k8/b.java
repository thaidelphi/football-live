package k8;

import java.util.Arrays;
import kotlin.jvm.internal.n;
/* compiled from: ListBuilder.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b {
    public static final <E> E[] a(int i10) {
        if (i10 >= 0) {
            return (E[]) new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final <T> T[] b(T[] tArr, int i10) {
        n.f(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        n.e(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    public static final <E> void c(E[] eArr, int i10) {
        n.f(eArr, "<this>");
        eArr[i10] = null;
    }

    public static final <E> void d(E[] eArr, int i10, int i11) {
        n.f(eArr, "<this>");
        while (i10 < i11) {
            c(eArr, i10);
            i10++;
        }
    }
}
