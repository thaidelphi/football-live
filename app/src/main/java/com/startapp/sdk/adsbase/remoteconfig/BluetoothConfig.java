package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BluetoothConfig implements Serializable {
    private static final long serialVersionUID = 6500835630965723999L;
    private int timeoutInSec = 20;
    private boolean enabled = false;
    private int discoveryIntervalInMinutes = 1440;
    private long refreshInterval = 900000;

    public final int a() {
        return this.discoveryIntervalInMinutes;
    }

    public final long b() {
        return this.refreshInterval;
    }

    public final int c() {
        return this.timeoutInSec;
    }

    public final boolean d() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BluetoothConfig bluetoothConfig = (BluetoothConfig) obj;
        return this.timeoutInSec == bluetoothConfig.timeoutInSec && this.enabled == bluetoothConfig.enabled && this.discoveryIntervalInMinutes == bluetoothConfig.discoveryIntervalInMinutes && this.refreshInterval == bluetoothConfig.refreshInterval;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), Integer.valueOf(this.discoveryIntervalInMinutes), Long.valueOf(this.refreshInterval)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
