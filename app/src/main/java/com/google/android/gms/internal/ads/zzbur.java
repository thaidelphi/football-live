package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbur extends zzaxc implements zzbus {
    public zzbur() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaxd.zzc(parcel);
            zzg((zzbuw) zzaxd.zza(parcel, zzbuw.CREATOR));
            parcel2.writeNoException();
        } else if (i10 != 2) {
            zzbuv zzbuvVar = null;
            zzbuq zzbuqVar = null;
            if (i10 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbuvVar = queryLocalInterface instanceof zzbuv ? (zzbuv) queryLocalInterface : new zzbut(readStrongBinder);
                }
                zzaxd.zzc(parcel);
                zzo(zzbuvVar);
                parcel2.writeNoException();
            } else if (i10 != 34) {
                switch (i10) {
                    case 5:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        int i12 = zzaxd.zza;
                        parcel2.writeInt(zzs ? 1 : 0);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                        zzaxd.zzc(parcel);
                        zzi(Z);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                        zzaxd.zzc(parcel);
                        zzk(Z2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        IObjectWrapper Z3 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                        zzaxd.zzc(parcel);
                        zzf(Z3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(zzd);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzaxd.zzc(parcel);
                        zzp(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzcb zzb = com.google.android.gms.ads.internal.client.zzca.zzb(parcel.readStrongBinder());
                        zzaxd.zzc(parcel);
                        zzl(zzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzb2 = zzb();
                        parcel2.writeNoException();
                        zzaxd.zze(parcel2, zzb2);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzbuqVar = queryLocalInterface2 instanceof zzbuq ? (zzbuq) queryLocalInterface2 : new zzbuq(readStrongBinder2);
                        }
                        zzaxd.zzc(parcel);
                        zzu(zzbuqVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzaxd.zzc(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        IObjectWrapper Z4 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                        zzaxd.zzc(parcel);
                        zzr(Z4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzaxd.zzc(parcel);
                        zzm(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzt = zzt();
                        parcel2.writeNoException();
                        int i13 = zzaxd.zza;
                        parcel2.writeInt(zzt ? 1 : 0);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdx zzc = zzc();
                        parcel2.writeNoException();
                        zzaxd.zzf(parcel2, zzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zzg = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                zzn(zzg);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }
}
