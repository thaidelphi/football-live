package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.DrmInitData;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class U2 {
    public static byte[] A00;
    public static String[] A01 = {"amtfipPJXqbID3qciNhCcWM0z9C7zGoD", "d1gDYDxAXfWbX", "t0EiutZTdECLVorbnwf6N4L3pftY", "pSeWGxIua7WPL", "mNg3t075ZsYRB0CFmmB8fYa9Y1wi7PXR", "BSRaK4CY9XBnXUn8Uw0BU1", "fW", "UklDjf4ac9mxv3mWCitICuMuBFHjQK1f"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "yPHC1Z2aanSlHOcPKgR4GK";
            strArr2[2] = "DDC5UVOzRYKGdAmtnCQ0C757duVd";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 77);
            i13++;
        }
    }

    public static void A0B() {
        if (A01[4].charAt(20) == 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "hh4Nh9y0LLUASInEpTHprO";
        strArr[2] = "Fibu6iPU4dNIs1JtLXKzgxrTgci1";
        A00 = new byte[]{33, 53, 36, 41, 47, 111, 33, 35, 115, 21, 1, 16, 29, 27, 91, 17, 21, 23, 71, 63, 43, 58, 55, 49, 113, 59, 63, 61, 109, 115, 52, 49, 61};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
        A07 = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, IronSourceConstants.RV_CALLBACK_AD_CLICKED, 1253, 1393};
    }

    public static int A00(int i10, int i11) {
        int sampleRate = i11 / 2;
        if (i10 >= 0) {
            int halfFrmsizecod = A05.length;
            if (i10 >= halfFrmsizecod || i11 < 0) {
                return -1;
            }
            int halfFrmsizecod2 = A07.length;
            if (sampleRate >= halfFrmsizecod2) {
                return -1;
            }
            int bitrate = A05[i10];
            if (bitrate == 44100) {
                int halfFrmsizecod3 = i11 % 2;
                return (A07[sampleRate] + halfFrmsizecod3) * 2;
            }
            int sampleRate2 = A02[sampleRate];
            if (bitrate == 32000) {
                int halfFrmsizecod4 = sampleRate2 * 6;
                return halfFrmsizecod4;
            }
            int halfFrmsizecod5 = sampleRate2 * 4;
            return halfFrmsizecod5;
        }
        return -1;
    }

    public static int A01(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int A02(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i10 = startIndex - 10;
        for (int i11 = position; i11 <= i10; i11++) {
            int startIndex2 = i11 + 4;
            int endIndex = AbstractC1672gE.A0F(byteBuffer, startIndex2) & (-2);
            if (endIndex == -126718022) {
                return i11 - position;
            }
        }
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        int numblkscod = 3;
        boolean isEac3 = ((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10;
        if (isEac3) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                int position = byteBuffer.position();
                String[] strArr = A01;
                String str = strArr[1];
                String str2 = strArr[3];
                int numblkscod2 = str.length();
                if (numblkscod2 != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[1] = "mg940SBvSwrjl";
                strArr2[3] = "BxEODy628ZWYr";
                numblkscod = (byteBuffer.get(position + 4) & 48) >> 4;
            }
            return A03[numblkscod] * 256;
        }
        return 1536;
    }

    public static int A04(ByteBuffer byteBuffer, int i10) {
        boolean z10 = (byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187;
        int position = byteBuffer.position();
        String[] strArr = A01;
        if (strArr[5].length() != strArr[2].length()) {
            A01[4] = "P5Sx2xa5kfdEzRWOhniQLifJ0MOZOLfb";
            return 40 << ((byteBuffer.get((position + i10) + (z10 ? 9 : 8)) >> 4) & 7);
        }
        throw new RuntimeException();
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        boolean isEac3 = ((bArr[5] & 248) >> 3) > 10;
        if (isEac3) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        int i10 = (bArr[4] & 192) >> 6;
        int i11 = bArr[4] & 63;
        String[] strArr = A01;
        String str = strArr[1];
        String str2 = strArr[3];
        int fscod = str.length();
        if (fscod != str2.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "RPnRKnRsxiZSI3TxYT9wwSOvnBJ7yBMT";
        strArr2[0] = "bf7cYHxPsGw5m3JFcbTQL9k7BLimjlTN";
        return A00(i10, i11);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114) {
            byte b10 = bArr[6];
            if (A01[6].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "9J4etDzoH8863";
            strArr[3] = "cVZ7q6a3PMeEI";
            if (b10 == 111 && (bArr[7] & 254) == 186) {
                return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static ZM A07(C1648fq c1648fq, String str, String str2, DrmInitData drmInitData) {
        C1647fp c1647fp = new C1647fp();
        c1647fp.A0C(c1648fq);
        int fscod = c1647fp.A04(2);
        int constantBitrate = A05[fscod];
        c1647fp.A09(8);
        int i10 = A04[c1647fp.A04(3)];
        if (c1647fp.A04(1) != 0) {
            i10++;
        }
        int fscod2 = c1647fp.A04(5);
        int halfFrmsizecod = A02[fscod2] * 1000;
        c1647fp.A06();
        c1648fq.A0f(c1647fp.A02());
        return new P5().A0y(str).A11(A0A(0, 9, 13)).A0b(i10).A0m(constantBitrate).A0u(drmInitData).A10(str2).A0a(halfFrmsizecod).A0j(halfFrmsizecod).A14();
    }

    public static ZM A08(C1648fq c1648fq, String str, String str2, DrmInitData drmInitData) {
        C1647fp c1647fp = new C1647fp();
        c1647fp.A0C(c1648fq);
        int fscod = c1647fp.A04(13) * 1000;
        c1647fp.A09(3);
        int peakBitrate = c1647fp.A04(2);
        int sampleRate = A05[peakBitrate];
        c1647fp.A09(10);
        int channelCount = A04[c1647fp.A04(3)];
        if (c1647fp.A04(1) != 0) {
            channelCount++;
        }
        c1647fp.A09(3);
        int A042 = c1647fp.A04(4);
        c1647fp.A09(1);
        if (A042 > 0) {
            c1647fp.A0A(6);
            if (c1647fp.A04(1) != 0) {
                channelCount += 2;
            }
            c1647fp.A09(1);
        }
        String A0A = A0A(9, 10, 57);
        int peakBitrate2 = c1647fp.A01();
        if (peakBitrate2 > 7) {
            c1647fp.A09(7);
            if (c1647fp.A04(1) != 0) {
                A0A = A0A(19, 14, 19);
            }
        }
        c1647fp.A06();
        c1648fq.A0f(c1647fp.A02());
        return new P5().A0y(str).A11(A0A).A0b(channelCount).A0m(sampleRate).A0u(drmInitData).A10(str2).A0j(fscod).A14();
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0205, code lost:
        if (r15 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0207, code lost:
        r22.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x020e, code lost:
        if (r22.A0H() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0210, code lost:
        r22.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0217, code lost:
        if (r22.A0H() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0219, code lost:
        r22.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0220, code lost:
        if (r22.A0H() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0226, code lost:
        if (r22.A0H() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0228, code lost:
        r22.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x022f, code lost:
        if (r22.A0H() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0231, code lost:
        r22.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x026a, code lost:
        if (r15 != false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.U1 A09(com.facebook.ads.redexgen.X.C1647fp r22) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.U2.A09(com.facebook.ads.redexgen.X.fp):com.facebook.ads.redexgen.X.U1");
    }
}
