package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.Timeline;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class D9 extends Timeline {
    public final OI<C1250Yh> A00;
    public final OI<C1248Yf> A01;
    public final int[] A02;
    public final int[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Window> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D9(com.facebook.ads.redexgen.X.OI<com.facebook.ads.redexgen.X.C1248Yf> r4, com.facebook.ads.redexgen.X.OI<com.facebook.ads.redexgen.X.C1250Yh> r5, int[] r6) {
        /*
            r3 = this;
            r3.<init>()
            int r1 = r4.size()
            int r0 = r6.length
            if (r1 != r0) goto L26
            r0 = 1
        Lb:
            com.facebook.ads.redexgen.X.AbstractC1589es.A07(r0)
            r3.A01 = r4
            r3.A00 = r5
            r3.A02 = r6
            int r0 = r6.length
            int[] r0 = new int[r0]
            r3.A03 = r0
            r2 = 0
        L1a:
            int r0 = r6.length
            if (r2 >= r0) goto L28
            int[] r1 = r3.A03
            r0 = r6[r2]
            r1[r0] = r2
            int r2 = r2 + 1
            goto L1a
        L26:
            r0 = 0
            goto Lb
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D9.<init>(com.facebook.ads.redexgen.X.OI, com.facebook.ads.redexgen.X.OI, int[]):void");
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A06() {
        return this.A00.size();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A07() {
        return this.A01.size();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A08(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == A0C(z10)) {
            if (i11 == 2) {
                return A0B(z10);
            }
            return -1;
        } else if (z10) {
            return this.A02[this.A03[i10] + 1];
        } else {
            return i10 + 1;
        }
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A0A(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A0B(boolean z10) {
        if (A0N()) {
            return -1;
        }
        if (z10) {
            return this.A02[0];
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A0C(boolean z10) {
        if (A0N()) {
            return -1;
        }
        if (z10) {
            return this.A02[A07() - 1];
        }
        return A07() - 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final C1250Yh A0I(int i10, C1250Yh p10, boolean z10) {
        C1284Zq c1284Zq;
        C1250Yh p11 = this.A00.get(i10);
        Object obj = p11.A03;
        Object obj2 = p11.A04;
        int i11 = p11.A00;
        long j10 = p11.A01;
        long j11 = p11.A02;
        c1284Zq = p11.A06;
        p10.A0G(obj, obj2, i11, j10, j11, c1284Zq, p11.A05);
        return p10;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final C1248Yf A0L(int i10, C1248Yf c1248Yf, long j10) {
        C1248Yf c1248Yf2 = this.A01.get(i10);
        c1248Yf.A07(c1248Yf2.A0C, c1248Yf2.A09, c1248Yf2.A0A, c1248Yf2.A06, c1248Yf2.A07, c1248Yf2.A04, c1248Yf2.A0G, c1248Yf2.A0D, c1248Yf2.A08, c1248Yf2.A02, c1248Yf2.A03, c1248Yf2.A00, c1248Yf2.A01, c1248Yf2.A05);
        c1248Yf.A0F = c1248Yf2.A0F;
        return c1248Yf;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object A0M(int i10) {
        throw new UnsupportedOperationException();
    }
}
