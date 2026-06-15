package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.DrmInitData;
import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.extractor.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.extractor.metadata.mp4.SmtaMetadataEntry;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class WB {
    public static byte[] A00;
    public static String[] A01 = {"Rq8K3x9U6U1qnsB", "LPhciFlpISIohAYgfLC9bA1lF1kOL0Ev", "9Kwqffs0Fu7WvZLbN9VIaI08fq6D4cO", "IaUK2p7UOiGFLn9kVW8ZQ0f1En4DcOpn", "T7xi50LT", "hTsCLy", "XofUw9hlRhPN5LS3KR6wPxIXKAHFL8lH", "VM2F9Bf6TO1x13KEVoDanTgaEcENkxzJ"};
    public static final byte[] A02;
    @MetaExoPlayerCustomization("Needed for oculus customization")
    public static final int[] A03;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x017d, code lost:
        if (r9 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017f, code lost:
        r5.A09(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0186, code lost:
        if (r5.A0H() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0188, code lost:
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0189, code lost:
        if (r0 <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018f, code lost:
        if (r5.A0H() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0191, code lost:
        r5.A09(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0194, code lost:
        if (r9 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0196, code lost:
        r5.A09(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0199, code lost:
        r5.A09(3);
        r0 = r5.A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a0, code lost:
        if (r7 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a2, code lost:
        if (r0 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a4, code lost:
        r5.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a7, code lost:
        if (r7 == 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ad, code lost:
        if (r5.A0H() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01af, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b4, code lost:
        if (r5.A0H() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b6, code lost:
        r4 = r5.A04(8);
        r3 = r5.A04(8);
        r1 = r5.A04(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c4, code lost:
        if (r2 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c7, code lost:
        if (r4 != 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cb, code lost:
        if (r3 != 13) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cd, code lost:
        if (r1 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01cf, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d0, code lost:
        r1 = r6.A01(com.google.android.exoplayer2.ColorInfo.A00(r4));
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d9, code lost:
        if (r2 != 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01db, code lost:
        r1.A00(r0).A02(com.google.android.exoplayer2.ColorInfo.A01(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ea, code lost:
        return r6.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01eb, code lost:
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
        r2 = r5.A04(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f3, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f5, code lost:
        r0 = r5.A04(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fa, code lost:
        if (r9 != false) goto L49;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.ColorInfo A0B(com.facebook.ads.redexgen.X.C1648fq r10) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A0B(com.facebook.ads.redexgen.X.fq):com.google.android.exoplayer2.ColorInfo");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Metadata A0C(C1134Tm c1134Tm) {
        C1133Tl A032 = c1134Tm.A03(1751411826);
        C1133Tl A033 = c1134Tm.A03(1801812339);
        C1133Tl A034 = c1134Tm.A03(1768715124);
        if (A032 == null || A033 == null || A034 == null || A03(A032.A00) != 1835299937) {
            return null;
        }
        C1648fq c1648fq = A033.A00;
        c1648fq.A0f(12);
        int A0C = c1648fq.A0C();
        String[] strArr = new String[A0C];
        for (int i10 = 0; i10 < A0C; i10++) {
            int A0C2 = c1648fq.A0C();
            c1648fq.A0g(4);
            strArr[i10] = c1648fq.A0W(A0C2 - 8);
        }
        C1648fq c1648fq2 = A034.A00;
        c1648fq2.A0f(8);
        ArrayList arrayList = new ArrayList();
        while (c1648fq2.A07() > 8) {
            int A09 = c1648fq2.A09();
            int A0C3 = c1648fq2.A0C();
            int A0C4 = c1648fq2.A0C() - 1;
            if (A0C4 < 0 || A0C4 >= strArr.length) {
                AbstractC1633fb.A07(A0M(178, 11, 31), A0M(359, 41, 109) + A0C4);
            } else {
                MdtaMetadataEntry A092 = WM.A09(c1648fq2, A09 + A0C3, strArr[A0C4]);
                if (A092 != null) {
                    arrayList.add(A092);
                }
            }
            c1648fq2.A0f(A09 + A0C3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (A0M(989, 13, 85).equals(r7) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
        if (A0M(1002, 16, 49).equals(r7) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
        if (A0M(989, 13, 85).equals(r7) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
        r13.A0g(4);
        r11 = r13.A0Q();
        r9 = r13.A0Q();
        r13.A0g(1);
        r1 = A02(r13);
        r8 = new byte[r1];
        r13.A0k(r8, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
        if (r9 <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
        if (r11 <= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
        r2 = com.facebook.ads.redexgen.X.WB.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
        if (r2[7].charAt(7) == r2[6].charAt(7)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
        com.facebook.ads.redexgen.X.WB.A01[2] = "I3o6H82Kvv0jVLLV1Q0zKrUjQbe4GJG";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
        return new com.facebook.ads.redexgen.X.W7(r7, r8, r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0100, code lost:
        com.facebook.ads.redexgen.X.WB.A01[1] = "PfTSBEnqsXODLHGQCFE6C5fFllaC2Ds3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010a, code lost:
        return new com.facebook.ads.redexgen.X.W7(r7, r8, r9, r11);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.W7 A0G(com.facebook.ads.redexgen.X.C1648fq r13, int r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A0G(com.facebook.ads.redexgen.X.fq, int):com.facebook.ads.redexgen.X.W7");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static WA A0I(C1648fq c1648fq) {
        long A0Q;
        c1648fq.A0f(8);
        int A032 = W5.A03(c1648fq.A0C());
        c1648fq.A0g(A032 == 0 ? 8 : 16);
        int A0C = c1648fq.A0C();
        c1648fq.A0g(4);
        boolean z10 = true;
        int A09 = c1648fq.A09();
        int i10 = A032 == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            } else if (c1648fq.A0l()[A09 + i11] != -1) {
                z10 = false;
                break;
            } else {
                i11++;
            }
        }
        if (z10) {
            c1648fq.A0g(i10);
            A0Q = -9223372036854775807L;
        } else {
            A0Q = A032 == 0 ? c1648fq.A0Q() : c1648fq.A0R();
            if (A0Q == 0) {
                A0Q = -9223372036854775807L;
            }
        }
        c1648fq.A0g(16);
        int A0C2 = c1648fq.A0C();
        int A0C3 = c1648fq.A0C();
        c1648fq.A0g(4);
        int A0C4 = c1648fq.A0C();
        int A0C5 = c1648fq.A0C();
        return new WA(A0C, A0Q, (A0C2 == 0 && A0C3 == 65536 && A0C4 == (-65536) && A0C5 == 0) ? 90 : (A0C2 == 0 && A0C3 == (-65536) && A0C4 == 65536 && A0C5 == 0) ? 270 : (A0C2 == (-65536) && A0C3 == 0 && A0C4 == 0 && A0C5 == (-65536)) ? 180 : 0);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
    public static WZ A0J(C1134Tm c1134Tm, C1133Tl c1133Tl, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws Q6 {
        int i10;
        int i11;
        int i12;
        C1134Tm A022;
        Pair<long[], long[]> A06;
        long j11 = j10;
        C1134Tm c1134Tm2 = (C1134Tm) AbstractC1589es.A01(c1134Tm.A02(1835297121));
        int A012 = A01(A03(((C1133Tl) AbstractC1589es.A01(c1134Tm2.A03(1751411826))).A00));
        if (A012 == -1) {
            return null;
        }
        WA A0I = A0I(((C1133Tl) AbstractC1589es.A01(c1134Tm.A03(1953196132))).A00);
        if (j11 == -9223372036854775807L) {
            j11 = A0I.A02;
        }
        long A05 = A05(c1133Tl.A00);
        long A0U = j11 == -9223372036854775807L ? -9223372036854775807L : AbstractC1672gE.A0U(j11, 1000000L, A05);
        Pair<Long, String> A08 = A08(((C1133Tl) AbstractC1589es.A01(c1134Tm2.A03(1835296868))).A00);
        C1133Tl A032 = ((C1134Tm) AbstractC1589es.A01(((C1134Tm) AbstractC1589es.A01(c1134Tm2.A02(1835626086))).A02(1937007212))).A03(1937011556);
        if (A032 != null) {
            C1648fq c1648fq = A032.A00;
            i10 = A0I.A00;
            i11 = A0I.A01;
            if (A01[0].length() != 15) {
                throw new RuntimeException();
            }
            A01[2] = "a6ThQLXS6v4ushcCg6g8wxrktGFbglX";
            W9 A0H = A0H(c1648fq, i10, i11, (String) A08.second, drmInitData, z11);
            long[] jArr = null;
            long[] jArr2 = null;
            if (!z10 && (A022 = c1134Tm.A02(1701082227)) != null && (A06 = A06(A022)) != null) {
                jArr = (long[]) A06.first;
                jArr2 = (long[]) A06.second;
            }
            if (A0H.A02 == null) {
                return null;
            }
            i12 = A0I.A00;
            return new WZ(i12, A012, ((Long) A08.first).longValue(), A05, A0U, A0H.A02, A0H.A01, A0H.A03, A0H.A00, jArr, jArr2);
        }
        throw Q6.A01(A0M(288, 63, 18), null);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1193Wa A0K(C1648fq c1648fq, int i10, int i11, String str) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            c1648fq.A0f(i12);
            int A0C = c1648fq.A0C();
            String[] strArr = A01;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "8GqC4jKazID6TYn9yHMRqPRobgfBBppl";
            strArr2[6] = "EzboqIVZPLANqj38Rkusn15qKaQ0PsH6";
            if (c1648fq.A0C() == 1952804451) {
                int A032 = W5.A03(c1648fq.A0C());
                c1648fq.A0g(1);
                int i13 = 0;
                int i14 = 0;
                if (A032 == 0) {
                    c1648fq.A0g(1);
                } else {
                    int A0I = c1648fq.A0I();
                    i13 = (A0I & 240) >> 4;
                    i14 = A0I & 15;
                }
                boolean z10 = c1648fq.A0I() == 1;
                int A0I2 = c1648fq.A0I();
                byte[] bArr = new byte[16];
                c1648fq.A0k(bArr, 0, bArr.length);
                byte[] bArr2 = null;
                if (z10 && A0I2 == 0) {
                    int A0I3 = c1648fq.A0I();
                    bArr2 = new byte[A0I3];
                    c1648fq.A0k(bArr2, 0, A0I3);
                }
                return new C1193Wa(z10, str, A0I2, bArr, i13, i14, bArr2);
            }
            i12 += A0C;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x04b8, code lost:
        if (r5 == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04bc, code lost:
        if (r7 == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04c3, code lost:
        if (r5 > 2147483647L) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04c7, code lost:
        if (r7 > 2147483647L) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04c9, code lost:
        r36.A00 = (int) r5;
        r36.A01 = (int) r7;
        com.facebook.ads.redexgen.X.AbstractC1672gE.A13(r20, 1000000, r0.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04fa, code lost:
        return new com.facebook.ads.redexgen.X.C1195Wc(r34, r17, r18, r16, r20, r19, com.facebook.ads.redexgen.X.AbstractC1672gE.A0U(r0.A08[0], 1000000, r0.A05));
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0519, code lost:
        if (r5 == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x053a, code lost:
        if (r6 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0543, code lost:
        if (r0.A08[0] != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0545, code lost:
        r8 = ((long[]) com.facebook.ads.redexgen.X.AbstractC1589es.A01(r0.A09))[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0550, code lost:
        r7 = r20.length;
        r5 = com.facebook.ads.redexgen.X.WB.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0564, code lost:
        if (r5[7].charAt(7) == r5[6].charAt(7)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0566, code lost:
        r5 = com.facebook.ads.redexgen.X.WB.A01;
        r5[4] = "3ceZQQ2j";
        r5[5] = "cAGxyE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0572, code lost:
        if (r6 >= r7) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0574, code lost:
        r20[r6] = com.facebook.ads.redexgen.X.AbstractC1672gE.A0U(r20[r6] - r8, 1000000, r0.A06);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0586, code lost:
        if (r6 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x05a6, code lost:
        return new com.facebook.ads.redexgen.X.C1195Wc(r34, r17, r18, r16, r20, r19, com.facebook.ads.redexgen.X.AbstractC1672gE.A0U(r1 - r8, 1000000, r0.A06));
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x05ac, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x05b0, code lost:
        if (r0.A03 != 1) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x05b2, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x05b3, code lost:
        r10 = 0;
        r12 = 0;
        r15 = false;
        r7 = new int[r0.A08.length];
        r6 = new int[r0.A08.length];
        r11 = (long[]) com.facebook.ads.redexgen.X.AbstractC1589es.A01(r0.A09);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05cc, code lost:
        if (r5 >= r0.A08.length) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x05ce, code lost:
        r1 = r11[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05d4, code lost:
        if (r1 == (-1)) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05d6, code lost:
        r8 = com.facebook.ads.redexgen.X.AbstractC1672gE.A0U(r0.A08[r5], r0.A06, r0.A05);
        r7[r5] = com.facebook.ads.redexgen.X.AbstractC1672gE.A0L(r20, r1, true, true);
        r6[r5] = com.facebook.ads.redexgen.X.AbstractC1672gE.A0K(r20, r1 + r8, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05fd, code lost:
        if (r7[r5] >= r6[r5]) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0605, code lost:
        if ((r19[r7[r5]] & 1) != 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0607, code lost:
        r7[r5] = r7[r5] + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x060d, code lost:
        r10 = r10 + (r6[r5] - r7[r5]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0620, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[3].charAt(8) == 'I') goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0622, code lost:
        com.facebook.ads.redexgen.X.WB.A01[3] = "ag0VbhsjBjhb7qbbAQI7jnL3blXQkDv0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x062b, code lost:
        if (r12 == r7[r5]) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x062d, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x062e, code lost:
        r15 = r15 | r1;
        r12 = r6[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0631, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0634, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0636, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x063e, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x063f, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0642, code lost:
        if (r10 == r21) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0644, code lost:
        r15 = r15 | r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0645, code lost:
        if (r15 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0647, code lost:
        r14 = new long[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0649, code lost:
        if (r15 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x064b, code lost:
        r11 = new int[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x064d, code lost:
        if (r15 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x064f, code lost:
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x065c, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[2].length() == 31) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0663, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0664, code lost:
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0667, code lost:
        r14 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x066a, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x066c, code lost:
        com.facebook.ads.redexgen.X.WB.A01[2] = "ZlivBdEMf0j9ZLDKkPFxIr20ydJ8DyI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0673, code lost:
        if (r15 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0675, code lost:
        r13 = new int[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0677, code lost:
        r12 = new long[r10];
        r25 = 0;
        r9 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0680, code lost:
        if (r8 >= r0.A08.length) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0682, code lost:
        r23 = r0.A09[r8];
        r5 = r7[r8];
        r10 = r6[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x068a, code lost:
        if (r15 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x068c, code lost:
        r2 = r10 - r5;
        java.lang.System.arraycopy(r17, r5, r14, r9, r2);
        java.lang.System.arraycopy(r18, r5, r11, r9, r2);
        java.lang.System.arraycopy(r19, r5, r13, r9, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x06aa, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[1].charAt(20) == 'F') goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x06ac, code lost:
        r3 = com.facebook.ads.redexgen.X.WB.A01;
        r3[4] = "UboglDvl";
        r3[5] = "m9AqPS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x06b8, code lost:
        if (r5 >= r10) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x06ba, code lost:
        r12[r9] = com.facebook.ads.redexgen.X.AbstractC1672gE.A0U(r25, 1000000, r0.A05) + com.facebook.ads.redexgen.X.AbstractC1672gE.A0U(java.lang.Math.max(0L, r20[r5] - r23), 1000000, r0.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x06dd, code lost:
        if (r15 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x06e3, code lost:
        if (r11[r9] <= r16) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x06e5, code lost:
        r16 = r18[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x06e7, code lost:
        r9 = r9 + 1;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x06f8, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[1].charAt(20) == 'F') goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x06fa, code lost:
        com.facebook.ads.redexgen.X.WB.A01[3] = "5pcuokRzPt0wlrvXjrH9zzvccU1vwTAT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0702, code lost:
        r25 = r25 + r0.A08[r8];
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x070c, code lost:
        com.facebook.ads.redexgen.X.WB.A01[1] = "fPiPAArhWW0UdBcri1KNtVR34INmYDz0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0714, code lost:
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0730, code lost:
        return new com.facebook.ads.redexgen.X.C1195Wc(r34, r14, r11, r16, r12, r13, com.facebook.ads.redexgen.X.AbstractC1672gE.A0U(r25, 1000000, r0.A05));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02cd, code lost:
        if (r10 > 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02cf, code lost:
        r5 = ((com.facebook.ads.redexgen.X.C1648fq) com.facebook.ads.redexgen.X.AbstractC1589es.A01(r28)).A0L() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0304, code lost:
        if (r10 > 0) goto L216;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C1195Wc A0L(com.facebook.ads.redexgen.X.WZ r34, com.facebook.ads.redexgen.X.C1134Tm r35, com.facebook.ads.redexgen.X.UV r36) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A0L(com.facebook.ads.redexgen.X.WZ, com.facebook.ads.redexgen.X.Tm, com.facebook.ads.redexgen.X.UV):com.facebook.ads.redexgen.X.Wc");
    }

    public static String A0M(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 42);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A00 = new byte[]{-69, -81, -14, 3, 3, 2, -81, -8, -3, 5, -16, -5, -8, -13, 115, 103, -71, -84, -76, -88, -80, -75, -80, -75, -82, -102, -88, -76, -73, -77, -84, -70, -120, -69, -101, -80, -76, -84, -70, -69, -88, -76, -73, -117, -84, -77, -69, -88, 103, 123, 111, -63, -76, -68, -80, -72, -67, -72, -67, -74, -94, -80, -68, -65, -69, -76, -62, -112, -61, -93, -72, -68, -76, -62, -61, -80, -68, -65, -98, -75, -75, -62, -76, -61, 111, -87, -99, -17, -30, -22, -34, -26, -21, -26, -21, -28, -48, -34, -22, -19, -23, -30, -16, -58, -21, -64, -27, -14, -21, -24, -99, 97, 85, -89, -102, -94, -106, -98, -93, -98, -93, -100, -119, -98, -94, -102, -88, -87, -106, -94, -91, 121, -102, -95, -87, -106, 120, -99, -106, -93, -100, -102, -88, 85, 116, 90, -84, -97, -89, -101, -93, -88, -93, -88, -95, -115, -77, -88, -99, -94, -84, -87, -88, -93, -76, -101, -82, -93, -87, -88, -115, -101, -89, -86, -90, -97, -83, 90, -118, -67, -72, -74, -103, -86, -69, -68, -82, -69, -68, -67, -16, -37, -35, -21, -21, -31, -18, -35, -104, -25, -38, -19, -41, -21, -31, -14, -35, -90, -53, -64, -52, -53, -48, -58, -48, -47, -62, -53, -47, 125, -48, -47, -65, -55, 125, -65, -52, -43, 125, -61, -52, -49, 125, -47, -49, -66, -64, -56, 125, -37, 0, 8, -13, -2, -5, -10, -78, 5, -13, -1, 2, -2, -9, -78, 4, -13, 6, -9, -78, -8, 1, 4, -78, -42, 1, -2, -12, 11, -78, -26, 4, 7, -9, -38, -42, -78, -33, -34, -30, -78, 5, 6, 4, -9, -13, -1, -52, -78, -119, -99, -88, -94, -85, -82, -87, -95, -96, 92, -81, -99, -87, -84, -88, -95, 92, -80, -99, -98, -88, -95, 92, 100, -81, -80, -98, -88, 101, 92, -87, -91, -81, -81, -91, -86, -93, 92, -81, -99, -87, -84, -88, -95, 92, -96, -95, -81, -97, -82, -91, -84, -80, -91, -85, -86, 92, 100, -81, -80, -81, -96, 101, -110, -77, -72, -74, -117, -88, -92, -89, -22, 2, 0, 7, 7, -4, -5, -73, 4, -4, 11, -8, -5, -8, 11, -8, -73, 14, 0, 11, -1, -73, 12, 5, 2, 5, 6, 14, 5, -73, 2, -4, 16, -73, 0, 5, -5, -4, 15, -47, -73, -95, -65, -82, -80, -72, 109, -75, -82, -64, 109, -69, -68, 109, -64, -82, -70, -67, -71, -78, 109, -63, -82, -81, -71, -78, 109, -64, -74, -57, -78, 109, -74, -69, -77, -68, -65, -70, -82, -63, -74, -68, -69, -25, 0, -9, 10, 2, -9, -11, 6, -9, -10, -78, -9, 0, -10, -78, 1, -8, -78, -11, -6, 7, 0, -3, -78, -10, -13, 6, -13, -57, -32, -27, -25, -30, -30, -31, -28, -26, -41, -42, -110, -43, -31, -34, -31, -28, -110, -26, -21, -30, -41, -84, -110, -59, -34, -29, -27, -32, -32, -33, -30, -28, -43, -44, -112, -39, -34, -39, -28, -39, -47, -36, -49, -44, -39, -29, -32, -36, -47, -23, -49, -44, -43, -36, -47, -23, -49, -32, -30, -43, -29, -43, -34, -28, -49, -42, -36, -47, -41, -19, 6, 11, 13, 8, 8, 7, 10, 12, -3, -4, -72, 5, -3, -4, 1, -7, -72, 10, -7, 12, -3, -58, -53, -28, -23, -21, -26, -26, -27, -24, -22, -37, -38, -106, -27, -40, -21, -43, -37, -18, -22, -37, -28, -23, -33, -27, -28, -43, -36, -30, -41, -35, -71, -46, -41, -39, -44, -44, -45, -42, -40, -55, -56, -124, -45, -58, -39, -61, -40, -35, -44, -55, -98, -124, -98, -73, -68, -66, -71, -71, -72, -69, -67, -82, -83, 105, -69, -82, -83, -66, -84, -82, -83, -88, -68, -67, -78, -75, -75, -88, -71, -78, -84, -67, -66, -69, -82, -88, -79, -82, -86, -83, -82, -69, -65, -40, -35, -33, -38, -38, -39, -36, -34, -49, -50, -118, -34, -45, -41, -45, -40, -47, -55, -45, -40, -48, -39, -55, -38, -36, -49, -35, -49, -40, -34, -55, -48, -42, -53, -47, -53, -38, -38, -42, -45, -51, -53, -34, -45, -39, -40, -103, -34, -34, -41, -42, -107, -30, -41, -42, -38, -23, -23, -27, -30, -36, -38, -19, -30, -24, -25, -88, -15, -90, -36, -38, -26, -34, -21, -38, -90, -26, -24, -19, -30, -24, -25, -22, -7, -7, -11, -14, -20, -22, -3, -14, -8, -9, -72, 1, -74, -10, -7, -67, -74, -20, -18, -22, -74, -65, -71, -63, -54, -39, -39, -43, -46, -52, -54, -35, -46, -40, -41, -104, -31, -106, -42, -39, -99, -106, -33, -35, -35, -14, 1, 1, -3, -6, -12, -14, 5, -6, 0, -1, -64, 9, -66, 2, 6, -6, -12, -4, 5, -6, -2, -10, -66, 5, 9, -60, -8, -26, -6, -23, -18, -12, -76, -72, -20, -11, -11, -33, -13, -30, -25, -19, -83, -33, -31, -79, 9, 29, 12, 17, 23, -41, 9, 11, -36, -102, -82, -99, -94, -88, 104, -102, -91, -102, -100, -35, -15, -32, -27, -21, -85, -35, -23, -18, -87, -13, -34, -81, -61, -78, -73, -67, 125, -77, -81, -79, -127, -23, -3, -20, -15, -9, -73, -18, -12, -23, -21, -97, -77, -94, -89, -83, 109, -91, 117, 111, 111, 107, -97, -86, -97, -75, -115, -95, -112, -107, -101, 91, -109, 99, 93, 93, 89, -103, -104, -115, -93, -2, 18, 1, 6, 12, -52, 10, 5, -2, -50, -110, -90, -107, -102, -96, 96, -98, -103, -98, 98, -87, -67, -84, -79, -73, 119, -75, -72, 124, -87, 117, -76, -87, -68, -75, -43, -23, -40, -35, -29, -93, -31, -28, -39, -37, -73, -53, -70, -65, -59, -123, -59, -58, -53, -55, -37, -17, -34, -29, -23, -87, -20, -37, -15, -38, -18, -35, -30, -24, -88, -19, -21, -18, -34, -90, -31, -35, -32, -12, -29, -24, -18, -82, -11, -19, -29, -83, -29, 
        -13, -14, -68, -48, -65, -60, -54, -118, -47, -55, -65, -119, -65, -49, -50, -119, -61, -65, -44, -24, -41, -36, -30, -94, -23, -31, -41, -95, -41, -25, -26, -95, -37, -41, -82, -29, -27, -30, -39, -36, -33, -40, -80, -33, -43, -27, -7, 13, -4, 1, 7, -57, 14, 6, -4, -58, -4, 12, 11, -58, 13, 0, -4, -45, 8, 10, 7, -2, 1, 4, -3, -43, 8, -54, -20, -21, -20, -70, -19, -20, -19, -3, -43, -41, -32, -43, -80, -78, -69, -64, -89, -84, -83, -80, -88, -123, -72, -77, -79, -105, -83, -66, -87, 100, -79, -71, -73, -72, 100, -90, -87, 100, -76, -77, -73, -83, -72, -83, -70, -87, -48, -36, -41, -53, -118, -53, -34, -39, -41, -118, -45, -35, -118, -41, -53, -40, -50, -53, -34, -39, -36, -29, 6, -10, -5, -4, -77, -12, 7, 2, 0, -77, -4, 6, -77, 0, -12, 1, -9, -12, 7, 2, 5, 12, -33, -48, -39, -50, -117, -52, -33, -38, -40, -117, -44, -34, -117, -40, -52, -39, -49, -52, -33, -38, -35, -28, -82, -95, -100, -99, -89, 103, 107, -97, -88, -88, 17, 4, -1, 0, 10, -54, -4, 17, -53, -52, -28, -41, -46, -45, -35, -99, -49, -28, -47, -19, -32, -37, -36, -26, -90, -37, -26, -29, -39, -16, -92, -19, -32, -22, -32, -26, -27, -58, -71, -76, -75, -65, Byte.MAX_VALUE, -72, -75, -58, -77, -72, -85, -90, -89, -79, 113, -81, -78, -89, -87, 19, 6, 1, 2, 12, -52, 21, -54, 19, 11, 1, -53, 12, 11, -49, -53, 19, 13, -43, -47, -60, -65, -64, -54, -118, -45, -120, -47, -55, -65, -119, -54, -55, -115, -119, -47, -53, -108};
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x034a, code lost:
        if (r3 != 1852009592) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x034c, code lost:
        r2 = com.facebook.ads.redexgen.X.WB.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x035f, code lost:
        if (r2[4].length() == r2[5].length()) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0361, code lost:
        com.facebook.ads.redexgen.X.WB.A01[1] = "dErATOYwL8wjSH3fOqcGQjIZkRPmAvVX";
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0368, code lost:
        if (r3 != 1852009571) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x036a, code lost:
        r9 = r33.A0M();
        r3 = r33.A0M();
        r2 = com.facebook.ads.redexgen.X.WB.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0382, code lost:
        if (r2[4].length() == r2[5].length()) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0384, code lost:
        com.facebook.ads.redexgen.X.WB.A01[0] = "6G0zxMtyMJKNeFZ";
        r6 = 2;
        r33.A0g(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0391, code lost:
        if (r8 != 19) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0399, code lost:
        if ((r33.A0I() & 128) == 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x039b, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x039c, code lost:
        r10 = com.google.android.exoplayer2.ColorInfo.A00(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03a0, code lost:
        if (r0 == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03a2, code lost:
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03a3, code lost:
        r9 = com.google.android.exoplayer2.ColorInfo.A01(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03b2, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[0].length() == 15) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03b4, code lost:
        com.facebook.ads.redexgen.X.WB.A01[1] = "EkxUPJXqVuSDxZmuWkydSNu67wAtZSbE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03bd, code lost:
        com.facebook.ads.redexgen.X.WB.A01[3] = "aM6sizBemUKXMNVlVUfiwXayyoT8isY9";
        r6 = 0;
        r33.A0g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03c9, code lost:
        if (r8 != 5) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03cc, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03d1, code lost:
        if (r3 != 1852009592) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03d5, code lost:
        com.facebook.ads.redexgen.X.WB.A01[2] = "WGQVJtFwR2t23CIObCRPwqutTYMxzMF";
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03de, code lost:
        com.facebook.ads.redexgen.X.AbstractC1633fb.A07(A0M(178, 11, 31), A0M(470, 24, 72) + com.facebook.ads.redexgen.X.W5.A04(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0449, code lost:
        r3 = new com.facebook.ads.redexgen.X.P5().A0g(r37).A11(r5).A0w(r7).A0r(r28).A0f(r27).A0Y(r26).A0l(r38).A13(r29).A0o(r13).A12(r14).A0u(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0489, code lost:
        if (r10 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x048b, code lost:
        if (r6 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x048d, code lost:
        if (r9 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x048f, code lost:
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0492, code lost:
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0494, code lost:
        r1 = r4.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0498, code lost:
        r3.A0t(new com.google.android.exoplayer2.ColorInfo(r10, r6, r9, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04a0, code lost:
        if (r17 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04a2, code lost:
        r0 = r17.A00;
        r2 = r3.A0a(com.facebook.ads.redexgen.X.AbstractC0985Nn.A04(r0));
        r0 = r17.A01;
        r2.A0j(com.facebook.ads.redexgen.X.AbstractC0985Nn.A04(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04b9, code lost:
        r40.A02 = r3.A14();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04c1, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04c2, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04c9, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        return;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Adding Colorspace support for AV1")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0R(com.facebook.ads.redexgen.X.C1648fq r33, int r34, int r35, int r36, int r37, int r38, com.google.android.exoplayer2.DrmInitData r39, com.facebook.ads.redexgen.X.W9 r40, int r41) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A0R(com.facebook.ads.redexgen.X.fq, int, int, int, int, int, com.google.android.exoplayer2.DrmInitData, com.facebook.ads.redexgen.X.W9, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d9, code lost:
        if (r2 == 1685353320) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02de, code lost:
        if (r2 != 1685353324) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e0, code lost:
        r5 = A0M(1002, 16, 49);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ef, code lost:
        if (r2 != 1685353317) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02f1, code lost:
        r5 = A0M(1018, 28, 73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0300, code lost:
        if (r2 != 1685353336) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0302, code lost:
        r5 = A0M(1046, 28, 110);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0311, code lost:
        if (r2 != 1935764850) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0313, code lost:
        r5 = A0M(812, 10, 91);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x032d, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[2].length() == 31) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x032f, code lost:
        if (r2 != 1935767394) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0331, code lost:
        r5 = A0M(850, 12, 82);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x033d, code lost:
        r14 = com.facebook.ads.redexgen.X.WB.A01;
        r14[7] = "ES9ZdpTgbLuLyGJmGtXMVyJAzck5Oys2";
        r14[6] = "j2uPTiulWFCit84ESBRBaYNc1YfmW3z6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0349, code lost:
        if (r2 != 1935767394) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x034f, code lost:
        if (r2 == 1819304813) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0354, code lost:
        if (r2 != 1936684916) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0356, code lost:
        r5 = A0M(967, 9, 80);
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0363, code lost:
        r3 = com.facebook.ads.redexgen.X.WB.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0377, code lost:
        if (r3[7].charAt(7) == r3[6].charAt(7)) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0379, code lost:
        com.facebook.ads.redexgen.X.WB.A01[2] = "jbAlsGVCBCVWbsHllgD6wxSyI790xgB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0380, code lost:
        if (r2 != 1953984371) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0382, code lost:
        r5 = A0M(967, 9, 80);
        r8 = 268435456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0393, code lost:
        if (r2 == 778924082) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0398, code lost:
        if (r2 != 778924083) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x039a, code lost:
        r5 = A0M(947, 10, 74);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03a9, code lost:
        if (r2 != 1835557169) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ab, code lost:
        r5 = A0M(912, 10, 115);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03ba, code lost:
        if (r2 != 1835560241) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03bc, code lost:
        r5 = A0M(922, 10, 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03c7, code lost:
        if (r2 != 1634492771) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03c9, code lost:
        r5 = A0M(840, 10, 15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03e5, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[3].charAt(8) == 'I') goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03e7, code lost:
        r4 = com.facebook.ads.redexgen.X.WB.A01;
        r4[7] = "nFWPIFy0PHgBPrQb41it31CojXgzY5zq";
        r4[6] = "avHzpsCj0JVsrcVeStWJh72jkpOeo1zk";
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03f3, code lost:
        if (r2 != 1634492791) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03f5, code lost:
        r5 = A0M(882, 15, 20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0404, code lost:
        if (r2 != 1970037111) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0406, code lost:
        r5 = A0M(897, 15, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0414, code lost:
        if (r2 != 1332770163) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0416, code lost:
        r5 = A0M(957, 10, 44);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0425, code lost:
        if (r2 != 1716281667) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0427, code lost:
        r5 = A0M(872, 10, 94);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0436, code lost:
        if (r2 != 1835823201) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0438, code lost:
        r5 = A0M(976, 13, 79);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04f0, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04f6, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        if (r2 == 2002876005) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02c5, code lost:
        if (r2 == 1685353315) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02c7, code lost:
        r5 = A0M(989, 13, 85);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02d3, code lost:
        if (r2 == 1685353315) goto L129;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0T(com.facebook.ads.redexgen.X.C1648fq r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.google.android.exoplayer2.DrmInitData r27, com.facebook.ads.redexgen.X.W9 r28, int r29) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A0T(com.facebook.ads.redexgen.X.fq, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.DrmInitData, com.facebook.ads.redexgen.X.W9, int):void");
    }

    static {
        A0P();
        A03 = new int[]{-3374493, -128628077, -2011932550, 38936541};
        A02 = AbstractC1672gE.A1G(A0M(351, 8, 25));
    }

    public static float A00(C1648fq c1648fq, int i10) {
        c1648fq.A0f(i10 + 8);
        int vSpacing = c1648fq.A0L();
        int hSpacing = c1648fq.A0L();
        return vSpacing / hSpacing;
    }

    public static int A01(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        if (i10 == 1835365473) {
            return 5;
        }
        return -1;
    }

    public static int A02(C1648fq c1648fq) {
        int A0I = c1648fq.A0I();
        int size = A0I & 127;
        while ((A0I & 128) == 128) {
            A0I = c1648fq.A0I();
            int currentByte = A0I & 127;
            size = (size << 7) | currentByte;
        }
        return size;
    }

    public static int A03(C1648fq c1648fq) {
        c1648fq.A0f(16);
        return c1648fq.A0C();
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(com.facebook.ads.redexgen.X.C1648fq r6, int r7, int r8, int r9) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            int r5 = r6.A09()
            if (r5 < r8) goto L31
            r1 = 1
        L7:
            r0 = 0
            com.facebook.ads.redexgen.X.UM.A01(r1, r0)
        Lb:
            int r0 = r5 - r8
            if (r0 >= r9) goto L33
            r6.A0f(r5)
            int r4 = r6.A0C()
            if (r4 <= 0) goto L2f
            r3 = 1
        L19:
            r2 = 1090(0x442, float:1.527E-42)
            r1 = 30
            r0 = 26
            java.lang.String r0 = A0M(r2, r1, r0)
            com.facebook.ads.redexgen.X.UM.A01(r3, r0)
            int r0 = r6.A0C()
            if (r0 != r7) goto L2d
            return r5
        L2d:
            int r5 = r5 + r4
            goto Lb
        L2f:
            r3 = 0
            goto L19
        L31:
            r1 = 0
            goto L7
        L33:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A04(com.facebook.ads.redexgen.X.fq, int, int, int):int");
    }

    public static long A05(C1648fq c1648fq) {
        int fullAtom = 8;
        c1648fq.A0f(8);
        if (W5.A03(c1648fq.A0C()) != 0) {
            fullAtom = 16;
        }
        c1648fq.A0g(fullAtom);
        return c1648fq.A0Q();
    }

    public static Pair<long[], long[]> A06(C1134Tm c1134Tm) {
        long j10;
        C1133Tl elstAtom = c1134Tm.A03(1701606260);
        if (elstAtom == null) {
            return null;
        }
        C1648fq c1648fq = elstAtom.A00;
        c1648fq.A0f(8);
        int A032 = W5.A03(c1648fq.A0C());
        int i10 = c1648fq.A0L();
        long[] editListMediaTimes = new long[i10];
        long[] editListDurations = new long[i10];
        for (int entryCount = 0; entryCount < i10; entryCount++) {
            editListMediaTimes[entryCount] = A032 == 1 ? c1648fq.A0R() : c1648fq.A0Q();
            if (A032 == 1) {
                j10 = c1648fq.A0P();
            } else {
                int A0C = c1648fq.A0C();
                String[] strArr = A01;
                if (strArr[4].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                A01[0] = "faaT8XmIxVXIEBg";
                j10 = A0C;
            }
            editListDurations[entryCount] = j10;
            if (c1648fq.A0b() == 1) {
                c1648fq.A0g(2);
            } else {
                throw new IllegalArgumentException(A0M(540, 23, 110));
            }
        }
        return Pair.create(editListMediaTimes, editListDurations);
    }

    public static Pair<Metadata, Metadata> A07(C1133Tl c1133Tl) {
        C1648fq c1648fq = c1133Tl.A00;
        c1648fq.A0f(8);
        Metadata metadata = null;
        Metadata metaMetadata = null;
        while (c1648fq.A07() >= 8) {
            int atomPosition = c1648fq.A09();
            int A0C = c1648fq.A0C();
            int A0C2 = c1648fq.A0C();
            if (A0C2 == 1835365473) {
                c1648fq.A0f(atomPosition);
                metadata = A0F(c1648fq, atomPosition + A0C);
            } else if (A0C2 == 1936553057) {
                c1648fq.A0f(atomPosition);
                int i10 = atomPosition + A0C;
                if (A01[2].length() != 31) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[4] = "5U9F0HbL";
                strArr[5] = "IMFBio";
                metaMetadata = A0E(c1648fq, i10);
            } else {
                continue;
            }
            c1648fq.A0f(atomPosition + A0C);
        }
        return Pair.create(metadata, metaMetadata);
    }

    public static Pair<Long, String> A08(C1648fq c1648fq) {
        c1648fq.A0f(8);
        int fullAtom = W5.A03(c1648fq.A0C());
        int languageCode = fullAtom == 0 ? 8 : 16;
        c1648fq.A0g(languageCode);
        long A0Q = c1648fq.A0Q();
        int version = fullAtom == 0 ? 4 : 8;
        c1648fq.A0g(version);
        int A0M = c1648fq.A0M();
        int languageCode2 = A0M >> 10;
        StringBuilder append = new StringBuilder().append(A0M(0, 0, 111)).append((char) ((languageCode2 & 31) + 96));
        int languageCode3 = A0M >> 5;
        StringBuilder append2 = append.append((char) ((languageCode3 & 31) + 96));
        int languageCode4 = A0M & 31;
        return Pair.create(Long.valueOf(A0Q), append2.append((char) (languageCode4 + 96)).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.X.C1193Wa> A09(com.facebook.ads.redexgen.X.C1648fq r9, int r10, int r11) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A09(com.facebook.ads.redexgen.X.fq, int, int):android.util.Pair");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.X.C1193Wa> A0A(com.facebook.ads.redexgen.X.C1648fq r6, int r7, int r8) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            int r5 = r6.A09()
        L4:
            int r0 = r5 - r7
            if (r0 >= r8) goto L33
            r6.A0f(r5)
            int r4 = r6.A0C()
            if (r4 <= 0) goto L31
            r3 = 1
        L12:
            r2 = 1090(0x442, float:1.527E-42)
            r1 = 30
            r0 = 26
            java.lang.String r0 = A0M(r2, r1, r0)
            com.facebook.ads.redexgen.X.UM.A01(r3, r0)
            int r1 = r6.A0C()
            r0 = 1936289382(0x73696e66, float:1.8494329E31)
            if (r1 != r0) goto L2f
            android.util.Pair r0 = A09(r6, r5, r4)
            if (r0 == 0) goto L2f
            return r0
        L2f:
            int r5 = r5 + r4
            goto L4
        L31:
            r3 = 0
            goto L12
        L33:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A0A(com.facebook.ads.redexgen.X.fq, int, int):android.util.Pair");
    }

    public static Metadata A0D(C1648fq c1648fq, int i10) {
        c1648fq.A0g(8);
        ArrayList arrayList = new ArrayList();
        while (c1648fq.A09() < i10) {
            Id3Frame A04 = WM.A04(c1648fq);
            if (A04 != null) {
                arrayList.add(A04);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata A0E(C1648fq c1648fq, int i10) {
        c1648fq.A0g(12);
        while (c1648fq.A09() < i10) {
            int atomSize = c1648fq.A09();
            int A0C = c1648fq.A0C();
            int atomPosition = c1648fq.A0C();
            if (atomPosition == 1935766900) {
                if (A0C < 14) {
                    return null;
                }
                c1648fq.A0g(5);
                int A0I = c1648fq.A0I();
                if (A0I == 12 || A0I == 13) {
                    float f10 = A0I == 12 ? 240.0f : 120.0f;
                    c1648fq.A0g(1);
                    return new Metadata(new SmtaMetadataEntry(f10, c1648fq.A0I()));
                }
                return null;
            }
            c1648fq.A0f(atomSize + A0C);
        }
        return null;
    }

    public static Metadata A0F(C1648fq c1648fq, int i10) {
        c1648fq.A0g(8);
        A0Q(c1648fq);
        while (c1648fq.A09() < i10) {
            int A09 = c1648fq.A09();
            int atomType = c1648fq.A0C();
            int atomSize = c1648fq.A0C();
            if (atomSize == 1768715124) {
                c1648fq.A0f(A09);
                return A0D(c1648fq, A09 + atomType);
            }
            c1648fq.A0f(A09 + atomType);
        }
        if (A01[2].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "OXAgsAj1";
        strArr[5] = "fvqrgv";
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
        if (r7 == 1634492771) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ed, code lost:
        if (r7 == 1634492791) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f2, code lost:
        if (r7 == 1970037111) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0204, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[3].charAt(8) == 'I') goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0206, code lost:
        r2 = com.facebook.ads.redexgen.X.WB.A01;
        r2[7] = "qg64UJQAzpTmHyLPXL7O7aEkmk2KAivH";
        r2[6] = "ht8kCeX7uuHYC3cI0Du1HtKt4zLlzwFz";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0212, code lost:
        if (r7 == 1332770163) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0217, code lost:
        if (r7 != 1716281667) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0219, code lost:
        A0T(r24, r7, r8, r9, r25, r27, r29, r28, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0222, code lost:
        com.facebook.ads.redexgen.X.WB.A01[0] = "Y9VHYanCPsI2e2J";
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0229, code lost:
        if (r7 == 1332770163) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x022c, code lost:
        if (r7 == 1634492771) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022f, code lost:
        com.facebook.ads.redexgen.X.WB.A01[1] = "Mu9UGxRsyv1fNCIYPqwI6UO8dJksap8b";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0236, code lost:
        if (r7 == 778924082) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x023a, code lost:
        com.facebook.ads.redexgen.X.WB.A01[2] = "Tdv19gpgah7kG8KLNSbiU3FJY2XFBa5";
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0241, code lost:
        if (r7 == 1685353324) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0248, code lost:
        if (r7 == 1414810956) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024d, code lost:
        if (r7 == 1954034535) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0252, code lost:
        if (r7 == 2004251764) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0257, code lost:
        if (r7 == 1937010800) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025c, code lost:
        if (r7 != 1664495672) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x025e, code lost:
        r8 = r8;
        r9 = r9;
        A0S(r24, r7, r8, r9, r25, r27, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026a, code lost:
        r2 = com.facebook.ads.redexgen.X.WB.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027d, code lost:
        if (r2[4].length() == r2[5].length()) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x027f, code lost:
        com.facebook.ads.redexgen.X.WB.A01[2] = "gxiE9NKmmL9uchOhalvHl02jDDEZfTq";
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0286, code lost:
        if (r7 != 1835365492) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0288, code lost:
        A0U(r24, r7, r8, r25, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x028d, code lost:
        com.facebook.ads.redexgen.X.WB.A01[3] = "ToxFSyeFlA38mkuLvo1Mu6lU6LxYgixd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0294, code lost:
        if (r7 != 1835365492) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x029a, code lost:
        if (r7 != 1667329389) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x029c, code lost:
        r14.A02 = new com.facebook.ads.redexgen.X.P5().A0g(r25).A11(A0M(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, 27, 79)).A14();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02c2, code lost:
        if (r7 != 1836070006) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ce, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02d4, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
        if (r7 != 1836070006) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (r7 == 1752589105) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r7 == 1751479857) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[3].charAt(8) == 'I') goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
        com.facebook.ads.redexgen.X.WB.A01[0] = "J9NFQWcBpP5bRoL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
        if (r7 == 1932670515) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
        if (r7 == 1211250227) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r7 == 1987063864) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
        if (r7 == 1987063865) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (r7 == 1635135537) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        if (r7 == 1685479798) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
        if (r7 == 1685479729) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
        if (r7 == 1685481573) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        if (r7 != 1685481521) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
        if (r7 == 1836069985) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
        if (r7 == 1701733217) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
        if (r7 == 1633889587) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[3].charAt(8) == 'I') goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
        r2 = com.facebook.ads.redexgen.X.WB.A01;
        r2[7] = "sIqgdg7Ir0gzrBx0QUcruw0RK0xaXW7w";
        r2[6] = "SsbgrgexWAa1UrrkUoBYj3jKgvPwcUou";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
        if (r7 == 1700998451) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013d, code lost:
        if (r7 == 1633889588) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
        if (r7 == 1835823201) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0147, code lost:
        if (r7 == 1685353315) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
        if (r7 == 1685353317) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0151, code lost:
        if (r7 == 1685353320) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0153, code lost:
        r2 = com.facebook.ads.redexgen.X.WB.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0166, code lost:
        if (r2[4].length() == r2[5].length()) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0168, code lost:
        r2 = com.facebook.ads.redexgen.X.WB.A01;
        r2[4] = "hfk9wb39";
        r2[5] = "0FrQFq";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0174, code lost:
        if (r7 == 1685353324) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0179, code lost:
        if (r7 == 1685353336) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
        if (r7 == 1935764850) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
        if (r7 == 1935767394) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
        if (r7 == 1819304813) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018d, code lost:
        if (r7 == 1936684916) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0192, code lost:
        if (r7 == 1953984371) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[2].length() == 31) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a4, code lost:
        if (r7 == 778924082) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b6, code lost:
        if (com.facebook.ads.redexgen.X.WB.A01[3].charAt(8) == 'I') goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
        com.facebook.ads.redexgen.X.WB.A01[1] = "rbsI3Efq0Hmlb8MFftDygTmwcUN3A1ex";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bf, code lost:
        if (r7 == 778924083) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c4, code lost:
        if (r7 == 1835557169) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c9, code lost:
        if (r7 == 1835560241) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cb, code lost:
        r2 = com.facebook.ads.redexgen.X.WB.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01df, code lost:
        if (r2[7].charAt(7) == r2[6].charAt(7)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e1, code lost:
        com.facebook.ads.redexgen.X.WB.A01[0] = "rKi8N418EB7jigj";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.W9 A0H(com.facebook.ads.redexgen.X.C1648fq r24, int r25, int r26, java.lang.String r27, com.google.android.exoplayer2.DrmInitData r28, boolean r29) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A0H(com.facebook.ads.redexgen.X.fq, int, int, java.lang.String, com.google.android.exoplayer2.DrmInitData, boolean):com.facebook.ads.redexgen.X.W9");
    }

    public static ByteBuffer A0N() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.hs != com.google.common.base.Function<com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.extractor.mp4.Track> */
    public static List<C1195Wc> A0O(C1134Tm c1134Tm, UV uv, long j10, DrmInitData drmInitData, boolean z10, boolean z11, InterfaceC1771hs<WZ, WZ> interfaceC1771hs) throws Q6 {
        WZ track;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c1134Tm.A01.size(); i10++) {
            C1134Tm c1134Tm2 = c1134Tm.A01.get(i10);
            if (((W5) c1134Tm2).A00 == 1953653099 && (track = interfaceC1771hs.A41(A0J(c1134Tm2, (C1133Tl) AbstractC1589es.A01(c1134Tm.A03(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(A0L(track, (C1134Tm) AbstractC1589es.A01(((C1134Tm) AbstractC1589es.A01(((C1134Tm) AbstractC1589es.A01(c1134Tm2.A02(1835297121))).A02(1835626086))).A02(1937007212)), uv));
            }
        }
        return arrayList;
    }

    public static void A0Q(C1648fq c1648fq) {
        int A09 = c1648fq.A09();
        c1648fq.A0g(4);
        if (c1648fq.A0C() != 1751411826) {
            A09 += 4;
        }
        c1648fq.A0f(A09);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<byte[]> */
    public static void A0S(C1648fq c1648fq, int i10, int i11, int i12, int i13, String str, W9 w92) {
        String A0M;
        c1648fq.A0f(i11 + 8 + 8);
        OI oi = null;
        long j10 = Long.MAX_VALUE;
        if (i10 == 1414810956) {
            if (A01[2].length() != 31) {
                throw new RuntimeException();
            }
            A01[2] = "JRt87GZMgD5fEMVBfoNrIXDL19zMo7T";
            A0M = A0M(691, 20, 64);
        } else if (i10 == 1954034535) {
            A0M = A0M(784, 28, 103);
            int sampleDescriptionLength = (i12 - 8) - 8;
            byte[] bArr = new byte[sampleDescriptionLength];
            c1648fq.A0k(bArr, 0, sampleDescriptionLength);
            oi = OI.A04(bArr);
        } else if (i10 == 2004251764) {
            String[] strArr = A01;
            if (strArr[4].length() != strArr[5].length()) {
                A01[0] = "VAPQbMGZr6CMzJb";
                A0M = A0M(763, 21, 63);
            } else {
                A0M = A0M(763, 21, 63);
            }
        } else if (i10 == 1937010800) {
            A0M = A0M(691, 20, 64);
            j10 = 0;
        } else if (i10 == 1664495672) {
            A0M = A0M(738, 25, 95);
            w92.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        w92.A02 = new P5().A0g(i13).A11(A0M).A10(str).A0s(j10).A12(oi).A14();
    }

    public static void A0U(C1648fq c1648fq, int i10, int i11, int i12, W9 w92) {
        c1648fq.A0f(i11 + 8 + 8);
        if (i10 == 1835365492) {
            c1648fq.A0U();
            String[] strArr = A01;
            if (strArr[7].charAt(7) == strArr[6].charAt(7)) {
                throw new RuntimeException();
            }
            A01[3] = "QORzH089JWGgbMxxBNIu32wCfbh73vL5";
            String mimeType = c1648fq.A0U();
            if (mimeType != null) {
                w92.A02 = new P5().A0g(i12).A11(mimeType).A14();
            }
        }
    }

    public static boolean A0V(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int latestDelayIndex = AbstractC1672gE.A07(4, 0, length);
        int lastIndex = jArr.length;
        int A07 = AbstractC1672gE.A07(lastIndex - 4, 0, length);
        int lastIndex2 = (jArr[0] > j11 ? 1 : (jArr[0] == j11 ? 0 : -1));
        if (lastIndex2 <= 0) {
            int lastIndex3 = (j11 > jArr[latestDelayIndex] ? 1 : (j11 == jArr[latestDelayIndex] ? 0 : -1));
            if (lastIndex3 < 0) {
                int i10 = (jArr[A07] > j12 ? 1 : (jArr[A07] == j12 ? 0 : -1));
                if (A01[0].length() != 15) {
                    throw new RuntimeException();
                }
                A01[3] = "UIj7yINuON8HzSPRJ6uGXDpOHCOuQ4pj";
                if (i10 < 0) {
                    int i11 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
                    if (A01[2].length() != 31) {
                        throw new RuntimeException();
                    }
                    A01[2] = "OLbz9oQsF5dhTYI0k8UVb3p9eiHzyiO";
                    if (i11 <= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] A0W(com.facebook.ads.redexgen.X.C1648fq r6, int r7, int r8) {
        /*
            int r4 = r7 + 8
        L2:
            int r0 = r4 - r7
            if (r0 >= r8) goto L42
            r6.A0f(r4)
            int r5 = r6.A0C()
            int r1 = r6.A0C()
            r0 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r1 != r0) goto L3a
            byte[] r3 = r6.A0l()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WB.A01
            r0 = 4
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WB.A01
            java.lang.String r1 = "mWVII78rWKXPWoThB17UwcFw6Ep5dNZ6"
            r0 = 1
            r2[r0] = r1
            int r0 = r4 + r5
            byte[] r0 = java.util.Arrays.copyOfRange(r3, r4, r0)
            return r0
        L3a:
            int r4 = r4 + r5
            goto L2
        L3c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L42:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.A0W(com.facebook.ads.redexgen.X.fq, int, int):byte[]");
    }
}
