package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbtp extends zzaxb implements zzbtr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zze(zzbud zzbudVar, zzbtv zzbtvVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzbudVar);
        zzaxd.zzf(zza, zzbtvVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zzf(zzbud zzbudVar, zzbtv zzbtvVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzbudVar);
        zzaxd.zzf(zza, zzbtvVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zzg(zzbud zzbudVar, zzbtv zzbtvVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzbudVar);
        zzaxd.zzf(zza, zzbtvVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zzh(String str, zzbtv zzbtvVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxd.zzf(zza, zzbtvVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtr
    public final void zzi(zzbtn zzbtnVar, zzbtw zzbtwVar) throws RemoteException {
        throw null;
    }
}
