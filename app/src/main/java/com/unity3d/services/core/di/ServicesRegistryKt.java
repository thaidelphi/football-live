package com.unity3d.services.core.di;

import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: ServicesRegistry.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ServicesRegistryKt {
    public static final ServicesRegistry registry(l<? super ServicesRegistry, w> registry) {
        n.f(registry, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        registry.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
