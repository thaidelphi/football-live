package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfna extends zzaxb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfna(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfmy zze(zzfmw zzfmwVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzfmwVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzfmy zzfmyVar = (zzfmy) zzaxd.zza(zzcZ, zzfmy.CREATOR);
        zzcZ.recycle();
        return zzfmyVar;
    }

    public final zzfnh zzf(zzfnf zzfnfVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzfnfVar);
        Parcel zzcZ = zzcZ(3, zza);
        zzfnh zzfnhVar = (zzfnh) zzaxd.zza(zzcZ, zzfnh.CREATOR);
        zzcZ.recycle();
        return zzfnhVar;
    }

    public final void zzg(zzfmt zzfmtVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzfmtVar);
        zzda(2, zza);
    }
}
