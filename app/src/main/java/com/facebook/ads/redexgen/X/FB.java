package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class FB {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, -31, -22, -21, -16, -10, -11, -37, -42, -36, -54, -49};
    }

    public FB() {
        this.A00 = new HashMap();
    }

    public FB(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final FB A02(C0710Cv c0710Cv) {
        if (c0710Cv != null) {
            this.A00.put(A00(11, 5, 48), CV.A01(c0710Cv.A04()));
        }
        return this;
    }

    public final FB A03(JL jl) {
        if (jl != null) {
            this.A00.putAll(jl.A0S());
        }
        return this;
    }

    public final FB A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
