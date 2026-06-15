package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzemf implements zzerw {
    private final zzgba zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemf(zzgba zzgbaVar, Context context) {
        this.zza = zzgbaVar;
        this.zzb = context;
    }

    public static /* synthetic */ zzemg zzc(zzemf zzemfVar) {
        double intExtra;
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlU)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) zzemfVar.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            if (batteryManager != null) {
                z10 = batteryManager.isCharging();
            } else {
                z10 = zze(zzemfVar.zzd());
            }
        } else {
            Intent zzd = zzemfVar.zzd();
            boolean zze = zze(zzd);
            intExtra = zzd != null ? zzd.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / zzd.getIntExtra("scale", -1) : -1.0d;
            z10 = zze;
        }
        return new zzemg(intExtra, z10);
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkU)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            return this.zzb.registerReceiver(null, intentFilter, 4);
        }
        return this.zzb.registerReceiver(null, intentFilter);
    }

    private static final boolean zze(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("status", -1);
            return intExtra == 2 || intExtra == 5;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    @SuppressLint({"UnprotectedReceiver"})
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemf.zzc(zzemf.this);
            }
        });
    }
}
