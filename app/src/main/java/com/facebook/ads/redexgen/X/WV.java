package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class WV implements Uj {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final boolean A06;

    public WV(long j10, long j11, int i10, int i11, boolean z10) {
        this.A05 = j10;
        this.A04 = j11;
        this.A01 = i11 == -1 ? 1 : i11;
        this.A00 = i10;
        this.A06 = z10;
        if (j10 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
            return;
        }
        this.A02 = j10 - j11;
        this.A03 = A01(j10, j11, i10);
    }

    private long A00(long j10) {
        long positionOffset = this.A01;
        long j11 = ((this.A00 * j10) / 8000000) / positionOffset;
        long positionOffset2 = this.A01;
        long positionOffset3 = j11 * positionOffset2;
        if (this.A02 != -1) {
            positionOffset3 = Math.min(positionOffset3, this.A02 - this.A01);
        }
        long positionOffset4 = Math.max(positionOffset3, 0L);
        long positionOffset5 = this.A04;
        return positionOffset5 + positionOffset4;
    }

    public static long A01(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }

    public final long A02(long j10) {
        return A01(j10, this.A04, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        if (this.A02 == -1 && !this.A06) {
            return new C1153Ui(new C1154Uk(0L, this.A04));
        }
        long A00 = A00(j10);
        long A02 = A02(A00);
        C1154Uk seekPoint = new C1154Uk(A02, A00);
        if (this.A02 == -1 || A02 >= j10 || this.A01 + A00 >= this.A05) {
            return new C1153Ui(seekPoint);
        }
        long seekTimeUs = this.A01 + A00;
        long secondSeekPosition = A02(seekTimeUs);
        return new C1153Ui(seekPoint, new C1154Uk(secondSeekPosition, seekTimeUs));
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return this.A02 != -1 || this.A06;
    }
}
