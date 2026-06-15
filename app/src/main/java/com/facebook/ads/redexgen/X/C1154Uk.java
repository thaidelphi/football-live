package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Uk  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1154Uk {
    public static byte[] A02;
    public static final C1154Uk A03;
    public final long A00;
    public final long A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{23, 27, 75, 84, 72, 82, 79, 82, 84, 85, 6, 89, 118, 107, 111, 103, 87, 113, 63, 88};
    }

    static {
        A01();
        A03 = new C1154Uk(0L, 0L);
    }

    public C1154Uk(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1154Uk c1154Uk = (C1154Uk) obj;
        return this.A01 == c1154Uk.A01 && this.A00 == c1154Uk.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 3) + this.A01 + A00(0, 11, 58) + this.A00 + A00(19, 1, 4);
    }
}
