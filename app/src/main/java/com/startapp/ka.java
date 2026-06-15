package com.startapp;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.h4;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ka extends p4 {

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f22178h;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f22179i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f22180j;

    public ka(Activity activity, h4.a aVar, h4.a aVar2, qa qaVar, com.startapp.sdk.ads.video.g gVar, pa paVar, TrackingParams trackingParams, boolean z10) {
        super(activity, aVar, aVar2, trackingParams);
        this.f22178h = null;
        this.f22179i = null;
        this.f22180j = null;
        this.f22178h = qaVar;
        this.f22179i = gVar;
        this.f22180j = paVar;
        this.f22388b = z10;
    }

    @JavascriptInterface
    public void replayVideo() {
        if (this.f22178h != null) {
            new Handler(Looper.getMainLooper()).post(this.f22178h);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        if (this.f22179i != null) {
            new Handler(Looper.getMainLooper()).post(this.f22179i);
        }
    }

    @JavascriptInterface
    public void toggleSound() {
        if (this.f22180j != null) {
            new Handler(Looper.getMainLooper()).post(this.f22180j);
        }
    }
}
