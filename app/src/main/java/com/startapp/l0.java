package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l0 {

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BannerListener f22186a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f22187b;

        public a(BannerListener bannerListener, View view, Context context) {
            this.f22186a = bannerListener;
            this.f22187b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f22186a.onFailedToReceiveAd(this.f22187b);
            } catch (Throwable th) {
                o9.a((Object) this.f22186a, th);
            }
        }
    }

    public static void a(Context context, BannerListener bannerListener, View view, String str) {
        d2.a("onLoadFailed", str, null, bannerListener != null);
        com.startapp.sdk.adsbase.a.a(bannerListener != null ? new a(bannerListener, view, context) : null);
    }
}
