package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdvertisingIdResolverMetadata implements Serializable {
    private static final long serialVersionUID = -1692502027621350736L;
    private boolean enabled = true;
    private double iep = 0.0d;
    private int ief = 0;

    public final int a() {
        return this.ief;
    }

    public final double b() {
        return this.iep;
    }

    public final boolean c() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdvertisingIdResolverMetadata advertisingIdResolverMetadata = (AdvertisingIdResolverMetadata) obj;
        return this.enabled == advertisingIdResolverMetadata.enabled && Double.compare(this.iep, advertisingIdResolverMetadata.iep) == 0 && this.ief == advertisingIdResolverMetadata.ief;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Double.valueOf(this.iep), Integer.valueOf(this.ief)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
