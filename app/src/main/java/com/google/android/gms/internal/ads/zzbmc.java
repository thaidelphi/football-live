package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmc implements zzbio {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbmq zzb;
    final /* synthetic */ zzblm zzc;
    final /* synthetic */ zzbmr zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmc(zzbmr zzbmrVar, long j10, zzbmq zzbmqVar, zzblm zzblmVar) {
        this.zza = j10;
        this.zzb = zzbmqVar;
        this.zzc = zzblmVar;
        this.zzd = zzbmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        zzbms zzbmsVar = (zzbms) obj;
        long a10 = com.google.android.gms.ads.internal.zzv.zzC().a() - this.zza;
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + a10 + " ms.");
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzblm zzblmVar = this.zzc;
                zzblmVar.zzq("/log", zzbin.zzg);
                zzblmVar.zzq("/result", zzbin.zzo);
                this.zzb.zzi(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
