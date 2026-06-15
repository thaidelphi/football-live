package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdyd {
    private final zzbtx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyd(zzbtx zzbtxVar) {
        this.zza = zzbtxVar;
    }

    public final void zza() {
        b6.a zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhF)).booleanValue()) {
            zzbys.zzb(zza, "persistFlags");
        } else {
            zzbys.zza(zza, "persistFlags");
        }
    }
}
