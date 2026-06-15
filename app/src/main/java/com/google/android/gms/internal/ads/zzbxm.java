package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbxm extends zzaxc implements zzbxn {
    public zzbxm() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbxn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzbxn ? (zzbxn) queryLocalInterface : new zzbxl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbxk zzbxkVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbxr zzbxrVar = (zzbxr) zzaxd.zza(parcel, zzbxr.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbxkVar = queryLocalInterface instanceof zzbxk ? (zzbxk) queryLocalInterface : new zzbxi(readStrongBinder);
                }
                zzaxd.zzc(parcel);
                zzf(Z, zzbxrVar, zzbxkVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzk(Z2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper Z3 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbss zzb = zzbsr.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzm(createTypedArrayList, Z3, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper Z4 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbss zzb2 = zzbsr.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzl(createTypedArrayList2, Z4, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzaxd.zzc(parcel);
                zzg((zzbsv) zzaxd.zza(parcel, zzbsv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper Z5 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzj(Z5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper Z6 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbss zzb3 = zzbsr.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzi(createTypedArrayList3, Z6, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper Z7 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbss zzb4 = zzbsr.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzh(createTypedArrayList4, Z7, zzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper Z8 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                IObjectWrapper Z9 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                String readString = parcel.readString();
                IObjectWrapper Z10 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                IObjectWrapper zze = zze(Z8, Z9, readString, Z10);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zze);
                return true;
            default:
                return false;
        }
    }
}
