package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.l4  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1964l4 implements InterfaceC05495w {
    public final /* synthetic */ MG A00;

    public C1964l4(MG mg) {
        this.A00 = mg;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05495w
    public final void ACD(C6K c6k) {
        boolean A0A;
        c6k.A0X(true);
        if (c6k.A06 != null && c6k.A07 == null) {
            c6k.A06 = null;
        }
        c6k.A07 = null;
        A0A = c6k.A0A();
        if (!A0A && !this.A00.A1x(c6k.A0H) && c6k.A0c()) {
            this.A00.removeDetachedView(c6k.A0H, false);
        }
    }
}
