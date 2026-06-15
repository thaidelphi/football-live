package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class LocationMetadata implements Serializable {
    private static final long serialVersionUID = 6065806350166123602L;
    private boolean coEnabled;
    private boolean fiEnabled;

    public final boolean a() {
        return this.fiEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationMetadata locationMetadata = (LocationMetadata) obj;
        return this.fiEnabled == locationMetadata.fiEnabled && this.coEnabled == locationMetadata.coEnabled;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.fiEnabled), Boolean.valueOf(this.coEnabled)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
