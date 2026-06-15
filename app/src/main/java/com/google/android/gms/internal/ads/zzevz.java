package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzevz implements zzejh {
    final /* synthetic */ zzewa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzevz(zzewa zzewaVar) {
        this.zza = zzewaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzevs zzevsVar;
        zzevs zzevsVar2;
        zzdqf zzdqfVar;
        zzcmy zzcmyVar = (zzcmy) obj;
        synchronized (this.zza) {
            zzcmy zzcmyVar2 = this.zza.zza;
            if (zzcmyVar2 != null) {
                zzcmyVar2.zzb();
            }
            zzewa zzewaVar = this.zza;
            zzewaVar.zza = zzcmyVar;
            zzcmyVar.zzc(zzewaVar);
            zzewa zzewaVar2 = this.zza;
            zzevsVar = zzewaVar2.zzg;
            zzevsVar2 = zzewaVar2.zzg;
            zzdqfVar = zzewaVar2.zzi;
            zzevsVar.zzk(new zzcmz(zzcmyVar, zzewaVar2, zzevsVar2, zzdqfVar));
            zzcmyVar.zzk();
        }
    }
}
