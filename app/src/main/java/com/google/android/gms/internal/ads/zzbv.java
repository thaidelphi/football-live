package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbv {
    public static final zzbv zza = new zzbv(zzfvv.zzn());
    private final zzfvv zzb;

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
    }

    public zzbv(List list) {
        this.zzb = zzfvv.zzl(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbv.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbv) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfvv zza() {
        return this.zzb;
    }

    public final boolean zzb(int i10) {
        for (int i11 = 0; i11 < this.zzb.size(); i11++) {
            zzbu zzbuVar = (zzbu) this.zzb.get(i11);
            if (zzbuVar.zzc() && zzbuVar.zza() == i10) {
                return true;
            }
        }
        return false;
    }
}
