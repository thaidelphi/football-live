package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zc implements nk {

    /* renamed from: a  reason: collision with root package name */
    private final ns f21653a;

    /* renamed from: b  reason: collision with root package name */
    private long f21654b;

    public zc(bf applicationLifecycleService, ns task) {
        kotlin.jvm.internal.n.f(applicationLifecycleService, "applicationLifecycleService");
        kotlin.jvm.internal.n.f(task, "task");
        this.f21653a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.f21654b;
    }

    private final void f() {
        this.f21654b = System.currentTimeMillis();
    }

    @Override // com.ironsource.nk
    public void a() {
    }

    @Override // com.ironsource.nk
    public void b() {
        this.f21653a.a(Long.valueOf(e()));
        this.f21653a.run();
    }

    @Override // com.ironsource.nk
    public void c() {
        f();
    }

    @Override // com.ironsource.nk
    public void d() {
    }
}
