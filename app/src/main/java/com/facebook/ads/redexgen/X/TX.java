package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TX implements InterfaceC1202Wj {
    public static String[] A04 = {"8eDNQuVhj6HhE0aXOUxIPi6SWJ", "rSsBc0D01Jkzjs7E75L56SoyTTKcbK0y", "eJAQfKLxAbIZZahT5Ip5jMMWACAMto3", "U4euxyWP6XLLFTCzy7P0sh3Ga7", "shmfGF", "CPSxyeX2nRXyHVWsMNxXAHkfikUPgKRS", "qP2Iyl3YHFMHKPVMw5hT0TrGiQ1t3VCc", "D9PGb9ZnQLUSUdTPk"};
    public long A00 = -1;
    public long A01 = -1;
    public UT A02;
    public UU A03;

    public TX(UU uu, UT ut) {
        this.A03 = uu;
        this.A02 = ut;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1202Wj
    public final Uj A5P() {
        AbstractC1589es.A08(this.A00 != -1);
        return new W3(this.A03, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1202Wj
    public final long AGV(WJ wj) {
        if (this.A01 >= 0) {
            long j10 = -(this.A01 + 2);
            this.A01 = -1L;
            String[] strArr = A04;
            if (strArr[3].length() != strArr[7].length()) {
                String[] strArr2 = A04;
                strArr2[4] = "U6EOfu";
                strArr2[0] = "zri4cOopvrlPFS0GFsI4EmN1ji";
                return j10;
            }
            throw new RuntimeException();
        }
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1202Wj
    public final void AJH(long j10) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC1672gE.A0L(jArr, j10, true, true)];
    }
}
