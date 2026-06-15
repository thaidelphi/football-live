package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdug extends zzfph {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzduf zzf;
    private boolean zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdug(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfph
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziU)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = f10 / 9.80665f;
            float f12 = fArr[1] / 9.80665f;
            float f13 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f11 * f11) + (f12 * f12) + (f13 * f13))) >= ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziV)).floatValue()) {
                long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
                if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziW)).intValue() <= a10) {
                    if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziX)).intValue() < a10) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = a10;
                    int i10 = this.zze + 1;
                    this.zze = i10;
                    zzduf zzdufVar = this.zzf;
                    if (zzdufVar != null) {
                        if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziY)).intValue()) {
                            zzdte zzdteVar = (zzdte) zzdufVar;
                            zzdteVar.zzh(new zzdtb(zzdteVar), zzdtd.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziU)).booleanValue()) {
                if (this.zzb == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                    this.zzb = sensorManager2;
                    if (sensorManager2 == null) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzc = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzd = com.google.android.gms.ads.internal.zzv.zzC().a() - ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziW)).intValue();
                    this.zzg = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzd(zzduf zzdufVar) {
        this.zzf = zzdufVar;
    }
}
