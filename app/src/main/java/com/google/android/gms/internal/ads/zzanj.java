package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzanj {
    public final int zza;
    public final long zzb;

    private zzanj(int i10, long j10) {
        this.zza = i10;
        this.zzb = j10;
    }

    public static zzanj zza(zzack zzackVar, zzdx zzdxVar) throws IOException {
        zzackVar.zzh(zzdxVar.zzN(), 0, 8);
        zzdxVar.zzL(0);
        return new zzanj(zzdxVar.zzg(), zzdxVar.zzs());
    }
}
