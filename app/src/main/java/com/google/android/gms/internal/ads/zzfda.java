package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfda {
    private final long zza;
    private long zzc;
    private final zzfcz zzb = new zzfcz();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfda() {
        long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
        this.zza = a10;
        this.zzc = a10;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfcz zzd() {
        zzfcz zzfczVar = this.zzb;
        zzfcz clone = zzfczVar.clone();
        zzfczVar.zza = false;
        zzfczVar.zzb = 0;
        return clone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().a();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
