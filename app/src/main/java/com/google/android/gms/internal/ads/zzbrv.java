package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbrv extends zzaxc implements zzbrw {
    public zzbrv() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbrw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbrw ? (zzbrw) queryLocalInterface : new zzbru(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zzaxd.zzc(parcel);
                zze((Intent) zzaxd.zza(parcel, Intent.CREATOR));
                break;
            case 2:
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzaxd.zzc(parcel);
                zzi(Z, readString, readString2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzg(Z2);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                IObjectWrapper Z3 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzf(createStringArray, createIntArray, Z3);
                break;
            case 6:
                zzaxd.zzc(parcel);
                zzj(IObjectWrapper.Stub.Z(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.offline.buffering.zza) zzaxd.zza(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
