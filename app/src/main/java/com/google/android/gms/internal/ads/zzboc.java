package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzboc extends zzaxc implements zzbod {
    public zzboc() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbod zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbod ? (zzbod) queryLocalInterface : new zzbob(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String readString = parcel.readString();
            zzaxd.zzc(parcel);
            zzbog zzb = zzb(readString);
            parcel2.writeNoException();
            zzaxd.zzf(parcel2, zzb);
        } else if (i10 == 2) {
            String readString2 = parcel.readString();
            zzaxd.zzc(parcel);
            boolean zze = zze(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
        } else if (i10 == 3) {
            String readString3 = parcel.readString();
            zzaxd.zzc(parcel);
            zzbqc zzc = zzc(readString3);
            parcel2.writeNoException();
            zzaxd.zzf(parcel2, zzc);
        } else if (i10 != 4) {
            return false;
        } else {
            String readString4 = parcel.readString();
            zzaxd.zzc(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzd ? 1 : 0);
        }
        return true;
    }
}
