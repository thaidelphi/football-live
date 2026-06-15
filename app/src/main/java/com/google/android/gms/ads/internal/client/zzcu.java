package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbod;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzcu extends zzaxc implements zzcv {
    public zzcu() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcv asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcv ? (zzcv) queryLocalInterface : new zzct(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzey liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzaxd.zze(parcel2, liteSdkVersion);
        } else if (i10 != 2) {
            return false;
        } else {
            zzbod adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzaxd.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
