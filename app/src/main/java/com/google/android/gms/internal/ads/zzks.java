package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzks {
    private static final zzty zzu = new zzty(new Object(), -1);
    public final zzbn zza;
    public final zzty zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzhs zzf;
    public final boolean zzg;
    public final zzwd zzh;
    public final zzxw zzi;
    public final List zzj;
    public final zzty zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbb zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzks(zzbn zzbnVar, zzty zztyVar, long j10, long j11, int i10, zzhs zzhsVar, boolean z10, zzwd zzwdVar, zzxw zzxwVar, List list, zzty zztyVar2, boolean z11, int i11, int i12, zzbb zzbbVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzbnVar;
        this.zzb = zztyVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzhsVar;
        this.zzg = z10;
        this.zzh = zzwdVar;
        this.zzi = zzxwVar;
        this.zzj = list;
        this.zzk = zztyVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = i12;
        this.zzo = zzbbVar;
        this.zzq = j12;
        this.zzr = j13;
        this.zzs = j14;
        this.zzt = j15;
    }

    public static zzks zzg(zzxw zzxwVar) {
        zzbn zzbnVar = zzbn.zza;
        zzty zztyVar = zzu;
        return new zzks(zzbnVar, zztyVar, -9223372036854775807L, 0L, 1, null, false, zzwd.zza, zzxwVar, zzfvv.zzn(), zztyVar, false, 1, 0, zzbb.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzty zzh() {
        return zzu;
    }

    public final zzks zza(zzty zztyVar) {
        return new zzks(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zztyVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzks zzb(zzty zztyVar, long j10, long j11, long j12, long j13, zzwd zzwdVar, zzxw zzxwVar, List list) {
        zzty zztyVar2 = this.zzk;
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        int i11 = this.zzn;
        zzbb zzbbVar = this.zzo;
        long j14 = this.zzq;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzks(this.zza, zztyVar, j11, j12, this.zze, this.zzf, this.zzg, zzwdVar, zzxwVar, list, zztyVar2, z10, i10, i11, zzbbVar, j14, j13, j10, elapsedRealtime, false);
    }

    public final zzks zzc(boolean z10, int i10, int i11) {
        return new zzks(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, i11, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzks zzd(zzhs zzhsVar) {
        return new zzks(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhsVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzks zze(int i10) {
        return new zzks(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzks zzf(zzbn zzbnVar) {
        return new zzks(zzbnVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
