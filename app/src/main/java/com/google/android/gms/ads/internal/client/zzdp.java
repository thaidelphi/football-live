package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzdp extends zzaxc implements zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzdq ? (zzdq) queryLocalInterface : new zzdo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaxd.zzc(parcel);
            zze((zzt) zzaxd.zza(parcel, zzt.CREATOR));
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i12 = zzaxd.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
