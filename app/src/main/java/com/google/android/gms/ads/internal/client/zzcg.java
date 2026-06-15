package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaze;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbvi;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzcg extends zzaxc implements zzch {
    public zzcg() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzce zzccVar;
        switch (i10) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzfq.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzccVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzccVar = queryLocalInterface instanceof zzce ? (zzce) queryLocalInterface : new zzcc(readStrongBinder);
                }
                zzaxd.zzc(parcel);
                zzi(createTypedArrayList, zzccVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                zzaxd.zzc(parcel);
                boolean zzl = zzl(readString);
                parcel2.writeNoException();
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                zzaxd.zzc(parcel);
                zzbvi zzg = zzg(readString2);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzg);
                return true;
            case 4:
                String readString3 = parcel.readString();
                zzaxd.zzc(parcel);
                boolean zzj = zzj(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zzj ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                zzaxd.zzc(parcel);
                zzaze zze = zze(readString4);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zze);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzaxd.zzc(parcel);
                boolean zzk = zzk(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                zzaxd.zzc(parcel);
                zzbx zzf = zzf(readString6);
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzf);
                return true;
            case 8:
                zzbod zzf2 = zzboc.zzf(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzh(zzf2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
