package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.m3;
import com.startapp.o9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TelephonyDataConfig implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final TelephonyDataConfig f23193a = new TelephonyDataConfig();
    private static final long serialVersionUID = -7175662234963204913L;
    private String param;
    private boolean enabled = true;
    @TypeInfo(type = ArrayList.class)
    private List<String> categories = Collections.singletonList(m3.f22280j.a());

    public final List<String> a() {
        return this.categories;
    }

    public final String b() {
        return this.param;
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
        TelephonyDataConfig telephonyDataConfig = (TelephonyDataConfig) obj;
        return this.enabled == telephonyDataConfig.enabled && o9.a(this.categories, telephonyDataConfig.categories) && o9.a(this.param, telephonyDataConfig.param);
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.categories, this.param};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
