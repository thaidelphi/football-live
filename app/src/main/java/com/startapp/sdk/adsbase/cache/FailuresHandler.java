package com.startapp.sdk.adsbase.cache;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FailuresHandler implements Serializable {
    private static final long serialVersionUID = -4588601967418450964L;
    @TypeInfo(type = ArrayList.class, value = Integer.class)
    private List<Integer> intervals = Arrays.asList(10, 30, 60, 300);
    private boolean infiniteLastRetry = true;

    public final List<Integer> a() {
        return this.intervals;
    }

    public final boolean b() {
        return this.infiniteLastRetry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailuresHandler failuresHandler = (FailuresHandler) obj;
        return this.infiniteLastRetry == failuresHandler.infiniteLastRetry && o9.a(this.intervals, failuresHandler.intervals);
    }

    public final int hashCode() {
        Object[] objArr = {this.intervals, Boolean.valueOf(this.infiniteLastRetry)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
