package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Kg  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0903Kg extends AbstractC1412c0 {
    public final /* synthetic */ ID A00;

    public C0903Kg(ID id) {
        this.A00 = id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(KZ kz) {
        String str;
        C0939Lr c0939Lr;
        str = this.A00.A05;
        C0940Ls c0940Ls = new C0940Ls(str, kz.A03(), kz.A01(), kz.A02());
        if (kz.A00() >= 0.05d) {
            c0940Ls.A06(kz.A01());
        }
        ID.A00(this.A00);
        c0939Lr = this.A00.A04;
        c0939Lr.A04(c0940Ls);
    }
}
