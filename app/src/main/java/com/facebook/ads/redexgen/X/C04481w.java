package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.1w  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04481w {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{44, 23, 24, 27, 21, 28, 89, 13, 22, 89, 9, 24, 11, 10, 28, 89, 19, 10, 22, 23, 89, 29, 24, 13, 24, 89, 16, 23, 89, 56, 29, 56, 26, 13, 16, 22, 23, 63, 24, 26, 13, 22, 11, 0, 87, 114, 119, 98, 119, 51, 50, 47, 53, 40, 57, 126, 97, 116, Byte.MAX_VALUE, 78, 125, 120, Byte.MAX_VALUE, 122, 49, 32, 51, 50, 40, 47, 38, 62, 47, 61, 61, 58, 38, 60, 33, 59, 41, 38, 42, 45, 54, 43, 60, 88, 95, 68, 89, 78, 116, 94, 89, 71, 116, 92, 78, 73, 116, 77, 74, 71, 71, 73, 74, 72, 64, 50, 52, 51, 35, 76, 83, 94, 95, 85, 101, 79, 72, 86};
    }

    static {
        A03();
        A01 = C04481w.class.getSimpleName();
    }

    public static AbstractC04471v A00(C1900k1 c1900k1, A7 a72, String str, Uri uri, Map<String, String> extraData, C04592h c04592h) {
        return A01(c1900k1, a72, str, uri, extraData, true, false, c04592h);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.AbstractC04471v A01(com.facebook.ads.redexgen.X.C1900k1 r15, com.facebook.ads.redexgen.X.A7 r16, java.lang.String r17, android.net.Uri r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, boolean r21, com.facebook.ads.redexgen.X.C04592h r22) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04481w.A01(com.facebook.ads.redexgen.X.k1, com.facebook.ads.redexgen.X.A7, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean, com.facebook.ads.redexgen.X.2h):com.facebook.ads.redexgen.X.1v");
    }

    public static boolean A04(String str) {
        return A02(82, 5, 80).equalsIgnoreCase(str) || A02(55, 9, 24).equalsIgnoreCase(str);
    }
}
