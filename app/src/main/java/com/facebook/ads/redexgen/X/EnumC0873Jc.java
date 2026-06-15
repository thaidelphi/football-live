package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Jc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public enum EnumC0873Jc {
    A05(true, false),
    A06(true, true);
    
    public static byte[] A02;
    public static String[] A03 = {"2ontwM2arFslKncjF33kbqsw34bOv6le", "G9q7n4RrTr1", "g4gCsJajd0OYdOA8Ye5rYJWq4JgSICF", "NFoKf805ct", "mafT0Rfur7fS0CNoj1tBpTWo2FQFb5xI", "EiMXCOKYsXD", "uVuWHRjrR7UDLAS", "0Dp8HE0WixXMfpgDKF4PEgrQKOmjSnl7"};
    public boolean A00;
    public boolean A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{39, 37, 52, 86, 73, 85, 82};
    }

    static {
        A01();
    }

    EnumC0873Jc(boolean z10, boolean z11) {
        this.A00 = z10;
        this.A01 = z11;
    }

    public final String A03() {
        return toString();
    }

    public final boolean A04() {
        return this.A00;
    }

    public final boolean A05() {
        return this.A01;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC0873Jc[] valuesCustom() {
        EnumC0873Jc[] valuesCustom = values();
        if (A03[7].charAt(2) != 'p') {
            throw new RuntimeException();
        }
        A03[7] = "eYpi2UA0ZlC7PiDY55aF0B4EyL2494ge";
        return (EnumC0873Jc[]) valuesCustom.clone();
    }
}
