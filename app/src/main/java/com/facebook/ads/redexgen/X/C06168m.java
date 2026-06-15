package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.8m  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C06168m implements R7, R8 {
    public static String[] A06 = {"1ZsuQqUhgt3teitMQ4GeUimcSTtZqrrN", "DlI2FIcWwBGEcUI8VbyxE2F7", "OBys2kVokAWves5jveaeXr7SlmXqNqeo", "7Rss8w8nbZuaEy0gv2BXxPtsZLUwfx9E", "pqA0QvXfNioCnyAr5bWRnoOg", "RB2UTNKQNa60zux4ojHI3jJrjUoVAO0q", "Q0iesb3nsbpa6asi4Da9qGj", "pzRBeELMN3nbeWYj8"};
    public long A00;
    public long A01;
    public long A02;
    public R8 A03;
    public RA[] A04 = new RA[0];
    public final R7 A05;

    public C06168m(R7 r72, boolean z10, long j10, long j11) {
        this.A05 = r72;
        this.A02 = z10 ? j10 : -9223372036854775807L;
        this.A01 = j10;
        this.A00 = j11;
    }

    private C1059Qn A00(long j10, C1059Qn c1059Qn) {
        long toleranceBeforeUs = AbstractC1672gE.A0T(c1059Qn.A01, 0L, j10 - this.A01);
        long A0T = AbstractC1672gE.A0T(c1059Qn.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j10);
        if (toleranceBeforeUs == c1059Qn.A01 && A0T == c1059Qn.A00) {
            return c1059Qn;
        }
        return new C1059Qn(toleranceBeforeUs, A0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1384bY
    /* renamed from: A01 */
    public final void ACl(R7 r72) {
        ((R8) AbstractC1589es.A01(this.A03)).ACl(this);
    }

    public static boolean A02(long j10, QD[] qdArr) {
        if (j10 != 0) {
            for (QD qd : qdArr) {
                if (qd != null) {
                    ZM A8s = qd.A8s();
                    if (!Q2.A0G(A8s.A0W, A8s.A0R)) {
                        String[] strArr = A06;
                        if (strArr[0].charAt(6) != strArr[2].charAt(6)) {
                            String[] strArr2 = A06;
                            strArr2[3] = "cNHmY7WEn6O0myy1x5i2L94uENuLU76g";
                            strArr2[5] = "MKObJyUV6aR753Z8T9WnvbR0y1G3p3TC";
                            return true;
                        }
                        throw new RuntimeException();
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1385bZ
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4i(long j10) {
        this.A05.A4i(j10);
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final boolean A52(long j10) {
        return this.A05.A52(j10);
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void A5q(long j10, boolean z10) {
        this.A05.A5q(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long A6h(long j10, C1059Qn c1059Qn) {
        if (j10 == this.A01) {
            long j11 = this.A01;
            if (A06[7].length() != 9) {
                String[] strArr = A06;
                strArr[3] = "30kzOjmO5DnFKolqOzwFG5SV9Z7ljgLg";
                strArr[5] = "g6sJ5KQ0ZZizLSy8t4ccOewAGY9Ihc56";
                return j11;
            }
            throw new RuntimeException();
        }
        return this.A05.A6h(j10, A00(j10, c1059Qn));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1385bZ
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A6w(long j10) {
        return this.A05.A6w(j10);
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long A6y() {
        long A6y = this.A05.A6y();
        if (A6y == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && A6y >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return A6y;
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long A8R() {
        long A8R = this.A05.A8R();
        if (A8R == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && A8R >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return A8R;
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final C1063Qs A9C() {
        return this.A05.A9C();
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void ABn() throws IOException {
        if (0 == 0) {
            this.A05.ABn();
            return;
        }
        throw null;
    }

    @Override // com.facebook.ads.redexgen.X.R8
    public final void AEd(R7 r72) {
        if (0 != 0) {
            return;
        }
        ((R8) AbstractC1589es.A01(this.A03)).AEd(this);
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void AGD(R8 r82, long j10) {
        this.A03 = r82;
        this.A05.AGD(this, j10);
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long AGY() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long initialDiscontinuityUs = AGY();
            return initialDiscontinuityUs != -9223372036854775807L ? initialDiscontinuityUs : childDiscontinuityUs;
        }
        long AGY = this.A05.AGY();
        if (AGY == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        AbstractC1589es.A08(AGY >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && AGY > this.A00) {
            z10 = false;
        }
        AbstractC1589es.A08(z10);
        return AGY;
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void AGe(long j10) {
        this.A05.AGe(j10);
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long AIE(@MetaExoPlayerCustomization long j10, boolean z10) {
        RA[] raArr;
        this.A02 = -9223372036854775807L;
        boolean z11 = false;
        for (RA ra : this.A04) {
            if (ra != null) {
                ra.A00();
            }
        }
        long AIE = this.A05.AIE(j10, z10);
        String[] strArr = A06;
        if (strArr[0].charAt(6) != strArr[2].charAt(6)) {
            A06[7] = "WZ2rEvOPvt3D7Egmlv2P0kl";
            if (AIE == j10 || (AIE >= this.A01 && (this.A00 == Long.MIN_VALUE || AIE <= this.A00))) {
                z11 = true;
            }
            AbstractC1589es.A08(z11);
            return AIE;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r7 <= r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    @Override // com.facebook.ads.redexgen.X.R7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AIF(com.facebook.ads.redexgen.X.QD[] r16, boolean[] r17, com.facebook.ads.redexgen.X.InterfaceC1381bV[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06168m.AIF(com.facebook.ads.redexgen.X.QD[], boolean[], com.facebook.ads.redexgen.X.bV[], boolean[], long):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1385bZ
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AIi(boolean z10) {
        this.A05.AIi(z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1385bZ
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AJg(byte b10) {
        this.A05.AJg(b10);
    }
}
