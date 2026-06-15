package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdCallbacksConfig implements Serializable {
    private static final long serialVersionUID = -4207400392050812703L;
    private boolean logNotSubscribed = false;
    @TypeInfo(type = HashSet.class)
    private Set<String> names;

    public final boolean a(String str) {
        Set<String> set = this.names;
        if (set == null) {
            return false;
        }
        for (String str2 : set) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdCallbacksConfig adCallbacksConfig = (AdCallbacksConfig) obj;
        return this.logNotSubscribed == adCallbacksConfig.logNotSubscribed && o9.a(this.names, adCallbacksConfig.names);
    }

    public final int hashCode() {
        return Objects.hash(this.names, Boolean.valueOf(this.logNotSubscribed));
    }

    public final boolean a() {
        return this.logNotSubscribed;
    }
}
