package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class eb {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f21916a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<View> f21917b;

    /* renamed from: c  reason: collision with root package name */
    public final BannerOptions f21918c;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        boolean onUpdate(boolean z10);
    }

    public eb(WebView webView, BannerOptions bannerOptions, a aVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f21916a = handler;
        this.f21917b = new WeakReference<>(webView);
        this.f21918c = bannerOptions;
        handler.postDelayed(new db(this, aVar), 100L);
    }

    public static boolean a(eb ebVar) {
        return bb.a(ebVar.f21917b.get(), ebVar.f21918c, new AtomicReference()) == null;
    }
}
