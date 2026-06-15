package com.unity3d.ironsourceads.interstitial;

import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InterstitialAdInfo {

    /* renamed from: a  reason: collision with root package name */
    private final String f23730a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23731b;

    public InterstitialAdInfo(String instanceId, String adId) {
        n.f(instanceId, "instanceId");
        n.f(adId, "adId");
        this.f23730a = instanceId;
        this.f23731b = adId;
    }

    public final String getAdId() {
        return this.f23731b;
    }

    public final String getInstanceId() {
        return this.f23730a;
    }

    public String toString() {
        return "[instanceId: '" + this.f23730a + "', adId: '" + this.f23731b + "']";
    }
}
