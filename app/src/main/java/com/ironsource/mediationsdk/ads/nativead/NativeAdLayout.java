package com.ironsource.mediationsdk.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class NativeAdLayout extends FrameLayout implements NativeAdViewBinderInterface {

    /* renamed from: a  reason: collision with root package name */
    private final NativeAdViewHolder f18527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(Context context) {
        super(context);
        n.f(context, "context");
        this.f18527a = new NativeAdViewHolder();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.f(context, "context");
        this.f18527a = new NativeAdViewHolder();
    }

    private final List<View> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            n.e(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }

    private final void a(ViewGroup viewGroup, List<? extends View> list) {
        for (View view : list) {
            viewGroup.addView(view);
        }
    }

    public final void registerNativeAdViews(LevelPlayNativeAd nativeAd) {
        n.f(nativeAd, "nativeAd");
        List<View> a10 = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, a10);
        AdapterNativeAdViewBinder nativeAdViewBinder = nativeAd.getNativeAdViewBinder();
        if (nativeAdViewBinder != null) {
            nativeAdViewBinder.setBodyView(this.f18527a.getBodyView());
            nativeAdViewBinder.setMediaView(this.f18527a.getMediaView());
            nativeAdViewBinder.setCallToActionView(this.f18527a.getCallToActionView());
            nativeAdViewBinder.setTitleView(this.f18527a.getTitleView());
            nativeAdViewBinder.setIconView(this.f18527a.getIconView());
            nativeAdViewBinder.setAdvertiserView(this.f18527a.getAdvertiserView());
            nativeAdViewBinder.setNativeAdView(frameLayout);
            addView(nativeAdViewBinder.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.f18527a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.f18527a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.f18527a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.f18527a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f18527a.setMediaView(levelPlayMediaView);
    }

    public final void setNativeAd(LevelPlayNativeAd nativeAd) {
        n.f(nativeAd, "nativeAd");
        registerNativeAdViews(nativeAd);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.f18527a.setTitleView(view);
    }
}
