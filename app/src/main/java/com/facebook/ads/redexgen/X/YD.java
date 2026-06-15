package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YD {
    public static String[] A0G = {"oReQJMYo2yqA0D6a8", "LfraKVf73akDf3wHdeEtrWdpsrMW", "zy8EPw", "zPPf4jRPwAUfISJpjTlT", "1d0wAt4ch5A0fQM2dD6rBrPdMZejduvY", "cGtVKnG7L7HY3k9er60UaVenuQYsd", "agFhZy", "S862KrizRInoRwZskDQJ"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public C1148Uc A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public YD() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A00(YD yd) {
        if (this.A0F) {
            if (yd.A0F) {
                C1148Uc c1148Uc = (C1148Uc) AbstractC1589es.A02(this.A09);
                C1148Uc spsData = yd.A09;
                C1148Uc otherSpsData = (C1148Uc) AbstractC1589es.A02(spsData);
                if (this.A03 == yd.A03 && this.A07 == yd.A07 && this.A0C == yd.A0C && ((!this.A0B || !yd.A0B || this.A0A == yd.A0A) && ((this.A05 == yd.A05 || (this.A05 != 0 && yd.A05 != 0)) && ((c1148Uc.A07 != 0 || otherSpsData.A07 != 0 || (this.A06 == yd.A06 && this.A02 == yd.A02)) && (c1148Uc.A07 != 1 || otherSpsData.A07 != 1 || (this.A00 == yd.A00 && this.A01 == yd.A01)))))) {
                    boolean z10 = this.A0E;
                    boolean z11 = yd.A0E;
                    if (A0G[1].length() != 28) {
                        throw new RuntimeException();
                    }
                    A0G[1] = "xcllOHpY5wD0Xe4YdoBQ1VksF4Lm";
                    if (z10 == z11 && (!this.A0E || this.A04 == yd.A04)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void A02() {
        this.A0D = false;
        this.A0F = false;
    }

    public final void A03(int i10) {
        this.A08 = i10;
        this.A0D = true;
    }

    public final void A04(C1148Uc c1148Uc, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
        this.A09 = c1148Uc;
        this.A05 = i10;
        this.A08 = i11;
        this.A03 = i12;
        this.A07 = i13;
        this.A0C = z10;
        this.A0B = z11;
        this.A0A = z12;
        this.A0E = z13;
        this.A04 = i14;
        this.A06 = i15;
        this.A02 = i16;
        this.A00 = i17;
        this.A01 = i18;
        this.A0F = true;
        this.A0D = true;
    }

    public final boolean A05() {
        return this.A0D && (this.A08 == 7 || this.A08 == 2);
    }
}
