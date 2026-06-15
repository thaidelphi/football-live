package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzcho implements zzdri {
    private final Long zza;
    private final String zzb;
    private final zzcha zzc;
    private final zzchq zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcho(zzcha zzchaVar, zzchq zzchqVar, Long l10, String str, zzcie zzcieVar) {
        this.zzc = zzchaVar;
        this.zzd = zzchqVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdri
    public final zzdrs zza() {
        Context context;
        zzdrl zzc;
        zzchq zzchqVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzchqVar.zza;
        zzc = zzdrm.zzc(zzchqVar.zzb);
        return zzdrt.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdri
    public final zzdrw zzb() {
        Context context;
        zzdrl zzc;
        zzchq zzchqVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzchqVar.zza;
        zzc = zzdrm.zzc(zzchqVar.zzb);
        return zzdrx.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
