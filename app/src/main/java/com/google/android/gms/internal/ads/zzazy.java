package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazy extends zzaxb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzazw zzazwVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzazwVar);
        Parcel zzcZ = zzcZ(3, zza);
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    public final zzazt zzf(zzazw zzazwVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzazwVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzazt zzaztVar = (zzazt) zzaxd.zza(zzcZ, zzazt.CREATOR);
        zzcZ.recycle();
        return zzaztVar;
    }

    public final zzazt zzg(zzazw zzazwVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzazwVar);
        Parcel zzcZ = zzcZ(2, zza);
        zzazt zzaztVar = (zzazt) zzaxd.zza(zzcZ, zzazt.CREATOR);
        zzcZ.recycle();
        return zzaztVar;
    }
}
