package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Qy  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1069Qy implements InterfaceC1495dL {
    public static String[] A04 = {"HJiG08VABV4bgPvBuIHmB0QgcQcpsXWu", "rPSLKKx", "s30Qb", "", "jZ8LcPBJeju31135gHiS3ruOtpsz6ca1", "Wk6RdB9", "nl0Ip", "e6TFxM3GpawCuoBue5hU0ga7A8aqYwlk"};
    public long A00;
    public long A01;
    public C1069Qy A02;
    public C1494dK A03;

    public C1069Qy(long j10, int i10) {
        A02(j10, i10);
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A01)) + this.A03.A00;
    }

    public final C1069Qy A01() {
        this.A03 = null;
        C1069Qy c1069Qy = this.A02;
        this.A02 = null;
        return c1069Qy;
    }

    public final void A02(long j10, int i10) {
        AbstractC1589es.A08(this.A03 == null);
        this.A01 = j10;
        this.A00 = i10 + j10;
    }

    public final void A03(C1494dK c1494dK, C1069Qy c1069Qy) {
        this.A03 = c1494dK;
        this.A02 = c1069Qy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1495dL
    public final C1494dK A6k() {
        return (C1494dK) AbstractC1589es.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1495dL
    public final C1069Qy ABx() {
        if (this.A02 != null) {
            C1069Qy c1069Qy = this.A02;
            String[] strArr = A04;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A04[0] = "s3hOhS6JRVZGOWqbEiZVryq1r0alsn39";
            if (c1069Qy.A03 == null) {
                return null;
            }
            return this.A02;
        }
        return null;
    }
}
