package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Gh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class RunnableC0800Gh implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"cNFcWbBTlC21yVLFwbr", "9GV2E8F9E2oE8CHXfnhYKiZsDK3egbEW", "QOwDSeu1r9UmOYKCJ4q7pu", "wLxLWw50lPgC4sAeZiCwv7pW84ixD2Ig", "u8mrTBG1NeFkrttZ2j0LSs7yOPehuw8f", "R35JTbeYnLlLSORxODVCOg1", "dSDMu8RDcGvfG7f91Jn", "vgGOrZScmi2DEwHan2nQobkknD6iF2"};
    public final /* synthetic */ LC A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{121, 70, 75, 74, 64, Byte.MAX_VALUE, 67, 78, 86, 77, 78, 76, 68, 106, 93, 93, 64, 93};
    }

    static {
        A01();
    }

    public RunnableC0800Gh(LC lc) {
        this.A00 = lc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0I(A00(0, 18, 33));
        } catch (Throwable th) {
            BQ.A00(th, this);
            if (A02[3].charAt(14) != 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "BiobfU8eOeDJTRwO1wDdFp";
            strArr[5] = "4fmLJ7Dm7W0RRBNKueLwAfq";
        }
    }
}
