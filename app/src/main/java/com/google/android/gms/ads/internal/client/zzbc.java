package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class zzbc extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    private final Object f11207a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private AdListener f11208b;

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        synchronized (this.f11207a) {
            AdListener adListener = this.f11208b;
            if (adListener != null) {
                adListener.onAdClicked();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.f11207a) {
            AdListener adListener = this.f11208b;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.f11207a) {
            AdListener adListener = this.f11208b;
            if (adListener != null) {
                adListener.onAdFailedToLoad(loadAdError);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.f11207a) {
            AdListener adListener = this.f11208b;
            if (adListener != null) {
                adListener.onAdImpression();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.f11207a) {
            AdListener adListener = this.f11208b;
            if (adListener != null) {
                adListener.onAdLoaded();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.f11207a) {
            AdListener adListener = this.f11208b;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }

    public final void zza(AdListener adListener) {
        synchronized (this.f11207a) {
            this.f11208b = adListener;
        }
    }
}
