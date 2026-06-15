package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzkd {
    public final zzty zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkd(zzty zztyVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        zzcv.zzd(!z14 || z12);
        if (z13 && !z12) {
            z15 = false;
        }
        zzcv.zzd(z15);
        this.zza = zztyVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkd.class == obj.getClass()) {
            zzkd zzkdVar = (zzkd) obj;
            if (this.zzb == zzkdVar.zzb && this.zzc == zzkdVar.zzc && this.zzd == zzkdVar.zzd && this.zze == zzkdVar.zze && this.zzh == zzkdVar.zzh && this.zzi == zzkdVar.zzi && this.zzj == zzkdVar.zzj) {
                zzty zztyVar = this.zza;
                zzty zztyVar2 = zzkdVar.zza;
                int i10 = zzeh.zza;
                if (Objects.equals(zztyVar, zztyVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j10 = this.zze;
        long j11 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzkd zza(long j10) {
        return j10 == this.zzc ? this : new zzkd(this.zza, this.zzb, j10, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzkd zzb(long j10) {
        return j10 == this.zzb ? this : new zzkd(this.zza, j10, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
