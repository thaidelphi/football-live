package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbtt extends zzaxb implements zzbtv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzbbVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, parcelFileDescriptor);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbud zzbudVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, parcelFileDescriptor);
        zzaxd.zzd(zza, zzbudVar);
        zzda(3, zza);
    }
}
