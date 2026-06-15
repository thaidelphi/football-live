package com.unity3d.ads.injection;

import com.google.android.gms.ads.RequestConfiguration;
import g9.l0;
import g9.w;
import i8.g;
import i8.i;
import i8.s;
import j8.i0;
import j8.j0;
import java.util.Map;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
import t8.a;
/* compiled from: Registry.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class Registry {
    private final w<Map<EntryKey, g<?>>> _services;

    public Registry() {
        Map f10;
        f10 = j0.f();
        this._services = l0.a(f10);
    }

    public static /* synthetic */ EntryKey factory$default(Registry registry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.f(instance, "instance");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, b0.b(Object.class));
        registry.add(entryKey, new Factory(instance));
        return entryKey;
    }

    public static /* synthetic */ Object get$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, b0.b(Object.class));
        g<?> gVar = registry.getServices().get(entryKey);
        if (gVar != null) {
            Object value = gVar.getValue();
            n.k(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public static /* synthetic */ Object getOrNull$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        g<?> gVar = registry.getServices().get(new EntryKey(named, b0.b(Object.class)));
        if (gVar == null) {
            return null;
        }
        Object value = gVar.getValue();
        n.k(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return value;
    }

    public static /* synthetic */ EntryKey single$default(Registry registry, String named, a instance, int i10, Object obj) {
        g b10;
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.f(instance, "instance");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, b0.b(Object.class));
        b10 = i.b(instance);
        registry.add(entryKey, b10);
        return entryKey;
    }

    public final <T> void add(EntryKey key, g<? extends T> instance) {
        Map<EntryKey, g<?>> value;
        Map d10;
        Map<EntryKey, g<?>> l10;
        n.f(key, "key");
        n.f(instance, "instance");
        if (!getServices().containsKey(key)) {
            w<Map<EntryKey, g<?>>> wVar = this._services;
            do {
                value = wVar.getValue();
                d10 = i0.d(s.a(key, instance));
                l10 = j0.l(value, d10);
            } while (!wVar.i(value, l10));
            return;
        }
        throw new IllegalStateException("Cannot have identical entries.".toString());
    }

    public final /* synthetic */ <T> EntryKey factory(String named, a<? extends T> instance) {
        n.f(named, "named");
        n.f(instance, "instance");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, b0.b(Object.class));
        add(entryKey, new Factory(instance));
        return entryKey;
    }

    public final /* synthetic */ <T> T get(String named) {
        n.f(named, "named");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, b0.b(Object.class));
        g<?> gVar = getServices().get(entryKey);
        if (gVar != null) {
            T t10 = (T) gVar.getValue();
            n.k(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return t10;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        n.f(named, "named");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        g<?> gVar = getServices().get(new EntryKey(named, b0.b(Object.class)));
        if (gVar == null) {
            return null;
        }
        T t10 = (T) gVar.getValue();
        n.k(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return t10;
    }

    public final Map<EntryKey, g<?>> getServices() {
        return this._services.getValue();
    }

    public final /* synthetic */ <T> EntryKey single(String named, a<? extends T> instance) {
        g<? extends T> b10;
        n.f(named, "named");
        n.f(instance, "instance");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, b0.b(Object.class));
        b10 = i.b(instance);
        add(entryKey, b10);
        return entryKey;
    }
}
