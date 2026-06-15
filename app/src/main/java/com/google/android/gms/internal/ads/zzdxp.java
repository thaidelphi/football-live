package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdxp implements zzgal {
    final /* synthetic */ zzbtn zza;
    final /* synthetic */ zzbtw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxp(zzdxv zzdxvVar, zzbtw zzbtwVar, zzbtn zzbtnVar) {
        this.zzb = zzbtwVar;
        this.zza = zzbtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        try {
            this.zzb.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zzf((String) obj, this.zza);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e8);
        }
    }
}
