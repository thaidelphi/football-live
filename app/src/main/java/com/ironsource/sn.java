package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class sn {

    /* renamed from: a  reason: collision with root package name */
    private final ct f20708a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20709b;

    /* renamed from: c  reason: collision with root package name */
    private final ig f20710c;

    /* renamed from: d  reason: collision with root package name */
    private final String f20711d;

    public sn(ct recordType, String advertiserBundleId, ig adProvider, String adInstanceId) {
        kotlin.jvm.internal.n.f(recordType, "recordType");
        kotlin.jvm.internal.n.f(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.n.f(adProvider, "adProvider");
        kotlin.jvm.internal.n.f(adInstanceId, "adInstanceId");
        this.f20708a = recordType;
        this.f20709b = advertiserBundleId;
        this.f20710c = adProvider;
        this.f20711d = adInstanceId;
    }

    public final g3 a(lm<sn, g3> mapper) {
        kotlin.jvm.internal.n.f(mapper, "mapper");
        return mapper.a(this);
    }

    public final String a() {
        return this.f20711d;
    }

    public final ig b() {
        return this.f20710c;
    }

    public final String c() {
        return this.f20709b;
    }

    public final ct d() {
        return this.f20708a;
    }
}
