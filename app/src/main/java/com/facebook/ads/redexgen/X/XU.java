package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Pattern;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XU {
    public static byte[] A03;
    public static String[] A04 = {"EFKFawmyyzDqeJuiKg", "6XZM8y5RhSRd50HBhgrMaoPdsslxtg", "wmAakdoS4x90LYfRlKy6e", "JO810ePF4RobPZPID0YD1lImespMMw1m", "19t0upKJWDWK8rDsDxKYAUOz6naMJM", "itlzYktnGg1go8iYB95NP7oH9xUVEeba", "0Tt5FWNcRMEXbQwCzq3NZciG2Q4bF8AK", "MTg8TP2YDeg6DzHxMqlqsDWUFI4ALySl"};
    public static final OG<String> A05;
    public static final OG<String> A06;
    public static final OG<String> A07;
    public static final OG<String> A08;
    public static final Pattern A09;
    public final int A00;
    public final int A01;
    public final int A02;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        if (r4.equals(A02(8, 4, 68)) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
        if (r5.equals(r1) != false) goto L38;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.XU A00(com.facebook.ads.redexgen.X.OG<java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XU.A00(com.facebook.ads.redexgen.X.OG):com.facebook.ads.redexgen.X.XU");
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{31, 54, -18, -39, -34, -20, -35, -22, 12, 32, 31, 26, -20, -17, -16, -7, -4, -17, -41, -35, -26, -41, -32, -39, 33, 44, 49, 48, 51, 54, 54, 47, 46, 45, 46, 45, 36, 52, 53, 42, 51, 33, 39, 38, 37, 27, 22, 23, -17, -31, -17, -35, -23, -31};
    }

    static {
        A03();
        A09 = Pattern.compile(A02(0, 3, 92));
        A08 = OG.A05(A02(8, 4, 68), A02(33, 4, 88));
        A06 = OG.A06(A02(24, 3, 86), A02(48, 6, 21), A02(18, 6, 13));
        A05 = OG.A05(A02(27, 6, 99), A02(37, 4, 94));
        A07 = OG.A06(A02(3, 5, 17), A02(12, 6, 35), A02(41, 7, 75));
    }

    public XU(int i10, int i11, int i12) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = i12;
    }

    public static XU A01(String str) {
        if (str == null) {
            return null;
        }
        String parsingValue = AbstractC1756hb.A01(str.trim());
        if (parsingValue.isEmpty()) {
            return null;
        }
        return A00(OG.A08(TextUtils.split(parsingValue, A09)));
    }
}
