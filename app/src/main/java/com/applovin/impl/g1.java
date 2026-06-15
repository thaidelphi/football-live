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
public class g1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7022a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f7023b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f7024c;

    /* renamed from: d  reason: collision with root package name */
    private final a f7025d;

    /* renamed from: e  reason: collision with root package name */
    private float f7026e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a();

        void b();
    }

    public g1(com.applovin.impl.sdk.j jVar, a aVar) {
        this.f7022a = jVar;
        c0 c0Var = new c0(jVar);
        this.f7023b = c0Var;
        this.f7024c = c0Var.a(1);
        this.f7025d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean(this.f7022a.f0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f7023b.b(this);
        this.f7023b.b(this, this.f7024c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f7023b.b(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f7023b.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f7026e;
            float f11 = (f10 * 0.5f) + (max * 0.5f);
            this.f7026e = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f7025d.a();
            } else if (f10 <= -0.8f || f11 >= -0.8f) {
            } else {
                this.f7025d.b();
            }
        }
    }
}
