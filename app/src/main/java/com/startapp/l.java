package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l {

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f22182a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f22183b;

        public a(AdEventListener adEventListener, Ad ad, Context context) {
            this.f22182a = adEventListener;
            this.f22183b = ad;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f22182a.onReceiveAd(this.f22183b);
            } catch (Throwable th) {
                o9.a((Object) this.f22182a, th);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f22184a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f22185b;

        public b(AdEventListener adEventListener, Ad ad, Context context) {
            this.f22184a = adEventListener;
            this.f22185b = ad;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f22184a.onFailedToReceiveAd(this.f22185b);
            } catch (Throwable th) {
                o9.a((Object) this.f22184a, th);
            }
        }
    }

    public static void a(Context context, AdEventListener adEventListener, Ad ad, boolean z10) {
        if (!z10) {
            d2.a("onLoadFailed", null, ad != null ? ad.getErrorMessage() : null, adEventListener != null);
        }
        com.startapp.sdk.adsbase.a.a(adEventListener != null ? new b(adEventListener, ad, context) : null);
    }

    public static void b(Context context, AdEventListener adEventListener, Ad ad, boolean z10) {
        if (!z10) {
            d2.a("onLoad", null, null, adEventListener != null);
        }
        com.startapp.sdk.adsbase.a.a(adEventListener != null ? new a(adEventListener, ad, context) : null);
    }
}
