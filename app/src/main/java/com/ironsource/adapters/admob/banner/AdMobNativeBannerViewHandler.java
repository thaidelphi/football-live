package com.ironsource.adapters.admob.banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AdMobNativeBannerViewHandler {
    private final NativeAdView mAdView;
    private FrameLayout.LayoutParams mLayoutParams;
    private NativeTemplateType mTemplateType;

    public AdMobNativeBannerViewHandler(ISBannerSize iSBannerSize, NativeTemplateType nativeTemplateType, Context context) {
        this.mTemplateType = nativeTemplateType;
        String description = iSBannerSize.getDescription();
        description.hashCode();
        char c10 = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals(l.f18872c)) {
                    c10 = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals(l.f18871b)) {
                    c10 = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals(l.f18874e)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.mLayoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 300), AdapterUtils.dpToPixels(context, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));
                break;
            case 1:
                this.mLayoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 90));
                break;
            case 2:
            case 3:
                this.mLayoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
                break;
        }
        this.mLayoutParams.gravity = 17;
        this.mAdView = (NativeAdView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.mTemplateType.getLayoutId(), (ViewGroup) null);
    }

    public FrameLayout.LayoutParams getLayoutParams() {
        return this.mLayoutParams;
    }

    public NativeAdView getNativeAdView() {
        return this.mAdView;
    }
}
