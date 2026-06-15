package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f21978a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f21979b;

    public g(Context context, StartAppAd startAppAd, AdDisplayListener adDisplayListener) {
        this.f21978a = adDisplayListener;
        this.f21979b = startAppAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f21978a.adHidden(this.f21979b);
        } catch (Throwable th) {
            o9.a((Object) this.f21978a, th);
        }
    }
}
