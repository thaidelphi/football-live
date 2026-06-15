package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BannerListener f22270a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f22271b;

    public m0(BannerListener bannerListener, BannerStandard bannerStandard, Context context) {
        this.f22270a = bannerListener;
        this.f22271b = bannerStandard;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f22270a.onImpression(this.f22271b);
        } catch (Throwable th) {
            o9.a((Object) this.f22270a, th);
        }
    }
}
