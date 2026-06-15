package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f2 {

    /* renamed from: a  reason: collision with root package name */
    private final ct f17357a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17358b;

    /* renamed from: c  reason: collision with root package name */
    private final String f17359c;

    /* renamed from: d  reason: collision with root package name */
    private final ig f17360d;

    /* renamed from: e  reason: collision with root package name */
    private final String f17361e;

    public f2(ct recordType, String advertiserBundleId, String networkInstanceId, ig adProvider, String adInstanceId) {
        kotlin.jvm.internal.n.f(recordType, "recordType");
        kotlin.jvm.internal.n.f(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.n.f(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.n.f(adProvider, "adProvider");
        kotlin.jvm.internal.n.f(adInstanceId, "adInstanceId");
        this.f17357a = recordType;
        this.f17358b = advertiserBundleId;
        this.f17359c = networkInstanceId;
        this.f17360d = adProvider;
        this.f17361e = adInstanceId;
    }

    public final sn a(lm<f2, sn> mapper) {
        kotlin.jvm.internal.n.f(mapper, "mapper");
        return mapper.a(this);
    }

    public final String a() {
        return this.f17361e;
    }

    public final ig b() {
        return this.f17360d;
    }

    public final String c() {
        return this.f17358b;
    }

    public final String d() {
        return this.f17359c;
    }

    public final ct e() {
        return this.f17357a;
    }
}
