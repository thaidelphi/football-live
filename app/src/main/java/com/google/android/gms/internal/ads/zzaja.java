package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaja {
    public static void zza(zzajb zzajbVar, zzajf zzajfVar, zzda zzdaVar) {
        for (int i10 = 0; i10 < zzajbVar.zza(); i10++) {
            long zzb = zzajbVar.zzb(i10);
            List zzc = zzajbVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i10 != zzajbVar.zza() - 1) {
                    long zzb2 = zzajbVar.zzb(i10 + 1) - zzajbVar.zzb(i10);
                    if (zzb2 > 0) {
                        zzdaVar.zza(new zzaiy(zzc, zzb, zzb2));
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
