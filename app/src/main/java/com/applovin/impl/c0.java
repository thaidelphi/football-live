package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final SensorManager f6729a = (SensorManager) com.applovin.impl.sdk.j.m().getSystemService("sensor");

    /* renamed from: b  reason: collision with root package name */
    private Handler f6730b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6731c;

    public c0(com.applovin.impl.sdk.j jVar) {
        boolean booleanValue = ((Boolean) jVar.a(o4.f8075b0)).booleanValue();
        this.f6731c = booleanValue;
        if (booleanValue) {
            HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
            handlerThread.start();
            this.f6730b = new Handler(handlerThread.getLooper());
        }
    }

    public Sensor a(int i10) {
        return this.f6729a.getDefaultSensor(i10);
    }

    public void b(final SensorEventListener sensorEventListener, final Sensor sensor, final int i10) {
        if (this.f6731c) {
            this.f6730b.post(new Runnable() { // from class: com.applovin.impl.o9
                @Override // java.lang.Runnable
                public final void run() {
                    c0.this.a(sensorEventListener, sensor, i10);
                }
            });
        } else {
            this.f6729a.registerListener(sensorEventListener, sensor, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i10) {
        this.f6729a.registerListener(sensorEventListener, sensor, i10, this.f6730b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f6729a.unregisterListener(sensorEventListener);
    }

    public void b(final SensorEventListener sensorEventListener) {
        if (this.f6731c) {
            this.f6730b.post(new Runnable() { // from class: com.applovin.impl.n9
                @Override // java.lang.Runnable
                public final void run() {
                    c0.this.a(sensorEventListener);
                }
            });
        } else {
            this.f6729a.unregisterListener(sensorEventListener);
        }
    }
}
