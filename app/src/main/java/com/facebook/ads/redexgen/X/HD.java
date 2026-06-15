package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HD implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C0915Ks A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 113, 124, 125, 119, 72, 116, 121, 97, 122, 121, 123, 115, 93, 106, 106, 119, 106};
    }

    public HD(C0915Ks c0915Ks) {
        this.A00 = c0915Ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HI hi;
        if (BQ.A02(this)) {
            return;
        }
        try {
            hi = this.A00.A00.A0Y;
            hi.AFY(A00(0, 18, 75));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
