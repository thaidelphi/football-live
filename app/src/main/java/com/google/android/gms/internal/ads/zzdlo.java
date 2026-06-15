package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdlo implements zzgal {
    final /* synthetic */ zzezu zza;
    final /* synthetic */ zzezx zzb;
    final /* synthetic */ zzclc zzc;
    final /* synthetic */ zzdlu zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlo(zzdlu zzdluVar, zzezu zzezuVar, zzezx zzezxVar, zzclc zzclcVar) {
        this.zza = zzezuVar;
        this.zzb = zzezxVar;
        this.zzc = zzclcVar;
        this.zzd = zzdluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdzu zzdzuVar;
        zzfhp zzfhpVar;
        zzdzu zzdzuVar2;
        zzdqf zzdqfVar;
        zzcdq zzcdqVar = (zzcdq) obj;
        zzcdqVar.zzW(this.zza, this.zzb);
        zzcfi zzN = zzcdqVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzka)).booleanValue() && zzN != null) {
            zzclc zzclcVar = this.zzc;
            zzdlu zzdluVar = this.zzd;
            zzdzuVar = zzdluVar.zzi;
            zzfhpVar = zzdluVar.zzj;
            zzN.zzK(zzclcVar, zzdzuVar, zzfhpVar);
            zzclc zzclcVar2 = this.zzc;
            zzdlu zzdluVar2 = this.zzd;
            zzdzuVar2 = zzdluVar2.zzi;
            zzdqfVar = zzdluVar2.zzd;
            zzN.zzM(zzclcVar2, zzdzuVar2, zzdqfVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmR)).booleanValue() || zzN == null) {
            return;
        }
        zzN.zzN(this.zza);
    }
}
