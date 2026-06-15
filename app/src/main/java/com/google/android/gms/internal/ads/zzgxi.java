package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgxi {
    public static final List zza(Object obj, long j10) {
        zzgww zzgwwVar = (zzgww) zzgzh.zzh(obj, j10);
        if (zzgwwVar.zzc()) {
            return zzgwwVar;
        }
        int size = zzgwwVar.size();
        zzgww zzf = zzgwwVar.zzf(size == 0 ? 10 : size + size);
        zzgzh.zzv(obj, j10, zzf);
        return zzf;
    }
}
