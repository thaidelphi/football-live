package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfvh extends zzfvk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvh() {
        super(null);
    }

    static final zzfvk zzf(int i10) {
        zzfvk zzfvkVar;
        zzfvk zzfvkVar2;
        zzfvk zzfvkVar3;
        if (i10 < 0) {
            zzfvkVar3 = zzfvk.zzb;
            return zzfvkVar3;
        } else if (i10 > 0) {
            zzfvkVar2 = zzfvk.zzc;
            return zzfvkVar2;
        } else {
            zzfvkVar = zzfvk.zza;
            return zzfvkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final zzfvk zzb(int i10, int i11) {
        return zzf(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final zzfvk zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final zzfvk zzd(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final zzfvk zze(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z11, z10));
    }
}
