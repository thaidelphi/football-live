package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.flac.PictureFrame;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
@MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class US {
    public static byte[] A00;
    public static String[] A01 = {"7xrPmsNNd1unvJpEfGKxRElcl", "UF6TMW5ECNWn0ZgVy6X49cXfyO7gkJiE", "E", "RDu94cFDn72yF7GpK0dr", "Y", "Ii87nBGvK8Q0hhczZRY1", "vqoXMgf1LSeO3kCxRF8sJspBkbslDPq2", "Jk0EpoMWrnH7PRkGzB"};

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 47;
            String[] strArr = A01;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A01[6] = "hZwP6y6oyh76aU1TPWI3XaYDcV3tuEqo";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-47, -20, -12, -9, -16, -17, -85, -1, -6, -85, -3, -16, -20, -17, -85, -47, -41, -52, -50, -85, -2, -1, -3, -16, -20, -8, -85, -8, -20, -3, -10, -16, -3, -71, -58, -23, -14, -13, -12, -96, -26, -14, -31, -19, -27, -96, -28, -17, -27, -13, -96, -18, -17, -12, -96, -13, -12, -31, -14, -12, -96, -9, -23, -12, -24, -96, -13, -7, -18, -29, -96, -29, -17, -28, -27, -82};
    }

    static {
        A08();
    }

    public static int A00(WJ wj) throws IOException {
        wj.AHr();
        C1648fq c1648fq = new C1648fq(2);
        wj.AG1(c1648fq.A0l(), 0, 2);
        int syncCode = c1648fq.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            wj.AHr();
            return syncCode;
        }
        wj.AHr();
        throw Q6.A01(A06(34, 42, 81), null);
    }

    public static Metadata A01(WJ wj, boolean z10) throws IOException {
        VP id3FramePredicate;
        if (z10) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = B2.A03;
        }
        Metadata A002 = new UX().A00(wj, id3FramePredicate);
        if (A002 == null || A002.A02() == 0) {
            return null;
        }
        return A002;
    }

    public static Metadata A02(WJ wj, boolean z10) throws IOException {
        wj.AHr();
        long A8Y = wj.A8Y();
        Metadata A012 = A01(wj, z10);
        wj.AJ9((int) (wj.A8Y() - A8Y));
        return A012;
    }

    public static UT A03(WJ wj, int i10) throws IOException {
        C1648fq c1648fq = new C1648fq(i10);
        wj.readFully(c1648fq.A0l(), 0, i10);
        return A04(c1648fq);
    }

    public static UT A04(C1648fq c1648fq) {
        c1648fq.A0g(1);
        int A0K = c1648fq.A0K();
        int length = c1648fq.A09();
        long j10 = length + A0K;
        int i10 = A0K / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long A0P = c1648fq.A0P();
            int length2 = (A0P > (-1L) ? 1 : (A0P == (-1L) ? 0 : -1));
            if (length2 == 0) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = A0P;
            jArr2[i11] = c1648fq.A0P();
            c1648fq.A0g(2);
            i11++;
        }
        int length3 = c1648fq.A09();
        c1648fq.A0g((int) (j10 - length3));
        return new UT(jArr, jArr2);
    }

    public static UU A05(WJ wj) throws IOException {
        byte[] bArr = new byte[38];
        wj.readFully(bArr, 0, 38);
        return new UU(bArr, 4);
    }

    public static List<String> A07(WJ wj, int i10) throws IOException {
        C1648fq c1648fq = new C1648fq(i10);
        wj.readFully(c1648fq.A0l(), 0, i10);
        c1648fq.A0g(4);
        return Arrays.asList(AbstractC1164Uv.A05(c1648fq, false, false).A02);
    }

    public static void A09(WJ wj) throws IOException {
        C1648fq c1648fq = new C1648fq(4);
        wj.readFully(c1648fq.A0l(), 0, 4);
        if (c1648fq.A0Q() == 1716281667) {
            return;
        }
        throw Q6.A01(A06(0, 34, 92), null);
    }

    public static boolean A0A(WJ wj) throws IOException {
        C1648fq c1648fq = new C1648fq(4);
        wj.AG1(c1648fq.A0l(), 0, 4);
        return c1648fq.A0Q() == 1716281667;
    }

    public static boolean A0B(WJ wj, UR ur) throws IOException {
        wj.AHr();
        C1647fp c1647fp = new C1647fp(new byte[4]);
        wj.AG1(c1647fp.A00, 0, 4);
        boolean A0H = c1647fp.A0H();
        int A04 = c1647fp.A04(7);
        int A042 = c1647fp.A04(24) + 4;
        if (A04 == 0) {
            UU A05 = A05(wj);
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "4gxQC6i9k4AoNZbM3f30";
            strArr2[5] = "AhWhbFWdu27jwwP6x47z";
            ur.A00 = A05;
        } else {
            UU uu = ur.A00;
            if (uu != null) {
                if (A04 != 3) {
                    if (A04 == 4) {
                        ur.A00 = uu.A0B(A07(wj, A042));
                    } else if (A04 == 6) {
                        C1648fq c1648fq = new C1648fq(A042);
                        wj.readFully(c1648fq.A0l(), 0, A042);
                        c1648fq.A0g(4);
                        PictureFrame pictureFrame = PictureFrame.A00(c1648fq);
                        ur.A00 = uu.A0A(C0958Mm.A03(pictureFrame));
                    } else {
                        wj.AJ9(A042);
                    }
                } else {
                    ur.A00 = uu.A09(A03(wj, A042));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return A0H;
    }
}
