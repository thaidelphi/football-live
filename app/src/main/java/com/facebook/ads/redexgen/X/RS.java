package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RS implements ZX {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{67, 85, 83, 69, 66, 85, 29, 64, 92, 81, 73, 82, 81, 83, 91, 3, 28, 17, 16, 26, 90, 20, 3, 22};
    }

    public RS() {
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final int A7F() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final MediaCodecInfo A7G(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final boolean AAG(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final boolean AAH(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, 4).equals(str) && A00(15, 9, 65).equals(str2);
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final boolean AIA() {
        return false;
    }
}
