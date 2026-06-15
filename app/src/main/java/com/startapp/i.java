package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f22080a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f22081b;

    public i(Context context, StartAppAd startAppAd, AdDisplayListener adDisplayListener) {
        this.f22080a = adDisplayListener;
        this.f22081b = startAppAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f22080a.adClicked(this.f22081b);
        } catch (Throwable th) {
            o9.a((Object) this.f22080a, th);
        }
    }
}
