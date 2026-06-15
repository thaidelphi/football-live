package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SU implements YT {
    public static String[] A06 = {"84mIbTPZd6aoJp3lghwjzEV1CXlFbTxk", "W9FMxAusLZkE7ZmzGPcB96nQPb6kpYre", "IKMwo3cB1n7Mun1A38p5O86Z", "pB9MZoxa1qxCt96MdBvwWUod9JFv9LyH", "v8lH5x9fod1bUde8yPNDLhDdan8bSg8g", "Sm43zprTvE0G7HR5LxxDhvZiqT8sMVB1", "hKUClx5zg5vMvifJai9ukQPV", "NqkOJAsqQGgwscckA74t9jHmmJ4q3EmY"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final YK A04;
    public final C1648fq A05 = new C1648fq(32);

    public SU(YK yk) {
        this.A04 = yk;
    }

    @Override // com.facebook.ads.redexgen.X.YT
    public final void A51(C1648fq c1648fq, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int i11 = -1;
        if (z10) {
            int A0I = c1648fq.A0I();
            if (A06[0].charAt(8) != 'd') {
                throw new RuntimeException();
            }
            A06[4] = "VzDVvJfsVhmc3MtNs7ivtdz3ntASc";
            i11 = c1648fq.A09() + A0I;
        }
        if (this.A03) {
            if (!z10) {
                return;
            }
            this.A03 = false;
            c1648fq.A0f(i11);
            this.A00 = 0;
        }
        while (c1648fq.A07() > 0) {
            if (this.A00 < 3) {
                if (this.A00 == 0) {
                    int A0I2 = c1648fq.A0I();
                    c1648fq.A0f(c1648fq.A09() - 1);
                    if (A0I2 == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int min = Math.min(c1648fq.A07(), 3 - this.A00);
                c1648fq.A0k(this.A05.A0l(), this.A00, min);
                this.A00 += min;
                if (this.A00 == 3) {
                    this.A05.A0f(0);
                    this.A05.A0e(3);
                    this.A05.A0g(1);
                    int A0I3 = this.A05.A0I();
                    int A0I4 = this.A05.A0I();
                    boolean payloadUnitStartIndicator = (A0I3 & 128) != 0;
                    this.A02 = payloadUnitStartIndicator;
                    this.A01 = (((A0I3 & 15) << 8) | A0I4) + 3;
                    if (this.A05.A08() < this.A01) {
                        this.A05.A0c(Math.min(4098, Math.max(this.A01, this.A05.A08() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c1648fq.A07(), this.A01 - this.A00);
                c1648fq.A0k(this.A05.A0l(), this.A00, min2);
                this.A00 += min2;
                if (this.A00 == this.A01) {
                    boolean payloadUnitStartIndicator2 = this.A02;
                    if (payloadUnitStartIndicator2) {
                        if (AbstractC1672gE.A0I(this.A05.A0l(), 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A05.A0e(this.A01 - 4);
                    } else {
                        this.A05.A0e(this.A01);
                    }
                    this.A05.A0f(0);
                    this.A04.A50(this.A05);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.YT
    public final void AA3(C1662g4 c1662g4, UL ul, YS ys) {
        this.A04.AA3(c1662g4, ul, ys);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.X.YT
    public final void AIB() {
        this.A03 = true;
    }
}
