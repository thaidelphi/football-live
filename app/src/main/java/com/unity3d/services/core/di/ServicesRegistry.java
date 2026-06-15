package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import i8.g;
import i8.h;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
import t8.a;
import z8.c;
/* compiled from: ServicesRegistry.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, g<?>> _services = new ConcurrentHashMap<>();

    public static /* synthetic */ ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.f(instance, "instance");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        ServiceKey serviceKey = new ServiceKey(named, b0.b(Object.class));
        servicesRegistry.updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public static /* synthetic */ Object get$default(ServicesRegistry servicesRegistry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return servicesRegistry.resolveService(new ServiceKey(named, b0.b(Object.class)));
    }

    public static /* synthetic */ Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return servicesRegistry.resolveServiceOrNull(new ServiceKey(named, b0.b(Object.class)));
    }

    public static /* synthetic */ ServiceKey single$default(ServicesRegistry servicesRegistry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.f(instance, "instance");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        ServiceKey serviceKey = new ServiceKey(named, b0.b(Object.class));
        servicesRegistry.updateService(serviceKey, h.b(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> ServiceKey factory(String named, a<? extends T> instance) {
        n.f(named, "named");
        n.f(instance, "instance");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        ServiceKey serviceKey = new ServiceKey(named, b0.b(Object.class));
        updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> T get(String named) {
        n.f(named, "named");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) resolveService(new ServiceKey(named, b0.b(Object.class)));
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        n.f(named, "named");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) resolveServiceOrNull(new ServiceKey(named, b0.b(Object.class)));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(String named, c<?> instance) {
        n.f(named, "named");
        n.f(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public Map<ServiceKey, g<?>> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(ServiceKey key) {
        n.f(key, "key");
        g<?> gVar = getServices().get(key);
        if (gVar != null) {
            return (T) gVar.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveServiceOrNull(ServiceKey key) {
        n.f(key, "key");
        g<?> gVar = getServices().get(key);
        if (gVar == null) {
            return null;
        }
        return (T) gVar.getValue();
    }

    public final /* synthetic */ <T> ServiceKey single(String named, a<? extends T> instance) {
        n.f(named, "named");
        n.f(instance, "instance");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        ServiceKey serviceKey = new ServiceKey(named, b0.b(Object.class));
        updateService(serviceKey, h.b(instance));
        return serviceKey;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(ServiceKey key, g<? extends T> instance) {
        n.f(key, "key");
        n.f(instance, "instance");
        if (!getServices().containsKey(key)) {
            this._services.put(key, instance);
            return;
        }
        throw new IllegalStateException(("Cannot have multiple identical services: " + key).toString());
    }
}
