package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class lq implements ui {

    /* renamed from: a  reason: collision with root package name */
    private final c3 f18260a;

    /* renamed from: b  reason: collision with root package name */
    private final yq f18261b;

    public lq(c3 adapterConfig, yq adFormatConfigurations) {
        kotlin.jvm.internal.n.f(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.n.f(adFormatConfigurations, "adFormatConfigurations");
        this.f18260a = adapterConfig;
        this.f18261b = adFormatConfigurations;
    }

    @Override // com.ironsource.d3
    public boolean a() {
        return !this.f18260a.j();
    }

    @Override // com.ironsource.d3
    public String b() {
        String a10 = this.f18260a.a();
        kotlin.jvm.internal.n.e(a10, "adapterConfig.adSourceNameForEvents");
        return a10;
    }

    @Override // com.ironsource.d3
    public wi c() {
        return wi.f21295b.a(this.f18260a.d());
    }

    @Override // com.ironsource.d3
    public boolean d() {
        return true;
    }

    @Override // com.ironsource.u
    public long e() {
        return this.f18261b.i();
    }

    @Override // com.ironsource.d3
    public String f() {
        String f10 = this.f18260a.f();
        kotlin.jvm.internal.n.e(f10, "adapterConfig.providerName");
        return f10;
    }
}
