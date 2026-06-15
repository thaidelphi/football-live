package com.startapp.sdk.adsbase.crashreport;

import com.startapp.o9;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ANRRemoteConfig implements Serializable {
    private static final long serialVersionUID = -5572648856211286333L;
    private boolean enableLoggerExtraCheck;
    private boolean enabled = false;
    private boolean shrinkStacktrace = true;
    private boolean collectBlockedOnly = true;
    private boolean ignorePredefinedStacktraceElements = true;
    private boolean enableForegroundCheck = true;
    private long checkInterval = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
    private long sleepInterval = 2000;

    public final boolean a() {
        return this.collectBlockedOnly;
    }

    public final long b() {
        return this.checkInterval;
    }

    public final long c() {
        return this.sleepInterval;
    }

    public final boolean d() {
        return this.ignorePredefinedStacktraceElements;
    }

    public final boolean e() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ANRRemoteConfig aNRRemoteConfig = (ANRRemoteConfig) obj;
        return this.enabled == aNRRemoteConfig.enabled && this.shrinkStacktrace == aNRRemoteConfig.shrinkStacktrace && this.collectBlockedOnly == aNRRemoteConfig.collectBlockedOnly && this.ignorePredefinedStacktraceElements == aNRRemoteConfig.ignorePredefinedStacktraceElements && this.enableLoggerExtraCheck == aNRRemoteConfig.enableLoggerExtraCheck && this.enableForegroundCheck == aNRRemoteConfig.enableForegroundCheck && this.checkInterval == aNRRemoteConfig.checkInterval && this.sleepInterval == aNRRemoteConfig.sleepInterval;
    }

    public final boolean f() {
        return this.enableForegroundCheck;
    }

    public final boolean g() {
        return this.enableLoggerExtraCheck;
    }

    public final boolean h() {
        return this.shrinkStacktrace;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Boolean.valueOf(this.shrinkStacktrace), Boolean.valueOf(this.collectBlockedOnly), Boolean.valueOf(this.ignorePredefinedStacktraceElements), Boolean.valueOf(this.enableLoggerExtraCheck), Boolean.valueOf(this.enableForegroundCheck), Long.valueOf(this.checkInterval), Long.valueOf(this.sleepInterval)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
