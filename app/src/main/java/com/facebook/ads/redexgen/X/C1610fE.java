package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.fE  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1610fE {
    public static byte[] A04;
    public static String[] A05 = {"1wyZbVqSUEJVoNG7PV0F0wU84tMzpskM", "1tLWmpCTmQBDbg1NCfVeIDUZ", "zSJQjbK4RXnpukTjj7aiH8ZxU9zMfWNo", "ONfjwOEe6DQFrmTWlbvZ4dpZ30zJWh57", "HLczMI", "iMFJRtixmdZqvTue6kW7JPGFrVPSgVs9", "hMQl0KwSfHrSPR6OcHxnbCfUvisUITrX", "7mAwqmZzZfOrAHZV04F6r35tqP3ev7sr"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 38);
            if (A05[4].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "G61Ig15gnJL0jpTaRQDM3x7iAqZJqs85";
            strArr[2] = "pYoLxA93zhlSqYT3gDlAoMN0UyYRQagZ";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{40, 37, 41, 39, 40, 52, 96, 45, 53, 51, 52, 96, 34, 37, 96, 48, 47, 51, 41, 52, 41, 54, 37, 108, 96, 34, 53, 52, 96, 41, 51, 122, 96, 115, 109, 96, 112, 108, 36, 105, 113, 119, 112, 36, 102, 97, 36, 116, 107, 119, 109, 112, 109, 114, 97, 40, 36, 102, 113, 112, 36, 109, 119, 62, 36};
    }

    static {
        A01();
    }

    @MetaExoPlayerCustomization("Should be private but left public for backward compat")
    public C1610fE(int i10, int i11, float f10, long j10) {
        AbstractC1589es.A09(i10 > 0, A00(33, 32, 34) + i10);
        AbstractC1589es.A09(i11 > 0, A00(0, 33, 102) + i11);
        this.A02 = i10;
        this.A01 = i11;
        this.A00 = f10;
        this.A03 = j10;
    }
}
