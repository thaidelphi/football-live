package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcns implements zzhdk {
    private final zzhdt zza;

    public zzcns(zzcnl zzcnlVar, zzhdt zzhdtVar) {
        this.zza = zzhdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwa zzn;
        zzcov zzb = ((zzcow) this.zza).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmx)).booleanValue()) {
            zzn = zzfwa.zzo(new zzdbw(zzb, zzbyp.zza));
        } else {
            zzn = zzfwa.zzn();
        }
        zzhds.zzb(zzn);
        return zzn;
    }
}
