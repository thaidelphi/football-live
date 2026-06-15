package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NetworkDiagnosticConfig implements Serializable {
    private static final long serialVersionUID = 600844380854621516L;
    private boolean enabled;
    private int ief;
    private int sendingIntervalMinutes = 60;
    private int minCountToSend = 10;
    private int types = 1;

    public final int a() {
        return this.ief;
    }

    public final int b() {
        return this.minCountToSend;
    }

    public final int c() {
        return this.sendingIntervalMinutes;
    }

    public final int d() {
        return this.types;
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
        NetworkDiagnosticConfig networkDiagnosticConfig = (NetworkDiagnosticConfig) obj;
        return this.enabled == networkDiagnosticConfig.enabled && this.sendingIntervalMinutes == networkDiagnosticConfig.sendingIntervalMinutes && this.minCountToSend == networkDiagnosticConfig.minCountToSend && this.types == networkDiagnosticConfig.types && this.ief == networkDiagnosticConfig.ief;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.sendingIntervalMinutes), Integer.valueOf(this.minCountToSend), Integer.valueOf(this.types), Integer.valueOf(this.ief)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
