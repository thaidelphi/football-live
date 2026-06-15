package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmg implements zzbyy {
    final /* synthetic */ zzbmq zza;
    final /* synthetic */ zzffc zzb;
    final /* synthetic */ zzbmr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmg(zzbmr zzbmrVar, zzbmq zzbmqVar, zzffc zzffcVar) {
        this.zza = zzbmqVar;
        this.zzb = zzffcVar;
        this.zzc = zzbmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbmq zzbmqVar;
        zzffq zzffqVar;
        zzffq zzffqVar2;
        zzbmq zzbmqVar2;
        zzbmq zzbmqVar3;
        zzblm zzblmVar = (zzblm) obj;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            zzbmr zzbmrVar = this.zzc;
            zzbmqVar = zzbmrVar.zzh;
            if (zzbmqVar != null) {
                zzbmq zzbmqVar4 = this.zza;
                zzbmqVar2 = zzbmrVar.zzh;
                if (zzbmqVar4 != zzbmqVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbmqVar3 = this.zzc.zzh;
                    zzbmqVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbdf.zzd.zze()).booleanValue()) {
                zzbmr zzbmrVar2 = this.zzc;
                zzffqVar = zzbmrVar2.zze;
                if (zzffqVar != null) {
                    zzffqVar2 = zzbmrVar2.zze;
                    zzffc zzffcVar = this.zzb;
                    zzffcVar.zzg(true);
                    zzffqVar2.zzc(zzffcVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
