package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final ct f21080a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21081b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21082c;

    /* renamed from: d  reason: collision with root package name */
    private final String f21083d;

    /* renamed from: e  reason: collision with root package name */
    private final ig f21084e;

    /* renamed from: f  reason: collision with root package name */
    private final String f21085f;

    public v(ct recordType, String advertiserBundleId, String networkInstanceId, String adUnitId, ig adProvider, String adInstanceId) {
        kotlin.jvm.internal.n.f(recordType, "recordType");
        kotlin.jvm.internal.n.f(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.n.f(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adProvider, "adProvider");
        kotlin.jvm.internal.n.f(adInstanceId, "adInstanceId");
        this.f21080a = recordType;
        this.f21081b = advertiserBundleId;
        this.f21082c = networkInstanceId;
        this.f21083d = adUnitId;
        this.f21084e = adProvider;
        this.f21085f = adInstanceId;
    }

    public final f2 a(lm<v, f2> mapper) {
        kotlin.jvm.internal.n.f(mapper, "mapper");
        return mapper.a(this);
    }

    public final String a() {
        return this.f21085f;
    }

    public final ig b() {
        return this.f21084e;
    }

    public final String c() {
        return this.f21083d;
    }

    public final String d() {
        return this.f21081b;
    }

    public final String e() {
        return this.f21082c;
    }

    public final ct f() {
        return this.f21080a;
    }
}
