package com.facebook.ads.redexgen.X;

import com.ironsource.j3;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class S1 implements YX {
    public static byte[] A0C;
    public static String[] A0D = {"GlNYRdnBxpEZJHTmMw8HueWs8TUgF8mx", "DZB0tNKpfPCQm9F58sqvYmE8zou9iH17", "vxjUGxAul7dZiFBoxlBvfuM1YbshqPrL", "fX3qtCJcU4RF1QOu4NrXdj2JBifTXmfF", "1OTGwlxmQxEP4IoFSBbVBHiS7Xa3eUxq", "EC9WmiNEUEi6mM3sm24w10cpBWlJZ6V6", "2eAqdYDcmn5PCvNLyzkv4hU0NwVBiYXy", "KQaEe8"};
    public static final int[] A0E;
    public static final int[] A0F;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final ZM A06;
    public final UL A07;
    public final InterfaceC1157Uo A08;
    public final YZ A09;
    public final C1648fq A0A;
    public final byte[] A0B;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{3, -24, 47, 55, 60, 2, -24, -99, -48, -56, -67, -69, -52, -67, -68, 120, -66, -54, -71, -59, -67, -53, 120, -56, -67, -54, 120, -70, -60, -57, -69, -61, -110, 120, -55, -35, -52, -47, -41, -105, -38, -55, -33};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = this.A09.A02;
        int i13 = this.A09.A05;
        int i14 = (i11 * 4) + (i10 * i12);
        int i15 = (i13 * 4) + i14;
        int i16 = (i12 / i13) - 4;
        int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
        int min = Math.min(bArr[i14 + 2] & 255, 88);
        int i18 = A0F[min];
        int i19 = ((this.A04 * i10 * i13) + i11) * 2;
        bArr2[i19] = (byte) (i17 & 255);
        bArr2[i19 + 1] = (byte) (i17 >> 8);
        for (int i20 = 0; i20 < i16 * 2; i20++) {
            int i21 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & 255;
            int i22 = i20 % 2;
            if (A0D[4].charAt(3) != 'a') {
                A0D[4] = "VWjYtUhpws3Seo7KXu2jCuIUARlH7Z52";
                int i23 = i22 == 0 ? i21 & 15 : i21 >> 4;
                int i24 = i23 & 7;
                if (A0D[7].length() == 6) {
                    A0D[7] = "1zSQp8";
                    int i25 = (((i24 * 2) + 1) * i18) >> 3;
                    if ((i23 & 8) != 0) {
                        i25 = -i25;
                    }
                    i17 = AbstractC1672gE.A07(i17 + i25, -32768, 32767);
                    i19 += i13 * 2;
                    bArr2[i19] = (byte) (i17 & 255);
                    bArr2[i19 + 1] = (byte) (i17 >> 8);
                    min = AbstractC1672gE.A07(min + A0E[i23], 0, A0F.length - 1);
                    i18 = A0F[min];
                    if (A0D[4].charAt(3) == 'a') {
                        throw new RuntimeException();
                    }
                    A0D[7] = "lPO6i5";
                }
            }
            throw new RuntimeException();
        }
    }

    static {
        A04();
        A0E = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        A0F = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, j3.a.b.f17903h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    }

    public S1(UL ul, InterfaceC1157Uo interfaceC1157Uo, YZ yz) throws Q6 {
        this.A07 = ul;
        this.A08 = interfaceC1157Uo;
        this.A09 = yz;
        this.A05 = Math.max(1, yz.A04 / 10);
        C1648fq scratch = new C1648fq(yz.A06);
        scratch.A0G();
        this.A04 = scratch.A0G();
        int i10 = yz.A05;
        int i11 = (((yz.A02 - (i10 * 4)) * 8) / (yz.A01 * i10)) + 1;
        if (this.A04 == i11) {
            int numChannels = AbstractC1672gE.A05(this.A05, this.A04);
            this.A0B = new byte[yz.A02 * numChannels];
            int maxBlocksToDecode = A02(this.A04, i10);
            this.A0A = new C1648fq(maxBlocksToDecode * numChannels);
            int maxBlocksToDecode2 = yz.A04;
            int constantBitrate = ((maxBlocksToDecode2 * yz.A02) * 8) / this.A04;
            this.A06 = new P5().A11(A03(34, 9, 18)).A0a(constantBitrate).A0j(constantBitrate).A0h(A02(this.A05, i10)).A0b(yz.A05).A0m(yz.A04).A0i(2).A14();
            return;
        }
        throw Q6.A01(A03(7, 27, 2) + i11 + A03(0, 7, 114) + this.A04, null);
    }

    private int A00(int i10) {
        return i10 / (this.A09.A05 * 2);
    }

    private int A01(int i10) {
        return A02(i10, this.A09.A05);
    }

    public static int A02(int i10, int i11) {
        return i10 * 2 * i11;
    }

    private void A05(int i10) {
        int A01 = A01(i10);
        this.A08.AI0(this.A03 + AbstractC1672gE.A0U(this.A02, 1000000L, this.A09.A04), 1, A01, this.A01 - A01, null);
        long timeUs = i10;
        this.A02 += timeUs;
        this.A01 -= A01;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(byte[] r4, int r5, com.facebook.ads.redexgen.X.C1648fq r6) {
        /*
            r3 = this;
            r2 = 0
        L1:
            if (r2 >= r5) goto L17
            r1 = 0
        L4:
            com.facebook.ads.redexgen.X.YZ r0 = r3.A09
            int r0 = r0.A05
            if (r1 >= r0) goto L14
            byte[] r0 = r6.A0l()
            r3.A06(r4, r2, r1, r0)
            int r1 = r1 + 1
            goto L4
        L14:
            int r2 = r2 + 1
            goto L1
        L17:
            int r0 = r3.A04
            int r0 = r0 * r5
            int r1 = r3.A01(r0)
            r0 = 0
            r6.A0f(r0)
            r6.A0e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.S1.A07(byte[], int, com.facebook.ads.redexgen.X.fq):void");
    }

    @Override // com.facebook.ads.redexgen.X.YX
    public final void A9y(int i10, long j10) {
        this.A07.AID(new C1087Rq(this.A09, this.A04, i10, j10));
        this.A08.A6U(this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.YX
    public final void AHq(long j10) {
        this.A00 = 0;
        this.A03 = j10;
        this.A01 = 0;
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.YX
    public final boolean AHz(WJ wj, long j10) throws IOException {
        int A00 = this.A05 - A00(this.A01);
        int targetFramesRemaining = this.A04;
        int blocksToDecode = AbstractC1672gE.A05(A00, targetFramesRemaining);
        int i10 = this.A09.A02 * blocksToDecode;
        int targetFramesRemaining2 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z10 = targetFramesRemaining2 == 0;
        while (!z10) {
            int targetFramesRemaining3 = this.A00;
            if (targetFramesRemaining3 >= i10) {
                break;
            }
            int targetFramesRemaining4 = this.A00;
            int targetReadBytes = (int) Math.min(i10 - targetFramesRemaining4, j10);
            byte[] bArr = this.A0B;
            int targetFramesRemaining5 = this.A00;
            int blocksToDecode2 = wj.read(bArr, targetFramesRemaining5, targetReadBytes);
            if (blocksToDecode2 == -1) {
                z10 = true;
            } else {
                int targetFramesRemaining6 = this.A00;
                this.A00 = targetFramesRemaining6 + blocksToDecode2;
            }
        }
        int targetReadBytes2 = this.A00;
        int targetFramesRemaining7 = this.A09.A02;
        int targetReadBytes3 = targetReadBytes2 / targetFramesRemaining7;
        if (targetReadBytes3 > 0) {
            A07(this.A0B, targetReadBytes3, this.A0A);
            int blocksToDecode3 = this.A00;
            int targetFramesRemaining8 = this.A09.A02;
            this.A00 = blocksToDecode3 - (targetFramesRemaining8 * targetReadBytes3);
            int targetReadBytes4 = this.A0A.A0A();
            this.A08.AHx(this.A0A, targetReadBytes4);
            int targetFramesRemaining9 = this.A01;
            this.A01 = targetFramesRemaining9 + targetReadBytes4;
            int targetFramesRemaining10 = this.A01;
            int blocksToDecode4 = A00(targetFramesRemaining10);
            int targetFramesRemaining11 = this.A05;
            if (blocksToDecode4 >= targetFramesRemaining11) {
                int targetFramesRemaining12 = this.A05;
                A05(targetFramesRemaining12);
            }
        }
        if (z10) {
            int targetFramesRemaining13 = this.A01;
            int targetFramesRemaining14 = A00(targetFramesRemaining13);
            if (targetFramesRemaining14 > 0) {
                A05(targetFramesRemaining14);
            }
        }
        return z10;
    }
}
