package com.appnext.banners;

import android.content.Context;
import android.util.AttributeSet;
import com.appnext.base.Appnext;
import com.appnext.core.callbacks.OnECPMLoaded;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BannerView extends BaseBannerView {
    public BannerView(Context context) {
        this(context, null);
    }

    @Override // com.appnext.banners.BaseBannerView
    protected BaseBannerAdapter getBannerAdapter() {
        if (this.bannerAdapter == null) {
            this.bannerAdapter = new e();
        }
        return this.bannerAdapter;
    }

    @Override // com.appnext.banners.BaseBannerView
    public void getECPM(BannerAdRequest bannerAdRequest, OnECPMLoaded onECPMLoaded) {
        super.getECPM(bannerAdRequest, onECPMLoaded);
    }

    public BannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Appnext.init(context);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Appnext.init(context);
    }
}
