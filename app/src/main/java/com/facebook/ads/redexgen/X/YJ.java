package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YJ {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Y7 A05;
    public final C1647fp A06 = new C1647fp(new byte[64]);
    public final C1662g4 A07;

    public YJ(Y7 y72, C1662g4 c1662g4) {
        this.A05 = y72;
        this.A07 = c1662g4;
    }

    private void A00() {
        this.A06.A09(8);
        this.A03 = this.A06.A0H();
        this.A02 = this.A06.A0H();
        this.A06.A09(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A09(4);
            this.A06.A09(1);
            long pts = this.A06.A04(15) << 15;
            long A04 = (this.A06.A04(3) << 30) | pts;
            this.A06.A09(1);
            long pts2 = this.A06.A04(15);
            long j10 = A04 | pts2;
            this.A06.A09(1);
            if (!this.A04 && this.A02) {
                this.A06.A09(4);
                long pts3 = this.A06.A04(3);
                this.A06.A09(1);
                this.A06.A09(1);
                this.A06.A09(1);
                this.A07.A06((pts3 << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            this.A01 = this.A07.A06(j10);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AIB();
    }

    public final void A03(C1648fq c1648fq) throws Q6 {
        c1648fq.A0k(this.A06.A00, 0, 3);
        this.A06.A08(0);
        A00();
        c1648fq.A0k(this.A06.A00, 0, this.A00);
        this.A06.A08(0);
        A01();
        this.A05.AFy(this.A01, 4);
        this.A05.A50(c1648fq);
        this.A05.AFx();
    }
}
