package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.Timeline;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class R2 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Timeline A06;
    public final Timeline A07;
    public final R5 A08;
    public final R5 A09;

    public R2(long j10, Timeline timeline, int i10, R5 r52, long j11, Timeline timeline2, int i11, R5 r53, long j12, long j13) {
        this.A04 = j10;
        this.A07 = timeline;
        this.A01 = i10;
        this.A09 = r52;
        this.A03 = j11;
        this.A06 = timeline2;
        this.A00 = i11;
        this.A08 = r53;
        this.A02 = j12;
        this.A05 = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        R2 r22 = (R2) obj;
        if (this.A04 == r22.A04 && this.A01 == r22.A01 && this.A03 == r22.A03 && this.A00 == r22.A00 && this.A02 == r22.A02 && this.A05 == r22.A05 && AbstractC1013Or.A01(this.A07, r22.A07) && AbstractC1013Or.A01(this.A09, r22.A09) && AbstractC1013Or.A01(this.A06, r22.A06) && AbstractC1013Or.A01(this.A08, r22.A08)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1013Or.A00(Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05));
    }
}
