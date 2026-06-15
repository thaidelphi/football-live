package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AnalyticsCategoryFilterConfig implements Serializable {
    private static final long serialVersionUID = -706642555040875333L;
    @TypeInfo(type = ArrayList.class)
    private List<String> excludeAppActivity;
    @TypeInfo(type = ArrayList.class)
    private List<String> excludeValues;
    @TypeInfo(type = ArrayList.class)
    private List<String> fields;
    @TypeInfo(type = ArrayList.class)
    private List<String> includeAppActivity;
    @TypeInfo(type = ArrayList.class)
    private List<String> includeValues;
    private String interval;

    public final List<String> a() {
        return this.excludeAppActivity;
    }

    public final List<String> b() {
        return this.excludeValues;
    }

    public final List<String> c() {
        return this.fields;
    }

    public final List<String> d() {
        return this.includeAppActivity;
    }

    public final List<String> e() {
        return this.includeValues;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig = (AnalyticsCategoryFilterConfig) obj;
        return o9.a(this.includeValues, analyticsCategoryFilterConfig.includeValues) && o9.a(this.excludeValues, analyticsCategoryFilterConfig.excludeValues) && o9.a(this.includeAppActivity, analyticsCategoryFilterConfig.includeAppActivity) && o9.a(this.excludeAppActivity, analyticsCategoryFilterConfig.excludeAppActivity) && o9.a(this.fields, analyticsCategoryFilterConfig.fields) && o9.a(this.interval, analyticsCategoryFilterConfig.interval);
    }

    public final String f() {
        return this.interval;
    }

    public final int hashCode() {
        Object[] objArr = {this.includeValues, this.excludeValues, this.includeAppActivity, this.excludeAppActivity, this.fields, this.interval};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
