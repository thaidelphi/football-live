package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmd implements zzbio {
    final /* synthetic */ zzblm zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzby zzb;
    final /* synthetic */ zzbmr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmd(zzbmr zzbmrVar, zzauc zzaucVar, zzblm zzblmVar, com.google.android.gms.ads.internal.util.zzby zzbyVar) {
        this.zza = zzblmVar;
        this.zzb = zzbyVar;
        this.zzc = zzbmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i10;
        zzbms zzbmsVar = (zzbms) obj;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            com.google.android.gms.ads.internal.util.client.zzo.zzi("JS Engine is requesting an update");
            i10 = this.zzc.zzi;
            if (i10 == 0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", (zzbio) this.zzb.zza());
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
