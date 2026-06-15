package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzzi implements zzabc {
    private final zzaag zza;
    private final zzcw zzb;
    private final zzaal zzc;
    private final Queue zzd;
    private Surface zze;
    private zzz zzf;
    private long zzg;
    private long zzh;
    private zzaaz zzi;
    private Executor zzj;
    private zzaad zzk;

    public zzzi(zzaag zzaagVar, zzcw zzcwVar) {
        this.zza = zzaagVar;
        zzaagVar.zzk(zzcwVar);
        this.zzb = zzcwVar;
        this.zzc = new zzaal(new zzzg(this, null), zzaagVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzx().zzaj();
        this.zzg = -9223372036854775807L;
        this.zzi = zzaaz.zzb;
        this.zzj = new Executor() { // from class: com.google.android.gms.internal.ads.zzzb
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
            }
        };
        this.zzk = new zzaad() { // from class: com.google.android.gms.internal.ads.zzzc
            @Override // com.google.android.gms.internal.ads.zzaad
            public final void zza(long j10, long j11, zzz zzzVar, MediaFormat mediaFormat) {
            }
        };
    }

    public static /* bridge */ /* synthetic */ zzaaz zze(zzzi zzziVar) {
        return zzziVar.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzA() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzB(long j10, boolean z10, zzaba zzabaVar) {
        this.zzd.add(zzabaVar);
        this.zzc.zzb(j10 - this.zzh);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzC(zzz zzzVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzD() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzE() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzF(boolean z10) {
        return this.zza.zzo(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final Surface zzb() {
        Surface surface = this.zze;
        zzcv.zzb(surface);
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzh() {
        this.zze = null;
        this.zza.zzm(null);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzi() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzj(boolean z10) {
        if (z10) {
            this.zza.zzi();
        }
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzk(boolean z10) {
        this.zza.zzc(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzl(int i10, zzz zzzVar, List list) {
        zzcv.zzf(list.isEmpty());
        zzz zzzVar2 = this.zzf;
        int i11 = zzzVar2.zzv;
        int i12 = zzzVar.zzv;
        if (i12 != i11 || zzzVar.zzw != zzzVar2.zzw) {
            this.zzc.zzd(i12, zzzVar.zzw);
        }
        float f10 = zzzVar.zzx;
        if (f10 != this.zzf.zzx) {
            this.zza.zzl(f10);
        }
        this.zzf = zzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzm() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzn(boolean z10) {
        this.zza.zze(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzo() {
        this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzp() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzr(long j10, long j11) throws zzabb {
        try {
            this.zzc.zze(j10, j11);
        } catch (zzhs e8) {
            throw new zzabb(e8, this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzs(int i10) {
        this.zza.zzj(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzt(zzaaz zzaazVar, Executor executor) {
        this.zzi = zzaazVar;
        this.zzj = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzu(Surface surface, zzdy zzdyVar) {
        this.zze = surface;
        this.zza.zzm(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzv(float f10) {
        this.zza.zzn(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzw(long j10, long j11, long j12) {
        if (j10 != this.zzg) {
            this.zzc.zzc(j10);
            this.zzg = j10;
        }
        this.zzh = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzx(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzy(zzaad zzaadVar) {
        this.zzk = zzaadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzz(zzkz zzkzVar) {
        throw new UnsupportedOperationException();
    }
}
