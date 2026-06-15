package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Wa  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1193Wa {
    public static byte[] A05;
    public final int A00;
    public final C1156Um A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{34, 43, 37, 68, 118, 118, 112, 104, 108, 107, 98, 37, 68, 64, 86, 40, 70, 81, 87, 37, 102, 119, 124, 117, 113, 106, 37, 104, 106, 97, 96, 43, 35, 5, 22, 20, 28, 50, 25, 20, 5, 14, 7, 3, 30, 24, 25, 53, 24, 15, 61, 6, 27, 29, 24, 24, 7, 26, 28, 13, 12, 72, 24, 26, 7, 28, 13, 11, 28, 1, 7, 6, 72, 27, 11, 0, 13, 5, 13, 72, 28, 17, 24, 13, 72, 79, 24, 25, 24, 74, 62, 63, 62, 46, 89, 95, 84, 89, 9, 15, 4, 25};
    }

    public C1193Wa(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        AbstractC1589es.A07((bArr2 == null) ^ (i10 == 0));
        this.A03 = z10;
        this.A02 = str;
        this.A00 = i10;
        this.A04 = bArr2;
        this.A01 = new C1156Um(A00(str), bArr, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        char c10;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 32))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3046671:
                if (str.equals(A01(90, 4, 6))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3049879:
                if (str.equals(A01(94, 4, 97))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3049895:
                if (str.equals(A01(98, 4, 49))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                AbstractC1633fb.A07(A01(32, 18, 44), A01(50, 36, 51) + str + A01(0, 32, 94));
                return 1;
        }
    }
}
