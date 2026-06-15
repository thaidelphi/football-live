package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class z6 implements ui {

    /* renamed from: a  reason: collision with root package name */
    private final c3 f21629a;

    /* renamed from: b  reason: collision with root package name */
    private final u6 f21630b;

    public z6(c3 adapterConfig, u6 adFormatConfigurations) {
        kotlin.jvm.internal.n.f(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.n.f(adFormatConfigurations, "adFormatConfigurations");
        this.f21629a = adapterConfig;
        this.f21630b = adFormatConfigurations;
    }

    @Override // com.ironsource.d3
    public boolean a() {
        return !this.f21629a.j();
    }

    @Override // com.ironsource.d3
    public String b() {
        String a10 = this.f21629a.a();
        kotlin.jvm.internal.n.e(a10, "adapterConfig.adSourceNameForEvents");
        return a10;
    }

    @Override // com.ironsource.d3
    public wi c() {
        return wi.f21295b.a(this.f21629a.d());
    }

    @Override // com.ironsource.d3
    public boolean d() {
        return true;
    }

    @Override // com.ironsource.u
    public long e() {
        return this.f21630b.b();
    }

    @Override // com.ironsource.d3
    public String f() {
        String f10 = this.f21629a.f();
        kotlin.jvm.internal.n.e(f10, "adapterConfig.providerName");
        return f10;
    }
}
