package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzblf extends zzaxb implements zzblh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final void zze(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final void zzg(zzblb zzblbVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzblbVar);
        zzda(1, zza);
    }
}
