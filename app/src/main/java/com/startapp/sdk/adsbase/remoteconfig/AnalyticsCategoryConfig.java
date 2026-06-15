package com.startapp.sdk.adsbase.remoteconfig;

import androidx.annotation.Keep;
import com.startapp.common.parser.TypeInfo;
import com.startapp.l9;
import com.startapp.o9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AnalyticsCategoryConfig implements Serializable {
    private static final long serialVersionUID = 5410570404581113345L;
    private Double enabled;
    @TypeInfo(parser = FiltersParser.class, type = ArrayList.class, value = AnalyticsCategoryFilterConfig.class)
    private List<AnalyticsCategoryFilterConfig> filters;
    private String firstDelay;
    private Integer flags;
    private Integer priority;
    private Boolean sendViaDb;
    private String ttl;

    /* compiled from: Sta */
    @Keep
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class FiltersParser extends l9<AnalyticsCategoryFilterConfig> {
        public FiltersParser() {
            super(AnalyticsCategoryFilterConfig.class);
        }
    }

    public final Double a() {
        return this.enabled;
    }

    public final List<AnalyticsCategoryFilterConfig> b() {
        return this.filters;
    }

    public final String c() {
        return this.firstDelay;
    }

    public final Integer d() {
        return this.flags;
    }

    public final Integer e() {
        return this.priority;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsCategoryConfig analyticsCategoryConfig = (AnalyticsCategoryConfig) obj;
        return o9.a(this.enabled, analyticsCategoryConfig.enabled) && o9.a(this.flags, analyticsCategoryConfig.flags) && o9.a(this.priority, analyticsCategoryConfig.priority) && o9.a(this.sendViaDb, analyticsCategoryConfig.sendViaDb) && o9.a(this.ttl, analyticsCategoryConfig.ttl) && o9.a(this.firstDelay, analyticsCategoryConfig.firstDelay) && o9.a(this.filters, analyticsCategoryConfig.filters);
    }

    public final Boolean f() {
        return this.sendViaDb;
    }

    public final String g() {
        return this.ttl;
    }

    public final int hashCode() {
        Object[] objArr = {this.enabled, this.flags, this.priority, this.sendViaDb, this.ttl, this.firstDelay, this.filters};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
