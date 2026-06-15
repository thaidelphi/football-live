package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Pair;
import android.view.Display;
import com.ironsource.b9;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.sensors.SensorsData;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x7 {

    /* renamed from: b  reason: collision with root package name */
    public int f23539b;

    /* renamed from: d  reason: collision with root package name */
    public final long f23541d;

    /* renamed from: e  reason: collision with root package name */
    public x0 f23542e;

    /* renamed from: f  reason: collision with root package name */
    public SensorManager f23543f;

    /* renamed from: g  reason: collision with root package name */
    public final t4<com.startapp.sdk.adsbase.e> f23544g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f23545h;

    /* renamed from: i  reason: collision with root package name */
    public Pair<Integer, Integer> f23546i;

    /* renamed from: j  reason: collision with root package name */
    public final t4<AdvertisingIdResolver> f23547j;

    /* renamed from: k  reason: collision with root package name */
    public final j2<SensorsData> f23548k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f23549l;

    /* renamed from: m  reason: collision with root package name */
    public final int f23550m;

    /* renamed from: a  reason: collision with root package name */
    public int f23538a = 0;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<Integer, Long> f23540c = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    public final a f23551n = new a();

    /* renamed from: o  reason: collision with root package name */
    public final b f23552o = new b();

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
            SensorsData a10 = x7.this.a();
            if (a10 != null) {
                try {
                    if (a10.h()) {
                        if (x7.a(x7.this, sensorEvent)) {
                            return;
                        }
                        x7 x7Var = x7.this;
                        if (x7Var.f23539b < x7Var.f23550m && !x7.a(x7Var)) {
                            x7.a(x7.this, sensorEvent, a10);
                            return;
                        }
                        x7 x7Var2 = x7.this;
                        x7Var2.a(x7Var2.f23539b >= x7Var2.f23550m);
                        return;
                    }
                } catch (Throwable th) {
                    if (x7.this.a(1)) {
                        l3.a(th);
                        return;
                    }
                    return;
                }
            }
            x7.this.a(true);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if (x7.this.f23552o.isInitialStickyBroadcast() && intent.getExtras() != null) {
                int i10 = intent.getExtras().getInt("plugged");
                x7.this.f23549l = i10 == 1;
            } else if (Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_CONNECTED") || Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_DISCONNECTED")) {
                x7.this.a(false);
            }
        }
    }

    public x7(t4 t4Var, t4 t4Var2, com.startapp.sdk.components.x xVar, Context context) {
        this.f23547j = t4Var;
        this.f23548k = xVar;
        this.f23544g = t4Var2;
        this.f23545h = context;
        this.f23546i = new Pair<>(Integer.valueOf(((com.startapp.sdk.adsbase.e) t4Var2.a()).getInt("last_collected_day", 0)), Integer.valueOf(((com.startapp.sdk.adsbase.e) t4Var2.a()).getInt("daily_collected", 0)));
        SensorsData a10 = a();
        if (a10 == null) {
            return;
        }
        this.f23541d = (long) ((1000 / a10.d()) * 0.95d);
        this.f23550m = a10.e();
        b(context);
    }

    public static boolean a(x7 x7Var, SensorEvent sensorEvent) {
        x7Var.getClass();
        int type = sensorEvent.sensor.getType();
        long currentTimeMillis = System.currentTimeMillis();
        Long l10 = x7Var.f23540c.get(Integer.valueOf(type));
        if (currentTimeMillis - (l10 == null ? 0L : l10.longValue()) < x7Var.f23541d) {
            return true;
        }
        x7Var.f23540c.put(Integer.valueOf(type), Long.valueOf(currentTimeMillis));
        return false;
    }

    public final void b() {
        try {
            SensorManager sensorManager = this.f23543f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f23551n);
            }
        } catch (Throwable th) {
            if (a(2)) {
                l3.a(th);
            }
        }
    }

    public final void b(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(this.f23552o, intentFilter);
        } catch (Throwable th) {
            if (a(8)) {
                l3.a(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:2:0x0000, B:4:0x0014, B:6:0x001c, B:12:0x0036, B:14:0x003e, B:21:0x004e, B:23:0x0073, B:35:0x009f, B:36:0x00a3, B:38:0x00b7, B:43:0x00cb, B:45:0x00de, B:44:0x00da, B:30:0x008b), top: B:53:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:2:0x0000, B:4:0x0014, B:6:0x001c, B:12:0x0036, B:14:0x003e, B:21:0x004e, B:23:0x0073, B:35:0x009f, B:36:0x00a3, B:38:0x00b7, B:43:0x00cb, B:45:0x00de, B:44:0x00da, B:30:0x008b), top: B:53:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:2:0x0000, B:4:0x0014, B:6:0x001c, B:12:0x0036, B:14:0x003e, B:21:0x004e, B:23:0x0073, B:35:0x009f, B:36:0x00a3, B:38:0x00b7, B:43:0x00cb, B:45:0x00de, B:44:0x00da, B:30:0x008b), top: B:53:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:2:0x0000, B:4:0x0014, B:6:0x001c, B:12:0x0036, B:14:0x003e, B:21:0x004e, B:23:0x0073, B:35:0x009f, B:36:0x00a3, B:38:0x00b7, B:43:0x00cb, B:45:0x00de, B:44:0x00da, B:30:0x008b), top: B:53:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.x7.a(android.content.Context):void");
    }

    public static boolean a(x7 x7Var) {
        boolean isScreenOn;
        x0 x0Var = x7Var.f23542e;
        if (x0Var != null) {
            boolean z10 = x0Var.f23528f;
            if (Build.VERSION.SDK_INT >= 20) {
                Display[] displays = ((DisplayManager) x7Var.f23545h.getSystemService(b9.h.f16644d)).getDisplays();
                int length = displays.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        isScreenOn = false;
                        break;
                    } else if (displays[i10].getState() == 2) {
                        isScreenOn = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                isScreenOn = ((PowerManager) x7Var.f23545h.getSystemService("power")).isScreenOn();
            }
            if (z10 != isScreenOn) {
                return true;
            }
        }
        return false;
    }

    public final void a(Context context, SensorsData sensorsData) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f23543f = sensorManager;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this.f23551n);
        int d10 = 1000000 / sensorsData.d();
        Sensor defaultSensor = this.f23543f.getDefaultSensor(1);
        Sensor defaultSensor2 = this.f23543f.getDefaultSensor(4);
        Sensor defaultSensor3 = this.f23543f.getDefaultSensor(2);
        this.f23543f.registerListener(this.f23551n, defaultSensor, d10);
        this.f23543f.registerListener(this.f23551n, defaultSensor2, d10);
        this.f23543f.registerListener(this.f23551n, defaultSensor3, d10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        if ((r2.f23529g.size() >= r2.f23530h) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.startapp.x7 r21, android.hardware.SensorEvent r22, com.startapp.sdk.sensors.SensorsData r23) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.x7.a(com.startapp.x7, android.hardware.SensorEvent, com.startapp.sdk.sensors.SensorsData):void");
    }

    public final void a(boolean z10) {
        try {
            SensorManager sensorManager = this.f23543f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f23551n);
            }
            SensorsData a10 = a();
            this.f23542e = null;
            if (z10 || a10 == null) {
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new y7(this), a10.a() * 1000);
        } catch (Throwable th) {
            if (a(32)) {
                l3.a(th);
            }
        }
    }

    public final SensorsData a() {
        return this.f23548k.call();
    }

    public final boolean a(int i10) {
        SensorsData a10 = a();
        ComponentInfoEventConfig b10 = a10 != null ? a10.b() : null;
        return b10 != null && b10.a((long) i10);
    }
}
