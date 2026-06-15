package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class pj implements ui {

    /* renamed from: a  reason: collision with root package name */
    private final c3 f19765a;

    /* renamed from: b  reason: collision with root package name */
    private final mj f19766b;

    public pj(c3 adapterConfig, mj adFormatConfigurations) {
        kotlin.jvm.internal.n.f(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.n.f(adFormatConfigurations, "adFormatConfigurations");
        this.f19765a = adapterConfig;
        this.f19766b = adFormatConfigurations;
    }

    @Override // com.ironsource.d3
    public boolean a() {
        return !this.f19765a.j();
    }

    @Override // com.ironsource.d3
    public String b() {
        String a10 = this.f19765a.a();
        kotlin.jvm.internal.n.e(a10, "adapterConfig.adSourceNameForEvents");
        return a10;
    }

    @Override // com.ironsource.d3
    public wi c() {
        return wi.f21295b.a(this.f19765a.d());
    }

    @Override // com.ironsource.d3
    public boolean d() {
        return true;
    }

    @Override // com.ironsource.u
    public long e() {
        return this.f19766b.e();
    }

    @Override // com.ironsource.d3
    public String f() {
        String f10 = this.f19765a.f();
        kotlin.jvm.internal.n.e(f10, "adapterConfig.providerName");
        return f10;
    }
}
