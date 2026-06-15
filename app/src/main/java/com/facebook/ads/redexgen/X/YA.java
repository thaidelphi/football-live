package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YA {
    public static byte[] A05;
    public static String[] A06 = {"fR4lZKwwyY21UaXkF2KSQybQkAryBYIv", "BBNVc7U2ctACbRP3a2E57h3fhHnztlXK", "yoJAyiBXkmMFka23Ij1T6RmbtDvrEu9e", "UZfqgXJMubWkLZB", "zNxjtHETiYywuc9jFmfu3Sfi8hfhzC2X", "CKlEoUe4kaZ336bTDZaJOQ438AXZ0DgX", "r7p9ViUR2QSLSaAdpGTCem11RQazgKRx", "lL4JGM7bOqPlXOv90D"};
    public static final byte[] A07;
    public int A00;
    public int A01;
    public byte[] A02;
    public int A03;
    public boolean A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-94, -116, -112, -115, -84, -65, -69, -66, -65, -52, Byte.MAX_VALUE, -104, -113, -94, -102, -113, -115, -98, -113, -114, 74, -99, -98, -117, -100, -98, 74, -115, -103, -114, -113, 74, -96, -117, -106, -97, -113};
        if (A06[7].length() == 8) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[2] = "jIfi5ik43O9e41l4y2iWLRVoKrLWuQFv";
        strArr[6] = "4cSBRirLnSorBFapUY246AKD45kfWM41";
        A05 = bArr;
    }

    static {
        A01();
        A07 = new byte[]{0, 0, 1};
    }

    public YA(int i10) {
        this.A02 = new byte[i10];
    }

    public final void A02() {
        this.A04 = false;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A03(byte[] bArr, int i10, int i11) {
        if (!this.A04) {
            return;
        }
        int i12 = i11 - i10;
        int length = this.A02.length;
        int readLength = this.A00;
        if (length < readLength + i12) {
            byte[] bArr2 = this.A02;
            int readLength2 = this.A00;
            this.A02 = Arrays.copyOf(bArr2, (readLength2 + i12) * 2);
        }
        byte[] bArr3 = this.A02;
        int readLength3 = this.A00;
        System.arraycopy(bArr, i10, bArr3, readLength3, i12);
        int readLength4 = this.A00;
        this.A00 = readLength4 + i12;
    }

    public final boolean A04(int i10, int i11) {
        int i12 = this.A03;
        String A00 = A00(10, 27, 10);
        String A002 = A00(0, 10, 58);
        switch (i12) {
            case 0:
                String[] strArr = A06;
                if (strArr[2].charAt(5) == strArr[6].charAt(5)) {
                    A06[7] = "e3zaxyq8ZNS";
                    if (i10 == 176) {
                        this.A03 = 1;
                        this.A04 = true;
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
                break;
            case 1:
                if (i10 != 181) {
                    AbstractC1633fb.A07(A002, A00);
                    A02();
                    break;
                } else {
                    this.A03 = 2;
                    break;
                }
            case 2:
                if (i10 > 31) {
                    AbstractC1633fb.A07(A002, A00);
                    A02();
                    break;
                } else {
                    this.A03 = 3;
                    break;
                }
            case 3:
                if ((i10 & 240) != 32) {
                    AbstractC1633fb.A07(A002, A00);
                    A02();
                    break;
                } else {
                    this.A01 = this.A00;
                    this.A03 = 4;
                    break;
                }
            case 4:
                if (i10 == 179 || i10 == 181) {
                    this.A00 -= i11;
                    this.A04 = false;
                    return true;
                }
            default:
                throw new IllegalStateException();
        }
        A03(A07, 0, A07.length);
        return false;
    }
}
