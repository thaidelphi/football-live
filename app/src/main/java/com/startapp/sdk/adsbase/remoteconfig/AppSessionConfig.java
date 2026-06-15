package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.a9;
import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppSessionConfig implements Serializable {
    private static final long serialVersionUID = 2463582211707601660L;
    @TypeInfo(name = "backgroundTimeout", parser = a9.class)
    private long timeoutMillis = 600000;

    public final long a() {
        return this.timeoutMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.timeoutMillis == ((AppSessionConfig) obj).timeoutMillis;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.timeoutMillis)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
