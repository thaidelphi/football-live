package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbvj extends zzaxb implements zzbvl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zze() throws RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzf() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzg() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzh(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzeVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzj() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzk(zzbvf zzbvfVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbvfVar);
        zzda(3, zza);
    }
}
