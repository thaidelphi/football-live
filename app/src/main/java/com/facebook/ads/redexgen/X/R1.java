package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class R1 implements InterfaceC1381bV, InterfaceC1382bW {
    public final int A00;
    public final /* synthetic */ C05867h A01;

    public R1(C05867h c05867h, int i10) {
        this.A01 = c05867h;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1382bW
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A7z() {
        return C05867h.A0W(this.A01)[this.A00].A0S();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1381bV
    public final boolean AAT() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1381bV
    public final void ABm() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1381bV
    public final int AGX(P6 p62, C1214Ww c1214Ww, int i10) {
        return this.A01.A0Y(this.A00, p62, c1214Ww, i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1381bV
    public final int AJ8(long j10) {
        return this.A01.A0X(this.A00, j10);
    }
}
