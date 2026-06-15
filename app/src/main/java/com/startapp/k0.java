package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BannerListener f22160a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f22161b;

    public k0(BannerListener bannerListener, View view, Context context) {
        this.f22160a = bannerListener;
        this.f22161b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f22160a.onReceiveAd(this.f22161b);
        } catch (Throwable th) {
            o9.a((Object) this.f22160a, th);
        }
    }
}
