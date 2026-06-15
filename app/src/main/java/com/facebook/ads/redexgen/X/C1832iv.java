package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
/* renamed from: com.facebook.ads.redexgen.X.iv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1832iv implements AR {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ C1827iq A01;

    public C1832iv(C1827iq c1827iq, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c1827iq;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AIa() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AIf(NativeAd nativeAd) {
        this.A01.A0I(C1816ie.A0L(nativeAd.getInternalNativeAd()), new C1828ir(C1816ie.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AJd() {
        this.A01.A0D();
    }
}
