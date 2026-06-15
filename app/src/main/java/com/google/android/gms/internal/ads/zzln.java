package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzln {
    public final long zza;
    public final zzbn zzb;
    public final int zzc;
    public final zzty zzd;
    public final long zze;
    public final zzbn zzf;
    public final int zzg;
    public final zzty zzh;
    public final long zzi;
    public final long zzj;

    public zzln(long j10, zzbn zzbnVar, int i10, zzty zztyVar, long j11, zzbn zzbnVar2, int i11, zzty zztyVar2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzbnVar;
        this.zzc = i10;
        this.zzd = zztyVar;
        this.zze = j11;
        this.zzf = zzbnVar2;
        this.zzg = i11;
        this.zzh = zztyVar2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzln.class == obj.getClass()) {
            zzln zzlnVar = (zzln) obj;
            if (this.zza == zzlnVar.zza && this.zzc == zzlnVar.zzc && this.zze == zzlnVar.zze && this.zzg == zzlnVar.zzg && this.zzi == zzlnVar.zzi && this.zzj == zzlnVar.zzj && zzfss.zza(this.zzb, zzlnVar.zzb) && zzfss.zza(this.zzd, zzlnVar.zzd) && zzfss.zza(this.zzf, zzlnVar.zzf) && zzfss.zza(this.zzh, zzlnVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
