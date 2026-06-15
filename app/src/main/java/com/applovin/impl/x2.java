package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x2 extends b3 implements m1 {

    /* renamed from: v  reason: collision with root package name */
    private final AtomicBoolean f9573v;

    /* renamed from: w  reason: collision with root package name */
    private final AtomicBoolean f9574w;

    public x2(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(i10, map, jSONObject, jSONObject2, null, jVar);
        this.f9573v = new AtomicBoolean();
        this.f9574w = new AtomicBoolean();
    }

    private long r0() {
        long a10 = a("ad_expiration_ms", -1L);
        return a10 < 0 ? b("ad_expiration_ms", ((Long) this.f6792a.a(j3.f7305g7)).longValue()) : a10;
    }

    @Override // com.applovin.impl.u2
    public u2 a(com.applovin.impl.mediation.g gVar) {
        return new x2(this, gVar);
    }

    @Override // com.applovin.impl.m1
    public long getTimeToLiveMillis() {
        return r0() - (SystemClock.elapsedRealtime() - L());
    }

    public MaxNativeAdView s0() {
        return this.f9322n.f();
    }

    @Override // com.applovin.impl.m1
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public ViewGroup t0() {
        return this.f9322n.h();
    }

    public AtomicBoolean u0() {
        return this.f9573v;
    }

    public String v0() {
        return BundleUtils.getString("template", "", l());
    }

    public AtomicBoolean w0() {
        return this.f9574w;
    }

    public boolean x0() {
        return a("inacc", (Boolean) this.f6792a.a(j3.f7322y7)).booleanValue();
    }

    public boolean y0() {
        return this.f9322n == null;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f9322n.a(maxNativeAdView);
    }

    public void a(ViewGroup viewGroup) {
        this.f9322n.a(viewGroup);
    }

    private x2(x2 x2Var, com.applovin.impl.mediation.g gVar) {
        super(x2Var.K(), x2Var.i(), x2Var.a(), x2Var.g(), gVar, x2Var.f6792a);
        this.f9573v = new AtomicBoolean();
        this.f9574w = new AtomicBoolean();
    }
}
