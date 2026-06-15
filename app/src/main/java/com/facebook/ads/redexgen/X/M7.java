package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class M7 extends C1929kU {
    public IB A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(NativeAdLayout nativeAdLayout, C1900k1 c1900k1, NativeAd nativeAd, AW aw) {
        C0772Ff c0772Ff = new C0772Ff(c1900k1);
        MediaView mediaView = new MediaView(c1900k1);
        AdOptionsView adOptionsView = new AdOptionsView(c1900k1, nativeAd, nativeAdLayout);
        aw.A09(adOptionsView, 28);
        this.A00 = new C1440cS(c1900k1, nativeAd, aw, C1816ie.A0L(nativeAd.getInternalNativeAd()).A18(), c0772Ff, mediaView, adOptionsView);
        D3.A0K(nativeAdLayout, aw.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c0772Ff, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C05656m, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
