package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzab {
    public final String zza;
    public final String zzb;

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzab(String str, String str2) {
        this.zza = zzeh.zzE(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzab.class == obj.getClass()) {
            zzab zzabVar = (zzab) obj;
            String str = this.zza;
            String str2 = zzabVar.zza;
            int i10 = zzeh.zza;
            if (Objects.equals(str, str2) && Objects.equals(this.zzb, zzabVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        String str = this.zza;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
