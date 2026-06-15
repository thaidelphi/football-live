package com.startapp;

import android.content.Context;
import com.startapp.o9;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a2 implements o9.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21749a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AdEventListener f21750b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InterstitialAd f21751c;

    public a2(Context context, AdEventListener adEventListener, InterstitialAd interstitialAd) {
        this.f21749a = context;
        this.f21750b = adEventListener;
        this.f21751c = interstitialAd;
    }

    @Override // com.startapp.o9.b
    public final void a(boolean z10, long j10, long j11, boolean z11) {
        l.b(this.f21749a, this.f21750b, this.f21751c, true);
    }

    @Override // com.startapp.o9.b
    public final void a(String str, int i10) {
        l.b(this.f21749a, this.f21750b, this.f21751c, true);
    }
}
