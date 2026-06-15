package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
/* renamed from: com.facebook.ads.redexgen.X.mA  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2029mA extends BY {
    public final /* synthetic */ N0 A00;
    public final /* synthetic */ AnonymousClass38 A01;
    public final /* synthetic */ C0948Ma A02;

    public C2029mA(C0948Ma c0948Ma, AnonymousClass38 anonymousClass38, N0 n02) {
        this.A02 = c0948Ma;
        this.A01 = anonymousClass38;
        this.A00 = n02;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5W(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C0660Ag(adErrorType, ""));
    }
}
