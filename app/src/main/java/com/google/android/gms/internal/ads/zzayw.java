package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayw implements Comparator {
    public zzayw(zzayx zzayxVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzayl zzaylVar = (zzayl) obj;
        zzayl zzaylVar2 = (zzayl) obj2;
        if (zzaylVar.zzd() >= zzaylVar2.zzd()) {
            if (zzaylVar.zzd() > zzaylVar2.zzd()) {
                return 1;
            }
            if (zzaylVar.zzb() >= zzaylVar2.zzb()) {
                if (zzaylVar.zzb() > zzaylVar2.zzb()) {
                    return 1;
                }
                float zza = (zzaylVar.zza() - zzaylVar.zzd()) * (zzaylVar.zzc() - zzaylVar.zzb());
                float zza2 = (zzaylVar2.zza() - zzaylVar2.zzd()) * (zzaylVar2.zzc() - zzaylVar2.zzb());
                if (zza <= zza2) {
                    return zza < zza2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
