package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbxn;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzcn extends zzaxc implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzaxd.zza(parcel, zzr.CREATOR);
                String readString = parcel.readString();
                zzbod zzf = zzboc.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaxd.zzc(parcel);
                zzbx zzd = zzd(Z, zzrVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzaxd.zza(parcel, zzr.CREATOR);
                String readString2 = parcel.readString();
                zzbod zzf2 = zzboc.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzbx zze = zze(Z2, zzrVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper Z3 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbod zzf3 = zzboc.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzbt zzb = zzb(Z3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper Z4 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                IObjectWrapper Z5 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzbfc zzj = zzj(Z4, Z5);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzj);
                return true;
            case 6:
                IObjectWrapper Z6 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbod zzf4 = zzboc.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzbus zzo = zzo(Z6, zzf4, readInt4);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzo);
                return true;
            case 7:
                IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper Z7 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzbsd zzn = zzn(Z7);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzn);
                return true;
            case 9:
                IObjectWrapper Z8 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzcy zzh = zzh(Z8, readInt5);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzh);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzbx zzf5 = zzf(IObjectWrapper.Stub.Z(parcel.readStrongBinder()), (zzr) zzaxd.zza(parcel, zzr.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper Z9 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                IObjectWrapper Z10 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                IObjectWrapper Z11 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzbfi zzk = zzk(Z9, Z10, Z11);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzk);
                return true;
            case 12:
                IObjectWrapper Z12 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbod zzf6 = zzboc.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzbvi zzp = zzp(Z12, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzp);
                return true;
            case 13:
                IObjectWrapper Z13 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzaxd.zza(parcel, zzr.CREATOR);
                String readString6 = parcel.readString();
                zzbod zzf7 = zzboc.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzbx zzc = zzc(Z13, zzrVar3, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper Z14 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbod zzf8 = zzboc.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzbxn zzq = zzq(Z14, zzf8, readInt9);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzq);
                return true;
            case 15:
                IObjectWrapper Z15 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbod zzf9 = zzboc.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzbrw zzm = zzm(Z15, zzf9, readInt10);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzm);
                return true;
            case 16:
                IObjectWrapper Z16 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbod zzf10 = zzboc.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbjn zzc2 = zzbjm.zzc(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzbjq zzl = zzl(Z16, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzl);
                return true;
            case 17:
                IObjectWrapper Z17 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbod zzf11 = zzboc.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzdt zzi = zzi(Z17, zzf11, readInt12);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzi);
                return true;
            case 18:
                IObjectWrapper Z18 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbod zzf12 = zzboc.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzaxd.zzc(parcel);
                zzch zzg = zzg(Z18, zzf12, readInt13);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzg);
                return true;
            default:
                return false;
        }
    }
}
