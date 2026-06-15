package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafo extends zzaft {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzafo(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafo.class == obj.getClass()) {
            zzafo zzafoVar = (zzafo) obj;
            String str = this.zzb;
            String str2 = zzafoVar.zzb;
            int i10 = zzeh.zza;
            if (Objects.equals(str, str2) && Objects.equals(this.zza, zzafoVar.zza) && Objects.equals(this.zzc, zzafoVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
        String str = this.zzc;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaft
    public final String toString() {
        return this.zzf + ": language=" + this.zza + ", description=" + this.zzb + ", text=" + this.zzc;
    }
}
