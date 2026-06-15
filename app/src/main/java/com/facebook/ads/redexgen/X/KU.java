package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class KU extends AbstractC1407bv {
    public final /* synthetic */ C1390be A00;

    public KU(C1390be c1390be) {
        this.A00 = c1390be;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(C1408bw c1408bw) {
        boolean z10;
        boolean z11;
        boolean A0D;
        Handler handler;
        int i10;
        boolean z12;
        boolean A0D2;
        z10 = this.A00.A03;
        if (!z10) {
            return;
        }
        z11 = this.A00.A02;
        if (!z11) {
            return;
        }
        this.A00.A03 = false;
        A0D = this.A00.A0D(EnumC0860Ip.A03);
        if (!A0D) {
            z12 = this.A00.A04;
            if (!z12) {
                A0D2 = this.A00.A0D(EnumC0860Ip.A02);
                if (!A0D2) {
                    return;
                }
                this.A00.A03();
                this.A00.A06(true, true);
                return;
            }
        }
        this.A00.A04 = false;
        handler = this.A00.A05;
        C1393bh c1393bh = new C1393bh(this);
        i10 = this.A00.A00;
        handler.postDelayed(c1393bh, i10);
    }
}
