package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class NP extends AbstractC2118nc {
    public static byte[] A01;
    public final long A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -11, 12, -76, 7, -3, 14, -7, -76, 1, 9, 7, 8, -76, -10, -7, -76, 4, 3, 7, -3, 8, -3, 10, -7, -76, 2, 9, 1, -10, -7, 6, -75};
    }

    public NP(long j10) {
        if (j10 > 0) {
            this.A00 = j10;
            return;
        }
        throw new IllegalArgumentException(A00(0, 33, 110));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2118nc
    public final boolean A08(File file, long j10, int i10) {
        return j10 <= this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2118nc, com.facebook.ads.redexgen.X.C1O
    public final /* bridge */ /* synthetic */ void AJW(File file) throws IOException {
        super.AJW(file);
    }
}
