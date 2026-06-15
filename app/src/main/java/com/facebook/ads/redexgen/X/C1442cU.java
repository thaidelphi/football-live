package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.cU  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1442cU implements InterfaceC0881Jk {
    public final /* synthetic */ I7 A00;

    public C1442cU(I7 i72) {
        this.A00 = i72;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0881Jk
    public final void AGI() {
        DR dr;
        DR dr2;
        EC ec;
        dr = this.A00.A02;
        if (dr != null) {
            dr2 = this.A00.A02;
            ec = this.A00.A03;
            dr2.A4Z(ec.A8u());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0881Jk
    public final void AGK(C0883Jm c0883Jm) {
        DR dr;
        DR dr2;
        EC ec;
        DR dr3;
        EC ec2;
        dr = this.A00.A02;
        if (dr == null) {
            return;
        }
        if (c0883Jm == null || !c0883Jm.A00()) {
            dr2 = this.A00.A02;
            ec = this.A00.A03;
            dr2.A4Z(ec.A8u());
            return;
        }
        dr3 = this.A00.A02;
        ec2 = this.A00.A03;
        dr3.A4Z(ec2.A8v());
    }
}
