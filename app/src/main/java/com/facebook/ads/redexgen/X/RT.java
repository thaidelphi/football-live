package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RT {
    public static byte[] A04;
    public static final RT A05;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{103, 107, 40, 35, 42, 37, 37, 46, 39, 8, 36, 62, 37, 63, 118, 71, 75, 14, 5, 8, 4, 15, 2, 5, 12, 86, 121, 77, 92, 81, 87, 126, 87, 74, 85, 89, 76, 99, 75, 89, 85, 72, 84, 93, 106, 89, 76, 93, 5};
    }

    static {
        A01();
        A05 = new RT(-1, -1, -1);
    }

    public RT(int i10, int i11, int i12) {
        int i13;
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        if (AbstractC1672gE.A15(i12)) {
            i13 = AbstractC1672gE.A06(i12, i11);
        } else {
            i13 = -1;
        }
        this.A00 = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RT) {
            RT rt = (RT) obj;
            return this.A03 == rt.A03 && this.A01 == rt.A01 && this.A02 == rt.A02;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1013Or.A00(Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return A00(26, 23, 15) + this.A03 + A00(0, 15, 124) + this.A01 + A00(15, 11, 92) + this.A02 + ']';
    }
}
