package com.facebook.ads.redexgen.X;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.List;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.iG */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1793iG {
    public static byte[] A00;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> InterfaceC1791iE<T> A00(InterfaceC1791iE<? super T> first, InterfaceC1791iE<? super T> second) {
        return new C1012Oq(A04((InterfaceC1791iE) AbstractC1790iD.A04(first), (InterfaceC1791iE) AbstractC1790iD.A04(second)));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static String A02(String methodName, Iterable<?> components) {
        StringBuilder append = new StringBuilder(A01(0, 11, 124)).append(methodName).append('(');
        boolean z10 = true;
        for (Object obj : components) {
            if (!z10) {
                append.append(',');
            }
            append.append(obj);
            z10 = false;
        }
        return append.append(')').toString();
    }

    public static void A05() {
        A00 = new byte[]{59, 93, 80, 79, 84, 78, 76, 95, 80, 94, 25};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    public static <T> List<InterfaceC1791iE<? super T>> A04(InterfaceC1791iE<? super T> first, InterfaceC1791iE<? super T> second) {
        return Arrays.asList(first, second);
    }
}
