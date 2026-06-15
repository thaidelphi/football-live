package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaac implements zzcb {
    private final Context zza;
    private final zzed zzb;
    private final zzbi zzc;
    private final SparseArray zzd;
    private final List zze;
    private final zzbx zzf;
    private final zzabc zzg;
    private final zzcw zzh;
    private final CopyOnWriteArraySet zzi;
    private zzdg zzj;
    private Pair zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaac(zzzw zzzwVar, zzaab zzaabVar) {
        Context context;
        zzbi zzbiVar;
        List list;
        zzbx zzbxVar;
        zzcw zzcwVar;
        zzaag zzaagVar;
        context = zzzwVar.zza;
        this.zza = context;
        this.zzb = new zzed(10);
        zzbiVar = zzzwVar.zzd;
        zzcv.zzb(zzbiVar);
        this.zzc = zzbiVar;
        this.zzd = new SparseArray();
        list = zzzwVar.zze;
        this.zze = list;
        zzbxVar = zzzwVar.zzf;
        this.zzf = zzbxVar;
        zzcwVar = zzzwVar.zzg;
        this.zzh = zzcwVar;
        zzaagVar = zzzwVar.zzb;
        this.zzg = new zzzi(zzaagVar, zzcwVar);
        this.zzi = new CopyOnWriteArraySet();
        new zzx().zzaj();
        this.zzn = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
        this.zzq = -1;
        this.zzm = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzca zzd(zzaac zzaacVar, zzz zzzVar, int i10) {
        zzcv.zzf(zzaacVar.zzm == 0);
        zzk zzv = zzv(zzzVar.zzC);
        if (zzv.zzd == 7 && zzeh.zza < 34) {
            zzi zzc = zzv.zzc();
            zzc.zzd(6);
            zzv = zzc.zzg();
        }
        zzk zzkVar = zzv;
        zzcw zzcwVar = zzaacVar.zzh;
        Looper myLooper = Looper.myLooper();
        zzcv.zzb(myLooper);
        final zzdg zzd = zzcwVar.zzd(myLooper, null);
        zzaacVar.zzj = zzd;
        try {
            zzbi zzbiVar = zzaacVar.zzc;
            Context context = zzaacVar.zza;
            zzn zznVar = zzn.zza;
            Objects.requireNonNull(zzd);
            zzbiVar.zza(context, zzkVar, zznVar, zzaacVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzzu
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdg.this.zzh(runnable);
                }
            }, zzaacVar.zzf, zzaacVar.zze, 0L);
            throw null;
        } catch (zzby e8) {
            throw new zzabb(e8, zzzVar);
        }
    }

    public static /* synthetic */ void zzi(zzaac zzaacVar) {
        zzaacVar.zzl--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzk(final zzaac zzaacVar, boolean z10) {
        zzed zzedVar;
        if (zzaacVar.zzm == 1) {
            zzaacVar.zzl++;
            zzaacVar.zzg.zzj(z10);
            while (true) {
                zzedVar = zzaacVar.zzb;
                if (zzedVar.zza() <= 1) {
                    break;
                }
                zzedVar.zzb();
            }
            if (zzedVar.zza() == 1) {
                Long l10 = (Long) zzedVar.zzb();
                Objects.requireNonNull(l10);
                zzaacVar.zzg.zzw(l10.longValue(), zzaacVar.zzp, -9223372036854775807L);
            }
            zzaacVar.zzn = -9223372036854775807L;
            zzaacVar.zzo = -9223372036854775807L;
            zzdg zzdgVar = zzaacVar.zzj;
            zzcv.zzb(zzdgVar);
            zzdgVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzv
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.zzi(zzaac.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzm(zzaac zzaacVar, long j10) {
        zzaacVar.zzp = j10;
        zzaacVar.zzg.zzw(0L, j10, -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzu(zzaac zzaacVar) {
        int i10 = zzaacVar.zzq;
        return i10 != -1 && i10 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzk zzv(zzk zzkVar) {
        return (zzkVar == null || !zzkVar.zzf()) ? zzk.zza : zzkVar;
    }

    public final zzabc zzg(int i10) {
        zzcv.zzf(!zzeh.zzG(this.zzd, 0));
        zzzx zzzxVar = new zzzx(this, this.zza, 0);
        this.zzi.add(zzzxVar);
        this.zzd.put(0, zzzxVar);
        return zzzxVar;
    }

    public final void zzp() {
        zzdy zzdyVar = zzdy.zza;
        zzdyVar.zzb();
        zzdyVar.zza();
        this.zzk = null;
    }

    public final void zzq() {
        if (this.zzm == 2) {
            return;
        }
        zzdg zzdgVar = this.zzj;
        if (zzdgVar != null) {
            zzdgVar.zze(null);
        }
        this.zzk = null;
        this.zzm = 2;
    }

    public final void zzr(Surface surface, zzdy zzdyVar) {
        Pair pair = this.zzk;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzdy) this.zzk.second).equals(zzdyVar)) {
            return;
        }
        this.zzk = Pair.create(surface, zzdyVar);
        zzdyVar.zzb();
        zzdyVar.zza();
    }

    public final void zzs(int i10) {
        this.zzq = 1;
    }
}
