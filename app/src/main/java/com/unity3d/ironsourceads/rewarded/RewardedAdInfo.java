package com.unity3d.ironsourceads.rewarded;

import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class RewardedAdInfo {

    /* renamed from: a  reason: collision with root package name */
    private final String f23743a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23744b;

    public RewardedAdInfo(String instanceId, String adId) {
        n.f(instanceId, "instanceId");
        n.f(adId, "adId");
        this.f23743a = instanceId;
        this.f23744b = adId;
    }

    public final String getAdId() {
        return this.f23744b;
    }

    public final String getInstanceId() {
        return this.f23743a;
    }

    public String toString() {
        return "[instanceId: '" + this.f23743a + "', adId: '" + this.f23744b + "']";
    }
}
