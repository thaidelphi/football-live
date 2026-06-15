package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmf implements Runnable {
    final /* synthetic */ zzbmq zza;
    final /* synthetic */ zzblm zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbmr zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmf(zzbmr zzbmrVar, zzbmq zzbmqVar, zzblm zzblmVar, ArrayList arrayList, long j10) {
        this.zza = zzbmqVar;
        this.zzb = zzblmVar;
        this.zzc = arrayList;
        this.zzd = j10;
        this.zze = zzbmrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i10;
        String str;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        obj = this.zze.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhE)).booleanValue()) {
                    this.zza.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                } else {
                    this.zza.zzg();
                }
                zzgba zzgbaVar = zzbyp.zzf;
                final zzblm zzblmVar = this.zzb;
                Objects.requireNonNull(zzblmVar);
                zzgbaVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbme
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblm.this.zzc();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzc));
                int zze = this.zza.zze();
                i10 = this.zze.zzi;
                if (this.zzc.isEmpty()) {
                    str = ". Still waiting for the engine to be loaded";
                } else {
                    str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.zzc.get(0));
                }
                com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze + ". Update status(fullLoadTimeout) is " + i10 + str + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzv.zzC().a() - this.zzd) + " ms at timeout. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}
