package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbm {
    public static final Object zza = new Object();
    private static final zzap zzp;
    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    public zzaj zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzap zzd = zzp;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zza("androidx.media3.common.Timeline");
        zzadVar.zzb(Uri.EMPTY);
        zzp = zzadVar.zzc();
        int i10 = zzeh.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbm.class.equals(obj.getClass())) {
            zzbm zzbmVar = (zzbm) obj;
            Object obj2 = this.zzb;
            Object obj3 = zzbmVar.zzb;
            int i10 = zzeh.zza;
            if (Objects.equals(obj2, obj3) && Objects.equals(this.zzd, zzbmVar.zzd) && Objects.equals(this.zzj, zzbmVar.zzj) && this.zze == zzbmVar.zze && this.zzf == zzbmVar.zzf && this.zzg == zzbmVar.zzg && this.zzh == zzbmVar.zzh && this.zzi == zzbmVar.zzi && this.zzk == zzbmVar.zzk && this.zzm == zzbmVar.zzm && this.zzn == zzbmVar.zzn && this.zzo == zzbmVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzaj zzajVar = this.zzj;
        int hashCode2 = zzajVar == null ? 0 : zzajVar.hashCode();
        long j10 = this.zze;
        long j11 = this.zzf;
        long j12 = this.zzg;
        int i10 = (((((((((((((hashCode * 961) + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j13 = this.zzm;
        return ((((((i10 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbm zza(Object obj, zzap zzapVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, zzaj zzajVar, long j13, long j14, int i10, int i11, long j15) {
        this.zzb = obj;
        this.zzd = zzapVar == null ? zzp : zzapVar;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z10;
        this.zzi = z11;
        this.zzj = zzajVar;
        this.zzl = 0L;
        this.zzm = j14;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
