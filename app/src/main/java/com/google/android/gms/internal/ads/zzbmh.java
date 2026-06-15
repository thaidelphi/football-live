package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmh implements zzbyw {
    final /* synthetic */ zzbmq zza;
    final /* synthetic */ zzffc zzb;
    final /* synthetic */ zzbmr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmh(zzbmr zzbmrVar, zzbmq zzbmqVar, zzffc zzffcVar) {
        this.zza = zzbmqVar;
        this.zzb = zzffcVar;
        this.zzc = zzbmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyw
    public final void zza() {
        Object obj;
        zzffq zzffqVar;
        zzffq zzffqVar2;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        obj = this.zzc.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbdf.zzd.zze()).booleanValue()) {
                zzbmr zzbmrVar = this.zzc;
                zzffqVar = zzbmrVar.zze;
                if (zzffqVar != null) {
                    zzffqVar2 = zzbmrVar.zze;
                    zzffc zzffcVar = this.zzb;
                    zzffcVar.zzc("Failed loading new engine");
                    zzffcVar.zzg(false);
                    zzffqVar2.zzc(zzffcVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
