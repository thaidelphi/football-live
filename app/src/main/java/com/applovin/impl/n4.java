package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final int f8011a;

    /* renamed from: b  reason: collision with root package name */
    private final float f8012b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f8013c;

    /* renamed from: d  reason: collision with root package name */
    private final Sensor f8014d;

    /* renamed from: e  reason: collision with root package name */
    private final Sensor f8015e;

    /* renamed from: f  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f8016f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f8017g;

    /* renamed from: h  reason: collision with root package name */
    private float f8018h;

    public n4(com.applovin.impl.sdk.j jVar) {
        this.f8016f = jVar;
        c0 c0Var = new c0(jVar);
        this.f8013c = c0Var;
        this.f8014d = c0Var.a(9);
        this.f8015e = c0Var.a(4);
        this.f8011a = ((Integer) jVar.a(o4.f8111f4)).intValue();
        this.f8012b = ((Float) jVar.a(o4.f8103e4)).floatValue();
    }

    private void a(Sensor sensor) {
        try {
            this.f8013c.b(this, sensor, (int) TimeUnit.MILLISECONDS.toMicros(this.f8011a));
        } catch (Throwable th) {
            this.f8016f.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f8016f.I().a("SensorDataManager", "Unable to register sensor listener", th);
            }
        }
    }

    public float b() {
        return this.f8018h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f8016f.f0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f8013c.b(this);
        if (((Boolean) this.f8016f.g0().a(o4.f8079b4)).booleanValue()) {
            a(this.f8014d);
        }
        if (((Boolean) this.f8016f.g0().a(o4.f8087c4)).booleanValue()) {
            a(this.f8015e);
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f8013c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f8017g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f8018h * this.f8012b;
            this.f8018h = f10;
            this.f8018h = f10 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }

    public float a() {
        float[] fArr = this.f8017g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }
}
