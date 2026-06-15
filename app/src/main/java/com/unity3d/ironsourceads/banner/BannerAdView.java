package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.p6;
import com.ironsource.q6;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class BannerAdView extends FrameLayout implements q6 {

    /* renamed from: a  reason: collision with root package name */
    private p6 f23726a;

    /* renamed from: b  reason: collision with root package name */
    private BannerAdViewListener f23727b;

    private BannerAdView(Context context) {
        super(context);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BannerAdView(com.ironsource.p6 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "bannerAdViewInternal"
            kotlin.jvm.internal.n.f(r3, r0)
            com.ironsource.vg r0 = r3.d()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "bannerAdViewInternal.container.context"
            kotlin.jvm.internal.n.e(r0, r1)
            r2.<init>(r0)
            r2.f23726a = r3
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r3.a(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r3.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ironsourceads.banner.BannerAdView.<init>(com.ironsource.p6):void");
    }

    public final BannerAdInfo getAdInfo() {
        p6 p6Var = this.f23726a;
        if (p6Var == null) {
            n.u("bannerAdViewInternal");
            p6Var = null;
        }
        return p6Var.c();
    }

    public final BannerAdViewListener getListener() {
        return this.f23727b;
    }

    @Override // com.ironsource.q6
    public void onBannerAdClicked() {
        BannerAdViewListener bannerAdViewListener = this.f23727b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.q6
    public void onBannerAdShown() {
        BannerAdViewListener bannerAdViewListener = this.f23727b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(BannerAdViewListener bannerAdViewListener) {
        this.f23727b = bannerAdViewListener;
    }
}
