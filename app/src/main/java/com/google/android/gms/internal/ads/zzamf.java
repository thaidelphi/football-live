package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzamf implements zzamn {
    private zzz zza;
    private zzee zzb;
    private zzadp zzc;

    public zzamf(String str, String str2) {
        zzx zzxVar = new zzx();
        zzxVar.zzE("video/mp2t");
        zzxVar.zzad(str);
        this.zza = zzxVar.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzamn
    public final void zza(zzdx zzdxVar) {
        zzcv.zzb(this.zzb);
        int i10 = zzeh.zza;
        long zze = this.zzb.zze();
        long zzf = this.zzb.zzf();
        if (zze == -9223372036854775807L || zzf == -9223372036854775807L) {
            return;
        }
        zzz zzzVar = this.zza;
        if (zzf != zzzVar.zzt) {
            zzx zzb = zzzVar.zzb();
            zzb.zzah(zzf);
            zzz zzaj = zzb.zzaj();
            this.zza = zzaj;
            this.zzc.zzm(zzaj);
        }
        int zzb2 = zzdxVar.zzb();
        this.zzc.zzr(zzdxVar, zzb2);
        this.zzc.zzt(zze, 1, zzb2, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzamn
    public final void zzb(zzee zzeeVar, zzacm zzacmVar, zzana zzanaVar) {
        this.zzb = zzeeVar;
        zzanaVar.zzc();
        zzadp zzw = zzacmVar.zzw(zzanaVar.zza(), 5);
        this.zzc = zzw;
        zzw.zzm(this.zza);
    }
}
