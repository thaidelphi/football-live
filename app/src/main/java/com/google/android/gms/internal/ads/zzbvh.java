package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbvh extends zzaxc implements zzbvi {
    public zzbvh() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbvi zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbvi ? (zzbvi) queryLocalInterface : new zzbvg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbvp zzbvpVar = null;
        zzbvp zzbvpVar2 = null;
        zzbvq zzbvqVar = null;
        zzbvl zzbvlVar = null;
        switch (i10) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvpVar = queryLocalInterface instanceof zzbvp ? (zzbvp) queryLocalInterface : new zzbvn(readStrongBinder);
                }
                zzaxd.zzc(parcel);
                zzf(zzmVar, zzbvpVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbvlVar = queryLocalInterface2 instanceof zzbvl ? (zzbvl) queryLocalInterface2 : new zzbvj(readStrongBinder2);
                }
                zzaxd.zzc(parcel);
                zzk(zzbvlVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i12 = zzaxd.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzm(Z);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbvqVar = queryLocalInterface3 instanceof zzbvq ? (zzbvq) queryLocalInterface3 : new zzbvq(readStrongBinder3);
                }
                zzaxd.zzc(parcel);
                zzp(zzbvqVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzaxd.zzc(parcel);
                zzl((zzbvw) zzaxd.zza(parcel, zzbvw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzaxd.zze(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                boolean zzg = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                zzn(Z2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvf zzd = zzd();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdx zzc = zzc();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq zzb3 = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvpVar2 = queryLocalInterface4 instanceof zzbvp ? (zzbvp) queryLocalInterface4 : new zzbvn(readStrongBinder4);
                }
                zzaxd.zzc(parcel);
                zzg(zzmVar2, zzbvpVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
