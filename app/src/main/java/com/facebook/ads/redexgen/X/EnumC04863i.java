package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.3i  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class EnumC04863i {
    public static byte[] A01;
    public static String[] A02 = {"VujXzvSFrlMAu4R1I5vUAWLnq57AsPWM", "eCB4AeZNNUxNJOW0xCQdVSKErAFKyRUE", "SxM7TzuiGj5mLkDPau1usW4gOWoxs80M", "JPSotx28OKEE72Qpgvn7eDCIGwp5uNVo", "DEnf6Zvbz7peiDJpz513nqQn8JHSiM1H", "gOyBV6cEPVg9ZlKZ082v3gM", "JzQKQqAcA3MWJuXBOCM1CdL45YEfwdQ5", "kFuiftK6CrUjCipoQAB5otHUPyyIQR1T"};
    public static final /* synthetic */ EnumC04863i[] A03;
    public static final EnumC04863i A04;
    public static final EnumC04863i A05;
    public static final EnumC04863i A06;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 125, 112, 113, 70, 71, 70, 77, 82, 69, 80, 79, 82, 84, 74, 75, 70, 71, 101, 100, 101, 110, 44, 59, 46, 49, 44, 42};
    }

    static {
        A01();
        A06 = new EnumC04863i(A00(8, 6, 62), 0, A00(22, 6, 96));
        A04 = new EnumC04863i(A00(0, 4, 10), 1, A00(14, 4, 28));
        A05 = new EnumC04863i(A00(4, 4, 54), 2, A00(18, 4, 53));
        A03 = A02();
    }

    public EnumC04863i(String str, int i10, String str2) {
        this.A00 = str2;
    }

    public static /* synthetic */ EnumC04863i[] A02() {
        EnumC04863i[] enumC04863iArr = new EnumC04863i[3];
        enumC04863iArr[0] = A06;
        EnumC04863i enumC04863i = A04;
        String[] strArr = A02;
        if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "cigJDFmR8APB9TZFazKvkLU6eV5xdG1z";
        strArr2[7] = "bxChofFJf2xaRn9PIbRGfpqcGnLInP10";
        enumC04863iArr[1] = enumC04863i;
        enumC04863iArr[2] = A05;
        return enumC04863iArr;
    }

    public final String A03() {
        return this.A00;
    }

    public static EnumC04863i valueOf(String str) {
        return (EnumC04863i) Enum.valueOf(EnumC04863i.class, str);
    }

    public static EnumC04863i[] values() {
        return (EnumC04863i[]) A03.clone();
    }
}
