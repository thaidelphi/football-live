package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Tb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1124Tb implements UK, Uj {
    public static byte[] A0Q;
    public static String[] A0R = {"NUT6ypXSHiS4J1Qe9g4LOXxZvmmU7mnX", "JH5e6JiDLqpQkmQeK07Zz6ngW1v2lGkJ", "I5aweA8RGWIFypEejOu6", "Q5w5ismp6kt0KnxqTdEJCbmbthzdLpcQ", "mvrYhRWEJPsztg67rX76Ookp6Zk7pVOx", "T99H6ErOcdo6LgjhhlFbccuqSDdx1PBc", "NGnQsXxOXXsOwnBVwWcfQbm7HiQdaJGD", "Tm7Ky6D3rFaIAf5wuTE1sGpz4jcDe75W"};
    public static final UO A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0A;
    public long A0B;
    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0C;
    public UL A0D;
    public MotionPhotoMetadata A0E;
    public C1648fq A0F;
    public WP[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final WW A0J;
    public final C1648fq A0K;
    public final C1648fq A0L;
    public final C1648fq A0M;
    public final C1648fq A0N;
    public final ArrayDeque<C1134Tm> A0O;
    public final List<Metadata.Entry> A0P;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private int A02(WJ wj, C1152Ug c1152Ug) throws IOException {
        int i10;
        long A8d = wj.A8d();
        if (this.A08 == -1) {
            this.A08 = A01(A8d);
            if (this.A08 == -1) {
                return -1;
            }
        }
        WP wp = this.A0G[this.A08];
        InterfaceC1157Uo interfaceC1157Uo = wp.A01;
        int i11 = wp.A00;
        long j10 = wp.A04.A06[i11];
        int i12 = wp.A04.A05[i11];
        C1158Up c1158Up = wp.A02;
        long j11 = (j10 - A8d) + this.A05;
        if (j11 < 0 || j11 >= 262144) {
            c1152Ug.A00 = j10;
            return 1;
        }
        if (wp.A03.A02 == 1) {
            j11 += 8;
            i12 -= 8;
        }
        wj.AJ9((int) j11);
        WZ wz = wp.A03;
        if (A0R[4].charAt(0) == 'm') {
            String[] strArr = A0R;
            strArr[6] = "V5VPNaDOx7L3pxLqCvlnTCZLNa4LXGZn";
            strArr[5] = "WTXU2x7OL0C6DOLdbcfsxjQxykFDhBKM";
            if (wz.A01 != 0) {
                byte[] A0l = this.A0L.A0l();
                A0l[0] = 0;
                A0l[1] = 0;
                A0l[2] = 0;
                int i13 = wp.A03.A01;
                int i14 = 4 - wp.A03.A01;
                while (this.A06 < i12) {
                    if (this.A07 == 0) {
                        wj.readFully(A0l, i14, i13);
                        this.A05 += i13;
                        this.A0L.A0f(0);
                        int A0C = this.A0L.A0C();
                        if (A0C < 0) {
                            throw Q6.A01(A09(48, 18, 63), null);
                        }
                        this.A07 = A0C;
                        this.A0M.A0f(0);
                        interfaceC1157Uo.AHx(this.A0M, 4);
                        this.A06 += 4;
                        i12 += i14;
                    } else {
                        int AHv = interfaceC1157Uo.AHv(wj, this.A07, false);
                        this.A05 += AHv;
                        this.A06 += AHv;
                        this.A07 -= AHv;
                    }
                }
            } else {
                if (A09(66, 9, 40).equals(wp.A03.A07.A0W)) {
                    if (this.A06 == 0) {
                        U5.A07(i12, this.A0N);
                        interfaceC1157Uo.AHx(this.A0N, 7);
                        this.A06 += 7;
                    }
                    i12 += 7;
                } else if (c1158Up != null) {
                    c1158Up.A03(wj);
                }
                while (this.A06 < i12) {
                    int AHv2 = interfaceC1157Uo.AHv(wj, i12 - this.A06, false);
                    this.A05 += AHv2;
                    this.A06 += AHv2;
                    this.A07 -= AHv2;
                }
            }
            long j12 = wp.A04.A07[i11];
            int i15 = wp.A04.A04[i11];
            if (c1158Up != null) {
                i10 = 0;
                c1158Up.A04(interfaceC1157Uo, j12, i15, i12, 0, null);
                if (i11 + 1 == wp.A04.A01) {
                    String[] strArr2 = A0R;
                    if (strArr2[7].charAt(18) == strArr2[3].charAt(18)) {
                        A0R[0] = "pfKdmMtqQATW4tq2F1tkx3HXWBYLJOh7";
                        c1158Up.A05(interfaceC1157Uo, null);
                    }
                }
            } else {
                i10 = 0;
                interfaceC1157Uo.AI0(j12, i15, i12, 0, null);
            }
            wp.A00++;
            this.A08 = -1;
            this.A05 = i10;
            this.A06 = i10;
            this.A07 = i10;
            return i10;
        }
        throw new RuntimeException();
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Q, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0Q = new byte[]{3, 54, 45, 47, 98, 49, 43, 56, 39, 98, 46, 39, 49, 49, 98, 54, 42, 35, 44, 98, 42, 39, 35, 38, 39, 48, 98, 46, 39, 44, 37, 54, 42, 98, 106, 55, 44, 49, 55, 50, 50, 45, 48, 54, 39, 38, 107, 108, 52, 19, 11, 28, 17, 20, 25, 93, 51, 60, 49, 93, 17, 24, 19, 26, 9, 21, 11, 31, 14, 3, 5, 69, 11, 9, 94, 77, 89, 72, 69, 67, 3, 88, 94, 89, 73, 1, 68, 72};
    }

    static {
        A0C();
        A0S = new UO() { // from class: com.facebook.ads.redexgen.X.Tc
            @Override // com.facebook.ads.redexgen.X.UO
            public final UK[] A5D() {
                return C1124Tb.A0M();
            }

            @Override // com.facebook.ads.redexgen.X.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
    }

    public C1124Tb() {
        this(0);
    }

    public C1124Tb(int i10) {
        this.A0I = i10;
        this.A04 = (i10 & 4) != 0 ? 3 : 0;
        this.A0J = new WW();
        this.A0P = new ArrayList();
        this.A0K = new C1648fq(16);
        this.A0O = new ArrayDeque<>();
        this.A0M = new C1648fq(AbstractC1149Ud.A03);
        this.A0L = new C1648fq(4);
        this.A0N = new C1648fq();
        this.A08 = -1;
        this.A0D = UL.A00;
        this.A0G = new WP[0];
    }

    public static int A00(int i10) {
        switch (i10) {
            case 1751476579:
                return 2;
            case 1903435808:
                return 1;
            default:
                return 0;
        }
    }

    private int A01(long j10) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i10 = 1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        for (int i12 = 0; i12 < this.A0G.length; i12++) {
            WP wp = this.A0G[i12];
            int i13 = wp.A00;
            if (i13 != wp.A04.A01) {
                long j13 = wp.A04.A06[i13];
                long j14 = ((long[][]) AbstractC1672gE.A0f(this.A0H))[i12][i13];
                long j15 = j13 - j10;
                int i14 = (j15 < 0 || j15 >= 262144) ? 1 : 0;
                if ((i14 == 0 && i10 != 0) || (i14 == i10 && j15 < sampleAccumulatedBytes)) {
                    i10 = i14;
                    sampleAccumulatedBytes = j15;
                    i11 = i12;
                    j11 = j14;
                }
                if (j14 < j12) {
                    j12 = j14;
                    trackIndex = i14;
                    minAccumulatedBytesTrackIndex = i12;
                }
            }
        }
        if (j12 == Long.MAX_VALUE || trackIndex == 0) {
            return i11;
        }
        long preferredSkipAmount = 10485760 + j12;
        if (j11 < preferredSkipAmount) {
            return i11;
        }
        return minAccumulatedBytesTrackIndex;
    }

    private int A03(WJ wj, C1152Ug c1152Ug) throws IOException {
        int A07 = this.A0J.A07(wj, c1152Ug, this.A0P);
        if (A07 == 1) {
            int result = (c1152Ug.A00 > 0L ? 1 : (c1152Ug.A00 == 0L ? 0 : -1));
            if (result == 0) {
                A0A();
            }
        }
        return A07;
    }

    public static int A04(C1195Wc c1195Wc, long j10) {
        int A00 = c1195Wc.A00(j10);
        if (A00 == -1) {
            return c1195Wc.A01(j10);
        }
        return A00;
    }

    public static int A05(C1648fq c1648fq) {
        c1648fq.A0f(8);
        int majorBrand = A00(c1648fq.A0C());
        if (majorBrand != 0) {
            return majorBrand;
        }
        c1648fq.A0g(4);
        while (c1648fq.A07() > 0) {
            int majorBrand2 = A00(c1648fq.A0C());
            if (majorBrand2 != 0) {
                return majorBrand2;
            }
        }
        return 0;
    }

    public static long A06(C1195Wc c1195Wc, long j10, long j11) {
        int A04 = A04(c1195Wc, j10);
        if (A04 == -1) {
            return j11;
        }
        return Math.min(c1195Wc.A06[A04], j11);
    }

    private final C1153Ui A07(long j10, int secondSampleIndex) {
        long j11;
        long j12;
        if (this.A0G.length == 0) {
            return new C1153Ui(C1154Uk.A03);
        }
        long j13 = -9223372036854775807L;
        long j14 = -1;
        int i10 = secondSampleIndex != -1 ? secondSampleIndex : this.A03;
        if (i10 != -1) {
            C1195Wc c1195Wc = this.A0G[i10].A04;
            int A04 = A04(c1195Wc, j10);
            if (A04 == -1) {
                return new C1153Ui(C1154Uk.A03);
            }
            j12 = c1195Wc.A07[A04];
            j11 = c1195Wc.A06[A04];
            if (j12 < j10 && A04 < c1195Wc.A01 - 1) {
                int mainTrackIndex = c1195Wc.A01(j10);
                if (A0R[4].charAt(0) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr = A0R;
                strArr[7] = "5TbJYWak67IZTn7wKEErPgQ4PrngZc54";
                strArr[3] = "J15wyTyjd5tEdyyLx9EQD1n9Dt372wer";
                if (mainTrackIndex != -1 && mainTrackIndex != A04) {
                    j13 = c1195Wc.A07[mainTrackIndex];
                    long[] jArr = c1195Wc.A06;
                    if (A0R[0].charAt(30) != 'Y') {
                        A0R[2] = "ZiTUjhZue4Lf5tJA0gsj";
                        j14 = jArr[mainTrackIndex];
                    } else {
                        j14 = jArr[mainTrackIndex];
                    }
                }
            }
        } else {
            j11 = Long.MAX_VALUE;
            j12 = j10;
        }
        String[] strArr2 = A0R;
        if (strArr2[6].charAt(7) != strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        A0R[4] = "mauqB61ONe8hzhGmkHhtsqUQU0XayHtr";
        if (secondSampleIndex == -1) {
            for (int i11 = 0; i11 < this.A0G.length; i11++) {
                if (i11 != this.A03) {
                    C1195Wc sampleTable = this.A0G[i11].A04;
                    j11 = A06(sampleTable, j12, j11);
                    if (j13 != -9223372036854775807L) {
                        j14 = A06(sampleTable, j13, j14);
                    }
                }
            }
        }
        C1154Uk c1154Uk = new C1154Uk(j12, j11);
        if (j13 == -9223372036854775807L) {
            return new C1153Ui(c1154Uk);
        }
        return new C1153Ui(c1154Uk, new C1154Uk(j13, j14));
    }

    public static /* synthetic */ WZ A08(WZ wz) {
        return wz;
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 == 2 && (this.A0I & 2) != 0) {
            this.A0D.AJX(0, 4).A6U(new P5().A0v(this.A0E == null ? null : new Metadata(this.A0E)).A14());
            this.A0D.A6E();
            this.A0D.AID(new C1191Vy(-9223372036854775807L));
        }
    }

    private void A0D(long j10) throws Q6 {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j10) {
            C1134Tm pop = this.A0O.pop();
            if (((W5) pop).A00 == 1836019574) {
                A0G(pop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                C1134Tm containerAtom = this.A0O.peek();
                containerAtom.A04(pop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j10) {
        if (this.A01 == 1836086884) {
            this.A0E = new MotionPhotoMetadata(0L, j10, -9223372036854775807L, j10 + this.A00, this.A09 - this.A00);
        }
    }

    private void A0F(WJ wj) throws IOException {
        this.A0N.A0d(8);
        wj.AG1(this.A0N.A0l(), 0, 8);
        WB.A0Q(this.A0N);
        wj.AJ9(this.A0N.A09());
        wj.AHr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010e, code lost:
        if (0 == r13) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
        if (2 == r13) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0157, code lost:
        if (r13 > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
        r3 = r11.A05.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015e, code lost:
        if (r3 != r11.A01) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0160, code lost:
        r20 = 0;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0163, code lost:
        r2 = r11.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0165, code lost:
        if (r13 >= r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0167, code lost:
        r2 = r11.A05[r13];
        r20 = r20 + r2;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0171, code lost:
        if (r13 > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0184, code lost:
        if (com.facebook.ads.redexgen.X.C1124Tb.A0R[0].charAt(30) == 'Y') goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0186, code lost:
        com.facebook.ads.redexgen.X.C1124Tb.A0R[4] = "mn2EOq8tQKipwnoEuaelyA1uoWGMjSBx";
        r10.A0a((int) ((8000000 * r20) / r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0226, code lost:
        throw new java.lang.RuntimeException();
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0G(com.facebook.ads.redexgen.X.C1134Tm r37) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1124Tb.A0G(com.facebook.ads.redexgen.X.Tm):void");
    }

    private void A0H(WP wp, long j10) {
        C1195Wc c1195Wc = wp.A04;
        int sampleIndex = c1195Wc.A00(j10);
        if (sampleIndex == -1) {
            sampleIndex = c1195Wc.A01(j10);
        }
        wp.A00 = sampleIndex;
    }

    public static boolean A0I(int i10) {
        if (i10 != 1836019574 && i10 != 1953653099 && i10 != 1835297121 && i10 != 1835626086) {
            String[] strArr = A0R;
            if (strArr[7].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            A0R[2] = "3YIqewhCwjG946DMJijN";
            if (i10 != 1937007212 && i10 != 1701082227 && i10 != 1835365473) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r4 != 1937011555) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r4 == 1937011578) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r4 == 1937013298) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r4 == 1937007471) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r4 == 1668232756) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        if (r4 == 1953196132) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r4 == 1718909296) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r4 == 1969517665) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r4 == 1801812339) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
        if (r4 != 1768715124) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
        if (r4 != 1937011555) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0J(int r4) {
        /*
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r4 == r0) goto L94
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r4 == r0) goto L94
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r4 == r0) goto L94
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r4 == r0) goto L94
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r4 == r0) goto L94
            r3 = 1937011571(0x73747373, float:1.9367401E31)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1124Tb.A0R
            r0 = 1
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L30
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L30:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1124Tb.A0R
            java.lang.String r1 = "N6gbuPifcKq94V5CzUEVD043Y49SVUG8"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "g0CnhcYi042EtcaaKhEv8tAgD7qyB3ig"
            r0 = 3
            r2[r0] = r1
            if (r4 == r3) goto L94
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r4 == r0) goto L94
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r4 == r0) goto L94
            r3 = 1937011555(0x73747363, float:1.9367382E31)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1124Tb.A0R
            r0 = 6
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L98
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1124Tb.A0R
            java.lang.String r1 = "KPmeYlzfGdD3LLwLXnwktzsmL0Ou8sjR"
            r0 = 1
            r2[r0] = r1
            if (r4 == r3) goto L94
        L67:
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r4 == r0) goto L94
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r4 == r0) goto L94
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r4 == r0) goto L94
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r4 == r0) goto L94
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r4 == r0) goto L94
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r4 == r0) goto L94
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r4 == r0) goto L94
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r4 == r0) goto L94
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r4 != r0) goto L96
        L94:
            r0 = 1
        L95:
            return r0
        L96:
            r0 = 0
            goto L95
        L98:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1124Tb.A0R
            java.lang.String r1 = "jzzH39RnaOpKTTGMhBx4RZhmZWHFKRbC"
            r0 = 0
            r2[r0] = r1
            if (r4 == r3) goto L94
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1124Tb.A0J(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
        if (r3 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
        if (r10.A00 != 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
        com.facebook.ads.redexgen.X.AbstractC1589es.A08(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0100, code lost:
        if (r10.A09 > 2147483647L) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0102, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0103, code lost:
        com.facebook.ads.redexgen.X.AbstractC1589es.A08(r0);
        r2 = new com.facebook.ads.redexgen.X.C1648fq((int) r10.A09);
        r0 = r10.A0K;
        java.lang.System.arraycopy(r0.A0l(), 0, r2.A0l(), 0, 8);
        r10.A0F = r2;
        r10.A04 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0120, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0122, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
        if (r3 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
        r3 = r11.A8d() - r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0142, code lost:
        if (com.facebook.ads.redexgen.X.C1124Tb.A0R[1].charAt(3) == 'e') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
        com.facebook.ads.redexgen.X.C1124Tb.A0R[4] = "mhu2zk2K0Swmk47DOyJIkVTyAzSdmj33";
        A0E(r3);
        r10.A0F = null;
        r10.A04 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0154, code lost:
        r2 = com.facebook.ads.redexgen.X.C1124Tb.A0R;
        r2[7] = "APjeOCKWMEGnWLZjfqELVPMbDhQp1Xft";
        r2[3] = "072jIj0JdWCub8DHysEboGlMzuki9op9";
        A0E(r3);
        r10.A0F = null;
        r10.A04 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0K(com.facebook.ads.redexgen.X.WJ r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1124Tb.A0K(com.facebook.ads.redexgen.X.WJ):boolean");
    }

    private boolean A0L(WJ wj, C1152Ug c1152Ug) throws IOException {
        long j10 = this.A09 - this.A00;
        long A8d = wj.A8d() + j10;
        boolean z10 = false;
        C1648fq c1648fq = this.A0F;
        if (c1648fq != null) {
            wj.readFully(c1648fq.A0l(), this.A00, (int) j10);
            if (this.A01 == 1718909296) {
                this.A02 = A05(c1648fq);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A05(new C1133Tl(this.A01, c1648fq));
            }
        } else if (j10 < 262144) {
            int i10 = (int) j10;
            String[] strArr = A0R;
            if (strArr[7].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            A0R[2] = "CPmd8d6bWhE45MZJwdPT";
            wj.AJ9(i10);
        } else {
            c1152Ug.A00 = wj.A8d() + j10;
            z10 = true;
        }
        A0D(A8d);
        return z10 && this.A04 != 2;
    }

    public static /* synthetic */ UK[] A0M() {
        return new UK[]{new C1124Tb()};
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        r2 = r6[r10];
        r7[r10][r2] = r13;
        r13 = r13 + r15[r10].A04.A05[r2];
        r2 = r2 + 1;
        r6[r10] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r2 >= r7[r10].length) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
        r5[r10] = r15[r10].A04.A07[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        r4[r10] = true;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long[][] A0N(com.facebook.ads.redexgen.X.WP[] r15) {
        /*
            int r0 = r15.length
            long[][] r7 = new long[r0]
            int r0 = r15.length
            int[] r6 = new int[r0]
            int r0 = r15.length
            long[] r5 = new long[r0]
            int r0 = r15.length
            boolean[] r4 = new boolean[r0]
            r2 = 0
        Ld:
            int r0 = r15.length
            if (r2 >= r0) goto L28
            r0 = r15[r2]
            com.facebook.ads.redexgen.X.Wc r0 = r0.A04
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r7[r2] = r0
            r0 = r15[r2]
            com.facebook.ads.redexgen.X.Wc r0 = r0.A04
            long[] r1 = r0.A07
            r0 = 0
            r0 = r1[r0]
            r5[r2] = r0
            int r2 = r2 + 1
            goto Ld
        L28:
            r13 = 0
            r3 = 0
        L2b:
            int r0 = r15.length
            if (r3 >= r0) goto L8c
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = -1
            r8 = 0
        L35:
            int r9 = r15.length
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1124Tb.A0R
            r0 = 1
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L4a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1124Tb.A0R
            java.lang.String r1 = "PvQHTc1qEQE1BCDGCOvlZEhDyshyiKQ3"
            r0 = 0
            r2[r0] = r1
            if (r8 >= r9) goto L63
            boolean r0 = r4[r8]
            if (r0 != 0) goto L60
            r1 = r5[r8]
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L60
            r10 = r8
            r11 = r5[r8]
        L60:
            int r8 = r8 + 1
            goto L35
        L63:
            r2 = r6[r10]
            r0 = r7[r10]
            r0[r2] = r13
            r0 = r15[r10]
            com.facebook.ads.redexgen.X.Wc r0 = r0.A04
            int[] r0 = r0.A05
            r0 = r0[r2]
            long r0 = (long) r0
            long r13 = r13 + r0
            r1 = 1
            int r2 = r2 + r1
            r6[r10] = r2
            r0 = r7[r10]
            int r0 = r0.length
            if (r2 >= r0) goto L87
            r0 = r15[r10]
            com.facebook.ads.redexgen.X.Wc r0 = r0.A04
            long[] r0 = r0.A07
            r0 = r0[r2]
            r5[r10] = r0
            goto L2b
        L87:
            r4[r10] = r1
            int r3 = r3 + 1
            goto L2b
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1124Tb.A0N(com.facebook.ads.redexgen.X.WP[]):long[][]");
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        return A07(j10, -1);
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A0D = ul;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final int AGT(WJ wj, C1152Ug c1152Ug) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (A0K(wj)) {
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                    if (!A0L(wj, c1152Ug)) {
                        break;
                    } else if (A0R[0].charAt(30) != 'Y') {
                        A0R[0] = "WW7RU0YyVZYcqT7LKW1qhBVpSoRBqfXQ";
                        return 1;
                    } else {
                        throw new RuntimeException();
                    }
                case 2:
                    return A02(wj, c1152Ug);
                case 3:
                    int A03 = A03(wj, c1152Ug);
                    String[] strArr = A0R;
                    if (strArr[7].charAt(18) == strArr[3].charAt(18)) {
                        A0R[4] = "mDiw27TLi806vElWjIgWsRLwXmS1eMms";
                        return A03;
                    }
                    String[] strArr2 = A0R;
                    strArr2[6] = "xgJiGfYOT8y1zClzSI10nAxOa2eHPkLm";
                    strArr2[5] = "anAV1A8OrmlTs1bkKqgXGKp0FRJYDIne";
                    return A03;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AIC(long j10, long j11) {
        WP[] wpArr;
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j10 == 0) {
            if (this.A04 != 3) {
                A0A();
                return;
            }
            this.A0J.A08();
            this.A0P.clear();
            return;
        }
        for (WP wp : this.A0G) {
            A0H(wp, j11);
            if (wp.A02 != null) {
                wp.A02.A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        return WX.A02(wj, (this.A0I & 2) != 0);
    }
}
