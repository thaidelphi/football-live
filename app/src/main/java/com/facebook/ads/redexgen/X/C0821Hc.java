package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Hc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0821Hc {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C2T A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{89, 91, 72, 94, 89, 84, 78, 7, 5, 22, 0, 13, 10, 0};
    }

    public C0821Hc(int i10, int i11, C2T c2t) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = c2t;
    }

    public final int A02() {
        return this.A01;
    }

    public final C2T A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap hashMap = new HashMap();
        StringBuilder append = new StringBuilder().append(this.A01);
        String A00 = A00(0, 0, 41);
        hashMap.put(A00(7, 7, 20), append.append(A00).toString());
        hashMap.put(A00(0, 7, 74), this.A00 + A00);
        return hashMap;
    }
}
