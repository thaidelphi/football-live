package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzbq extends zzaxc implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzaxd.zzc(parcel);
            boolean zzf = zzf(Z, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        } else if (i10 == 2) {
            IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
            zzaxd.zzc(parcel);
            zze(Z2);
            parcel2.writeNoException();
        } else if (i10 != 3) {
            return false;
        } else {
            zzaxd.zzc(parcel);
            boolean zzg = zzg(IObjectWrapper.Stub.Z(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.offline.buffering.zza) zzaxd.zza(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR));
            parcel2.writeNoException();
            parcel2.writeInt(zzg ? 1 : 0);
        }
        return true;
    }
}
