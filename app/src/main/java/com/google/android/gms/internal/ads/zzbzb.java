package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzbzb {
    private final zzbyu zza;
    private final AtomicInteger zzb;

    public zzbzb() {
        zzbyu zzbyuVar = new zzbyu();
        this.zza = zzbyuVar;
        this.zzb = new AtomicInteger(0);
        zzgap.zzr(zzbyuVar, new zzbyz(this), zzbyp.zzg);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhE)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzbyy zzbyyVar, zzbyw zzbywVar) {
        zzgap.zzr(this.zza, new zzbza(this, zzbyyVar, zzbywVar), zzbyp.zzg);
    }
}
