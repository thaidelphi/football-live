package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzbp extends zzaxc implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaxd.zzc(parcel);
            zzg((zzm) zzaxd.zza(parcel, zzm.CREATOR));
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i10 == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            int i12 = zzaxd.zza;
            parcel2.writeInt(zzi ? 1 : 0);
        } else if (i10 == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i10 != 5) {
            return false;
        } else {
            int readInt = parcel.readInt();
            zzaxd.zzc(parcel);
            zzh((zzm) zzaxd.zza(parcel, zzm.CREATOR), readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
