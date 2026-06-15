package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafp extends zzaft {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzafp(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafp.class == obj.getClass()) {
            zzafp zzafpVar = (zzafp) obj;
            String str = this.zza;
            String str2 = zzafpVar.zza;
            int i10 = zzeh.zza;
            if (Objects.equals(str, str2) && Objects.equals(this.zzb, zzafpVar.zzb) && Objects.equals(this.zzc, zzafpVar.zzc) && Arrays.equals(this.zzd, zzafpVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaft
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }
}
