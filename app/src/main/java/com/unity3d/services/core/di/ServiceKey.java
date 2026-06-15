package com.unity3d.services.core.di;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import z8.c;
/* compiled from: ServiceKey.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ServiceKey {
    private final c<?> instanceClass;
    private final String named;

    public ServiceKey(String named, c<?> instanceClass) {
        n.f(named, "named");
        n.f(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i10 & 2) != 0) {
            cVar = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, cVar);
    }

    public final String component1() {
        return this.named;
    }

    public final c<?> component2() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String named, c<?> instanceClass) {
        n.f(named, "named");
        n.f(instanceClass, "instanceClass");
        return new ServiceKey(named, instanceClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ServiceKey) {
            ServiceKey serviceKey = (ServiceKey) obj;
            return n.a(this.named, serviceKey.named) && n.a(this.instanceClass, serviceKey.instanceClass);
        }
        return false;
    }

    public final c<?> getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ ServiceKey(String str, c cVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, cVar);
    }
}
