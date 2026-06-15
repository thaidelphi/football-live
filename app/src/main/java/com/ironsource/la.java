package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class la extends ew {

    /* renamed from: d  reason: collision with root package name */
    private final xo f18177d;

    /* renamed from: e  reason: collision with root package name */
    private final zv f18178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(w2 adTools, xo outcomeReporter, zv waterfallInstances) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        this.f18177d = outcomeReporter;
        this.f18178e = waterfallInstances;
    }

    @Override // com.ironsource.ew
    public void a() {
    }

    @Override // com.ironsource.ew
    public void a(a0 instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
    }

    @Override // com.ironsource.ew
    public void b(a0 instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f18177d.a(this.f18178e.b(), instance);
    }

    @Override // com.ironsource.ew
    public void c(a0 instanceToShow) {
        kotlin.jvm.internal.n.f(instanceToShow, "instanceToShow");
    }
}
