package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class T5 implements Y7 {
    public static byte[] A0C;
    public static String[] A0D = {"c7td4l6FhBQAK", "DTHfzoMJ0AzZypdM6Gm8SFo2H6uPkgyC", "acXXVZBnBbPogRNCgSi7WwOlt2A6rEqU", "KWcTzk", "yQkgcEXCXTe994X1gET7oDSOs3PQrGWW", "OzWHzMcOaKXzhhI1lFkYNj", "9ngkgdBg0bHMabGOjTK6ZQB43lTpVAVA", "E5Uig"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public ZM A05;
    public InterfaceC1157Uo A06;
    public String A07;
    public boolean A08;
    public final C1647fp A09;
    public final C1648fq A0A;
    public final String A0B;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{32, 52, 37, 40, 46, 110, 32, 34, 114};
    }

    static {
        A02();
    }

    public T5() {
        this(null);
    }

    public T5(String str) {
        this.A09 = new C1647fp(new byte[128]);
        this.A0A = new C1648fq(this.A09.A00);
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
        this.A0B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (com.facebook.ads.redexgen.X.AbstractC1672gE.A1E(r3.A06, r6.A05.A0W) != false) goto L11;
     */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.fp r1 = r6.A09
            r0 = 0
            r1.A08(r0)
            com.facebook.ads.redexgen.X.fp r0 = r6.A09
            com.facebook.ads.redexgen.X.U1 r3 = com.facebook.ads.redexgen.X.U2.A09(r0)
            com.facebook.ads.redexgen.X.ZM r0 = r6.A05
            if (r0 == 0) goto L45
            int r5 = r3.A01
            com.facebook.ads.redexgen.X.ZM r4 = r6.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.T5.A0D
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 16
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.T5.A0D
            java.lang.String r1 = "hZiseNxsIbSCoqloHp2d8N6o9NjurTOT"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "HrrIsFtX2yN9qnKXbxq00UFvnInSr7rO"
            r0 = 2
            r2[r0] = r1
            int r0 = r4.A06
            if (r5 != r0) goto L45
            int r1 = r3.A04
            com.facebook.ads.redexgen.X.ZM r0 = r6.A05
            int r0 = r0.A0G
            if (r1 != r0) goto L45
            java.lang.String r1 = r3.A06
            com.facebook.ads.redexgen.X.ZM r0 = r6.A05
            java.lang.String r0 = r0.A0W
            boolean r0 = com.facebook.ads.redexgen.X.AbstractC1672gE.A1E(r1, r0)
            if (r0 != 0) goto L91
        L45:
            com.facebook.ads.redexgen.X.P5 r1 = new com.facebook.ads.redexgen.X.P5
            r1.<init>()
            java.lang.String r0 = r6.A07
            com.facebook.ads.redexgen.X.P5 r1 = r1.A0y(r0)
            java.lang.String r0 = r3.A06
            com.facebook.ads.redexgen.X.P5 r1 = r1.A11(r0)
            int r0 = r3.A01
            com.facebook.ads.redexgen.X.P5 r1 = r1.A0b(r0)
            int r0 = r3.A04
            com.facebook.ads.redexgen.X.P5 r1 = r1.A0m(r0)
            java.lang.String r0 = r6.A0B
            com.facebook.ads.redexgen.X.P5 r1 = r1.A10(r0)
            int r0 = r3.A00
            com.facebook.ads.redexgen.X.P5 r4 = r1.A0j(r0)
            r2 = 0
            r1 = 9
            r0 = 81
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.String r0 = r3.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L84
            int r0 = r3.A00
            r4.A0a(r0)
        L84:
            com.facebook.ads.redexgen.X.ZM r0 = r4.A14()
            r6.A05 = r0
            com.facebook.ads.redexgen.X.Uo r1 = r6.A06
            com.facebook.ads.redexgen.X.ZM r0 = r6.A05
            r1.A6U(r0)
        L91:
            int r0 = r3.A02
            r6.A01 = r0
            int r0 = r3.A03
            long r2 = (long) r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            com.facebook.ads.redexgen.X.ZM r0 = r6.A05
            int r0 = r0.A0G
            long r0 = (long) r0
            long r2 = r2 / r0
            r6.A03 = r2
            return
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.T5.A01():void");
    }

    private boolean A03(C1648fq c1648fq) {
        while (true) {
            if (c1648fq.A07() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c1648fq.A0I() == 11;
            } else {
                int A0I = c1648fq.A0I();
                if (A0I == 119) {
                    this.A08 = false;
                    String[] strArr = A0D;
                    String str = strArr[3];
                    String str2 = strArr[5];
                    int length = str.length();
                    int secondByte = str2.length();
                    if (length != secondByte) {
                        String[] strArr2 = A0D;
                        strArr2[4] = "pkPVjmqCIyAzdCmFBjs3PoIqXLVcrUPH";
                        strArr2[2] = "tJTrq5h2LVUSplF3MulfB87twvagryml";
                        return true;
                    }
                    throw new RuntimeException();
                }
                this.A08 = A0I == 11;
            }
        }
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
            int i10 = this.A02;
            String[] strArr = A0D;
            if (strArr[6].charAt(3) != strArr[1].charAt(3)) {
                A0D[0] = "kVkZkVO2q3SJ4";
                switch (i10) {
                    case 0:
                        if (!A03(c1648fq)) {
                            break;
                        } else {
                            this.A02 = 1;
                            this.A0A.A0l()[0] = 11;
                            this.A0A.A0l()[1] = 119;
                            this.A00 = 2;
                            break;
                        }
                    case 1:
                        if (!A04(c1648fq, this.A0A.A0l(), 128)) {
                            break;
                        } else {
                            A01();
                            this.A0A.A0f(0);
                            this.A06.AHx(this.A0A, 128);
                            this.A02 = 2;
                            break;
                        }
                    case 2:
                        int min = Math.min(c1648fq.A07(), this.A01 - this.A00);
                        this.A06.AHx(c1648fq, min);
                        this.A00 += min;
                        if (this.A00 == this.A01) {
                            if (this.A04 != -9223372036854775807L) {
                                this.A06.AI0(this.A04, 1, this.A01, 0, null);
                                this.A04 += this.A03;
                            }
                            this.A02 = 0;
                            break;
                        } else {
                            break;
                        }
                }
            } else {
                throw new RuntimeException();
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
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }
}
