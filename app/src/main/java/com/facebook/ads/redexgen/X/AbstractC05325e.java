package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.5e  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC05325e implements Q7 {
    public static String[] A04 = {"fLYU2h24", "9T4qb1qE9o6dnVNtHPl", "zY5ZDb2sbw0139lkg7uH6SCOm1GEdGJk", "SQmgC0k", "PIGC6h1HUYcT20GPRTJ9YIzsPGu64fVc", "dGx6LmnB", "p3Z2jT6dJCg95M7HEtd", "pxFVIGI1dYV2V3Xr7fehvfwfTSh7RjKF"};
    public int A00;
    public C1519dj A01;
    public final ArrayList<InterfaceC1558eN> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.X.Q7
    public /* synthetic */ Map A8j() {
        return AbstractC1508dY.A00(this);
    }

    public AbstractC05325e(boolean z10) {
        this.A03 = z10;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0D(com.facebook.ads.redexgen.X.C1519dj r4, boolean r5) {
        /*
            r3 = this;
            r3.A01 = r4
            r2 = 0
        L3:
            int r0 = r3.A00
            if (r2 >= r0) goto L17
            java.util.ArrayList<com.facebook.ads.redexgen.X.eN> r0 = r3.A02
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.eN r1 = (com.facebook.ads.redexgen.X.InterfaceC1558eN) r1
            boolean r0 = r3.A03
            r1.AFP(r3, r4, r0, r5)
            int r2 = r2 + 1
            goto L3
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC05325e.A0D(com.facebook.ads.redexgen.X.dj, boolean):void");
    }

    public final void A0E() {
        C1519dj c1519dj = (C1519dj) AbstractC1672gE.A0f(this.A01);
        for (int i10 = 0; i10 < this.A00; i10++) {
            this.A02.get(i10).AFO(this, c1519dj, this.A03);
        }
        this.A01 = null;
        if (A04[3].length() != 7) {
            throw new RuntimeException();
        }
        A04[4] = "n18HKcosmY2oFn2TeOIyDIR1JJ5fEniA";
    }

    public final void A0F(int i10) {
        C1519dj c1519dj = (C1519dj) AbstractC1672gE.A0f(this.A01);
        for (int i11 = 0; i11 < this.A00; i11++) {
            this.A02.get(i11).ACZ(this, c1519dj, this.A03, i10);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(com.facebook.ads.redexgen.X.C1519dj r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            int r0 = r2.A00
            if (r1 >= r0) goto Ld
            java.util.ArrayList<com.facebook.ads.redexgen.X.eN> r0 = r2.A02
            r0.get(r1)
            int r1 = r1 + 1
            goto L1
        Ld:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC05325e.A0G(com.facebook.ads.redexgen.X.dj):void");
    }

    public final void A0H(C1519dj c1519dj) {
        A0D(c1519dj, false);
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A3t(InterfaceC1558eN interfaceC1558eN) {
        AbstractC1589es.A01(interfaceC1558eN);
        if (!this.A02.contains(interfaceC1558eN)) {
            this.A02.add(interfaceC1558eN);
            this.A00++;
        }
    }
}
