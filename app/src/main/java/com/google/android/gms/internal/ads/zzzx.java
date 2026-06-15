package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzzx implements zzabc {
    final /* synthetic */ zzaac zza;
    private final int zzb;
    private zzfvv zzc;
    private zzz zzd;
    private long zze;
    private long zzf;
    private long zzg;

    public zzzx(zzaac zzaacVar, Context context, int i10) {
        this.zza = zzaacVar;
        this.zzb = true != zzeh.zzK(context) ? 5 : 1;
        this.zzc = zzfvv.zzn();
        this.zzg = -9223372036854775807L;
    }

    private final void zza(List list) {
        List list2;
        zzfvs zzfvsVar = new zzfvs();
        zzfvsVar.zzh(list);
        list2 = this.zza.zze;
        zzfvsVar.zzh(list2);
        this.zzc = zzfvsVar.zzi();
    }

    private static final void zzc(zzz zzzVar) {
        zzk zzv;
        zzx zzb = zzzVar.zzb();
        zzv = zzaac.zzv(zzzVar.zzC);
        zzb.zzD(zzv);
        zzb.zzaj();
        zzcv.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzA() {
        long j10;
        long j11;
        zzabc zzabcVar;
        this.zza.zzo = this.zzg;
        zzaac zzaacVar = this.zza;
        j10 = zzaacVar.zzn;
        j11 = zzaacVar.zzo;
        if (j10 >= j11) {
            zzabcVar = zzaacVar.zzg;
            zzabcVar.zzA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzB(long j10, boolean z10, zzaba zzabaVar) {
        zzcv.zzf(false);
        if (zzaac.zzu(this.zza)) {
            if (j10 - this.zze < this.zzf && !z10) {
                zzabaVar.zzb();
                return true;
            }
            zzcv.zzb(null);
            throw null;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzC(zzz zzzVar) throws zzabb {
        zzaac.zzd(this.zza, zzzVar, 0);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzD() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzE() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzF(boolean z10) {
        boolean zzF;
        zzF = this.zza.zzg.zzF(false);
        return zzF;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final Surface zzb() {
        zzcv.zzf(false);
        zzcv.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzh() {
        this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzi() {
        zzabc zzabcVar;
        zzabcVar = this.zza.zzg;
        zzabcVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzj(boolean z10) {
        this.zzg = -9223372036854775807L;
        zzaac.zzk(this.zza, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzk(boolean z10) {
        zzabc zzabcVar;
        zzabcVar = this.zza.zzg;
        zzabcVar.zzk(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzl(int i10, zzz zzzVar, List list) {
        zzcv.zzf(false);
        zza(list);
        this.zzd = zzzVar;
        this.zza.zzo = -9223372036854775807L;
        zzc(zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzm() {
        zzabc zzabcVar;
        zzabcVar = this.zza.zzg;
        zzabcVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzn(boolean z10) {
        zzabc zzabcVar;
        zzabcVar = this.zza.zzg;
        zzabcVar.zzn(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzo() {
        zzabc zzabcVar;
        zzabcVar = this.zza.zzg;
        zzabcVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzp() {
        zzabc zzabcVar;
        zzabcVar = this.zza.zzg;
        zzabcVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzq() {
        this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzr(long j10, long j11) throws zzabb {
        this.zza.zzg.zzr(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzs(int i10) {
        zzabc zzabcVar;
        zzabcVar = this.zza.zzg;
        zzabcVar.zzs(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzt(zzaaz zzaazVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzu(Surface surface, zzdy zzdyVar) {
        this.zza.zzr(surface, zzdyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzv(float f10) {
        this.zza.zzg.zzv(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzw(long j10, long j11, long j12) {
        zzed zzedVar;
        zzedVar = this.zza.zzb;
        long j13 = this.zzg;
        zzedVar.zzd(j13 == -9223372036854775807L ? 0L : j13 + 1, Long.valueOf(j10));
        this.zze = j11;
        zzaac.zzm(this.zza, j11);
        this.zzf = j12;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzx(List list) {
        if (this.zzc.equals(list)) {
            return;
        }
        zza(list);
        zzz zzzVar = this.zzd;
        if (zzzVar != null) {
            zzc(zzzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzy(zzaad zzaadVar) {
        this.zza.zzg.zzy(zzaadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzz(zzkz zzkzVar) {
    }
}
