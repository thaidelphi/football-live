package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdmg implements zzbjf {
    private final zzcvm zza;
    private final zzbvb zzb;
    private final String zzc;
    private final String zzd;

    public zzdmg(zzcvm zzcvmVar, zzezu zzezuVar) {
        this.zza = zzcvmVar;
        this.zzb = zzezuVar.zzl;
        this.zzc = zzezuVar.zzj;
        this.zzd = zzezuVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zza(zzbvb zzbvbVar) {
        int i10;
        String str;
        zzbvb zzbvbVar2 = this.zzb;
        if (zzbvbVar2 != null) {
            zzbvbVar = zzbvbVar2;
        }
        if (zzbvbVar != null) {
            str = zzbvbVar.zza;
            i10 = zzbvbVar.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zzd(new zzbum(str, i10), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zzc() {
        this.zza.zzf();
    }
}
