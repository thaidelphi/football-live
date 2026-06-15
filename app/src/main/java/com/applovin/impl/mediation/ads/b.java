package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.v7;
import com.applovin.impl.w7;
import com.applovin.impl.x2;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements w7.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7657a;

    /* renamed from: b  reason: collision with root package name */
    private final x2 f7658b;

    /* renamed from: c  reason: collision with root package name */
    private final w7 f7659c;

    /* renamed from: d  reason: collision with root package name */
    private final v7 f7660d;

    /* renamed from: e  reason: collision with root package name */
    private final a.InterfaceC0126a f7661e;

    public b(x2 x2Var, ViewGroup viewGroup, a.InterfaceC0126a interfaceC0126a, com.applovin.impl.sdk.j jVar) {
        this.f7657a = jVar;
        this.f7658b = x2Var;
        this.f7661e = interfaceC0126a;
        this.f7660d = new v7(viewGroup, jVar);
        w7 w7Var = new w7(viewGroup, jVar, this);
        this.f7659c = w7Var;
        w7Var.a(x2Var);
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = jVar.I();
            I.a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f7659c.b();
    }

    public x2 b() {
        return this.f7658b;
    }

    public void c() {
        this.f7657a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f7657a.I().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f7658b.u0().compareAndSet(false, true)) {
            this.f7657a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f7657a.I().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f7658b.getNativeAd().isExpired()) {
                com.applovin.impl.sdk.n.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f7657a.f().a(this.f7658b);
            }
            this.f7657a.P().processRawAdImpression(this.f7658b, this.f7661e);
        }
    }

    @Override // com.applovin.impl.w7.a
    public void onLogVisibilityImpression() {
        a(this.f7660d.a(this.f7658b));
    }

    private void a(long j10) {
        if (this.f7658b.w0().compareAndSet(false, true)) {
            this.f7657a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f7657a.I().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f7657a.P().processViewabilityAdImpressionPostback(this.f7658b, j10, this.f7661e);
        }
    }
}
