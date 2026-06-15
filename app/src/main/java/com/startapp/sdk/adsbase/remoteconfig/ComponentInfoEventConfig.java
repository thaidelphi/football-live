package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ComponentInfoEventConfig implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final ComponentInfoEventConfig f23150a = new ComponentInfoEventConfig();
    private static final long serialVersionUID = -5359772055016698271L;
    private long flags = 0;
    private double chance = 0.0d;

    public final boolean a(long j10) {
        return (this.flags & j10) == j10 && o9.a(this.chance);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ComponentInfoEventConfig.class != obj.getClass()) {
            return false;
        }
        ComponentInfoEventConfig componentInfoEventConfig = (ComponentInfoEventConfig) obj;
        return this.flags == componentInfoEventConfig.flags && Double.compare(this.chance, componentInfoEventConfig.chance) == 0;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.flags), Double.valueOf(this.chance)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
