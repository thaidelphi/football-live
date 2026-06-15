package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaml {
    private final zzalm zza;
    private final zzee zzb;
    private final zzdw zzc = new zzdw(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaml(zzalm zzalmVar, zzee zzeeVar) {
        this.zza = zzalmVar;
        this.zzb = zzeeVar;
    }

    public final void zza(zzdx zzdxVar) throws zzaz {
        long j10;
        long j11;
        zzdxVar.zzH(this.zzc.zza, 0, 3);
        this.zzc.zzl(0);
        this.zzc.zzn(8);
        this.zzd = this.zzc.zzp();
        this.zze = this.zzc.zzp();
        this.zzc.zzn(6);
        zzdw zzdwVar = this.zzc;
        zzdxVar.zzH(zzdwVar.zza, 0, zzdwVar.zzd(8));
        this.zzc.zzl(0);
        if (this.zzd) {
            this.zzc.zzn(4);
            long zzd = this.zzc.zzd(3);
            this.zzc.zzn(1);
            int zzd2 = this.zzc.zzd(15) << 15;
            this.zzc.zzn(1);
            long zzd3 = this.zzc.zzd(15);
            this.zzc.zzn(1);
            if (this.zzf || !this.zze) {
                j11 = zzd;
            } else {
                this.zzc.zzn(4);
                this.zzc.zzn(1);
                this.zzc.zzn(1);
                j11 = zzd;
                this.zzc.zzn(1);
                this.zzb.zzb((this.zzc.zzd(15) << 15) | (this.zzc.zzd(3) << 30) | this.zzc.zzd(15));
                this.zzf = true;
            }
            j10 = this.zzb.zzb((j11 << 30) | zzd2 | zzd3);
        } else {
            j10 = 0;
        }
        this.zza.zzd(j10, 4);
        this.zza.zza(zzdxVar);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
