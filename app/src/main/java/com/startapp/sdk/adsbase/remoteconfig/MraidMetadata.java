package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MraidMetadata implements Serializable {
    private static final long serialVersionUID = 1347811483134629452L;
    private double deferImpression;
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;
    private String scriptUrl;
    private String ttl;

    public final double a() {
        return this.deferImpression;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final String c() {
        return this.scriptUrl;
    }

    public final String d() {
        return this.ttl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MraidMetadata mraidMetadata = (MraidMetadata) obj;
        return Double.compare(this.deferImpression, mraidMetadata.deferImpression) == 0 && o9.a(this.scriptUrl, mraidMetadata.scriptUrl) && o9.a(this.ttl, mraidMetadata.ttl) && o9.a(this.infoEvents, mraidMetadata.infoEvents);
    }

    public final int hashCode() {
        Object[] objArr = {this.scriptUrl, this.ttl, Double.valueOf(this.deferImpression), this.infoEvents};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
