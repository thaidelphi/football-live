package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.dl;
import com.ironsource.lf;
import com.ironsource.w6;
import com.unity3d.mediation.LevelPlayAdSize;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final dl f23790a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context) {
        this(context, null, 0, 6, null);
        n.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.f(context, "context");
        w6 a10 = a(context);
        addView(a10);
        this.f23790a = new dl(lf.f18190a.a(), a10, attributeSet);
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId) {
        this(context, null, 0, 6, null);
        n.f(context, "context");
        n.f(adUnitId, "adUnitId");
        this.f23790a.a(adUnitId);
    }

    private final w6 a(Context context) {
        w6 w6Var = new w6(context);
        w6Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return w6Var;
    }

    public final void destroy() {
        this.f23790a.f();
    }

    public final String getAdId() {
        String uuid = this.f23790a.g().toString();
        n.e(uuid, "bannerViewInternal.adId.toString()");
        return uuid;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f23790a.h();
    }

    public final String getAdUnitId() {
        return this.f23790a.b();
    }

    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f23790a.i();
    }

    public final String getPlacementName() {
        return this.f23790a.j();
    }

    public final void loadAd() {
        this.f23790a.k();
    }

    public final void pauseAutoRefresh() {
        this.f23790a.l();
    }

    public final void resumeAutoRefresh() {
        this.f23790a.m();
    }

    public final void setAdSize(LevelPlayAdSize adSize) {
        n.f(adSize, "adSize");
        this.f23790a.a(adSize);
    }

    public final void setBannerListener(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f23790a.a(levelPlayBannerAdViewListener);
    }

    public final void setPlacementName(String str) {
        dl dlVar = this.f23790a;
        if (str == null) {
            str = "";
        }
        dlVar.b(str);
    }
}
