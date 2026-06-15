package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f21999a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f22000b;

    public h(Context context, StartAppAd startAppAd, AdDisplayListener adDisplayListener) {
        this.f21999a = adDisplayListener;
        this.f22000b = startAppAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f21999a.adDisplayed(this.f22000b);
        } catch (Throwable th) {
            o9.a((Object) this.f21999a, th);
        }
    }
}
