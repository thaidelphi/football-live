package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Rx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1094Rx extends Exception {
    public static byte[] A02;
    public static String[] A03 = {"XXye7LHZAeozqK8gapFsXSPF4xH", "t374HOVmt9LWG", "bgBFIwcrXQsVFM8uRII", "RFOuUGqKEUIlnO0HvszVIy1I5C9wZcDC", "dKNM0NGxlq4K1FEB6Qdh", "IHZMfrSF7wlU63KM", "B2fvb0FgtHpN0g1RQrEBtjrTNzTotaI0", "YZAHX3f"};
    public final long A00;
    public final long A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 20);
            if (A03[5].length() != 16) {
                throw new RuntimeException();
            }
            A03[6] = "8A6cGvM1NjIj7bT8Ce2tcNmgCuMcob1V";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{15, 3, 68, 76, 87, 3, 31, 36, 47, 50, 58, 47, 41, 62, 47, 46, 106, 43, 63, 46, 35, 37, 106, 62, 56, 43, 41, 33, 106, 62, 35, 39, 47, 57, 62, 43, 39, 58, 106, 46, 35, 57, 41, 37, 36, 62, 35, 36, 63, 35, 62, 51, 112, 106, 47, 50, 58, 47, 41, 62, 47, 46, 106};
    }

    static {
        A01();
    }

    public C1094Rx(long j10, long j11) {
        super(A00(6, 57, 94) + j11 + A00(0, 6, 55) + j10);
        this.A00 = j10;
        this.A01 = j11;
    }
}
