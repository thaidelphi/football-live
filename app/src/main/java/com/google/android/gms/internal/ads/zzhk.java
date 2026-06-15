package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhk {
    public final String zza;
    public final zzz zzb;
    public final zzz zzc;
    public final int zzd;
    public final int zze;

    public zzhk(String str, zzz zzzVar, zzz zzzVar2, int i10, int i11) {
        boolean z10 = false;
        if (i10 != 0) {
            i11 = i11 == 0 ? 0 : i11;
            zzcv.zzd(z10);
            zzcv.zzc(str);
            this.zza = str;
            this.zzb = zzzVar;
            Objects.requireNonNull(zzzVar2);
            this.zzc = zzzVar2;
            this.zzd = i10;
            this.zze = i11;
        }
        z10 = true;
        zzcv.zzd(z10);
        zzcv.zzc(str);
        this.zza = str;
        this.zzb = zzzVar;
        Objects.requireNonNull(zzzVar2);
        this.zzc = zzzVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhk.class == obj.getClass()) {
            zzhk zzhkVar = (zzhk) obj;
            if (this.zzd == zzhkVar.zzd && this.zze == zzhkVar.zze && this.zza.equals(zzhkVar.zza) && this.zzb.equals(zzhkVar.zzb) && this.zzc.equals(zzhkVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
