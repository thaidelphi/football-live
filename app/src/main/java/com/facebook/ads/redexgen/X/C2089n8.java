package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
/* renamed from: com.facebook.ads.redexgen.X.n8  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2089n8 implements C7I {
    public final /* synthetic */ int A00;
    public final /* synthetic */ N5 A01;
    public final /* synthetic */ N5 A02;
    public final /* synthetic */ C06248u A03;

    public C2089n8(N5 n52, int i10, C06248u c06248u, N5 n53) {
        this.A01 = n52;
        this.A00 = i10;
        this.A03 = c06248u;
        this.A02 = n53;
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final void ACF() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final void ACG() {
        C2B c2b;
        c2b = this.A01.A00;
        c2b.ADc(this.A02, C0660Ag.A00(AdErrorType.NO_FILL));
    }
}
