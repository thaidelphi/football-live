package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzzg {
    final /* synthetic */ zzzi zza;
    private zzz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzzg(zzzi zzziVar, zzzh zzzhVar) {
        this.zza = zzziVar;
    }

    public final void zza(final zzcc zzccVar) {
        zzx zzxVar = new zzx();
        zzxVar.zzai(zzccVar.zzb);
        zzxVar.zzM(zzccVar.zzc);
        zzxVar.zzad("video/raw");
        this.zzb = zzxVar.zzaj();
        zzzi.zzg(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzf
            @Override // java.lang.Runnable
            public final void run() {
                zzzi zzziVar = zzzg.this.zza;
                zzzi.zze(zzziVar).zzc(zzziVar, zzccVar);
            }
        });
    }

    public final void zzb(long j10, long j11, boolean z10) {
        if (z10) {
            zzzi zzziVar = this.zza;
            if (zzzi.zza(zzziVar) != null) {
                zzzi.zzg(zzziVar).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzzi zzziVar2 = zzzg.this.zza;
                        zzzi.zze(zzziVar2).zza(zzziVar2);
                    }
                });
            }
        }
        zzz zzzVar = this.zzb;
        if (zzzVar == null) {
            zzzVar = new zzx().zzaj();
        }
        zzz zzzVar2 = zzzVar;
        zzzi zzziVar2 = this.zza;
        zzzi.zzd(zzziVar2).zza(j11, zzzi.zzc(zzziVar2).zzc(), zzzVar2, null);
        ((zzaba) zzzi.zzf(this.zza).remove()).zza(j10);
    }
}
