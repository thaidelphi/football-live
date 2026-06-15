package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbxj extends zzaxc implements zzbxk {
    public zzbxj() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            zzaxd.zzc(parcel);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzaxd.zzc(parcel);
            zzb(readString);
        } else if (i10 != 3) {
            return false;
        } else {
            zzaxd.zzc(parcel);
            zzc(parcel.readString(), parcel.readString(), (Bundle) zzaxd.zza(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
