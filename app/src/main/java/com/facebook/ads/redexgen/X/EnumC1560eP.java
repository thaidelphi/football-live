package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
@MetaExoPlayerCustomization
/* renamed from: com.facebook.ads.redexgen.X.eP  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public enum EnumC1560eP {
    A04,
    A03,
    A05,
    A02;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-59, -54, -59, -48, -37, -49, -63, -61, -55, -63, -54, -48, -6, -10, -21, 3, -20, -21, -19, -11, -56, -54, -67, -66, -67, -52, -69, -64, -111, -118, -121, -118, -117, -109, -118};
    }

    static {
        A01();
    }
}
