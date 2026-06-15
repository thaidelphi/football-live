package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
/* renamed from: com.facebook.ads.redexgen.X.mG  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2035mG extends BY {
    public final /* synthetic */ C2084n3 A00;
    public final /* synthetic */ AnonymousClass38 A01;
    public final /* synthetic */ C0963Mr A02;

    public C2035mG(C0963Mr c0963Mr, AnonymousClass38 anonymousClass38, C2084n3 c2084n3) {
        this.A02 = c0963Mr;
        this.A01 = anonymousClass38;
        this.A00 = c2084n3;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C0660Ag A00 = C0660Ag.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5W(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
