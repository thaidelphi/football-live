package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfns extends zzaxc implements zzfnt {
    public zzfns() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                parcel.readString();
                zzaxd.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzaxd.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzaxd.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzaxd.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzaxd.zzc(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzaxd.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
