package com.unity3d.ads.core.configuration;

import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.n;
/* compiled from: MetadataReader.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class MetadataReader<T> {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage, String key) {
        n.f(jsonStorage, "jsonStorage");
        n.f(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    public final /* synthetic */ <T> T read(T t10) {
        T t11 = (T) getJsonStorage().get(getKey());
        if (t11 != null) {
            n.k(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return t11;
        }
        return t10;
    }

    public final /* synthetic */ <T> T readAndDelete(T t10) {
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            n.e(obj, "get(key)");
            n.k(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            t10 = obj;
        }
        Object obj2 = getJsonStorage().get(getKey());
        if (obj2 != null) {
            n.e(obj2, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return t10;
    }
}
