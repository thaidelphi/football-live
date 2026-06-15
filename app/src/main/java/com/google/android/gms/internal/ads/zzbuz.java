package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbuz extends zzaxc implements zzbva {
    public zzbuz() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbva zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzbva ? (zzbva) queryLocalInterface : new zzbuy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzl(Z);
                break;
            case 2:
                IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaxd.zzc(parcel);
                zzk(Z2, readInt);
                break;
            case 3:
                IObjectWrapper Z3 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzi(Z3);
                break;
            case 4:
                IObjectWrapper Z4 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzj(Z4);
                break;
            case 5:
                IObjectWrapper Z5 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzp(Z5);
                break;
            case 6:
                IObjectWrapper Z6 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzf(Z6);
                break;
            case 7:
                zzaxd.zzc(parcel);
                zzm(IObjectWrapper.Stub.Z(parcel.readStrongBinder()), (zzbvb) zzaxd.zza(parcel, zzbvb.CREATOR));
                break;
            case 8:
                IObjectWrapper Z7 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zze(Z7);
                break;
            case 9:
                IObjectWrapper Z8 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzg(Z8, readInt2);
                break;
            case 10:
                IObjectWrapper Z9 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzh(Z9);
                break;
            case 11:
                IObjectWrapper Z10 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzo(Z10);
                break;
            case 12:
                Bundle bundle = (Bundle) zzaxd.zza(parcel, Bundle.CREATOR);
                zzaxd.zzc(parcel);
                break;
            case 13:
                IObjectWrapper Z11 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzn(Z11);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
