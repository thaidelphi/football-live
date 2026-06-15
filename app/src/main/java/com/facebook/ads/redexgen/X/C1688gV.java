package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.gV  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1688gV extends BY {
    public final /* synthetic */ FW A00;

    public C1688gV(FW fw) {
        this.A00 = fw;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        Runnable runnable;
        int i10;
        if (this.A00.isPressed()) {
            FW fw = this.A00;
            i10 = this.A00.A08;
            fw.postDelayed(this, i10);
            return;
        }
        this.A00.setPressed(true);
        FW fw2 = this.A00;
        runnable = this.A00.A0A;
        fw2.postOnAnimationDelayed(runnable, 250L);
    }
}
