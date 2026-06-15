package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzqv implements zzqy {
    @Override // com.google.android.gms.internal.ads.zzqy
    public final int zza(zzz zzzVar) {
        return zzzVar.zzs != null ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final /* synthetic */ zzqx zzb(zzqt zzqtVar, zzz zzzVar) {
        return zzqx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final zzqz zzc(zzqt zzqtVar, zzz zzzVar) {
        if (zzzVar.zzs == null) {
            return null;
        }
        return new zzqz(new zzqr(new zzrb(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }
}
