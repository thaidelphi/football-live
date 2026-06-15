package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdDebuggerMetadata implements Serializable {
    private static final long serialVersionUID = 2490385963596560324L;
    @TypeInfo(type = LinkedHashSet.class)
    private Set<String> devices;
    @TypeInfo(name = "sendInfoEvents")
    private boolean infoEvents;
    private boolean testAds;

    public final Set<String> a() {
        return this.devices;
    }

    public final boolean b() {
        return this.infoEvents;
    }

    public final boolean c() {
        return this.testAds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdDebuggerMetadata adDebuggerMetadata = (AdDebuggerMetadata) obj;
        return this.testAds == adDebuggerMetadata.testAds && this.infoEvents == adDebuggerMetadata.infoEvents && o9.a(this.devices, adDebuggerMetadata.devices);
    }

    public final int hashCode() {
        Object[] objArr = {this.devices, Boolean.valueOf(this.testAds), Boolean.valueOf(this.infoEvents)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
