package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcgl implements zzhdk {
    private final zzcft zza;

    public zzcgl(zzcft zzcftVar) {
        this.zza = zzcftVar;
    }

    public static VersionInfoParcel zzc(zzcft zzcftVar) {
        VersionInfoParcel zze = zzcftVar.zze();
        zzhds.zzb(zze);
        return zze;
    }

    public final VersionInfoParcel zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
