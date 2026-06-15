package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeee implements zzgal {
    final /* synthetic */ zzezu zza;
    final /* synthetic */ zzeef zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeee(zzeef zzeefVar, zzezu zzezuVar) {
        this.zza = zzezuVar;
        this.zzb = zzeefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzeeg zzeegVar;
        zzeeg zzeegVar2;
        zzeeg zzeegVar3;
        synchronized (this.zzb) {
            zzeegVar = this.zzb.zzh;
            zzeegVar.zzb(th, this.zza);
            zzeegVar2 = this.zzb.zzh;
            zzezu zza = zzeegVar2.zza();
            if (this.zza.zzav) {
                while (zza != null) {
                    this.zzb.zze(zza);
                    zzeegVar3 = this.zzb.zzh;
                    zza = zzeegVar3.zza();
                }
            } else if (zza != null) {
                this.zzb.zze(zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeeg zzeegVar;
        zzeeg zzeegVar2;
        zzeew zzeewVar = (zzeew) obj;
        synchronized (this.zzb) {
            zzeegVar = this.zzb.zzh;
            zzeegVar.zzc(zzeewVar, this.zza);
            zzeegVar2 = this.zzb.zzh;
            zzezu zza = zzeegVar2.zza();
            if (zza != null) {
                this.zzb.zze(zza);
            }
        }
    }
}
