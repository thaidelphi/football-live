package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzkx extends zztm {
    private final zzbm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkx(zzky zzkyVar, zzbn zzbnVar) {
        super(zzbnVar);
        this.zzc = new zzbm();
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i10, zzbl zzblVar, boolean z10) {
        zzbl zzd = this.zzb.zzd(i10, zzblVar, z10);
        if (this.zzb.zze(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zzi(zzblVar.zza, zzblVar.zzb, zzblVar.zzc, zzblVar.zzd, 0L, zzb.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
