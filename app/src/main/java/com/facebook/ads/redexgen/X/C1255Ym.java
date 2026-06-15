package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
@MetaExoPlayerCustomization("Should be final")
/* renamed from: com.facebook.ads.redexgen.X.Ym  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1255Ym implements PD {
    public static String[] A05 = {"qQB0oA45HvA5z7", "c6V68HSmHbSKNauVNu2l8j37Km", "ONb5LNCiCHSV8OYAgFZkPlbp4R", "SUQd8emL0wyRps", "0YsYBLVjFtQQ1RismQ", "Hv5MtYdu32hCBlRwlC", "UKrHOUrYAyaJUXSRnRDuYTEWhYQRKQSb", "JQJJATYiY0WXxvs9calNvP14WLZy3SFx"};
    public long A00;
    public long A01;
    public C1264Yv A02 = C1264Yv.A06;
    public boolean A03;
    public final InterfaceC1596ez A04;

    public C1255Ym(InterfaceC1596ez interfaceC1596ez) {
        this.A04 = interfaceC1596ez;
    }

    public void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A69();
            String[] strArr = A05;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "knVLFXtpOytCwUG4s1QKNFlwhv";
            strArr2[1] = "cqMcCzQACJbUL3WDmO3HGQoUGy";
            this.A03 = true;
        }
    }

    public void A01() {
        if (this.A03) {
            A02(A8f());
            this.A03 = false;
        }
    }

    public void A02(long j10) {
        this.A01 = j10;
        if (this.A03) {
            long A69 = this.A04.A69();
            String[] strArr = A05;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "NoinPkSBMCTDNUdVmv";
            strArr2[5] = "TXklLEQn3V1cVxlAUb";
            this.A00 = A69;
        }
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public C1264Yv A8c() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public long A8f() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A69 = this.A04.A69();
            long positionUs = this.A00;
            long j10 = A69 - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = AbstractC1672gE.A0O(j10);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A03(j10);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public void AIj(C1264Yv c1264Yv) {
        if (this.A03) {
            A02(A8f());
        }
        this.A02 = c1264Yv;
    }
}
