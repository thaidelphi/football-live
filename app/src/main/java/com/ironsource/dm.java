package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class dm implements rc<cm> {

    /* renamed from: a  reason: collision with root package name */
    private final String f17072a;

    /* renamed from: b  reason: collision with root package name */
    private final yp f17073b;

    /* renamed from: c  reason: collision with root package name */
    private final e3 f17074c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f17075d;

    public dm(String adm, yp providerName, e3 adapterConfigs, boolean z10) {
        kotlin.jvm.internal.n.f(adm, "adm");
        kotlin.jvm.internal.n.f(providerName, "providerName");
        kotlin.jvm.internal.n.f(adapterConfigs, "adapterConfigs");
        this.f17072a = adm;
        this.f17073b = providerName;
        this.f17074c = adapterConfigs;
        this.f17075d = z10;
    }

    @Override // com.ironsource.rc
    /* renamed from: b */
    public cm a() throws or, Exception {
        ui a10 = this.f17074c.a(this.f17073b);
        new s0(this.f17072a, a10, this.f17075d).a();
        if (a10 != null) {
            return new cm(a10.c(), a10.b(), a10.e(), a10.a(), false, 16, null);
        }
        return null;
    }
}
