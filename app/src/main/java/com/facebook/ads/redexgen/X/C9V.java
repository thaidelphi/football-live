package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.9V  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C9V implements InterfaceC1135Tn {
    public static byte[] A06;
    public static String[] A07 = {"yMDohKHGc01a8Mouj", "VYM3", "NjB1rd5eng", "A0MgTqcY4eQRXRFiVgfCfb", "JfGh6zGouJ6JL", "EiGCjZr9v1cNihi0jXDNNL", "hBVWWyV9viaSIEWHVtwPcSPFWF19KpwR", "cxblfdldHc2W7"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long[] A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C9V A01(long j10, long j11, UY uy, C1648fq c1648fq) {
        int A0L;
        int i10 = uy.A04;
        int i11 = uy.A03;
        int A0C = c1648fq.A0C();
        if ((A0C & 1) != 1 || (A0L = c1648fq.A0L()) == 0) {
            String[] strArr = A07;
            if (strArr[0].length() != strArr[2].length()) {
                A07[5] = "VGQbUcHSTKZxn9MjDRfNVjMpBA9e";
                return null;
            }
            throw new RuntimeException();
        }
        long A0U = AbstractC1672gE.A0U(A0L, i10 * 1000000, i11);
        if ((A0C & 6) != 6) {
            return new C9V(j11, uy.A02, A0U);
        }
        long A0Q = c1648fq.A0Q();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = c1648fq.A0I();
        }
        if (j10 != -1 && j10 != j11 + A0Q) {
            AbstractC1633fb.A07(A02(27, 10, 71), A02(2, 25, 55) + j10 + A02(0, 2, 35) + (j11 + A0Q));
        }
        return new C9V(j11, uy.A02, A0U, A0Q, jArr);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{55, 59, 87, 70, 65, 72, 47, 107, 110, 123, 110, 47, 124, 102, 117, 106, 47, 98, 102, 124, 98, 110, 123, 108, 103, 53, 47, 39, 22, 17, 24, 44, 26, 26, 20, 26, 13};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        long[] jArr;
        double d10;
        if (AAY()) {
            long A0T = AbstractC1672gE.A0T(j10, 0L, this.A04);
            double d11 = (A0T * 100.0d) / this.A04;
            if (d11 <= 0.0d) {
                d10 = 0.0d;
            } else if (d11 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i10 = (int) d11;
                double d12 = ((long[]) AbstractC1589es.A02(this.A05))[i10];
                d10 = (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d11 - i10)) + d12;
            }
            return new C1153Ui(new C1154Uk(A0T, this.A03 + AbstractC1672gE.A0T(Math.round((d10 / 256.0d) * this.A02), this.A00, this.A02 - 1)));
        }
        return new C1153Ui(new C1154Uk(0L, this.A03 + this.A00));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1135Tn
    public final long A97(long j10) {
        long j11 = j10 - this.A03;
        if (!AAY() || j11 <= this.A00) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC1589es.A02(this.A05);
        double d10 = (j11 * 256.0d) / this.A02;
        int A0L = AbstractC1672gE.A0L(jArr, (long) d10, true, true);
        long A00 = A00(A0L);
        long j12 = jArr[A0L];
        long A002 = A00(A0L + 1);
        long j13 = A0L == 99 ? 256L : jArr[A0L + 1];
        return Math.round((A002 - A00) * (j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12))) + A00;
    }

    static {
        A03();
    }

    public C9V(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public C9V(long j10, int i10, long j11, long j12, long[] jArr) {
        this.A03 = j10;
        this.A00 = i10;
        this.A04 = j11;
        this.A05 = jArr;
        this.A02 = j12;
        this.A01 = j12 != -1 ? j10 + j12 : -1L;
    }

    private long A00(int i10) {
        return (this.A04 * i10) / 100;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1135Tn
    public final long A7Z() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return this.A05 != null;
    }
}
