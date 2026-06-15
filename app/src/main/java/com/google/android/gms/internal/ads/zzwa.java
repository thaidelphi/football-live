package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzwa implements zztw, zztv {
    private final zztw zza;
    private final long zzb;
    private zztv zzc;

    public zzwa(zztw zztwVar, long j10) {
        this.zza = zztwVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zza(long j10, zzlg zzlgVar) {
        long j11 = this.zzb;
        return this.zza.zza(j10 - j11, zzlgVar) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zze(long j10) {
        long j11 = this.zzb;
        return this.zza.zze(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zzf(zzxp[] zzxpVarArr, boolean[] zArr, zzvs[] zzvsVarArr, boolean[] zArr2, long j10) {
        zzvs[] zzvsVarArr2 = new zzvs[zzvsVarArr.length];
        int i10 = 0;
        while (true) {
            zzvs zzvsVar = null;
            if (i10 >= zzvsVarArr.length) {
                break;
            }
            zzvz zzvzVar = (zzvz) zzvsVarArr[i10];
            if (zzvzVar != null) {
                zzvsVar = zzvzVar.zzc();
            }
            zzvsVarArr2[i10] = zzvsVar;
            i10++;
        }
        long zzf = this.zza.zzf(zzxpVarArr, zArr, zzvsVarArr2, zArr2, j10 - this.zzb);
        for (int i11 = 0; i11 < zzvsVarArr.length; i11++) {
            zzvs zzvsVar2 = zzvsVarArr2[i11];
            if (zzvsVar2 == null) {
                zzvsVarArr[i11] = null;
            } else {
                zzvs zzvsVar3 = zzvsVarArr[i11];
                if (zzvsVar3 == null || ((zzvz) zzvsVar3).zzc() != zzvsVar2) {
                    zzvsVarArr[i11] = new zzvz(zzvsVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final zzwd zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    public final /* bridge */ /* synthetic */ void zzh(zzvu zzvuVar) {
        zztw zztwVar = (zztw) zzvuVar;
        zztv zztvVar = this.zzc;
        Objects.requireNonNull(zztvVar);
        zztvVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzi(long j10, boolean z10) {
        this.zza.zzi(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzj(zztw zztwVar) {
        zztv zztvVar = this.zzc;
        Objects.requireNonNull(zztvVar);
        zztvVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzl(zztv zztvVar, long j10) {
        this.zzc = zztvVar;
        this.zza.zzl(this, j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final void zzm(long j10) {
        this.zza.zzm(j10 - this.zzb);
    }

    public final zztw zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzo(zzka zzkaVar) {
        long j10 = zzkaVar.zza;
        long j11 = this.zzb;
        zzjy zza = zzkaVar.zza();
        zza.zze(j10 - j11);
        return this.zza.zzo(zza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
