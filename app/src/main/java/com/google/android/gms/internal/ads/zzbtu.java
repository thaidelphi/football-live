package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbtu extends zzaxc implements zzbtv {
    public zzbtu() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaxd.zzc(parcel);
            zzf((ParcelFileDescriptor) zzaxd.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i10 == 2) {
            zzaxd.zzc(parcel);
            zze((com.google.android.gms.ads.internal.util.zzbb) zzaxd.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            zzaxd.zzc(parcel);
            zzg((ParcelFileDescriptor) zzaxd.zza(parcel, ParcelFileDescriptor.CREATOR), (zzbud) zzaxd.zza(parcel, zzbud.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
