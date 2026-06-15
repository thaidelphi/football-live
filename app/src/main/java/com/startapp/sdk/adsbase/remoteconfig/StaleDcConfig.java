package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class StaleDcConfig implements Serializable {
    private static final long serialVersionUID = 6968747702766307828L;
    private int ief = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.ief == ((StaleDcConfig) obj).ief;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.ief)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
