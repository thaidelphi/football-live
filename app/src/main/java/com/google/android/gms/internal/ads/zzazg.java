package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzazg extends zzaxc implements zzazh {
    public zzazg() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzazh zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzazh ? (zzazh) queryLocalInterface : new zzazf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzaze zzazcVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzazcVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzazcVar = queryLocalInterface instanceof zzaze ? (zzaze) queryLocalInterface : new zzazc(readStrongBinder);
            }
            zzaxd.zzc(parcel);
            zzd(zzazcVar);
        } else if (i10 == 2) {
            parcel.readInt();
            zzaxd.zzc(parcel);
        } else if (i10 != 3) {
            return false;
        } else {
            zzaxd.zzc(parcel);
            zzc((com.google.android.gms.ads.internal.client.zze) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
