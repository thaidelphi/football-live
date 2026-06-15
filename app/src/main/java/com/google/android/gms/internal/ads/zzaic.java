package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaic {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzz zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzaid[] zzl;

    public zzaic(int i10, int i11, long j10, long j11, long j12, long j13, zzz zzzVar, int i12, zzaid[] zzaidVarArr, int i13, long[] jArr, long[] jArr2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = zzzVar;
        this.zzh = i12;
        this.zzl = zzaidVarArr;
        this.zzk = i13;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzaic zza(zzz zzzVar) {
        return new zzaic(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzzVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }

    public final zzaid zzb(int i10) {
        return this.zzl[i10];
    }
}
