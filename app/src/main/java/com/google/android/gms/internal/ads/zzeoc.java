package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeoc implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzeoc(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwa zzn;
        zzepa zzb = ((zzepc) this.zza).zzb();
        Context zza = ((zzcfx) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzln)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(zza)) {
                zzn = zzfwa.zzo(zzb);
                zzhds.zzb(zzn);
                return zzn;
            }
        }
        zzn = zzfwa.zzn();
        zzhds.zzb(zzn);
        return zzn;
    }
}
