package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzexn implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzexn(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzexl zzb() {
        zzbxz zzh;
        Context context = (Context) this.zza.zzb();
        zzfby zzfbyVar = (zzfby) this.zzb.zzb();
        zzfcq zzfcqVar = (zzfcq) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgh)).booleanValue()) {
            zzh = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg();
        } else {
            zzh = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzh();
        }
        boolean z10 = false;
        if (zzh != null && zzh.zzh()) {
            z10 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgx)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgg)).booleanValue() || z10) {
                zzfcp zza = zzfcqVar.zza(zzfcg.AppOpen, context, zzfbyVar, new zzewp(new zzewm()));
                zzexb zzexbVar = new zzexb(new zzexa());
                zzfcc zzfccVar = zza.zza;
                zzgba zzgbaVar = zzbyp.zza;
                return new zzewr(zzexbVar, new zzewx(zzfccVar, zzgbaVar), zza.zzb, zza.zza.zza().zzf, zzgbaVar);
            }
        }
        return new zzexa();
    }
}
