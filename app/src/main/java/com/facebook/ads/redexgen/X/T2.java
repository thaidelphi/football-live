package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class T2 implements Y7 {
    public static byte[] A0D;
    public static String[] A0E = {"IKIOwGzI", "PdvnIlE1FRpoGrRRSS8vm7daIUygEoqq", "ophPL1zH", "bU", "bToXL0LBRe6rOfu16aDAZ4WralkjQGIv", "9d4JsDXogUBR1ixzN80yiZiJrMLi4C3I", "mL1I", "sm"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public ZM A05;
    public InterfaceC1157Uo A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final C1647fp A0A;
    public final C1648fq A0B;
    public final String A0C;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 42);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{-58, -38, -55, -50, -44, -108, -58, -56, -103};
    }

    static {
        A02();
    }

    public T2() {
        this(null);
    }

    public T2(String str) {
        this.A0A = new C1647fp(new byte[16]);
        this.A0B = new C1648fq(this.A0A.A00);
        this.A02 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
        this.A0C = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r4.equals(r7.A05.A0W) != false) goto L14;
     */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.fp r1 = r7.A0A
            r0 = 0
            r1.A08(r0)
            com.facebook.ads.redexgen.X.fp r0 = r7.A0A
            com.facebook.ads.redexgen.X.U4 r3 = com.facebook.ads.redexgen.X.U5.A04(r0)
            com.facebook.ads.redexgen.X.ZM r5 = r7.A05
            r2 = 0
            r1 = 9
            r0 = 59
            java.lang.String r4 = A00(r2, r1, r0)
            if (r5 == 0) goto L52
            int r1 = r3.A01
            com.facebook.ads.redexgen.X.ZM r0 = r7.A05
            int r0 = r0.A06
            if (r1 != r0) goto L52
            int r6 = r3.A04
            com.facebook.ads.redexgen.X.ZM r5 = r7.A05
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.T2.A0E
            r0 = 2
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.T2.A0E
            java.lang.String r1 = "XkloENK3mD6tCjMFQ2y0JVLf2I"
            r0 = 6
            r2[r0] = r1
            int r0 = r5.A0G
            if (r6 != r0) goto L52
            com.facebook.ads.redexgen.X.ZM r0 = r7.A05
            java.lang.String r0 = r0.A0W
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L80
        L52:
            com.facebook.ads.redexgen.X.P5 r1 = new com.facebook.ads.redexgen.X.P5
            r1.<init>()
            java.lang.String r0 = r7.A07
            com.facebook.ads.redexgen.X.P5 r0 = r1.A0y(r0)
            com.facebook.ads.redexgen.X.P5 r1 = r0.A11(r4)
            int r0 = r3.A01
            com.facebook.ads.redexgen.X.P5 r1 = r1.A0b(r0)
            int r0 = r3.A04
            com.facebook.ads.redexgen.X.P5 r1 = r1.A0m(r0)
            java.lang.String r0 = r7.A0C
            com.facebook.ads.redexgen.X.P5 r0 = r1.A10(r0)
            com.facebook.ads.redexgen.X.ZM r0 = r0.A14()
            r7.A05 = r0
            com.facebook.ads.redexgen.X.Uo r1 = r7.A06
            com.facebook.ads.redexgen.X.ZM r0 = r7.A05
            r1.A6U(r0)
        L80:
            int r0 = r3.A02
            r7.A01 = r0
            int r0 = r3.A03
            long r2 = (long) r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            com.facebook.ads.redexgen.X.ZM r0 = r7.A05
            int r0 = r0.A0G
            long r0 = (long) r0
            long r2 = r2 / r0
            r7.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.T2.A01():void");
    }

    private boolean A03(C1648fq c1648fq) {
        int A0I;
        while (true) {
            if (c1648fq.A07() <= 0) {
                return false;
            }
            if (!this.A09) {
                this.A09 = c1648fq.A0I() == 172;
            } else {
                A0I = c1648fq.A0I();
                this.A09 = A0I == 172;
                if (A0I == 64 || A0I == 65) {
                    break;
                }
            }
        }
        this.A08 = A0I == 65;
        return true;
    }

    private boolean A04(C1648fq c1648fq, byte[] bArr, int i10) {
        int min = Math.min(c1648fq.A07(), i10 - this.A00);
        int bytesToRead = this.A00;
        c1648fq.A0k(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A50(C1648fq c1648fq) {
        AbstractC1589es.A02(this.A06);
        while (c1648fq.A07() > 0) {
            switch (this.A02) {
                case 0:
                    if (!A03(c1648fq)) {
                        break;
                    } else {
                        this.A02 = 1;
                        this.A0B.A0l()[0] = -84;
                        this.A0B.A0l()[1] = (byte) (this.A08 ? 65 : 64);
                        this.A00 = 2;
                        break;
                    }
                case 1:
                    if (!A04(c1648fq, this.A0B.A0l(), 16)) {
                        break;
                    } else {
                        A01();
                        this.A0B.A0f(0);
                        this.A06.AHx(this.A0B, 16);
                        this.A02 = 2;
                        break;
                    }
                case 2:
                    int min = Math.min(c1648fq.A07(), this.A01 - this.A00);
                    if (A0E[1].charAt(10) == 'p') {
                        A0E[5] = "qQf7sxLWMATWj9eNdS7CPqpQmxboQMYu";
                        this.A06.AHx(c1648fq, min);
                        int bytesToRead = this.A00;
                        this.A00 = bytesToRead + min;
                        int i10 = this.A00;
                        int bytesToRead2 = this.A01;
                        if (i10 != bytesToRead2) {
                            break;
                        } else {
                            int bytesToRead3 = (this.A04 > (-9223372036854775807L) ? 1 : (this.A04 == (-9223372036854775807L) ? 0 : -1));
                            if (bytesToRead3 != 0) {
                                this.A06.AI0(this.A04, 1, this.A01, 0, null);
                                this.A04 += this.A03;
                            }
                            this.A02 = 0;
                            break;
                        }
                    } else {
                        throw new RuntimeException();
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A07 = ys.A04();
        this.A06 = ul.AJX(ys.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFy(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A04 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AIB() {
        this.A02 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }
}
