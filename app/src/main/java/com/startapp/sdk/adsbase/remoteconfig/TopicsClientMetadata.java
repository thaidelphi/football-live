package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TopicsClientMetadata implements Serializable {
    private static final long serialVersionUID = -3156048165050662402L;
    private double enabled = 0.0d;
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    public final double a() {
        return this.enabled;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopicsClientMetadata topicsClientMetadata = (TopicsClientMetadata) obj;
        return Double.compare(this.enabled, topicsClientMetadata.enabled) == 0 && o9.a(this.infoEvents, topicsClientMetadata.infoEvents);
    }

    public final int hashCode() {
        Object[] objArr = {Double.valueOf(this.enabled), this.infoEvents};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
