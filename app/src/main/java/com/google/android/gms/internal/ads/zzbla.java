package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbla extends zzaxc implements zzblb {
    public zzbla() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzble zzblcVar;
        if (i10 == 3) {
            com.google.android.gms.ads.internal.client.zzea zzb = zzb();
            parcel2.writeNoException();
            zzaxd.zzf(parcel2, zzb);
            return true;
        } else if (i10 == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        } else if (i10 == 5) {
            IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzblcVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzblcVar = queryLocalInterface instanceof zzble ? (zzble) queryLocalInterface : new zzblc(readStrongBinder);
            }
            zzaxd.zzc(parcel);
            zzf(Z, zzblcVar);
            parcel2.writeNoException();
            return true;
        } else if (i10 == 6) {
            IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
            zzaxd.zzc(parcel);
            zze(Z2);
            parcel2.writeNoException();
            return true;
        } else if (i10 != 7) {
            return false;
        } else {
            zzbev zzc = zzc();
            parcel2.writeNoException();
            zzaxd.zzf(parcel2, zzc);
            return true;
        }
    }
}
