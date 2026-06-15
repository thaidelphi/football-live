package com.startapp.sdk.triggeredlinks;

import com.startapp.common.parser.TypeInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppEventsMetadata implements Serializable {
    private static final long serialVersionUID = -5670027899854165615L;
    @TypeInfo(type = HashMap.class)
    private Map<String, String> active;
    @TypeInfo(type = HashMap.class)
    private Map<String, String> inactive;
    @TypeInfo(type = HashMap.class)
    private Map<String, String> launch;
    @TypeInfo(type = HashMap.class, value = PeriodicAppEventMetadata.class)
    private Map<String, PeriodicAppEventMetadata> periodic;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppEventsMetadata appEventsMetadata = (AppEventsMetadata) obj;
        Map<String, String> map = this.launch;
        if (map == null ? appEventsMetadata.launch == null : map.equals(appEventsMetadata.launch)) {
            Map<String, String> map2 = this.active;
            if (map2 == null ? appEventsMetadata.active == null : map2.equals(appEventsMetadata.active)) {
                Map<String, String> map3 = this.inactive;
                if (map3 == null ? appEventsMetadata.inactive == null : map3.equals(appEventsMetadata.inactive)) {
                    Map<String, PeriodicAppEventMetadata> map4 = this.periodic;
                    Map<String, PeriodicAppEventMetadata> map5 = appEventsMetadata.periodic;
                    return map4 != null ? map4.equals(map5) : map5 == null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Map<String, String> map = this.launch;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, String> map2 = this.active;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.inactive;
        int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, PeriodicAppEventMetadata> map4 = this.periodic;
        return hashCode3 + (map4 != null ? map4.hashCode() : 0);
    }
}
