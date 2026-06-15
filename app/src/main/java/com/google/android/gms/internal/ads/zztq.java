package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zztq implements zztw, zztv {
    public final zzty zza;
    private final long zzb;
    private zzua zzc;
    private zztw zzd;
    private zztv zze;
    private long zzf = -9223372036854775807L;
    private final zzye zzg;

    public zztq(zzty zztyVar, zzye zzyeVar, long j10) {
        this.zza = zztyVar;
        this.zzg = zzyeVar;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzf;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zza(long j10, zzlg zzlgVar) {
        zztw zztwVar = this.zzd;
        int i10 = zzeh.zza;
        return zztwVar.zza(j10, zzlgVar);
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzb() {
        zztw zztwVar = this.zzd;
        int i10 = zzeh.zza;
        return zztwVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzc() {
        zztw zztwVar = this.zzd;
        int i10 = zzeh.zza;
        return zztwVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zzd() {
        zztw zztwVar = this.zzd;
        int i10 = zzeh.zza;
        return zztwVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zze(long j10) {
        zztw zztwVar = this.zzd;
        int i10 = zzeh.zza;
        return zztwVar.zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zzf(zzxp[] zzxpVarArr, boolean[] zArr, zzvs[] zzvsVarArr, boolean[] zArr2, long j10) {
        long j11 = this.zzf;
        long j12 = (j11 == -9223372036854775807L || j10 != this.zzb) ? j10 : j11;
        this.zzf = -9223372036854775807L;
        zztw zztwVar = this.zzd;
        int i10 = zzeh.zza;
        return zztwVar.zzf(zzxpVarArr, zArr, zzvsVarArr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final zzwd zzg() {
        zztw zztwVar = this.zzd;
        int i10 = zzeh.zza;
        return zztwVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    public final /* bridge */ /* synthetic */ void zzh(zzvu zzvuVar) {
        zztw zztwVar = (zztw) zzvuVar;
        zztv zztvVar = this.zze;
        int i10 = zzeh.zza;
        zztvVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzi(long j10, boolean z10) {
        zztw zztwVar = this.zzd;
        int i10 = zzeh.zza;
        zztwVar.zzi(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzj(zztw zztwVar) {
        zztv zztvVar = this.zze;
        int i10 = zzeh.zza;
        zztvVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzk() throws IOException {
        try {
            zztw zztwVar = this.zzd;
            if (zztwVar != null) {
                zztwVar.zzk();
                return;
            }
            zzua zzuaVar = this.zzc;
            if (zzuaVar != null) {
                zzuaVar.zzz();
            }
        } catch (IOException e8) {
            throw e8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzl(zztv zztvVar, long j10) {
        this.zze = zztvVar;
        zztw zztwVar = this.zzd;
        if (zztwVar != null) {
            zztwVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final void zzm(long j10) {
        zztw zztwVar = this.zzd;
        int i10 = zzeh.zza;
        zztwVar.zzm(j10);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzo(zzka zzkaVar) {
        zztw zztwVar = this.zzd;
        return zztwVar != null && zztwVar.zzo(zzkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzp() {
        zztw zztwVar = this.zzd;
        return zztwVar != null && zztwVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzty zztyVar) {
        long zzv = zzv(this.zzb);
        zzua zzuaVar = this.zzc;
        Objects.requireNonNull(zzuaVar);
        zztw zzI = zzuaVar.zzI(zztyVar, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j10) {
        this.zzf = j10;
    }

    public final void zzt() {
        zztw zztwVar = this.zzd;
        if (zztwVar != null) {
            zzua zzuaVar = this.zzc;
            Objects.requireNonNull(zzuaVar);
            zzuaVar.zzG(zztwVar);
        }
    }

    public final void zzu(zzua zzuaVar) {
        zzcv.zzf(this.zzc == null);
        this.zzc = zzuaVar;
    }
}
