package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ST implements UC {
    public final int A00;
    public final int A01;
    public final C1648fq A02 = new C1648fq();
    public final C1662g4 A03;

    public ST(int i10, C1662g4 c1662g4, int i11) {
        this.A00 = i10;
        this.A03 = c1662g4;
        this.A01 = i11;
    }

    private UA A00(C1648fq c1648fq, long j10, long j11) {
        int A00;
        int A002;
        int A0A = c1648fq.A0A();
        long j12 = -1;
        long j13 = -1;
        long lastPcrTimeUsInRange = -9223372036854775807L;
        while (c1648fq.A07() >= 188 && (A002 = (A00 = YU.A00(c1648fq.A0l(), c1648fq.A09(), A0A)) + 188) <= A0A) {
            long A01 = YU.A01(c1648fq, A00, this.A00);
            if (A01 != -9223372036854775807L) {
                long A06 = this.A03.A06(A01);
                if (A06 > j10) {
                    if (lastPcrTimeUsInRange == -9223372036854775807L) {
                        return UA.A04(A06, j11);
                    }
                    return UA.A03(j11 + j12);
                }
                long endOfLastPacketPositionInStream = A06 + 100000;
                if (endOfLastPacketPositionInStream > j10) {
                    return UA.A03(A00 + j11);
                }
                j12 = A00;
                lastPcrTimeUsInRange = A06;
            }
            c1648fq.A0f(A002);
            j13 = A002;
        }
        if (lastPcrTimeUsInRange != -9223372036854775807L) {
            return UA.A05(lastPcrTimeUsInRange, j11 + j13);
        }
        return UA.A03;
    }

    @Override // com.facebook.ads.redexgen.X.UC
    public final void AF2() {
        this.A02.A0i(AbstractC1672gE.A07);
    }

    @Override // com.facebook.ads.redexgen.X.UC
    public final UA AI2(WJ wj, long j10) throws IOException {
        long A8d = wj.A8d();
        int min = (int) Math.min(this.A01, wj.A8E() - A8d);
        this.A02.A0d(min);
        wj.AG1(this.A02.A0l(), 0, min);
        return A00(this.A02, j10, A8d);
    }
}
