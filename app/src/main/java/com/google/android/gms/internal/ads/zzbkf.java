package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbkf extends zzaxb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbjz zzbjzVar, zzbke zzbkeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzbjzVar);
        zzaxd.zzf(zza, zzbkeVar);
        zzdb(2, zza);
    }
}
