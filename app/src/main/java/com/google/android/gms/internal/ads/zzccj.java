package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzccj implements zzjx {
    private final zzye zza = new zzye(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    final void zza(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final long zzb(zznz zznzVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzc(zznz zznzVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzd(zznz zznzVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zze(zznz zznzVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzf(zzjw zzjwVar, zzwd zzwdVar, zzxp[] zzxpVarArr) {
        this.zzf = 0;
        for (zzxp zzxpVar : zzxpVarArr) {
            if (zzxpVar != null) {
                int i10 = this.zzf;
                int i11 = zzxpVar.zzg().zzc;
                int i12 = 131072;
                if (i11 == 0) {
                    i12 = 144310272;
                } else if (i11 == 1) {
                    i12 = 13107200;
                } else if (i11 == 2) {
                    i12 = 131072000;
                } else if (i11 != 3 && i11 != 5 && i11 != 6) {
                    throw new IllegalArgumentException();
                }
                this.zzf = i10 + i12;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final boolean zzg(zznz zznzVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final boolean zzh(zzjw zzjwVar) {
        long j10 = zzjwVar.zzb;
        boolean z10 = true;
        boolean z11 = j10 > this.zzc ? false : j10 < this.zzb ? true : true;
        int zza = this.zza.zza();
        int i10 = this.zzf;
        if (!z11 && (!z11 || !this.zzg || zza >= i10)) {
            z10 = false;
        }
        this.zzg = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final /* synthetic */ boolean zzi(zzbn zzbnVar, zzty zztyVar, long j10) {
        zzdn.zzf("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final boolean zzj(zzjw zzjwVar) {
        long j10 = zzjwVar.zzd ? this.zze : this.zzd;
        return j10 <= 0 || zzjwVar.zzb >= j10;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final zzye zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i10) {
        this.zzd = i10 * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zze = i10 * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zzc = i10 * 1000;
    }

    public final synchronized void zzo(int i10) {
        this.zzb = i10 * 1000;
    }
}
