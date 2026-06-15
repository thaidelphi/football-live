package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfdl implements zzhdk {
    public static zzfdl zza() {
        return zzfdk.zza;
    }

    public static zzgba zzc() {
        zzgba zzgbaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfG)).booleanValue()) {
            zzgbaVar = zzbyp.zzc;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfF)).booleanValue()) {
                zzgbaVar = zzbyp.zza;
            } else {
                zzgbaVar = zzbyp.zzf;
            }
        }
        zzhds.zzb(zzgbaVar);
        return zzgbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
