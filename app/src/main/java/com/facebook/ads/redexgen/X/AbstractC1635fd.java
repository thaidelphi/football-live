package com.facebook.ads.redexgen.X;

import android.media.MediaFormat;
import com.google.android.exoplayer2.ColorInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.fd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1635fd {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-83, -71, -74, -71, -68, 119, -68, -85, -72, -79, -81, -33, -21, -24, -21, -18, -87, -17, -16, -35, -22, -32, -35, -18, -32, -108, -96, -99, -96, -93, 94, -91, -93, -110, -97, -92, -105, -106, -93, -13, 3, -12, -67, -47, -51, -37, -106, -36, -35, -54, -35, -46, -52, -106, -46, -41, -49, -40};
    }

    public static void A02(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(25, 14, 31), colorInfo.A03);
            A04(mediaFormat, A00(11, 14, 106), colorInfo.A02);
            A04(mediaFormat, A00(0, 11, 56), colorInfo.A01);
            A05(mediaFormat, A00(43, 15, 87), colorInfo.A04);
        }
    }

    public static void A03(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void A04(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void A05(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(android.media.MediaFormat r5, java.util.List<byte[]> r6) {
        /*
            r4 = 0
        L1:
            int r0 = r6.size()
            if (r4 >= r0) goto L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 39
            r1 = 4
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.lang.Object r0 = r6.get(r4)
            byte[] r0 = (byte[]) r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r5.setByteBuffer(r1, r0)
            int r4 = r4 + 1
            goto L1
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1635fd.A06(android.media.MediaFormat, java.util.List):void");
    }
}
