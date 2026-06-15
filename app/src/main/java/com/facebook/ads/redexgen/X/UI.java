package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.DrmInitData;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class UI {
    public static byte[] A00;
    public static String[] A01 = {"PbWJcmgEqcJQjjwB6VLPd", "tkTYOWKHragR9UPT1W1nuf", "QVMhx2tT3xErvCLPidA6CjERltcQzimg", "Z2IOdsKIeItRWRPGlNoB9IJnEl", "xLx2nXLuxI6bZJYzHF4Ge", "nA63UMb6dkdF2udehO", "XriuJJGqYAIIEn7GC0jIz65RNx9SnM7V", "55ZVIjHA259pYpYa2UAGgYPDCX4zj5rH"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 27);
            if (A01[1].length() != 22) {
                throw new RuntimeException();
            }
            A01[3] = "kfBlyCDQRkNI";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        byte[] bArr = {42, 62, 47, 34, 36, 100, 61, 37, 47, 101, 47, 63, 56};
        String[] strArr = A01;
        if (strArr[6].charAt(3) == strArr[7].charAt(3)) {
            throw new RuntimeException();
        }
        A01[1] = "vxIvww3gX5SaH4cngqUXEl";
        A00 = bArr;
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, a.f18931n, IronSourceConstants.IS_AD_UNIT_CAPPED, 2560, 2688, 2816, 2823, 2944, 3072, 3840, CodedOutputStream.DEFAULT_BUFFER_SIZE, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int nblks;
        int position = byteBuffer.position();
        int position2 = byteBuffer.get(position);
        switch (position2) {
            case AdSize.AUTO_HEIGHT /* -2 */:
                int position3 = position + 5;
                int i10 = (byteBuffer.get(position3) & 1) << 6;
                int position4 = position + 4;
                nblks = i10 | ((byteBuffer.get(position4) & 252) >> 2);
                break;
            case -1:
                int position5 = position + 4;
                int i11 = (byteBuffer.get(position5) & 7) << 4;
                int position6 = position + 7;
                nblks = i11 | ((byteBuffer.get(position6) & 60) >> 2);
                break;
            case 31:
                int position7 = position + 5;
                int i12 = (byteBuffer.get(position7) & 7) << 4;
                int position8 = position + 6;
                nblks = i12 | ((byteBuffer.get(position8) & 60) >> 2);
                break;
            default:
                int position9 = position + 4;
                int i13 = (byteBuffer.get(position9) & 1) << 6;
                int position10 = position + 5;
                nblks = i13 | ((byteBuffer.get(position10) & 252) >> 2);
                break;
        }
        int position11 = nblks + 1;
        return position11 * 32;
    }

    public static int A01(byte[] bArr) {
        int i10;
        boolean z10 = false;
        switch (bArr[0]) {
            case AdSize.AUTO_HEIGHT /* -2 */:
                i10 = (((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[6] & 240) >> 4)) + 1;
                break;
            case -1:
                i10 = (((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[9] & 60) >> 2)) + 1;
                z10 = true;
                break;
            case 31:
                i10 = (((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[8] & 60) >> 2)) + 1;
                z10 = true;
                break;
            default:
                i10 = (((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[7] & 240) >> 4)) + 1;
                break;
        }
        return z10 ? (i10 * 16) / 14 : i10;
    }

    public static int A02(byte[] bArr) {
        int i10;
        switch (bArr[0]) {
            case AdSize.AUTO_HEIGHT /* -2 */:
                int nblks = bArr[5];
                i10 = ((nblks & 1) << 6) | ((bArr[4] & 252) >> 2);
                break;
            case -1:
                i10 = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
                break;
            case 31:
                i10 = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
                break;
            default:
                i10 = ((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2);
                break;
        }
        int nblks2 = i10 + 1;
        return nblks2 * 32;
    }

    public static ZM A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        int sfreq;
        C1647fp A042 = A04(bArr);
        A042.A09(60);
        int amode = A042.A04(6);
        int rate = A02[amode];
        int amode2 = A042.A04(4);
        int sampleRate = A03[amode2];
        int amode3 = A042.A04(5);
        if (amode3 >= A04.length) {
            sfreq = -1;
        } else {
            int sfreq2 = A04[amode3] * 1000;
            sfreq = sfreq2 / 2;
        }
        A042.A09(10);
        int amode4 = A01[2].charAt(28);
        if (amode4 != 114) {
            String[] strArr = A01;
            strArr[6] = "5t2oPEoC53D4eOMTP8AgHfWh8GQd1j84";
            strArr[7] = "osJtV6zrfIAFnpZO5kwdHchVUF9KsfN4";
            return new P5().A0y(str).A11(A05(0, 13, 80)).A0a(sfreq).A0b(rate + (A042.A04(2) > 0 ? 1 : 0)).A0m(sampleRate).A0u(drmInitData).A10(str2).A14();
        }
        throw new RuntimeException();
    }

    public static C1647fp A04(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C1647fp(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                copyOf[i10] = copyOf[i10 + 1];
                copyOf[i10 + 1] = b10;
            }
        }
        C1647fp c1647fp = new C1647fp(copyOf);
        if (copyOf[0] == 31) {
            C1647fp c1647fp2 = new C1647fp(copyOf);
            while (c1647fp2.A01() >= 16) {
                c1647fp2.A09(2);
                c1647fp.A0B(c1647fp2.A04(14), 14);
            }
        }
        c1647fp.A0D(copyOf);
        if (A01[3].length() != 27) {
            A01[5] = "X6d7Dq6RdGkC6amMRe";
            return c1647fp;
        }
        throw new RuntimeException();
    }

    public static boolean A07(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
