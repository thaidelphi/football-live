package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Sr  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1114Sr implements Y7 {
    public static byte[] A06;
    public int A00;
    public int A01;
    public InterfaceC1157Uo A03;
    public boolean A04;
    public final C1648fq A05 = new C1648fq(10);
    public long A02 = -9223372036854775807L;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{4, 41, 51, 35, 33, 50, 36, 41, 46, 39, 96, 41, 46, 54, 33, 44, 41, 36, 96, 9, 4, 115, 96, 52, 33, 39, 88, 117, 34, 67, 116, 112, 117, 116, 99, 65, 80, 80, 76, 73, 67, 65, 84, 73, 79, 78, 15, 73, 68, 19};
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A50(C1648fq c1648fq) {
        AbstractC1589es.A02(this.A03);
        if (!this.A04) {
            return;
        }
        int A07 = c1648fq.A07();
        int bytesAvailable = this.A00;
        if (bytesAvailable < 10) {
            int bytesAvailable2 = this.A00;
            int min = Math.min(A07, 10 - bytesAvailable2);
            byte[] A0l = c1648fq.A0l();
            int A09 = c1648fq.A09();
            byte[] A0l2 = this.A05.A0l();
            int bytesAvailable3 = this.A00;
            System.arraycopy(A0l, A09, A0l2, bytesAvailable3, min);
            int bytesAvailable4 = this.A00;
            if (bytesAvailable4 + min == 10) {
                this.A05.A0f(0);
                int headerBytesAvailable = this.A05.A0I();
                if (73 == headerBytesAvailable) {
                    int headerBytesAvailable2 = this.A05.A0I();
                    if (68 == headerBytesAvailable2) {
                        int headerBytesAvailable3 = this.A05.A0I();
                        if (51 == headerBytesAvailable3) {
                            this.A05.A0g(3);
                            int bytesAvailable5 = this.A05.A0H();
                            this.A01 = bytesAvailable5 + 10;
                        }
                    }
                }
                AbstractC1633fb.A07(A00(26, 9, 109), A00(0, 26, 60));
                this.A04 = false;
                return;
            }
        }
        int headerBytesAvailable4 = this.A01;
        int bytesAvailable6 = this.A00;
        int bytesToWrite = Math.min(A07, headerBytesAvailable4 - bytesAvailable6);
        this.A03.AHx(c1648fq, bytesToWrite);
        int bytesAvailable7 = this.A00;
        this.A00 = bytesAvailable7 + bytesToWrite;
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A03 = ul.AJX(ys.A03(), 5);
        this.A03.A6U(new P5().A0y(ys.A04()).A11(A00(35, 15, 92)).A14());
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFx() {
        AbstractC1589es.A02(this.A03);
        if (!this.A04 || this.A01 == 0 || this.A00 != this.A01) {
            return;
        }
        if (this.A02 != -9223372036854775807L) {
            this.A03.AI0(this.A02, 1, this.A01, 0, null);
        }
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFy(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.A04 = true;
        if (j10 != -9223372036854775807L) {
            this.A02 = j10;
        }
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AIB() {
        this.A04 = false;
        this.A02 = -9223372036854775807L;
    }
}
