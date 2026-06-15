package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class UV {
    public static byte[] A02;
    public static final Pattern A03;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{26, 100, 31, 116, 105, 125, 37, 105, 34, 5, 105, 2, 25, 63, 124, 57, 100, 108, 31, 116, 105, 125, 37, 105, 34, 5, 105, 2, 25, 63, 124, 57, 109, 100, 108, 31, 116, 105, 125, 37, 105, 34, 5, 105, 2, 25, 63, 124, 57, 109, 23, 27, 25, 90, 21, 4, 4, 24, 17, 90, 29, 32, 1, 26, 17, 7, 104, 85, 116, 111, 82, 76, 81, 67};
    }

    static {
        A01();
        A03 = Pattern.compile(A00(0, 50, 95));
    }

    private boolean A02(String str) {
        Matcher matcher = A03.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) AbstractC1672gE.A0f(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) AbstractC1672gE.A0f(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.A00 = parseInt;
                    this.A01 = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i10) {
        int encoderPadding = i10 >> 12;
        int encoderDelay = i10 & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(com.google.android.exoplayer2.Metadata r9) {
        /*
            r8 = this;
            r3 = 0
        L1:
            int r0 = r9.A02()
            if (r3 >= r0) goto L59
            com.google.android.exoplayer2.Metadata$Entry r5 = r9.A03(r3)
            boolean r7 = r5 instanceof com.google.android.exoplayer2.extractor.metadata.id3.CommentFrame
            r2 = 66
            r1 = 8
            r0 = 26
            java.lang.String r6 = A00(r2, r1, r0)
            r4 = 1
            if (r7 == 0) goto L2d
            com.google.android.exoplayer2.extractor.metadata.id3.CommentFrame r5 = (com.google.android.exoplayer2.extractor.metadata.id3.CommentFrame) r5
            java.lang.String r0 = r5.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = r5.A02
            boolean r0 = r8.A02(r0)
            if (r0 == 0) goto L56
            return r4
        L2d:
            boolean r0 = r5 instanceof com.google.android.exoplayer2.extractor.metadata.id3.InternalFrame
            if (r0 == 0) goto L56
            com.google.android.exoplayer2.extractor.metadata.id3.InternalFrame r5 = (com.google.android.exoplayer2.extractor.metadata.id3.InternalFrame) r5
            r2 = 50
            r1 = 16
            r0 = 111(0x6f, float:1.56E-43)
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.String r0 = r5.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = r5.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = r5.A02
            boolean r0 = r8.A02(r0)
            if (r0 == 0) goto L56
            return r4
        L56:
            int r3 = r3 + 1
            goto L1
        L59:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A05(com.google.android.exoplayer2.Metadata):boolean");
    }
}
