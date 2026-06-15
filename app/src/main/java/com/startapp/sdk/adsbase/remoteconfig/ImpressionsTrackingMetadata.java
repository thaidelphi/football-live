package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.k9;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ImpressionsTrackingMetadata implements Serializable {
    private static final long serialVersionUID = -8908841983322302421L;
    @TypeInfo(parser = k9.class)
    private double enabled = 0.0d;
    private int types = 3;

    public final double a() {
        return this.enabled;
    }

    public final int b() {
        return this.types;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImpressionsTrackingMetadata impressionsTrackingMetadata = (ImpressionsTrackingMetadata) obj;
        return Double.compare(this.enabled, impressionsTrackingMetadata.enabled) == 0 && this.types == impressionsTrackingMetadata.types;
    }

    public final int hashCode() {
        Object[] objArr = {Double.valueOf(this.enabled), Integer.valueOf(this.types)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
