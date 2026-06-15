package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.ArrayList;
/* renamed from: com.facebook.ads.redexgen.X.mT  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2048mT implements InterfaceC05907l {
    public final /* synthetic */ AbstractC2058md A00;
    public final /* synthetic */ InterfaceC04722u A01;
    public final /* synthetic */ C04732v A02;
    public final /* synthetic */ C1900k1 A03;
    public final /* synthetic */ boolean A04;

    public C2048mT(C04732v c04732v, C1900k1 c1900k1, boolean z10, AbstractC2058md abstractC2058md, InterfaceC04722u interfaceC04722u) {
        this.A02 = c04732v;
        this.A03 = c1900k1;
        this.A04 = z10;
        this.A00 = abstractC2058md;
        this.A01 = interfaceC04722u;
    }

    private void A00(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            if (C06419m.A1j(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC0811Gs.A01(this.A03, this.A00, 1, new C2049mU(this)));
                return;
            }
            this.A01.AC9();
            return;
        }
        this.A01.AC8(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACa() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACj() {
        A00(true);
    }
}
