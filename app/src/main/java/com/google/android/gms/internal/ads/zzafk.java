package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafk extends zzaft {
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzafk(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafk.class == obj.getClass()) {
            zzafk zzafkVar = (zzafk) obj;
            if (this.zzc == zzafkVar.zzc) {
                String str = this.zza;
                String str2 = zzafkVar.zza;
                int i10 = zzeh.zza;
                if (Objects.equals(str, str2) && Objects.equals(this.zzb, zzafkVar.zzb) && Arrays.equals(this.zzd, zzafkVar.zzd)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        int i10 = this.zzc;
        String str2 = this.zzb;
        return ((((((i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaft
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaft, com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        zzarVar.zza(this.zzd, this.zzc);
    }
}
