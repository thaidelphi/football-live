package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.DrmInitData;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class U5 {
    public static byte[] A00;
    public static String[] A01 = {"EDbMaNnOAmY0RUAoa81bsdHC4j8WXcgq", "SWG1KqVOkRlJj5xaFJLXfgvDZGcLop9W", "NnVJgvXVZSo8y", "MZutOzUHR9f6ofw4F9B4zZrhWVwaux2f", "iJqNP9fc7gU428pJE5yolgtY1lT8LdOq", "d47YjnRvT4PZseum75lZj5V30Q4jd", "", "7qpAsdx1ZTRXxrWBJjlVhK3OYLOnnJkC"};
    public static final int[] A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static U4 A04(C1647fp c1647fp) {
        int A04 = c1647fp.A04(16);
        int A042 = c1647fp.A04(16);
        int i10 = 0 + 2 + 2;
        if (A042 == 65535) {
            A042 = c1647fp.A04(24);
            i10 += 3;
        }
        int i11 = A042 + i10;
        if (A04 == 44097) {
            i11 += 2;
        }
        int A043 = c1647fp.A04(2);
        if (A043 == 3) {
            A043 += A00(c1647fp, 2);
        }
        int A044 = c1647fp.A04(10);
        if (c1647fp.A0H() && c1647fp.A04(3) > 0) {
            c1647fp.A09(2);
        }
        int i12 = c1647fp.A0H() ? 48000 : 44100;
        int A045 = c1647fp.A04(4);
        int i13 = 0;
        if (i12 != 44100 || A045 != 13) {
            if (i12 == 48000 && A045 < A02.length) {
                i13 = A02[A045];
                switch (A044 % 5) {
                    case 1:
                    case 3:
                        if (A045 == 3 || A045 == 8) {
                            i13++;
                            break;
                        }
                    case 2:
                        if (A045 == 8 || A045 == 11) {
                            i13++;
                            break;
                        }
                    case 4:
                        if (A045 == 3 || A045 == 8 || A045 == 11) {
                            i13++;
                            break;
                        }
                }
            }
        } else {
            i13 = A02[A045];
        }
        return new U4(A043, 2, i12, i11, i13);
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 61);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{104, 124, 109, 96, 102, 38, 104, 106, 61};
    }

    static {
        A06();
        A02 = new int[]{2002, 2000, 1920, IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1001, 1000, 960, 800, 800, 480, CommonGatewayClient.CODE_400, CommonGatewayClient.CODE_400, a.f18931n};
    }

    public static int A00(C1647fp c1647fp, int i10) {
        int i11 = 0;
        while (true) {
            int value = c1647fp.A04(i10);
            int i12 = i11 + value;
            boolean A0H = c1647fp.A0H();
            if (A01[2].length() == 18) {
                throw new RuntimeException();
            }
            A01[2] = "TxTKr2zZZb";
            if (!A0H) {
                return i12;
            }
            i11 = (i12 + 1) << i10;
        }
    }

    public static int A01(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return A04(new C1647fp(bArr)).A03;
    }

    public static int A02(byte[] bArr, int i10) {
        if (bArr.length < 7) {
            return -1;
        }
        int headerSize = bArr[2];
        int i11 = (headerSize & 255) << 8;
        int headerSize2 = bArr[3];
        int i12 = i11 | (headerSize2 & 255);
        int i13 = 2 + 2;
        if (i12 == 65535) {
            int headerSize3 = bArr[4];
            int i14 = (headerSize3 & 255) << 16;
            int headerSize4 = bArr[5];
            int i15 = i14 | ((headerSize4 & 255) << 8);
            int headerSize5 = bArr[6];
            i12 = i15 | (headerSize5 & 255);
            i13 += 3;
        }
        if (i10 == 44097) {
            i13 += 2;
        }
        return i12 + i13;
    }

    public static ZM A03(C1648fq c1648fq, String str, String str2, DrmInitData drmInitData) {
        c1648fq.A0g(1);
        return new P5().A0y(str).A11(A05(0, 9, 52)).A0b(2).A0m(((c1648fq.A0I() & 32) >> 5) == 1 ? 48000 : 44100).A0u(drmInitData).A10(str2).A14();
    }

    public static void A07(int i10, C1648fq c1648fq) {
        c1648fq.A0d(7);
        byte[] A0l = c1648fq.A0l();
        A0l[0] = -84;
        A0l[1] = 64;
        A0l[2] = -1;
        A0l[3] = -1;
        A0l[4] = (byte) ((i10 >> 16) & 255);
        A0l[5] = (byte) ((i10 >> 8) & 255);
        A0l[6] = (byte) (i10 & 255);
    }
}
