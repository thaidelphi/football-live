package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcfk {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcfk(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzcfk zza() {
        return new zzcfk(0, 0, 0);
    }

    public static zzcfk zzb(int i10, int i11) {
        return new zzcfk(1, i10, i11);
    }

    public static zzcfk zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzcfk(3, 0, 0) : zzrVar.zzi ? new zzcfk(2, 0, 0) : zzrVar.zzh ? new zzcfk(0, 0, 0) : new zzcfk(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzcfk zzd() {
        return new zzcfk(5, 0, 0);
    }

    public static zzcfk zze() {
        return new zzcfk(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
