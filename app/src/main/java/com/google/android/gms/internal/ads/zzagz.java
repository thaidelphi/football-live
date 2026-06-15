package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzagz {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzdx zzf;
    private final zzdx zzg;
    private int zzh;
    private int zzi;

    public zzagz(zzdx zzdxVar, zzdx zzdxVar2, boolean z10) throws zzaz {
        this.zzg = zzdxVar;
        this.zzf = zzdxVar2;
        this.zze = z10;
        zzdxVar2.zzL(12);
        this.zza = zzdxVar2.zzp();
        zzdxVar.zzL(12);
        this.zzi = zzdxVar.zzp();
        zzacn.zzb(zzdxVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzw() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzM(4);
            int i11 = this.zzi - 1;
            this.zzi = i11;
            this.zzh = i11 > 0 ? (-1) + this.zzg.zzp() : -1;
        }
        return true;
    }
}
