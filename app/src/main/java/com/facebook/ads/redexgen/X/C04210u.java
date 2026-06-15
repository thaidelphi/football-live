package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.0u  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04210u extends AbstractC05525z {
    public static byte[] A0H;
    public static String[] A0I = {"NvI8w9M6tlyvGt07ROp5gcDFRuKjs8sbr", "o6o1GZjn6w5iD3TuD7IypBj6qZhE8LE6", "03eW3cAl0TOGEZ", "1BnEJcPqgm2BbABF4O4jACcV83pPEeQV", "FKmOFb8XU4uKcVg885KEf0akfF0rU573", "m3moL65Zf5ywac", "r8huNeiZhEpXsxRNP4WAvwel03jPBrv7", "gLbeJV9t5Lmu237q9Xp5Qy3JaC8KcwEH"};
    public AnonymousClass64 A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final OI<C1462co> A0B;
    public final float A0C;
    public final int A0D;
    public final long A0E;
    public final InterfaceC1502dS A0F;
    public final InterfaceC1596ez A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C04210u(@MetaExoPlayerCustomization("Used for OculusAdaptiveTrackSelection") C1246Yc c1246Yc, @MetaExoPlayerCustomization("Used to retain old value for Oculus") int[] iArr, int i10, InterfaceC1502dS interfaceC1502dS, int i11, long j10, long j11, long j12, int i12, int i13, float f10, float f11, long j13, List<C1462co> list, InterfaceC1596ez interfaceC1596ez) {
        super(c1246Yc, iArr, i10);
        if (j12 < j10) {
            AbstractC1633fb.A07(A03(0, 22, 97), A03(22, 90, 73));
            j12 = j10;
        }
        this.A0F = interfaceC1502dS;
        this.A0D = i11;
        this.A08 = j10 * 1000;
        this.A0E = j11 * 1000;
        this.A09 = 1000 * j12;
        this.A07 = i12;
        this.A06 = i13;
        this.A0C = f10;
        this.A05 = f11;
        this.A0B = OI.A05(list);
        this.A0A = j13;
        this.A0G = interfaceC1596ez;
        this.A01 = 1.0f;
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0H = new byte[]{94, 123, 126, 111, 107, 118, 105, 122, 75, 109, 126, 124, 116, 76, 122, 115, 122, 124, 107, 118, 112, 113, 118, 83, 93, 66, 68, 67, 94, 89, 80, 23, 90, 94, 89, 115, 66, 69, 86, 67, 94, 88, 89, 99, 88, 101, 82, 67, 86, 94, 89, 118, 81, 67, 82, 69, 115, 94, 68, 84, 86, 69, 83, 122, 68, 23, 67, 88, 23, 85, 82, 23, 86, 67, 23, 91, 82, 86, 68, 67, 23, 90, 94, 89, 115, 66, 69, 86, 67, 94, 88, 89, 113, 88, 69, 102, 66, 86, 91, 94, 67, 78, 126, 89, 84, 69, 82, 86, 68, 82, 122, 68};
    }

    static {
        A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        if (r11.length == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r11.length == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
        r3 = r8[r5][0];
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<java.lang.Integer> */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.OI<com.facebook.ads.redexgen.X.OI<com.facebook.ads.redexgen.X.C1462co>> A00(com.facebook.ads.redexgen.X.C1479d5[] r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04210u.A00(com.facebook.ads.redexgen.X.d5[]):com.facebook.ads.redexgen.X.OI");
    }

    public static /* synthetic */ OI A01(C1479d5[] c1479d5Arr) {
        return A00(c1479d5Arr);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nH != com.google.common.collect.Multimap<java.lang.Double, java.lang.Integer> */
    public static OI<Integer> A02(long[][] jArr) {
        InterfaceC2098nH A00 = AbstractC2100nJ.A02().A03().A00();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                double[] logBitrates = new double[jArr[i10].length];
                int i11 = 0;
                while (true) {
                    double d10 = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        d10 = Math.log(jArr[i10][i11]);
                    }
                    logBitrates[i11] = d10;
                    i11++;
                }
                double d11 = logBitrates[logBitrates.length - 1] - logBitrates[0];
                int i12 = 0;
                for (int i13 = 1; i12 < logBitrates.length - i13; i13 = 1) {
                    A00.AGM(Double.valueOf(d11 == 0.0d ? 1.0d : (((logBitrates[i12] + logBitrates[i12 + 1]) * 0.5d) - logBitrates[0]) / d11), Integer.valueOf(i10));
                    i12++;
                }
            }
        }
        Collection values = A00.values();
        if (A0I[6].charAt(9) != 'E') {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[7] = "fccdpFL18VU70aMgRkcSNTW0PyqGAz3V";
        strArr[1] = "acyPQfwETLj0MHixODwctPUCudb6Lo1G";
        return OI.A05(values);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    public static void A05(List<C4T<C1462co>> list, long[] jArr) {
        long j10 = 0;
        for (long totalBitrate : jArr) {
            j10 += totalBitrate;
        }
        int i10 = 0;
        while (true) {
            int size = list.size();
            String[] strArr = A0I;
            if (strArr[7].charAt(10) == strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A0I[3] = "bQnYpudw8mff8zjN61SfJHhNQb2nbe8x";
            if (i10 < size) {
                C4T<C1462co> c4t = list.get(i10);
                if (c4t != null) {
                    c4t.A04(new C1462co(j10, jArr[i10]));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static long[][] A06(C1479d5[] c1479d5Arr) {
        long j10;
        long[] jArr;
        long[][] jArr2 = new long[c1479d5Arr.length];
        for (int i10 = 0; i10 < c1479d5Arr.length; i10++) {
            C1479d5 c1479d5 = c1479d5Arr[i10];
            int i11 = A0I[3].charAt(29);
            if (i11 == 101) {
                String[] strArr = A0I;
                strArr[4] = "aSvaoGQLGgOa9buJlpv9o2k7cZpDmtG8";
                strArr[0] = "t9s5xDQEFZXiIwVGN4zCrxq7Hjw4B6GmB";
                if (c1479d5 == null) {
                    int i12 = A0I[6].charAt(9);
                    if (i12 == 69) {
                        String[] strArr2 = A0I;
                        strArr2[7] = "5RSJOnMVbtsbO4kxzXJNTV8CxqlDEspb";
                        strArr2[1] = "LGic1BtlSbbsvncSfV1yEytiCGz3Td7Q";
                        jArr2[i10] = new long[0];
                    }
                } else {
                    jArr2[i10] = new long[c1479d5.A02.length];
                    for (int i13 = 0; i13 < c1479d5.A02.length; i13++) {
                        C1246Yc c1246Yc = c1479d5.A01;
                        String[] strArr3 = A0I;
                        String str = strArr3[2];
                        String str2 = strArr3[5];
                        int i14 = str.length();
                        if (i14 != str2.length()) {
                            j10 = c1246Yc.A08(c1479d5.A02[i13]).A05;
                            jArr = jArr2[i10];
                            if (j10 != -1) {
                                jArr[i13] = j10;
                            }
                            j10 = 0;
                            jArr[i13] = j10;
                        } else {
                            String[] strArr4 = A0I;
                            strArr4[2] = "XRfby8rpBMRzlH";
                            strArr4[5] = "c4CCeZBcxZ1Xb3";
                            j10 = c1246Yc.A08(c1479d5.A02[i13]).A05;
                            jArr = jArr2[i10];
                            if (j10 != -1) {
                                jArr[i13] = j10;
                            }
                            j10 = 0;
                            jArr[i13] = j10;
                        }
                    }
                    Arrays.sort(jArr2[i10]);
                }
            }
            throw new RuntimeException();
        }
        return jArr2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05525z, com.facebook.ads.redexgen.X.QD
    public final void A5n() {
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05525z, com.facebook.ads.redexgen.X.QD
    public final void A6A() {
        this.A04 = -9223372036854775807L;
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.X.QD
    public final int A8t() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05525z, com.facebook.ads.redexgen.X.QD
    public final void AEW(float f10) {
        this.A01 = f10;
    }
}
