package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.Wd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class EnumC1196Wd {
    public static byte[] A00;
    public static String[] A01 = {"GMoX6LJM8ECzPVFFSTYySIjy2G46b7CC", "K4ROu9GbaiuUz0OUbYPvc3VtR6Ocg10D", "2AA4uqnc2zCDDCio5EZ97QWSPUtmQR3f", "A8a3QYxScFddez2bdU1mla2lprwVYHmf", "V4UPsIp0", "PIqIX5wy82zXVIF2a02jCZ2W7L5u5YXV", "X7cDthlcc3bRPhxwlR4vwK2rkVwYY95c", "6fkX9VznN37pSxFnefpopLVwpVOmzDnD"};
    public static final /* synthetic */ EnumC1196Wd[] A02;
    public static final EnumC1196Wd A03;
    public static final EnumC1196Wd A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -57, -66, -35, -32, -40};
    }

    static {
        A01();
        A03 = new EnumC1196Wd(A00(0, 3, 77), 0);
        A04 = new EnumC1196Wd(A00(3, 3, 93), 1);
        A02 = A02();
    }

    public EnumC1196Wd(String str, int i10) {
    }

    public static /* synthetic */ EnumC1196Wd[] A02() {
        EnumC1196Wd[] enumC1196WdArr = new EnumC1196Wd[2];
        EnumC1196Wd enumC1196Wd = A03;
        if (A01[3].charAt(12) != 'X') {
            A01[4] = "0E2R1KIW";
            enumC1196WdArr[0] = enumC1196Wd;
            enumC1196WdArr[1] = A04;
            return enumC1196WdArr;
        }
        throw new RuntimeException();
    }

    public static EnumC1196Wd valueOf(String str) {
        return (EnumC1196Wd) Enum.valueOf(EnumC1196Wd.class, str);
    }

    public static EnumC1196Wd[] values() {
        return (EnumC1196Wd[]) A02.clone();
    }
}
