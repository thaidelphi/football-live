package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Sw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1119Sw implements Y7 {
    public static byte[] A06;
    public static String[] A07 = {"in4sXJhlGobuFdjY0QRO8DRxFSX4UzFj", "kKmapTRMiWxVb5OYWR2BnMQXysM3TtHT", "4OhnUYbAqAvDq0qXKSeHgf6qCHGf", "5nrq0rkB35odpXo60pAgwwiZNfvhkgFn", "A0wM4HXFPQzXq5huwwinIghlC1p9AzQO", "JI1YPzku", "KbPcBHa9ubdp5JSgYLr1LSdltsZPvo5b", "Ak9vzkpjISqOmIoLdrnrrsTWwG9a"};
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public final List<YO> A04;
    public final InterfaceC1157Uo[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{109, 124, 124, 96, 101, 111, 109, 120, 101, 99, 98, 35, 104, 122, 110, Byte.MAX_VALUE, 121, 110, Byte.MAX_VALUE};
    }

    static {
        A01();
    }

    public C1119Sw(List<YO> list) {
        this.A04 = list;
        this.A05 = new InterfaceC1157Uo[list.size()];
    }

    private boolean A02(C1648fq c1648fq, int i10) {
        if (c1648fq.A07() == 0) {
            return false;
        }
        int A0I = c1648fq.A0I();
        String[] strArr = A07;
        if (strArr[6].charAt(25) != strArr[1].charAt(25)) {
            throw new RuntimeException();
        }
        A07[5] = "5eCkBQiP";
        if (A0I != i10) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A50(C1648fq c1648fq) {
        InterfaceC1157Uo[] interfaceC1157UoArr;
        if (this.A03) {
            if (this.A00 == 2 && !A02(c1648fq, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c1648fq, 0)) {
                return;
            }
            int A09 = c1648fq.A09();
            int A072 = c1648fq.A07();
            for (InterfaceC1157Uo interfaceC1157Uo : this.A05) {
                c1648fq.A0f(A09);
                String[] strArr = A07;
                String str = strArr[6];
                String str2 = strArr[1];
                int charAt = str.charAt(25);
                int dataPosition = str2.charAt(25);
                if (charAt != dataPosition) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[6] = "OQZAa7aqqiADcVGaZRRB4nmdqsApKfmg";
                strArr2[1] = "EHEq6drNwOxHXaKJ8wx087n95sBJtbzI";
                interfaceC1157Uo.AHx(c1648fq, A072);
            }
            int dataPosition2 = this.A01;
            this.A01 = dataPosition2 + A072;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    @Override // com.facebook.ads.redexgen.X.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A5S(com.facebook.ads.redexgen.X.UL r8, com.facebook.ads.redexgen.X.YS r9) {
        /*
            r7 = this;
            r4 = 0
        L1:
            com.facebook.ads.redexgen.X.Uo[] r0 = r7.A05
            int r0 = r0.length
            if (r4 >= r0) goto L52
            java.util.List<com.facebook.ads.redexgen.X.YO> r0 = r7.A04
            java.lang.Object r6 = r0.get(r4)
            com.facebook.ads.redexgen.X.YO r6 = (com.facebook.ads.redexgen.X.YO) r6
            r9.A05()
            int r1 = r9.A03()
            r0 = 3
            com.facebook.ads.redexgen.X.Uo r3 = r8.AJX(r1, r0)
            com.facebook.ads.redexgen.X.P5 r1 = new com.facebook.ads.redexgen.X.P5
            r1.<init>()
            java.lang.String r0 = r9.A04()
            com.facebook.ads.redexgen.X.P5 r5 = r1.A0y(r0)
            r2 = 0
            r1 = 19
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.P5 r1 = r5.A11(r0)
            byte[] r0 = r6.A02
            java.util.List r0 = java.util.Collections.singletonList(r0)
            com.facebook.ads.redexgen.X.P5 r1 = r1.A12(r0)
            java.lang.String r0 = r6.A01
            com.facebook.ads.redexgen.X.P5 r0 = r1.A10(r0)
            com.facebook.ads.redexgen.X.ZM r0 = r0.A14()
            r3.A6U(r0)
            com.facebook.ads.redexgen.X.Uo[] r0 = r7.A05
            r0[r4] = r3
            int r4 = r4 + 1
            goto L1
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1119Sw.A5S(com.facebook.ads.redexgen.X.UL, com.facebook.ads.redexgen.X.YS):void");
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFx() {
        if (this.A03) {
            if (this.A02 != -9223372036854775807L) {
                for (InterfaceC1157Uo interfaceC1157Uo : this.A05) {
                    interfaceC1157Uo.AI0(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFy(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j10 != -9223372036854775807L) {
            this.A02 = j10;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AIB() {
        this.A03 = false;
        this.A02 = -9223372036854775807L;
    }
}
