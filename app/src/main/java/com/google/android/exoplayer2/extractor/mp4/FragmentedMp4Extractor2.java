package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.redexgen.X.AbstractC1149Ud;
import com.facebook.ads.redexgen.X.AbstractC1589es;
import com.facebook.ads.redexgen.X.AbstractC1633fb;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.C1127Te;
import com.facebook.ads.redexgen.X.C1133Tl;
import com.facebook.ads.redexgen.X.C1134Tm;
import com.facebook.ads.redexgen.X.C1152Ug;
import com.facebook.ads.redexgen.X.C1193Wa;
import com.facebook.ads.redexgen.X.C1194Wb;
import com.facebook.ads.redexgen.X.C1195Wc;
import com.facebook.ads.redexgen.X.C1648fq;
import com.facebook.ads.redexgen.X.C1662g4;
import com.facebook.ads.redexgen.X.InterfaceC1157Uo;
import com.facebook.ads.redexgen.X.InterfaceC1771hs;
import com.facebook.ads.redexgen.X.P5;
import com.facebook.ads.redexgen.X.Q6;
import com.facebook.ads.redexgen.X.UK;
import com.facebook.ads.redexgen.X.UL;
import com.facebook.ads.redexgen.X.UO;
import com.facebook.ads.redexgen.X.UV;
import com.facebook.ads.redexgen.X.Uj;
import com.facebook.ads.redexgen.X.VB;
import com.facebook.ads.redexgen.X.W5;
import com.facebook.ads.redexgen.X.WB;
import com.facebook.ads.redexgen.X.WC;
import com.facebook.ads.redexgen.X.WJ;
import com.facebook.ads.redexgen.X.WK;
import com.facebook.ads.redexgen.X.WL;
import com.facebook.ads.redexgen.X.WS;
import com.facebook.ads.redexgen.X.WX;
import com.facebook.ads.redexgen.X.WY;
import com.facebook.ads.redexgen.X.WZ;
import com.facebook.ads.redexgen.X.ZM;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
@MetaExoPlayerCustomization("Rename the class for A/B Testing")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class FragmentedMp4Extractor2 implements UK {
    public static byte[] A0Z;
    public static String[] A0a = {"UhkiW08sdOa6MLqzIxYa4l6K9Go8a5nF", "0UFlLg2A4E4sCS9MRLaMIQbXScdTT2aj", "iyvk7MPRNYXsGx2HwftmeYTgR4EbhnjX", "wJRD974Ex9w1JOFbbQk9dJPapCoIWG3I", "TAvpDkSr8CiZNLyjRIryejX1W3gbvalg", "E7R6UmYIGyDjj1Lsm6lfBdw0aO8xTv0G", "aqeXoqbVEtO0YmQrU7KD8QPSJI0EqN0Q", "C5jyPerRkNgqLB67qnSND9Qg4ogDmW"};
    public static final UO A0b;
    public static final ZM A0c;
    public static final byte[] A0d;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    @MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public UL A0D;
    public WL A0E;
    public C1648fq A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC1157Uo[] A0I;
    public InterfaceC1157Uo[] A0J;
    public final int A0K;
    public final SparseArray<WL> A0L;
    public final InterfaceC1157Uo A0M;
    public final VB A0N;
    public final WZ A0O;
    public final C1648fq A0P;
    public final C1648fq A0Q;
    public final C1648fq A0R;
    public final C1648fq A0S;
    public final C1648fq A0T;
    public final C1662g4 A0U;
    public final ArrayDeque<C1134Tm> A0V;
    public final ArrayDeque<WK> A0W;
    public final List<ZM> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
        if (r2.A03 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if ((r32 & 1) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
        if (r2.A03 == 2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0163, code lost:
        r19 = false;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(com.facebook.ads.redexgen.X.WL r30, int r31, int r32, com.facebook.ads.redexgen.X.C1648fq r33, int r34) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A01(com.facebook.ads.redexgen.X.WL, int, int, com.facebook.ads.redexgen.X.fq, int):int");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, WY> A05(C1648fq c1648fq, long j10) throws Q6 {
        long A0R;
        long A0R2;
        c1648fq.A0f(8);
        int A03 = W5.A03(c1648fq.A0C());
        c1648fq.A0g(4);
        long A0Q = c1648fq.A0Q();
        if (A03 == 0) {
            A0R = c1648fq.A0Q();
            A0R2 = j10 + c1648fq.A0Q();
        } else {
            A0R = c1648fq.A0R();
            A0R2 = j10 + c1648fq.A0R();
        }
        long A0U = AbstractC1672gE.A0U(A0R, 1000000L, A0Q);
        c1648fq.A0g(2);
        int A0M = c1648fq.A0M();
        int[] iArr = new int[A0M];
        long[] jArr = new long[A0M];
        long[] jArr2 = new long[A0M];
        long[] jArr3 = new long[A0M];
        long j11 = A0U;
        for (int i10 = 0; i10 < A0M; i10++) {
            int A0C = c1648fq.A0C();
            if ((Integer.MIN_VALUE & A0C) != 0) {
                throw Q6.A01(A0A(756, 28, 2), null);
            }
            long A0Q2 = c1648fq.A0Q();
            iArr[i10] = Integer.MAX_VALUE & A0C;
            jArr[i10] = A0R2;
            jArr3[i10] = j11;
            A0R += A0Q2;
            j11 = AbstractC1672gE.A0U(A0R, 1000000L, A0Q);
            jArr2[i10] = j11 - jArr3[i10];
            c1648fq.A0g(4);
            A0R2 += iArr[i10];
        }
        return Pair.create(Long.valueOf(A0U), new WY(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r8 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r2 = r9.A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
        if (r8 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
        r2 = r7.A01;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.WL A09(com.facebook.ads.redexgen.X.C1648fq r9, android.util.SparseArray<com.facebook.ads.redexgen.X.WL> r10, boolean r11) {
        /*
            r0 = 8
            r9.A0f(r0)
            int r0 = r9.A0C()
            int r8 = com.facebook.ads.redexgen.X.W5.A02(r0)
            int r0 = r9.A0C()
            if (r11 == 0) goto L2e
            r3 = 0
            java.lang.String[] r2 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 22
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L33
        L28:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2e:
            java.lang.Object r4 = r10.get(r0)
            goto L3e
        L33:
            java.lang.String[] r2 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a
            java.lang.String r1 = "TB8CV96Y75L8HKRMSXRARjNyJ9Kf"
            r0 = 7
            r2[r0] = r1
            java.lang.Object r4 = r10.valueAt(r3)
        L3e:
            com.facebook.ads.redexgen.X.WL r4 = (com.facebook.ads.redexgen.X.WL) r4
            if (r4 != 0) goto L44
            r0 = 0
            return r0
        L44:
            r0 = r8 & 1
            if (r0 == 0) goto L54
            long r1 = r9.A0R()
            com.facebook.ads.redexgen.X.Wb r0 = r4.A08
            r0.A04 = r1
            com.facebook.ads.redexgen.X.Wb r0 = r4.A08
            r0.A03 = r1
        L54:
            com.facebook.ads.redexgen.X.WC r7 = r4.A04
            r3 = r8 & 2
            java.lang.String[] r2 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L6c
            goto L28
        L6c:
            java.lang.String[] r2 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a
            java.lang.String r1 = "i06Ep7msBcrdOAQcyRUYXyS0dMgPPiSZ"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto Lc2
            int r0 = r9.A0C()
            int r6 = r0 + (-1)
        L7b:
            r0 = r8 & 8
            if (r0 == 0) goto Lbf
            int r5 = r9.A0C()
        L83:
            r0 = r8 & 16
            if (r0 == 0) goto Lbc
            int r3 = r9.A0C()
        L8b:
            r8 = r8 & 32
            java.lang.String[] r1 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 10
            if (r1 == r0) goto Lb6
            java.lang.String[] r2 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a
            java.lang.String r1 = "mfhAdoOCuv0v6oZh0xDFuVPV5WqC5n6R"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "Xw0mRh5ORXPmCNDuyQQrR2PKVQnsi2GN"
            r0 = 6
            r2[r0] = r1
            if (r8 == 0) goto Lb9
        La8:
            int r2 = r9.A0C()
        Lac:
            com.facebook.ads.redexgen.X.Wb r1 = r4.A08
            com.facebook.ads.redexgen.X.WC r0 = new com.facebook.ads.redexgen.X.WC
            r0.<init>(r6, r5, r3, r2)
            r1.A06 = r0
            return r4
        Lb6:
            if (r8 == 0) goto Lb9
            goto La8
        Lb9:
            int r2 = r7.A01
            goto Lac
        Lbc:
            int r3 = r7.A03
            goto L8b
        Lbf:
            int r5 = r7.A00
            goto L83
        Lc2:
            int r6 = r7.A02
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A09(com.facebook.ads.redexgen.X.fq, android.util.SparseArray, boolean):com.facebook.ads.redexgen.X.WL");
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Z, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0Z = new byte[]{-105, -32, -22, -105, -37, -32, -35, -35, -36, -23, -36, -27, -21, -105, -35, -23, -26, -28, -105, -35, -23, -40, -34, -28, -36, -27, -21, -105, -22, -40, -28, -25, -29, -36, -105, -38, -26, -20, -27, -21, 123, -60, -50, 123, -62, -51, -64, -68, -49, -64, -51, 123, -49, -61, -68, -55, 123, -63, -51, -68, -62, -56, -64, -55, -49, 123, -50, -68, -56, -53, -57, -64, 123, -66, -54, -48, -55, -49, -100, -49, -54, -56, 123, -50, -60, -43, -64, 123, -57, -64, -50, -50, 123, -49, -61, -68, -55, 123, -61, -64, -68, -65, -64, -51, 123, -57, -64, -55, -62, -49, -61, 123, -125, -48, -55, -50, -48, -53, -53, -54, -51, -49, -64, -65, -124, -119, -101, -60, -54, -56, -49, 118, -71, -59, -53, -60, -54, 118, -65, -60, 118, -55, -72, -67, -58, 118, 119, -109, 118, -121, 118, 126, -53, -60, -55, -53, -58, -58, -59, -56, -54, -69, -70, Byte.MAX_VALUE, -124, -71, -30, -24, -26, -19, -108, -41, -29, -23, -30, -24, -108, -35, -30, -108, -25, -37, -28, -40, -108, -107, -79, -108, -91, -108, -100, -23, -30, -25, -23, -28, -28, -29, -26, -24, -39, -40, -99, -94, -106, -62, -79, -73, -67, -75, -66, -60, -75, -76, -99, -64, -124, -107, -56, -60, -62, -79, -77, -60, -65, -62, -71, -41, -34, -33, -30, -39, -34, -41, -112, -34, -43, -41, -47, -28, -39, -26, -43, -112, -33, -42, -42, -29, -43, -28, -112, -28, -33, -112, -29, -47, -35, -32, -36, -43, -112, -44, -47, -28, -47, -98, -82, -45, -37, -58, -47, -50, -55, -123, -77, -90, -79, -123, -47, -54, -45, -52, -39, -51, -83, -58, -62, -57, -127, -62, -43, -48, -50, -127, -59, -58, -57, -54, -49, -58, -44, -127, -58, -39, -43, -58, -49, -59, -58, -59, -127, -62, -43, -48, -50, -127, -44, -54, -37, -58, -127, -119, -42, -49, -44, -42, -47, -47, -48, -45, -43, -58, -59, -118, -113, -104, -79, -83, -78, 108, -83, -64, -69, -71, 108, -61, -75, -64, -76, 108, -72, -79, -70, -77, -64, -76, 108, -118, 108, 126, 125, Byte.MIN_VALUE, -125, Byte.MIN_VALUE, -124, Byte.MAX_VALUE, -126, Byte.MIN_VALUE, -125, 108, 116, -63, -70, -65, -63, -68, -68, -69, -66, -64, -79, -80, 117, 122, 107, -126, -126, -113, -127, -112, 60, -112, -117, 60, -127, -118, Byte.MAX_VALUE, -114, -107, -116, -112, -123, -117, -118, 60, Byte.MIN_VALUE, 125, -112, 125, 60, -109, 125, -113, 60, -118, -127, -125, 125, -112, -123, -110, -127, 74, -84, -61, -61, -48, -62, -47, 125, -47, -52, 125, -62, -53, -63, 125, -52, -61, 125, -54, -63, -66, -47, 125, -44, -66, -48, 125, -53, -62, -60, -66, -47, -58, -45, -62, -117, -119, -80, -97, -84, -84, -93, -98, -93, -88, -95, 90, -114, -84, -101, -99, -91, Byte.MAX_VALUE, -88, -99, -84, -77, -86, -82, -93, -87, -88, 124, -87, -78, 90, -86, -101, -84, -101, -89, -97, -82, -97, -84, -83, 90, -93, -83, 90, -81, -88, -83, -81, -86, -86, -87, -84, -82, -97, -98, 104, -108, -94, -86, -69, 97, -76, -94, -82, -79, -83, -90, 97, -92, -80, -74, -81, -75, 97, 125, -113, -104, -115, 74, -99, -117, -105, -102, -106, -113, 74, -115, -103, -97, -104, -98, 74, 114, -118, -120, -113, -113, -124, -125, 63, -113, -110, -110, -121, 63, Byte.MIN_VALUE, -109, -114, -116, 63, 71, -123, Byte.MIN_VALUE, -120, -117, -124, -125, 63, -109, -114, 63, -124, -105, -109, -111, Byte.MIN_VALUE, -126, -109, 63, -108, -108, -120, -125, 72, -118, -94, -96, -89, -89, -96, -91, -98, 87, -104, -85, -90, -92, 87, -82, -96, -85, -97, 87, -93, -100, -91, -98, -85, -97, 87, 117, 87, 105, 104, 107, 110, 107, 111, 106, 109, 107, 110, 87, 95, -84, -91, -86, -84, -89, -89, -90, -87, -85, -100, -101, 96, 101, -56, -32, -34, -27, -27, -34, -29, -36, -107, -22, -29, -24, -22, -27, -27, -28, -25, -23, -38, -39, -107, -38, -30, -24, -36, -107, -21, -38, -25, -24, -34, -28, -29, -81, -107, 113, -118, -127, -108, -116, -127, Byte.MAX_VALUE, -112, -127, Byte.MIN_VALUE, 60, -119, -117, -117, -110, 60, 126, -117, -108, 74, 120, -111, -120, -101, -109, -120, -122, -105, -120, -121, 67, -111, -120, -118, -124, -105, -116, -103, -120, 67, -103, -124, -113, -104, -120, 93, 67, -103, -78, -87, -68, -76, -87, -89, -72, -87, -88, 100, -73, -91, -83, -77, 100, -87, -78, -72, -74, -67, 100, -89, -77, -71, -78, -72, 126, 100, 105, -126, 124, 117, -126, 120, Byte.MIN_VALUE, 121, 120, 52, 125, -126, 120, 125, -122, 121, 119, -120, 52, -122, 121, 122, 121, -122, 121, -126, 119, 121, -95, -84, -67, -76, -84, -83, -73, -80, 107, -73, -80, -71, -78, -65, -77, 107, -81, -80, -66, -82, -67, -76, -69, -65, -76, -70, -71, 107, -76, -71, 107, -66, -78, -69, -81, 107, -79, -70, -64, -71, -81, 107, 115, -64, -71, -66, -64, -69, -69, -70, -67, -65, -80, -81, 116, -22, -7, -7, -11, -14, -20, -22, -3, -14, -8, -9, -72, 1, -74, -18, -10, -4, -16, 117, -124, -124, Byte.MIN_VALUE, 125, 119, 117, -120, 125, -125, -126, 67, -116, 65, -127, -124, 72, 65, -118, -120, -120, -119, -99, -116, -111, -105, 87, -119, -117, 92, -31, -44, -49, -48, -38, -102, -45, -48, -31, -50, 3, -10, -15, -14, -4, -68, -6, -3, -63};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0M(C1134Tm c1134Tm, SparseArray<WL> sparseArray, boolean z10, int i10, byte[] bArr) throws Q6 {
        WL A09 = A09(((C1133Tl) AbstractC1589es.A01(c1134Tm.A03(1952868452))).A00, sparseArray, z10);
        if (A09 == null) {
            return;
        }
        C1194Wb c1194Wb = A09.A08;
        long j10 = c1194Wb.A05;
        boolean z11 = c1194Wb.A09;
        A09.A08();
        A09.A06 = true;
        C1133Tl A03 = c1134Tm.A03(1952867444);
        if (A03 == null || (i10 & 2) != 0) {
            c1194Wb.A05 = j10;
            c1194Wb.A09 = z11;
        } else {
            c1194Wb.A05 = A03(A03.A00);
            c1194Wb.A09 = true;
        }
        A0N(c1134Tm, A09, i10);
        C1193Wa A00 = A09.A05.A03.A00(((WC) AbstractC1589es.A01(c1194Wb.A06)).A02);
        C1133Tl A032 = c1134Tm.A03(1935763834);
        if (A032 != null) {
            A0Q((C1193Wa) AbstractC1589es.A01(A00), A032.A00, c1194Wb);
        }
        C1133Tl A033 = c1134Tm.A03(1935763823);
        if (A033 != null) {
            A0T(A033.A00, c1194Wb);
        }
        C1133Tl A034 = c1134Tm.A03(1936027235);
        if (A034 != null) {
            A0U(A034.A00, c1194Wb);
        }
        A0O(c1134Tm, A00 != null ? A00.A02 : null, c1194Wb);
        int size = c1134Tm.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<C1133Tl> list = c1134Tm.A02;
            if (A0a[0].charAt(8) == 'l') {
                throw new RuntimeException();
            }
            A0a[5] = "SbyztV3Exh6Wzn6h1MaI5w2UtlpY3BjV";
            C1133Tl c1133Tl = list.get(i11);
            if (((W5) c1133Tl).A00 == 1970628964) {
                A0V(c1133Tl.A00, c1194Wb, bArr);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
        if (r7 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
        r4.A0g(1);
        r1 = r4.A0I();
        r9 = (r1 & 240) >> 4;
        r10 = r1 & 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
        if (r4.A0I() != 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r5 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r7 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
        r7 = r4.A0I();
        r8 = new byte[16];
        r4.A0k(r8, 0, r8.length);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
        if (r7 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
        r1 = r4.A0I();
        r0 = new byte[r1];
        r4.A0k(r0, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
        r13.A08 = true;
        r13.A07 = new com.facebook.ads.redexgen.X.C1193Wa(r5, r12, r7, r8, r9, r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
        throw com.facebook.ads.redexgen.X.Q6.A00(A0A(165, 39, 98));
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0O(com.facebook.ads.redexgen.X.C1134Tm r11, java.lang.String r12, com.facebook.ads.redexgen.X.C1194Wb r13) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0O(com.facebook.ads.redexgen.X.Tm, java.lang.String, com.facebook.ads.redexgen.X.Wb):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0175, code lost:
        if (r6 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0177, code lost:
        r1 = r19.A0U.A05(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0186, code lost:
        if (r19.A0A == (-9223372036854775807L)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018e, code lost:
        if (com.facebook.ads.redexgen.X.C0962Mq.A03(com.facebook.ads.redexgen.X.EnumC0959Mn.A0y) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0190, code lost:
        r1 = r19.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0192, code lost:
        r4 = r19.A0J;
        r3 = r4.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0196, code lost:
        if (r0 >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0198, code lost:
        r4[r0].AI0(r1, 1, r7, 0, null);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ac, code lost:
        if (r6 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Adding Uri for eMsg")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0S(com.facebook.ads.redexgen.X.C1648fq r20, android.net.Uri r21) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0S(com.facebook.ads.redexgen.X.fq, android.net.Uri):void");
    }

    static {
        A0D();
        A0b = new UO() { // from class: com.facebook.ads.redexgen.X.Th
            @Override // com.facebook.ads.redexgen.X.UO
            public final UK[] A5D() {
                return FragmentedMp4Extractor2.A0b();
            }

            @Override // com.facebook.ads.redexgen.X.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new P5().A11(A0A(839, 18, 119)).A14();
    }

    public FragmentedMp4Extractor2() {
        this(0);
    }

    public FragmentedMp4Extractor2(int i10) {
        this(i10, null);
    }

    public FragmentedMp4Extractor2(int i10, C1662g4 c1662g4) {
        this(i10, c1662g4, null, Collections.emptyList());
    }

    public FragmentedMp4Extractor2(int i10, C1662g4 c1662g4, WZ wz, List<ZM> list) {
        this(i10, c1662g4, wz, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public FragmentedMp4Extractor2(int i10, C1662g4 c1662g4, WZ wz, List<ZM> list, InterfaceC1157Uo interfaceC1157Uo) {
        this.A0A = -9223372036854775807L;
        this.A0K = i10;
        this.A0U = c1662g4;
        this.A0O = wz;
        this.A0X = Collections.unmodifiableList(list);
        this.A0M = interfaceC1157Uo;
        this.A0N = new VB();
        this.A0P = new C1648fq(16);
        this.A0S = new C1648fq(AbstractC1149Ud.A03);
        this.A0R = new C1648fq(5);
        this.A0Q = new C1648fq();
        this.A0Y = new byte[16];
        this.A0T = new C1648fq(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0D = UL.A00;
        this.A0J = new InterfaceC1157Uo[0];
        this.A0I = new InterfaceC1157Uo[0];
    }

    public static int A00(int i10) throws Q6 {
        if (i10 >= 0) {
            return i10;
        }
        throw Q6.A01(A0A(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 27, 17) + i10, null);
    }

    public static long A02(C1648fq c1648fq) {
        c1648fq.A0f(8);
        int fullAtom = c1648fq.A0C();
        return W5.A03(fullAtom) == 0 ? c1648fq.A0Q() : c1648fq.A0R();
    }

    public static long A03(C1648fq c1648fq) {
        c1648fq.A0f(8);
        int fullAtom = c1648fq.A0C();
        int version = W5.A03(fullAtom);
        return version == 1 ? c1648fq.A0R() : c1648fq.A0Q();
    }

    public static Pair<Integer, WC> A04(C1648fq c1648fq) {
        c1648fq.A0f(12);
        int defaultSampleDescriptionIndex = c1648fq.A0C();
        int trackId = c1648fq.A0C();
        int defaultSampleFlags = c1648fq.A0C();
        int defaultSampleSize = c1648fq.A0C();
        int defaultSampleDuration = c1648fq.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new WC(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A06(List<C1133Tl> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1133Tl c1133Tl = list.get(i10);
            int leafChildrenSize = ((W5) c1133Tl).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] A0l = c1133Tl.A00.A0l();
                UUID A02 = WS.A02(A0l);
                String[] strArr = A0a;
                String str = strArr[3];
                String str2 = strArr[6];
                int leafChildrenSize2 = str.charAt(22);
                if (leafChildrenSize2 != str2.charAt(22)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0a;
                strArr2[2] = "qEvmW863TYpssOpdeQ1hxwRF5zEzT8xC";
                strArr2[4] = "NTvUlAqmjBOZf1DxBtaDThvIYTD7GZ2U";
                if (A02 == null) {
                    AbstractC1633fb.A07(A0A(204, 22, 62), A0A(550, 42, 13));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A02, A0A(897, 9, 123), A0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private WC A07(SparseArray<WC> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            WC valueAt = sparseArray.valueAt(0);
            String[] strArr = A0a;
            if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0a;
            strArr2[3] = "rqQHM6H1nSOokoudFwB3RuPZ1ngN52G4";
            strArr2[6] = "kku7Gywm5eC4QL4LYZ2gmRPNr3XPud5Y";
            return valueAt;
        }
        return (WC) AbstractC1589es.A01(sparseArray.get(i10));
    }

    public static WL A08(SparseArray<WL> sparseArray) {
        boolean z10;
        boolean z11;
        WL wl = null;
        long sampleOffset = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            WL valueAt = sparseArray.valueAt(i10);
            z10 = valueAt.A06;
            if (z10 || valueAt.A01 != valueAt.A05.A01) {
                z11 = valueAt.A06;
                if (!z11 || valueAt.A02 != valueAt.A08.A01) {
                    long nextSampleOffset = valueAt.A05();
                    if (nextSampleOffset < sampleOffset) {
                        wl = valueAt;
                        sampleOffset = nextSampleOffset;
                    }
                }
            }
        }
        return wl;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x0054 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C() {
        /*
            r7 = this;
            r5 = 100
            r0 = 2
            com.facebook.ads.redexgen.X.Uo[] r0 = new com.facebook.ads.redexgen.X.InterfaceC1157Uo[r0]
            r7.A0J = r0
            r6 = 0
            com.facebook.ads.redexgen.X.Uo r0 = r7.A0M
            if (r0 == 0) goto L15
            com.facebook.ads.redexgen.X.Uo[] r2 = r7.A0J
            int r1 = r6 + 1
            com.facebook.ads.redexgen.X.Uo r0 = r7.A0M
            r2[r6] = r0
            r6 = r1
        L15:
            int r0 = r7.A0K
            r0 = r0 & 4
            if (r0 == 0) goto L2c
            com.facebook.ads.redexgen.X.Uo[] r4 = r7.A0J
            int r3 = r6 + 1
            com.facebook.ads.redexgen.X.UL r2 = r7.A0D
            int r1 = r5 + 1
            r0 = 5
            com.facebook.ads.redexgen.X.Uo r0 = r2.AJX(r5, r0)
            r4[r6] = r0
            r6 = r3
            r5 = r1
        L2c:
            com.facebook.ads.redexgen.X.Uo[] r0 = r7.A0J
            java.lang.Object[] r0 = com.facebook.ads.redexgen.X.AbstractC1672gE.A1I(r0, r6)
            com.facebook.ads.redexgen.X.Uo[] r0 = (com.facebook.ads.redexgen.X.InterfaceC1157Uo[]) r0
            r7.A0J = r0
            com.facebook.ads.redexgen.X.Uo[] r4 = r7.A0J
            int r3 = r4.length
            r2 = 0
        L3a:
            if (r2 >= r3) goto L46
            r1 = r4[r2]
            com.facebook.ads.redexgen.X.ZM r0 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0c
            r1.A6U(r0)
            int r2 = r2 + 1
            goto L3a
        L46:
            java.util.List<com.facebook.ads.redexgen.X.ZM> r0 = r7.A0X
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Uo[] r0 = new com.facebook.ads.redexgen.X.InterfaceC1157Uo[r0]
            r7.A0I = r0
            r3 = 0
        L51:
            com.facebook.ads.redexgen.X.Uo[] r0 = r7.A0I
            int r0 = r0.length
            if (r3 >= r0) goto L72
            com.facebook.ads.redexgen.X.UL r1 = r7.A0D
            int r2 = r5 + 1
            r0 = 3
            com.facebook.ads.redexgen.X.Uo r1 = r1.AJX(r5, r0)
            java.util.List<com.facebook.ads.redexgen.X.ZM> r0 = r7.A0X
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.redexgen.X.ZM r0 = (com.facebook.ads.redexgen.X.ZM) r0
            r1.A6U(r0)
            com.facebook.ads.redexgen.X.Uo[] r0 = r7.A0I
            r0[r3] = r1
            int r3 = r3 + 1
            r5 = r2
            goto L51
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0C():void");
    }

    private void A0E(long j10) {
        while (!this.A0W.isEmpty()) {
            ArrayDeque<WK> arrayDeque = this.A0W;
            String[] strArr = A0a;
            if (strArr[2].charAt(2) != strArr[4].charAt(2)) {
                throw new RuntimeException();
            }
            A0a[1] = "v7UJ00ZUODvl1z5erlvjIWXW9XCC2BVp";
            WK removeFirst = arrayDeque.removeFirst();
            this.A03 -= removeFirst.A00;
            long j11 = removeFirst.A01;
            if (removeFirst.A02) {
                j11 += j10;
            }
            if (this.A0U != null) {
                j11 = this.A0U.A05(j11);
            }
            for (InterfaceC1157Uo interfaceC1157Uo : this.A0J) {
                interfaceC1157Uo.AI0(j11, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j10) throws Q6 {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j10) {
            A0I(this.A0V.pop());
        }
        A0B();
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0G(WJ wj) throws IOException {
        int i10 = ((int) this.A07) - this.A00;
        C1648fq c1648fq = this.A0F;
        if (c1648fq != null) {
            wj.readFully(c1648fq.A0l(), 8, i10);
            A0P(new C1133Tl(this.A01, c1648fq), wj.A8d(), wj.A9F());
        } else {
            wj.AJ9(i10);
        }
        A0F(wj.A8d());
    }

    private void A0H(WJ wj) throws IOException {
        WL wl = null;
        long j10 = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i10 = 0; i10 < size; i10++) {
            WL nextTrackBundle = this.A0L.valueAt(i10);
            C1194Wb c1194Wb = nextTrackBundle.A08;
            if (c1194Wb.A0A) {
                int i11 = (c1194Wb.A03 > j10 ? 1 : (c1194Wb.A03 == j10 ? 0 : -1));
                String[] strArr = A0a;
                if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                    throw new RuntimeException();
                }
                A0a[7] = "sSeCeOMztPCHTRyGw6YoolpgXWm1";
                if (i11 < 0) {
                    j10 = c1194Wb.A03;
                    wl = this.A0L.valueAt(i10);
                }
            }
        }
        if (wl == null) {
            this.A02 = 3;
            return;
        }
        int A8d = (int) (j10 - wj.A8d());
        if (A8d >= 0) {
            wj.AJ9(A8d);
            wl.A08.A04(wj);
            return;
        }
        throw Q6.A01(A0A(384, 39, 10), null);
    }

    private void A0I(C1134Tm c1134Tm) throws Q6 {
        if (((W5) c1134Tm).A00 == 1836019574) {
            A0K(c1134Tm);
        } else if (((W5) c1134Tm).A00 == 1836019558) {
            A0J(c1134Tm);
        } else if (this.A0V.isEmpty()) {
        } else {
            this.A0V.peek().A04(c1134Tm);
        }
    }

    private void A0J(C1134Tm c1134Tm) throws Q6 {
        A0L(c1134Tm, this.A0L, this.A0O != null, this.A0K, this.A0Y);
        DrmInitData A06 = A06(c1134Tm.A02);
        if (A06 != null) {
            int i10 = this.A0L.size();
            for (int trackCount = 0; trackCount < i10; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(A06);
            }
        }
        if (this.A0B != -9223372036854775807L) {
            int size = this.A0L.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0L.valueAt(i11).A0A(this.A0B);
            }
            this.A0B = -9223372036854775807L;
        }
    }

    private void A0K(C1134Tm c1134Tm) throws Q6 {
        AbstractC1589es.A0A(this.A0O == null, A0A(680, 20, 10));
        DrmInitData A06 = A06(c1134Tm.A02);
        C1134Tm c1134Tm2 = (C1134Tm) AbstractC1589es.A01(c1134Tm.A02(1836475768));
        SparseArray<WC> sparseArray = new SparseArray<>();
        long j10 = -9223372036854775807L;
        int size = c1134Tm2.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1133Tl c1133Tl = c1134Tm2.A02.get(i10);
            if (((W5) c1133Tl).A00 == 1953654136) {
                Pair<Integer, WC> A04 = A04(c1133Tl.A00);
                sparseArray.put(((Integer) A04.first).intValue(), (WC) A04.second);
            } else if (((W5) c1133Tl).A00 == 1835362404) {
                j10 = A02(c1133Tl.A00);
            }
        }
        List<C1195Wc> A0O = WB.A0O(c1134Tm, new UV(), j10, A06, (this.A0K & 16) != 0, false, new InterfaceC1771hs() { // from class: com.facebook.ads.redexgen.X.Tg
            @Override // com.facebook.ads.redexgen.X.InterfaceC1771hs
            public final Object A41(Object obj) {
                return FragmentedMp4Extractor2.this.A0c((WZ) obj);
            }
        });
        int size2 = A0O.size();
        if (this.A0L.size() == 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                C1195Wc c1195Wc = A0O.get(i11);
                WZ wz = c1195Wc.A03;
                this.A0L.put(wz.A00, new WL(this.A0D.AJX(i11, wz.A03), c1195Wc, A07(sparseArray, wz.A00)));
                this.A08 = Math.max(this.A08, wz.A04);
            }
            this.A0D.A6E();
            return;
        }
        AbstractC1589es.A08(this.A0L.size() == size2);
        for (int i12 = 0; i12 < size2; i12++) {
            C1195Wc c1195Wc2 = A0O.get(i12);
            WZ wz2 = c1195Wc2.A03;
            this.A0L.get(wz2.A00).A0C(c1195Wc2, A07(sparseArray, wz2.A00));
        }
    }

    public static void A0L(C1134Tm c1134Tm, SparseArray<WL> sparseArray, boolean z10, int i10, byte[] bArr) throws Q6 {
        int size = c1134Tm.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<C1134Tm> list = c1134Tm.A01;
            int i12 = A0a[0].charAt(8);
            if (i12 == 108) {
                throw new RuntimeException();
            }
            A0a[1] = "SCrtLO5kQchETV6HN8r6qzYC2Kf61uip";
            C1134Tm child = list.get(i11);
            int i13 = ((W5) child).A00;
            if (i13 == 1953653094) {
                A0M(child, sparseArray, z10, i10, bArr);
            }
        }
    }

    public static void A0N(C1134Tm c1134Tm, WL wl, int i10) throws Q6 {
        int trunSampleCount = 0;
        int i11 = 0;
        List<C1133Tl> list = c1134Tm.A02;
        int leafChildrenSize = list.size();
        int i12 = 0;
        while (true) {
            String[] strArr = A0a;
            String str = strArr[3];
            String str2 = strArr[6];
            int totalSampleCount = str.charAt(22);
            int trunCount = str2.charAt(22);
            if (totalSampleCount != trunCount) {
                break;
            }
            A0a[7] = "x4LcLHSu306Omyjc";
            if (i12 < leafChildrenSize) {
                C1133Tl c1133Tl = list.get(i12);
                int trunCount2 = ((W5) c1133Tl).A00;
                if (trunCount2 == 1953658222) {
                    C1648fq c1648fq = c1133Tl.A00;
                    c1648fq.A0f(12);
                    int trunCount3 = c1648fq.A0L();
                    if (trunCount3 > 0) {
                        i11 += trunCount3;
                        int totalSampleCount2 = A0a[1].charAt(6);
                        if (totalSampleCount2 == 106) {
                            break;
                        }
                        String[] strArr2 = A0a;
                        strArr2[2] = "ttv73UHw6JjUd5ghqFAuq52OOmAilHlj";
                        strArr2[4] = "UgvGKV2ts7dQ8WVJJRfD2DexW0iVww2u";
                        trunSampleCount++;
                    } else {
                        continue;
                    }
                }
                i12++;
            } else {
                wl.A02 = 0;
                wl.A00 = 0;
                wl.A01 = 0;
                wl.A08.A03(trunSampleCount, i11);
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < leafChildrenSize; i15++) {
                    C1133Tl c1133Tl2 = list.get(i15);
                    String[] strArr3 = A0a;
                    String str3 = strArr3[3];
                    String str4 = strArr3[6];
                    int totalSampleCount3 = str3.charAt(22);
                    int trunCount4 = str4.charAt(22);
                    if (totalSampleCount3 == trunCount4) {
                        A0a[7] = "LketcJIvu95PfMTlJaWYyFW3xnxb";
                        C1133Tl c1133Tl3 = c1133Tl2;
                        int trunCount5 = ((W5) c1133Tl3).A00;
                        if (trunCount5 == 1953658222) {
                            int totalSampleCount4 = i13 + 1;
                            i14 = A01(wl, i13, i10, c1133Tl3.A00, i14);
                            i13 = totalSampleCount4;
                        }
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0P(C1133Tl c1133Tl, long j10, Uri uri) throws Q6 {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A05(c1133Tl);
        } else if (((W5) c1133Tl).A00 == 1936286840) {
            Pair<Long, WY> A05 = A05(c1133Tl.A00, j10);
            long longValue = ((Long) A05.first).longValue();
            String[] strArr = A0a;
            if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            A0a[5] = "kPgFMScEwFvlSPQ83kJP4U1MrtzNnJpH";
            this.A0C = longValue;
            this.A0D.AID((Uj) A05.second);
            this.A0G = true;
        } else if (((W5) c1133Tl).A00 != 1701671783 || uri == null) {
        } else {
            A0S(c1133Tl.A00, uri);
        }
    }

    public static void A0Q(C1193Wa c1193Wa, C1648fq c1648fq, C1194Wb c1194Wb) throws Q6 {
        int i10 = c1193Wa.A00;
        c1648fq.A0f(8);
        int vectorSize = c1648fq.A0C();
        if ((W5.A02(vectorSize) & 1) == 1) {
            c1648fq.A0g(8);
        }
        int defaultSampleInfoSize = c1648fq.A0I();
        int sampleCount = c1648fq.A0L();
        int vectorSize2 = c1194Wb.A00;
        if (sampleCount <= vectorSize2) {
            int i11 = 0;
            if (defaultSampleInfoSize != 0) {
                i11 = 0 + (defaultSampleInfoSize * sampleCount);
                Arrays.fill(c1194Wb.A0F, 0, sampleCount, defaultSampleInfoSize > i10);
            } else {
                boolean[] zArr = c1194Wb.A0F;
                for (int totalSize = 0; totalSize < sampleCount; totalSize++) {
                    int vectorSize3 = c1648fq.A0I();
                    i11 += vectorSize3;
                    zArr[totalSize] = vectorSize3 > i10;
                    if (A0a[7].length() == 10) {
                        throw new RuntimeException();
                    }
                    A0a[0] = "DVf2WE8rBkeTLiD3n7oPfeL6uKvADzGi";
                }
            }
            boolean[] zArr2 = c1194Wb.A0F;
            int vectorSize4 = c1194Wb.A00;
            Arrays.fill(zArr2, sampleCount, vectorSize4, false);
            if (i11 > 0) {
                c1194Wb.A02(i11);
                return;
            }
            return;
        }
        StringBuilder append = new StringBuilder().append(A0A(IronSourceConstants.INIT_COMPLETE, 18, 47)).append(sampleCount).append(A0A(40, 38, 73));
        int vectorSize5 = c1194Wb.A00;
        throw Q6.A01(append.append(vectorSize5).toString(), null);
    }

    public static void A0R(C1648fq c1648fq, int i10, C1194Wb c1194Wb) throws Q6 {
        c1648fq.A0f(i10 + 8);
        int fullAtom = c1648fq.A0C();
        int flags = W5.A02(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = c1648fq.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = c1194Wb.A0F;
                int fullAtom4 = c1194Wb.A00;
                Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = c1194Wb.A00;
            if (sampleCount == fullAtom5) {
                Arrays.fill(c1194Wb.A0F, 0, sampleCount, z10);
                int fullAtom6 = c1648fq.A07();
                c1194Wb.A02(fullAtom6);
                c1194Wb.A05(c1648fq);
                return;
            }
            StringBuilder append = new StringBuilder().append(A0A(532, 18, 24)).append(sampleCount).append(A0A(0, 40, 101));
            int fullAtom7 = c1194Wb.A00;
            throw Q6.A01(append.append(fullAtom7).toString(), null);
        }
        throw Q6.A00(A0A(458, 56, 40));
    }

    public static void A0T(C1648fq c1648fq, C1194Wb c1194Wb) throws Q6 {
        c1648fq.A0f(8);
        int flags = c1648fq.A0C();
        int fullAtom = W5.A02(flags) & 1;
        if (fullAtom == 1) {
            c1648fq.A0g(8);
        }
        int A0L = c1648fq.A0L();
        if (A0L == 1) {
            int entryCount = W5.A03(flags);
            c1194Wb.A03 += entryCount == 0 ? c1648fq.A0Q() : c1648fq.A0R();
            String[] strArr = A0a;
            String str = strArr[3];
            String str2 = strArr[6];
            int fullAtom2 = str.charAt(22);
            int entryCount2 = str2.charAt(22);
            if (fullAtom2 != entryCount2) {
                throw new RuntimeException();
            }
            A0a[5] = "SWXRgqOgtWRkLw968YOAVCsfjXOIcM9q";
            return;
        }
        throw Q6.A01(A0A(727, 29, 50) + A0L, null);
    }

    public static void A0U(C1648fq c1648fq, C1194Wb c1194Wb) throws Q6 {
        A0R(c1648fq, 0, c1194Wb);
    }

    public static void A0V(C1648fq c1648fq, C1194Wb c1194Wb, byte[] bArr) throws Q6 {
        c1648fq.A0f(8);
        c1648fq.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0d)) {
            return;
        }
        A0R(c1648fq, 16, c1194Wb);
    }

    public static boolean A0W(int i10) {
        if (i10 != 1836019574 && i10 != 1953653099 && i10 != 1835297121 && i10 != 1835626086 && i10 != 1937007212) {
            if (A0a[5].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[3] = "WPWfN65Zr81WP9ZqInKRP2PneU53sRQs";
            strArr[6] = "80NnBKXbkB9K88FgTUxXqfPgNIzOOBfB";
            if (i10 != 1836019558) {
                if (A0a[0].charAt(8) == 'l') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0a;
                strArr2[2] = "0OvuBctf6r2iGfxjF23VmN7lXK4IfrRA";
                strArr2[4] = "A3v6tdRPZnkPb8cKozl1fcCJk7KVsS8O";
                if (i10 != 1953653094 && i10 != 1836475768 && i10 != 1701082227) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r4 != 1886614376) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
        if (r4 == 1935763834) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ad, code lost:
        if (r4 == 1935763823) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
        if (r4 == 1936027235) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b7, code lost:
        if (r4 == 1970628964) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
        if (r4 == 1935828848) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00be, code lost:
        r2 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d3, code lost:
        if (r2[3].charAt(22) == r2[6].charAt(22)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
        com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a[5] = "cDfr4RaEYNbI8okuEudkE4O8yawNg2Rg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
        if (r4 == 1936158820) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e1, code lost:
        if (r4 == 1701606260) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e6, code lost:
        if (r4 == 1835362404) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00eb, code lost:
        if (r4 != 1701671783) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ef, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
        r2 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a;
        r2[2] = "VSvrp5bUKlHJG5h7Y4pJ0ieIRtzAwYlK";
        r2[4] = "x3vrfs2amKE9vjuS4yL6sNfyNgyn6rqN";
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fd, code lost:
        if (r4 == 1936158820) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0100, code lost:
        if (r4 != 1886614376) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0X(int r4) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0X(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a1, code lost:
        if (r3 <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a3, code lost:
        r2 = new com.facebook.ads.redexgen.X.C1648fq((int) r11.A07);
        r0 = r11.A0P;
        java.lang.System.arraycopy(r0.A0l(), 0, r2.A0l(), 0, 8);
        r11.A0F = r2;
        r11.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c9, code lost:
        if (r3 <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e5, code lost:
        throw com.facebook.ads.redexgen.X.Q6.A00(A0A(335, 49, 58));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Y(com.facebook.ads.redexgen.X.WJ r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0Y(com.facebook.ads.redexgen.X.WJ):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0246, code lost:
        if (r8 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0248, code lost:
        r9 = r8.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0250, code lost:
        if (com.facebook.ads.redexgen.X.C0962Mq.A03(com.facebook.ads.redexgen.X.EnumC0959Mn.A1E) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0254, code lost:
        if (r18.A0E == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0256, code lost:
        r8 = r18.A0E.A05.A03.A07;
        r4 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a;
        r3 = r4[3];
        r4 = r4[6];
        r3 = r3.charAt(22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0270, code lost:
        if (r3 == r4.charAt(22)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0281, code lost:
        if (A0A(857, 21, 2).equals(r8.A0W) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0283, code lost:
        r12 = r12 | 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0285, code lost:
        r3 = r1;
        r5.AI0(r1, r12, r18.A06, 0, r9);
        r18.A0A = r3;
        A0E(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0299, code lost:
        if (r6.A0D() != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x029b, code lost:
        r18.A0E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029e, code lost:
        r18.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a2, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a3, code lost:
        com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0a[1] = "r9sW4LmjAZQ5quXSvtPI02WdCCCr3uIr";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02b9, code lost:
        if (A0A(857, 21, 2).equals(r8.A0W) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02c8, code lost:
        if (r8 != null) goto L78;
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Z(com.facebook.ads.redexgen.X.WJ r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0Z(com.facebook.ads.redexgen.X.WJ):boolean");
    }

    public static boolean A0a(WZ wz) {
        if (wz.A08 == null || wz.A08.length != 1 || wz.A09 == null) {
            return false;
        }
        if (wz.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = AbstractC1672gE.A0U(wz.A08[0] + wz.A09[0], 1000000L, wz.A05);
        return editListEndMediaTimeUs >= wz.A04;
    }

    public static /* synthetic */ UK[] A0b() {
        return new UK[]{new C1127Te()};
    }

    public final WZ A0c(WZ wz) {
        return wz;
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A0D = ul;
        A0B();
        A0C();
        if (this.A0O != null) {
            this.A0L.put(0, new WL(ul.AJX(0, this.A0O.A03), new C1195Wc(this.A0O, new long[0], new int[0], 0, new long[0], new int[0], 0L), new WC(0, 0, 0, 0)));
            this.A0D.A6E();
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final int AGT(WJ wj, C1152Ug c1152Ug) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (A0Y(wj)) {
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                    A0G(wj);
                    break;
                case 2:
                    A0H(wj);
                    break;
                default:
                    if (!A0Z(wj)) {
                        break;
                    } else if (A0a[7].length() != 10) {
                        String[] strArr = A0a;
                        strArr[3] = "dFm9hkZXFotyWCB4D0UT2sPnBD7xdKq6";
                        strArr[6] = "3q6oN7s18Q2TDIHhSEZOjjPTNBIO0D18";
                        return 0;
                    } else {
                        throw new RuntimeException();
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AIC(long j10, long j11) {
        int size = this.A0L.size();
        for (int i10 = 0; i10 < size; i10++) {
            SparseArray<WL> sparseArray = this.A0L;
            int i11 = A0a[0].charAt(8);
            if (i11 == 108) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[2] = "jqv3jOUumqRgYYZiBGeDaSxGuLBnNUBj";
            strArr[4] = "ggvuVsNu7gZuN1Cql3DxBigPSwziOkYN";
            sparseArray.valueAt(i10).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j11;
        this.A0V.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        return WX.A01(wj);
    }
}
