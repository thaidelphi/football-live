package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzada implements zzadi {
    private final zzdo zza;
    private final zzdo zzb;
    private long zzc;

    public zzada(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzcv.zzd(length == length2);
        if (length2 > 0 && jArr2[0] > 0) {
            int i10 = length2 + 1;
            zzdo zzdoVar = new zzdo(i10);
            this.zza = zzdoVar;
            zzdo zzdoVar2 = new zzdo(i10);
            this.zzb = zzdoVar2;
            zzdoVar.zzc(0L);
            zzdoVar2.zzc(0L);
        } else {
            this.zza = new zzdo(length2);
            this.zzb = new zzdo(length2);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        zzdo zzdoVar = this.zzb;
        if (zzdoVar.zza() == 0) {
            zzadj zzadjVar = zzadj.zza;
            return new zzadg(zzadjVar, zzadjVar);
        }
        int zzb = zzeh.zzb(zzdoVar, j10, true, true);
        zzadj zzadjVar2 = new zzadj(this.zzb.zzb(zzb), this.zza.zzb(zzb));
        if (zzadjVar2.zzb != j10) {
            zzdo zzdoVar2 = this.zzb;
            if (zzb != zzdoVar2.zza() - 1) {
                int i10 = zzb + 1;
                return new zzadg(zzadjVar2, new zzadj(zzdoVar2.zzb(i10), this.zza.zzb(i10)));
            }
        }
        return new zzadg(zzadjVar2, zzadjVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}
