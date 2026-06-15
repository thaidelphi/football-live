package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s2 extends com.ironsource.mediationsdk.h {

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, k0> f20059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(List<? extends NetworkSettings> providers, int i10) {
        super(providers, i10);
        int a10;
        kotlin.jvm.internal.n.f(providers, "providers");
        a10 = y8.i.a(j8.g0.c(j8.o.k(providers, 10)), 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (NetworkSettings networkSettings : providers) {
            i8.n a11 = i8.s.a(networkSettings.getProviderName(), new k0(i10));
            linkedHashMap.put(a11.c(), a11.d());
        }
        this.f20059e = linkedHashMap;
    }

    private final void a(Map<String, i0> map) {
        for (Map.Entry<String, k0> entry : this.f20059e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }

    @Override // com.ironsource.mediationsdk.h
    public String a(String instanceName) {
        String d10;
        kotlin.jvm.internal.n.f(instanceName, "instanceName");
        k0 k0Var = this.f20059e.get(instanceName);
        return (k0Var == null || (d10 = k0Var.d()) == null) ? "" : d10;
    }

    public final void a(zv waterfallInstances) {
        int a10;
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        List<a0> b10 = waterfallInstances.b();
        a10 = y8.i.a(j8.g0.c(j8.o.k(b10, 10)), 16);
        Map<String, i0> linkedHashMap = new LinkedHashMap<>(a10);
        for (a0 a0Var : b10) {
            i8.n a11 = i8.s.a(a0Var.o(), a0Var.r());
            linkedHashMap.put(a11.c(), a11.d());
        }
        a(linkedHashMap);
    }
}
