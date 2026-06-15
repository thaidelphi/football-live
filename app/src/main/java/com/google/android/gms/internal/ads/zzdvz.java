package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdvz implements zzgal {
    final /* synthetic */ Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvz(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        if (((Boolean) zzbde.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzba)) {
            zzbaw.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdws zzdwsVar = (zzdws) obj;
        if (((Boolean) zzbde.zzj.zze()).booleanValue()) {
            zzbaw.zze(this.zza);
        }
    }
}
