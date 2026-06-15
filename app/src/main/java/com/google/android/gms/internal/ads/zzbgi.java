package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbgi extends zzaxc implements zzbgj {
    public zzbgi() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbgj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof zzbgj ? (zzbgj) queryLocalInterface : new zzbgh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.ads.internal.client.zzbx zzad = com.google.android.gms.ads.internal.client.zzbw.zzad(parcel.readStrongBinder());
            IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
            zzaxd.zzc(parcel);
            zze(zzad, Z);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
