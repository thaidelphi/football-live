package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f22115a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f22116b;

    public j(Context context, Ad ad, AdDisplayListener adDisplayListener) {
        this.f22115a = adDisplayListener;
        this.f22116b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f22115a.adNotDisplayed(this.f22116b);
        } catch (Throwable th) {
            o9.a((Object) this.f22115a, th);
        }
    }
}
