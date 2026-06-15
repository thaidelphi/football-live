package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TelephonyMetadata implements Serializable {
    private static final long serialVersionUID = -644112324647697192L;
    @TypeInfo(type = HashMap.class, value = TelephonyDataConfig.class)
    private Map<String, TelephonyDataConfig> data;
    private boolean enabled;
    private int ief = 0;
    private double iep = 0.0d;
    private boolean rciu;

    public final int a() {
        return this.ief;
    }

    public final double b() {
        return this.iep;
    }

    public final boolean c() {
        return this.enabled;
    }

    public final boolean d() {
        return this.rciu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TelephonyMetadata telephonyMetadata = (TelephonyMetadata) obj;
        return this.enabled == telephonyMetadata.enabled && this.ief == telephonyMetadata.ief && Double.compare(this.iep, telephonyMetadata.iep) == 0 && this.rciu == telephonyMetadata.rciu && o9.a(this.data, telephonyMetadata.data);
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.ief), Double.valueOf(this.iep), Boolean.valueOf(this.rciu), this.data};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final TelephonyDataConfig a(String str) {
        Map<String, TelephonyDataConfig> map = this.data;
        TelephonyDataConfig telephonyDataConfig = map != null ? map.get(str) : null;
        return telephonyDataConfig != null ? telephonyDataConfig : TelephonyDataConfig.f23193a;
    }
}
