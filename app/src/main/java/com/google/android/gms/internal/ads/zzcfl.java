package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzcfl extends zzaxc implements zzcfm {
    public zzcfl() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zzaxd.zzc(parcel);
                zzp((Bundle) zzaxd.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzaxd.zzc(parcel);
                Bundle zzd = zzd((Bundle) zzaxd.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzaxd.zze(parcel2, zzd);
                return true;
            case 3:
                zzaxd.zzc(parcel);
                zzo(parcel.readString(), parcel.readString(), (Bundle) zzaxd.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzt(readString, readString2, Z);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean zzg = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                Map zzk = zzk(readString3, readString4, zzg);
                parcel2.writeNoException();
                parcel2.writeMap(zzk);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzaxd.zzc(parcel);
                int zzb = zzb(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
            case 7:
                zzaxd.zzc(parcel);
                zzq((Bundle) zzaxd.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzaxd.zzc(parcel);
                zzm(parcel.readString(), parcel.readString(), (Bundle) zzaxd.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                zzaxd.zzc(parcel);
                List zzj = zzj(readString6, readString7);
                parcel2.writeNoException();
                parcel2.writeList(zzj);
                return true;
            case 10:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString8 = parcel.readString();
                zzaxd.zzc(parcel);
                zzl(readString8);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString9 = parcel.readString();
                zzaxd.zzc(parcel);
                zzn(readString9);
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                zzaxd.zzc(parcel);
                zzs(Z2, readString10, readString11);
                parcel2.writeNoException();
                return true;
            case 16:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 17:
                String zzg2 = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg2);
                return true;
            case 18:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 19:
                zzaxd.zzc(parcel);
                zzr((Bundle) zzaxd.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
