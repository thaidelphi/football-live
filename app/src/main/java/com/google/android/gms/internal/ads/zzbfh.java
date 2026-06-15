package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbfh extends zzaxc implements zzbfi {
    public zzbfh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbfi zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof zzbfi ? (zzbfi) queryLocalInterface : new zzbfg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
            zzaxd.zzc(parcel);
            zzc(Z);
        } else if (i10 == 2) {
            zzd();
        } else if (i10 != 3) {
            return false;
        } else {
            IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
            zzaxd.zzc(parcel);
            zzb(Z2);
        }
        parcel2.writeNoException();
        return true;
    }
}
