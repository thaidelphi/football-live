package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdrs implements zzdrg {
    private final long zza;
    private final zzeja zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrs(long j10, Context context, zzdrl zzdrlVar, zzcfq zzcfqVar, String str) {
        this.zza = j10;
        zzexz zzv = zzcfqVar.zzv();
        zzv.zzc(context);
        zzv.zza(new com.google.android.gms.ads.internal.client.zzr());
        zzv.zzb(str);
        zzeja zza = zzv.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdrr(this, zzdrlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdrg
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdrg
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrg
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.u0(null));
    }
}
