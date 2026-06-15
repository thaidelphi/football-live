package com.unity3d.ironsourceads.banner;

import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class BannerAdInfo {

    /* renamed from: a  reason: collision with root package name */
    private final String f23711a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23712b;

    public BannerAdInfo(String instanceId, String adId) {
        n.f(instanceId, "instanceId");
        n.f(adId, "adId");
        this.f23711a = instanceId;
        this.f23712b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerAdInfo.f23711a;
        }
        if ((i10 & 2) != 0) {
            str2 = bannerAdInfo.f23712b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f23711a;
    }

    public final String component2() {
        return this.f23712b;
    }

    public final BannerAdInfo copy(String instanceId, String adId) {
        n.f(instanceId, "instanceId");
        n.f(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BannerAdInfo) {
            BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
            return n.a(this.f23711a, bannerAdInfo.f23711a) && n.a(this.f23712b, bannerAdInfo.f23712b);
        }
        return false;
    }

    public final String getAdId() {
        return this.f23712b;
    }

    public final String getInstanceId() {
        return this.f23711a;
    }

    public int hashCode() {
        return (this.f23711a.hashCode() * 31) + this.f23712b.hashCode();
    }

    public String toString() {
        return "[instanceId: '" + this.f23711a + "', adId: '" + this.f23712b + "']";
    }
}
