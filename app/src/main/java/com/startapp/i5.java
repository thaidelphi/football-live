package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i5 {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicInteger f22086j = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final Context f22087a;

    /* renamed from: b  reason: collision with root package name */
    public final com.startapp.sdk.adsbase.e f22088b;

    /* renamed from: c  reason: collision with root package name */
    public final j2<MotionMetadata> f22089c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f22090d;

    /* renamed from: e  reason: collision with root package name */
    public k5 f22091e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22092f;

    /* renamed from: g  reason: collision with root package name */
    public int f22093g;

    /* renamed from: h  reason: collision with root package name */
    public Sensor f22094h;

    /* renamed from: i  reason: collision with root package name */
    public final a f22095i = new a();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            try {
                i5 i5Var = i5.this;
                k5 k5Var = i5Var.f22091e;
                if (k5Var == null || k5Var.a(sensorEvent) || !i5Var.a(8)) {
                    return;
                }
                int i10 = i5Var.f22093g;
                if ((i10 & 8) != 0) {
                    return;
                }
                i5Var.f22093g = i10 | 8;
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "MP";
                l3Var.f22229e = String.valueOf(8);
                l3Var.a();
            } catch (OutOfMemoryError unused) {
                i5 i5Var2 = i5.this;
                i5Var2.getClass();
                try {
                    i5Var2.d();
                } catch (Throwable th) {
                    l3.a(th);
                }
            } catch (Throwable th2) {
                i5 i5Var3 = i5.this;
                if (i5Var3.a(16)) {
                    int i11 = i5Var3.f22093g;
                    if ((i11 & 16) != 0) {
                        return;
                    }
                    i5Var3.f22093g = i11 | 16;
                    l3.a(th2);
                }
            }
        }
    }

    public i5(Context context, com.startapp.sdk.adsbase.e eVar, com.startapp.sdk.components.v vVar, Handler handler) {
        this.f22087a = context;
        this.f22088b = eVar;
        this.f22089c = vVar;
        this.f22090d = handler;
    }

    public final double a() {
        double a10;
        MotionMetadata call = this.f22089c.call();
        call = (call == null || !call.u()) ? null : null;
        if (call == null) {
            return -1.0d;
        }
        k5 k5Var = this.f22091e;
        if (k5Var != null) {
            return Double.longBitsToDouble(k5Var.f22174c.get());
        }
        double d10 = this.f22088b.getFloat("e9142de3c7cc5952", 0.0f);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.f22088b.getLong("7783513af1730383", 0L);
        double b10 = call.b();
        double a11 = call.a();
        double c10 = call.c();
        double a12 = p9.a(0.0d, call.a(), call.c());
        double max = Math.max(0L, currentTimeMillis - j10) / b10;
        if (c10 > 0.0d) {
            a10 = (p9.a(max, a11, c10) - a12) / (1.0d - a12);
        } else if (c10 < 0.0d) {
            a10 = p9.a(max, a11, c10) / a12;
        } else {
            a10 = p9.a(max, a11, c10);
        }
        return d10 * a10;
    }

    public final void b() {
        if (this.f22091e != null) {
            e.a edit = this.f22088b.edit();
            float longBitsToDouble = (float) Double.longBitsToDouble(this.f22091e.f22175d.get());
            edit.a(Float.valueOf(longBitsToDouble), "e9142de3c7cc5952");
            edit.f23101a.putFloat("e9142de3c7cc5952", longBitsToDouble);
            edit.putLong("7783513af1730383", this.f22091e.f22176e.get()).apply();
            if (a(4)) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "MP.save";
                l3Var.f22229e = String.format(Locale.ENGLISH, "%.6f", Double.valueOf(a()));
                l3Var.a();
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        MotionMetadata call = this.f22089c.call();
        MotionMetadata motionMetadata = (call == null || !call.u()) ? null : call;
        if (motionMetadata != null && (sensorManager = (SensorManager) this.f22087a.getSystemService("sensor")) != null && Build.VERSION.SDK_INT >= 9 && this.f22094h == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            int min = Math.min(Math.max((int) UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, (int) (o9.c(motionMetadata.r()) * 1000)), 100000);
            if (defaultSensor == null || !sensorManager.registerListener(this.f22095i, defaultSensor, min)) {
                return;
            }
            this.f22094h = defaultSensor;
            double d10 = this.f22088b.getFloat("e9142de3c7cc5952", 0.0f);
            long j10 = this.f22088b.getLong("7783513af1730383", 0L);
            k5 k5Var = this.f22091e;
            if (k5Var != null) {
                k5Var.interrupt();
                this.f22091e = null;
            }
            if (this.f22091e == null) {
                k5 k5Var2 = new k5("startapp-mp-" + f22086j.incrementAndGet(), motionMetadata, motionMetadata.q(), d10, j10);
                this.f22091e = k5Var2;
                k5Var2.start();
            }
            if (a(1)) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "MP.start";
                l3Var.f22229e = defaultSensor.getName() + "," + defaultSensor.getMinDelay() + "," + defaultSensor.getPower();
                l3Var.a();
            }
        }
    }

    public final void d() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f22087a.getSystemService("sensor");
        if (sensorManager == null || (sensor = this.f22094h) == null) {
            return;
        }
        sensorManager.unregisterListener(this.f22095i, sensor);
        this.f22094h = null;
        b();
        k5 k5Var = this.f22091e;
        if (k5Var != null) {
            k5Var.interrupt();
            this.f22091e = null;
        }
        if (a(2)) {
            l3 l3Var = new l3(m3.f22274d);
            l3Var.f22228d = "MP.stop";
            l3Var.a();
        }
    }

    public final boolean a(int i10) {
        if (this.f22092f) {
            MotionMetadata call = this.f22089c.call();
            call = (call == null || !call.u()) ? null : null;
            return (call == null || (i10 & call.j()) == 0) ? false : true;
        }
        return false;
    }
}
