package com.ironsource.adapters.ironsource.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.qh;
import com.ironsource.rh;
import com.ironsource.sdk.mediation.R;
import com.ironsource.th;
import com.ironsource.uh;
import i8.l;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {
    private final th nativeAd;
    private final NativeAdProperties nativeAdProperties;
    private qh networkNativeAdView;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdOptionsPosition.values().length];
            try {
                iArr[AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(th nativeAd, NativeAdProperties nativeAdProperties) {
        n.f(nativeAd, "nativeAd");
        n.f(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = nativeAd;
        this.nativeAdProperties = nativeAdProperties;
    }

    @SuppressLint({"RtlHardcoded"})
    private final FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i11 == 1) {
            i10 = 51;
        } else if (i11 == 2) {
            i10 = 53;
        } else if (i11 == 3) {
            i10 = 83;
        } else if (i11 != 4) {
            throw new l();
        } else {
            i10 = 85;
        }
        layoutParams.gravity = i10;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public qh getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(View view) {
        if (view == null) {
            IronLog.INTERNAL.error("nativeAdView is null");
        } else if (this.nativeAd.b() == null) {
            IronLog.INTERNAL.error("nativeAd.adData is null");
        } else {
            LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
            if (mediaView != null) {
                rh b10 = this.nativeAd.b();
                n.c(b10);
                WebView l10 = b10.l();
                if (l10 != null) {
                    mediaView.addView(l10, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            rh b11 = this.nativeAd.b();
            n.c(b11);
            View m7 = b11.m();
            m7.setId(R.id.privacy_icon_button);
            m7.setLayoutParams(getPrivacyIconLayoutParams());
            Context context = view.getContext();
            n.e(context, "context");
            qh qhVar = new qh(context);
            qhVar.addView(view);
            qhVar.addView(m7);
            this.networkNativeAdView = qhVar;
            qh networkNativeAdView = getNetworkNativeAdView();
            n.c(networkNativeAdView);
            this.nativeAd.a(new uh(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), m7));
        }
    }
}
