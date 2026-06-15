package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzcc extends zzaxb implements zzce {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(zzfq zzfqVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzfqVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(zzfq zzfqVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzfqVar);
        zzda(2, zza);
    }
}
