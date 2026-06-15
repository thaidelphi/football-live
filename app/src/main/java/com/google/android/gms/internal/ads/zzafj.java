package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafj implements zzau {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzafj(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        zzcv.zzd(z11);
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafj.class == obj.getClass()) {
            zzafj zzafjVar = (zzafj) obj;
            if (this.zza == zzafjVar.zza) {
                String str = this.zzb;
                String str2 = zzafjVar.zzb;
                int i10 = zzeh.zza;
                if (Objects.equals(str, str2) && Objects.equals(this.zzc, zzafjVar.zzc) && Objects.equals(this.zzd, zzafjVar.zzd) && this.zze == zzafjVar.zze && this.zzf == zzafjVar.zzf) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int hashCode = str != null ? str.hashCode() : 0;
        int i10 = this.zza;
        String str2 = this.zzc;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = ((i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode;
        String str3 = this.zzd;
        return (((((((i11 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        String str = this.zzc;
        if (str != null) {
            zzarVar.zzq(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzarVar.zzj(str2);
        }
    }
}
