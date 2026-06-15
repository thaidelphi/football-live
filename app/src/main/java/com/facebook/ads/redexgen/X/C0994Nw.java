package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.Serializable;
import java.util.Arrays;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Nw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0994Nw extends AbstractC2115nY<Comparable<?>> implements Serializable {
    public static byte[] A00;
    public static String[] A01 = {"JDLm", "59j9VSz50JRV62zRfQhUHOfkCXfgeUgK", "B91zWfVJnglJ6qaTwxSE2cgOmWPFgOKk", "ELqJY4", "RV9gCl0i3PKSKYNXbtai8ngQK3fccqTs", "fKxm10xyRNZ", "83zGhfyjGQem9Bncw", "2Nxy8TZF5cPmoYOpvxnNSToHaqPSrsmH"};
    public static final C0994Nw A02;
    public static final long serialVersionUID = 0;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 85);
            if (A01[5].length() == 31) {
                throw new RuntimeException();
            }
            A01[3] = "F1rbTbQwQjJP2vUBRKO1k8FP";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{13, 48, 38, 39, 48, 43, 44, 37, 108, 44, 35, 54, 55, 48, 35, 46, 106, 107};
    }

    static {
        A02();
        A02 = new C0994Nw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC2115nY, java.util.Comparator
    /* renamed from: A00 */
    public final int compare(Comparable<?> left, Comparable<?> right) {
        AbstractC1790iD.A04(left);
        AbstractC1790iD.A04(right);
        return left.compareTo(right);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2115nY
    public final <S extends Comparable<?>> AbstractC2115nY<S> A06() {
        return C0992Nu.A02;
    }

    public final String toString() {
        return A01(0, 18, 23);
    }
}
