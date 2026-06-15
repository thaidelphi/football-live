package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SensorsConfig implements Serializable {
    private static final long serialVersionUID = -4658637722934999907L;
    private int timeoutInSec = 10;
    private boolean enabled = false;
    private long refreshInterval = 900000;
    @TypeInfo(complex = true)
    private BaseSensorConfig ambientTemperatureSensor = new BaseSensorConfig(14);
    @TypeInfo(complex = true)
    private BaseSensorConfig gravitySensor = new BaseSensorConfig(9);
    @TypeInfo(complex = true)
    private BaseSensorConfig lightSensor = new BaseSensorConfig(3);
    @TypeInfo(complex = true)
    private BaseSensorConfig linearAccelerationSensor = new BaseSensorConfig(9);
    @TypeInfo(complex = true)
    private BaseSensorConfig magneticFieldSensor = new BaseSensorConfig(3);
    @TypeInfo(complex = true)
    private BaseSensorConfig pressureSensor = new BaseSensorConfig(9);
    @TypeInfo(complex = true)
    private BaseSensorConfig relativeHumiditySensor = new BaseSensorConfig(14);
    @TypeInfo(complex = true)
    private BaseSensorConfig rotationVectorSensor = new BaseSensorConfig(9);
    @TypeInfo(complex = true)
    private BaseSensorConfig gyroscopeUncalibratedSensor = new BaseSensorConfig(18);

    public final BaseSensorConfig a() {
        return this.ambientTemperatureSensor;
    }

    public final BaseSensorConfig b() {
        return this.gravitySensor;
    }

    public final BaseSensorConfig c() {
        return this.gyroscopeUncalibratedSensor;
    }

    public final BaseSensorConfig d() {
        return this.lightSensor;
    }

    public final BaseSensorConfig e() {
        return this.linearAccelerationSensor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SensorsConfig sensorsConfig = (SensorsConfig) obj;
        return this.timeoutInSec == sensorsConfig.timeoutInSec && this.enabled == sensorsConfig.enabled && this.refreshInterval == sensorsConfig.refreshInterval && o9.a(this.ambientTemperatureSensor, sensorsConfig.ambientTemperatureSensor) && o9.a(this.gravitySensor, sensorsConfig.gravitySensor) && o9.a(this.lightSensor, sensorsConfig.lightSensor) && o9.a(this.linearAccelerationSensor, sensorsConfig.linearAccelerationSensor) && o9.a(this.magneticFieldSensor, sensorsConfig.magneticFieldSensor) && o9.a(this.pressureSensor, sensorsConfig.pressureSensor) && o9.a(this.relativeHumiditySensor, sensorsConfig.relativeHumiditySensor) && o9.a(this.rotationVectorSensor, sensorsConfig.rotationVectorSensor) && o9.a(this.gyroscopeUncalibratedSensor, sensorsConfig.gyroscopeUncalibratedSensor);
    }

    public final BaseSensorConfig f() {
        return this.magneticFieldSensor;
    }

    public final BaseSensorConfig g() {
        return this.pressureSensor;
    }

    public final long h() {
        return this.refreshInterval;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), Long.valueOf(this.refreshInterval), this.ambientTemperatureSensor, this.gravitySensor, this.lightSensor, this.linearAccelerationSensor, this.magneticFieldSensor, this.pressureSensor, this.relativeHumiditySensor, this.rotationVectorSensor, this.gyroscopeUncalibratedSensor};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final BaseSensorConfig i() {
        return this.relativeHumiditySensor;
    }

    public final BaseSensorConfig j() {
        return this.rotationVectorSensor;
    }

    public final int k() {
        return this.timeoutInSec;
    }

    public final boolean l() {
        return this.enabled;
    }
}
