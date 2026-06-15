package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbod;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzcx extends zzaxc implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzdk zzdiVar;
        switch (i10) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                zzaxd.zzc(parcel);
                zzq(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                zzaxd.zzc(parcel);
                zzr(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzg = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                zzp(zzg);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzaxd.zzc(parcel);
                zzn(Z, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzl(readString3, Z2);
                parcel2.writeNoException();
                return true;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzv = zzv();
                parcel2.writeNoException();
                int i12 = zzaxd.zza;
                parcel2.writeInt(zzv ? 1 : 0);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzaxd.zzc(parcel);
                zzh(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbod zzf2 = zzboc.zzf(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzo(zzf2);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbkt zzc = zzbks.zzc(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzs(zzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List zzg2 = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg2);
                return true;
            case 14:
                zzaxd.zzc(parcel);
                zzu((zzfs) zzaxd.zza(parcel, zzfs.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdiVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdiVar = queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdi(readStrongBinder);
                }
                zzaxd.zzc(parcel);
                zzm(zzdiVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zzg3 = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                zzj(zzg3);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                zzaxd.zzc(parcel);
                zzt(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
