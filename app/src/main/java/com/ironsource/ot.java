package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ot extends ew {

    /* renamed from: d  reason: collision with root package name */
    private final xo f19635d;

    /* renamed from: e  reason: collision with root package name */
    private final zv f19636e;

    /* renamed from: f  reason: collision with root package name */
    private final g0 f19637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(w2 adTools, xo outcomeReporter, zv waterfallInstances, g0 adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.n.f(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.f19635d = outcomeReporter;
        this.f19636e = waterfallInstances;
        this.f19637f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.ew
    public void a() {
        a0 a10 = this.f19637f.c().a();
        if (a10 != null) {
            this.f19635d.a(this.f19636e.b(), a10);
        }
    }

    @Override // com.ironsource.ew
    public void a(a0 instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        if (!this.f19637f.a(instance) && (!this.f19637f.a() || (instance = this.f19637f.c().a()) == null)) {
            return;
        }
        this.f19635d.a(this.f19636e.b(), instance);
    }

    @Override // com.ironsource.ew
    public void b(a0 instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
    }

    @Override // com.ironsource.ew
    public void c(a0 instanceToShow) {
        kotlin.jvm.internal.n.f(instanceToShow, "instanceToShow");
        this.f19635d.a(this.f19636e.b(), instanceToShow);
    }
}
