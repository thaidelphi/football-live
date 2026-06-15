package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RcdMetadata implements Serializable {
    private static final long serialVersionUID = -5907202998030810278L;
    @TypeInfo(complex = true, parser = RcdTargets.Parser.class)
    private RcdTargets targets;
    private boolean enabled = false;
    private double prb = 0.0d;
    private int ief = 0;
    private double iep = 0.0d;

    public final double a() {
        return this.prb;
    }

    public final RcdTargets b() {
        return this.targets;
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
        RcdMetadata rcdMetadata = (RcdMetadata) obj;
        return this.enabled == rcdMetadata.enabled && Double.compare(this.prb, rcdMetadata.prb) == 0 && this.ief == rcdMetadata.ief && Double.compare(this.iep, rcdMetadata.iep) == 0 && o9.a(this.targets, rcdMetadata.targets);
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Double.valueOf(this.prb), Integer.valueOf(this.ief), Double.valueOf(this.iep), this.targets};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
