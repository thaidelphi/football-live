package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class pl extends FrameLayout implements NativeAdViewBinderInterface {

    /* renamed from: a  reason: collision with root package name */
    private final NativeAdViewHolder f19767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(Context context) {
        super(context);
        kotlin.jvm.internal.n.f(context, "context");
        this.f19767a = new NativeAdViewHolder();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.n.f(context, "context");
        this.f19767a = new NativeAdViewHolder();
    }

    private final List<View> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            kotlin.jvm.internal.n.e(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }

    private final void a(ViewGroup viewGroup, List<? extends View> list) {
        for (View view : list) {
            viewGroup.addView(view);
        }
    }

    public final void a(ml nativeAd) {
        kotlin.jvm.internal.n.f(nativeAd, "nativeAd");
        List<View> a10 = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, a10);
        AdapterNativeAdViewBinder f10 = nativeAd.f();
        if (f10 != null) {
            f10.setBodyView(this.f19767a.getBodyView());
            f10.setMediaView(this.f19767a.getMediaView());
            f10.setCallToActionView(this.f19767a.getCallToActionView());
            f10.setTitleView(this.f19767a.getTitleView());
            f10.setIconView(this.f19767a.getIconView());
            f10.setAdvertiserView(this.f19767a.getAdvertiserView());
            f10.setNativeAdView(frameLayout);
            addView(f10.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.f19767a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.f19767a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.f19767a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.f19767a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f19767a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.f19767a.setTitleView(view);
    }
}
