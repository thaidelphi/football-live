package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbum extends zzbuo {
    private final String zza;
    private final int zzb;

    public zzbum(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbum)) {
            zzbum zzbumVar = (zzbum) obj;
            if (Objects.a(this.zza, zzbumVar.zza)) {
                if (Objects.a(Integer.valueOf(this.zzb), Integer.valueOf(zzbumVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final String zzc() {
        return this.zza;
    }
}
