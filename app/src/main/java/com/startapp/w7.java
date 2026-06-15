package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import com.startapp.t0;
import java.util.HashMap;
import org.json.JSONArray;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class w7 {

    /* renamed from: c  reason: collision with root package name */
    public final SensorManager f23512c;

    /* renamed from: d  reason: collision with root package name */
    public final n6 f23513d;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, b> f23510a = null;

    /* renamed from: f  reason: collision with root package name */
    public final a f23515f = new a();

    /* renamed from: b  reason: collision with root package name */
    public final v7 f23511b = new v7();

    /* renamed from: e  reason: collision with root package name */
    public int f23514e = 0;

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
            JSONArray jSONArray;
            int a10 = w7.this.f23511b.a(sensorEvent);
            w7 w7Var = w7.this;
            if (a10 == w7Var.f23514e) {
                w7Var.c();
                w7 w7Var2 = w7.this;
                n6 n6Var = w7Var2.f23513d;
                if (n6Var != null) {
                    try {
                        jSONArray = w7Var2.f23511b.a();
                    } catch (Exception unused) {
                        jSONArray = null;
                    }
                    n6Var.a(jSONArray);
                }
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f23517a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23518b;

        public b(int i10, int i11) {
            this.f23517a = i10;
            this.f23518b = i11;
        }
    }

    public w7(Context context, t0.b bVar) {
        this.f23512c = (SensorManager) context.getSystemService("sensor");
        this.f23513d = bVar;
        a();
    }

    public final void a() {
        this.f23510a = new HashMap<>();
        SensorsConfig J = MetaData.f23158k.J();
        a(13, J.a());
        a(9, J.b());
        a(5, J.d());
        a(10, J.e());
        a(2, J.f());
        a(6, J.g());
        a(12, J.i());
        a(11, J.j());
        a(16, J.c());
    }

    public final void b() {
        Sensor defaultSensor;
        for (Integer num : this.f23510a.keySet()) {
            int intValue = num.intValue();
            b bVar = this.f23510a.get(Integer.valueOf(intValue));
            if (Build.VERSION.SDK_INT >= bVar.f23517a && (defaultSensor = this.f23512c.getDefaultSensor(intValue)) != null) {
                this.f23512c.registerListener(this.f23515f, defaultSensor, bVar.f23518b);
                this.f23514e++;
            }
        }
    }

    public final void c() {
        this.f23512c.unregisterListener(this.f23515f);
    }

    public final void a(int i10, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f23510a.put(Integer.valueOf(i10), new b(baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}
