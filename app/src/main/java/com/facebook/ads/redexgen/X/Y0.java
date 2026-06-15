package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.regex.Pattern;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class Y0 {
    public static byte[] A00;
    public static String[] A01 = {"OyM0sm", "9LkwZMEZqZ1wUZeQDWg", "kzkBngDDwGN4g4F4WnIJLXmD5Xx23rBe", "1S", "TtSy8Bl73Or", "3eaX9kQyKWS", "6e4GC9", "nlD7DE22s1TlKm8CeE"};
    public static final Pattern A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{60, 38, 81, 108, 100, 113, 119, 96, 113, 112, 52, 67, 81, 86, 66, 64, 64, 58, 52, 83, 123, 96, 52, 35, 22, 1, 16, 22, 29, 7, 18, 20, 22, 0, 83, 30, 6, 0, 7, 83, 22, 29, 23, 83, 4, 26, 7, 27, 83, 86, 23, 5, 2, 22, 20, 20, 18, 96, 34, 50, 51, 40, 57, 84, 39, 92, 117, 33, 82, 86, 85, 67, 88};
    }

    static {
        A03();
        A02 = Pattern.compile(A02(58, 15, 105));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 12))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 102));
    }

    public static long A01(String str) throws NumberFormatException {
        long j10 = 0;
        String[] subparts = AbstractC1672gE.A1P(str, A02(56, 2, 91));
        for (String str2 : AbstractC1672gE.A1O(subparts[0], A02(1, 1, 9))) {
            long value = Long.parseLong(str2);
            j10 = (60 * j10) + value;
        }
        long j11 = j10 * 1000;
        int length = subparts.length;
        String[] parts = A01;
        if (parts[1].length() != parts[7].length()) {
            String[] parts2 = A01;
            parts2[1] = "5nSMsfcQTIWvKN7i8rP";
            parts2[7] = "57J361HlMkztxWpQdR";
            if (length == 2) {
                long value2 = Long.parseLong(subparts[1]);
                j11 += value2;
            }
            return 1000 * j11;
        }
        throw new RuntimeException();
    }

    public static void A04(C1648fq c1648fq) throws Q6 {
        int A09 = c1648fq.A09();
        if (A05(c1648fq)) {
            return;
        }
        c1648fq.A0f(A09);
        throw Q6.A01(A02(2, 21, 1) + c1648fq.A0T(), null);
    }

    public static boolean A05(C1648fq c1648fq) {
        String A0T = c1648fq.A0T();
        if (A0T != null) {
            String line = A02(50, 6, 85);
            if (A0T.startsWith(line)) {
                return true;
            }
        }
        return false;
    }
}
