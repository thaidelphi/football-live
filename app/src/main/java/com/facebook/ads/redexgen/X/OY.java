package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class OY<F, T> extends AbstractC2115nY<F> implements Serializable {
    public static byte[] A02;
    public static String[] A03 = {"qP7uN3CTeBtugcvn4iscvs4NawNVw3hj", "uACvKKD4Xh814PQzJz7fno8Y0d2htzTr", "OaGwUL0wruZXrmXuBUYR8eOdlsWVX5jO", "JY9GX7tPgJ", "UJNVJd39Mn7RrVqRZr4HQjubetYZ2pJj", "tP9Bx5HW1SG5GbSCFf4kAQmgB2SyEv9b", "xcsG1NfXHnFrLoKWAotfCT6bqQ3ToZXO", "wDWfKnr2Hnyq67FaxNzVQD5A0FwwfXbW"};
    public static final long serialVersionUID = 0;
    public final InterfaceC1771hs<F, ? extends T> A00;
    public final AbstractC2115nY<T> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].charAt(0) == strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A03[1] = "UOsr4mSSP3XVk2xA78tBNfMlPB0RSTkt";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 5);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{78, 122, 59, 58, 6, 49, 39, 33, 56, 32, 27, 50, 124};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof OY) {
            OY oy = (OY) object;
            return this.A00.equals(oy.A00) && this.A01.equals(oy.A01);
        }
        return false;
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OY != com.google.common.collect.ByFunctionOrdering<F, T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.hs != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Ordering<T> */
    public OY(InterfaceC1771hs<F, ? extends T> function, AbstractC2115nY<T> ordering) {
        this.A00 = (InterfaceC1771hs) AbstractC1790iD.A04(function);
        this.A01 = (AbstractC2115nY) AbstractC1790iD.A04(ordering);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OY != com.google.common.collect.ByFunctionOrdering<F, T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2115nY, java.util.Comparator
    public final int compare(@ParametricNullness F left, @ParametricNullness F right) {
        return this.A01.compare(this.A00.A41(left), this.A00.A41(right));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OY != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final int hashCode() {
        return AbstractC1013Or.A00(this.A00, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OY != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final String toString() {
        return this.A01 + A00(1, 12, 81) + this.A00 + A00(0, 1, 98);
    }
}
