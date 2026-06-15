package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class B5 {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static boolean A03;
    public static byte[] A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{96, 54, Byte.MAX_VALUE, 96, 54, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, 81, 93, 81, 93, 85, 84, 4, 7, 11, 45, 55, 48, 57, 126, 50, 63, 45, 42, 126, 63, 58, 126, 44, 59, 45, 46, 49, 48, 45, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, EnumC0664Al enumC0664Al) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        switch (enumC0664Al) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static String A02(B6 b62) {
        AbstractC0669Au.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A02.get(A03(b62));
    }

    public static String A03(B6 b62) {
        return String.format(Locale.US, A01(0, 14, 29), b62.A09(), b62.A07(), Integer.valueOf(b62.A08() == null ? 0 : b62.A08().A00()), Integer.valueOf(b62.A08() == null ? 0 : b62.A08().A01()), Integer.valueOf(b62.A04()));
    }

    public static void A05(long j10, B6 b62) {
        A01.put(A03(b62), Long.valueOf(j10));
    }

    public static void A06(B6 b62) {
        A00.put(A03(b62), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, B6 b62) {
        A02.put(A03(b62), str);
    }

    public static boolean A08(B6 b62) {
        if (A03) {
            return false;
        }
        String A032 = A03(b62);
        if (A00.containsKey(A032)) {
            return System.currentTimeMillis() - A00.get(A032).longValue() < A00(A032, b62.A07());
        }
        return false;
    }
}
