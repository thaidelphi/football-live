package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazf extends zzaxb implements zzazh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzb(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzd(zzaze zzazeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzazeVar);
        zzda(1, zza);
    }
}
