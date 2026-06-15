package com.startapp.sdk.adsbase.cache;

import com.startapp.l;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.g;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements AdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.a f23034a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f23035b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f23036c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f23037d;

    public e(g gVar, g.a aVar, boolean z10, boolean z11) {
        this.f23037d = gVar;
        this.f23034a = aVar;
        this.f23035b = z10;
        this.f23036c = z11;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        if (this.f23035b) {
            l.a(this.f23037d.f23040b, this.f23034a, ad, true);
            return;
        }
        g gVar = this.f23037d;
        gVar.f23043e = null;
        gVar.a(this.f23036c);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        l.b(this.f23037d.f23040b, this.f23034a, ad, true);
    }
}
