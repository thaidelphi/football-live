package j8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ArraysJvm.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class l extends k {
    public static <T> List<T> b(T[] tArr) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        List<T> a10 = n.a(tArr);
        kotlin.jvm.internal.n.e(a10, "asList(this)");
        return a10;
    }

    public static final <T> T[] c(T[] tArr, T[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return c(objArr, objArr2, i10, i11, i12);
    }

    public static void e(int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.n.f(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final <T> void f(T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void g(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        f(objArr, obj, i10, i11);
    }

    public static final <T> void h(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.n.f(tArr, "<this>");
        kotlin.jvm.internal.n.f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
