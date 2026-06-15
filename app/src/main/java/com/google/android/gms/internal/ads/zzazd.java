package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzazd extends zzaxc implements zzaze {
    public zzazd() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzaze zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return queryLocalInterface instanceof zzaze ? (zzaze) queryLocalInterface : new zzazc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzazl zzazjVar;
        switch (i10) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbx zze = zze();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzazi) {
                        zzazi zzaziVar = (zzazi) queryLocalInterface;
                    }
                }
                zzaxd.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzazjVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzazjVar = queryLocalInterface2 instanceof zzazl ? (zzazl) queryLocalInterface2 : new zzazj(readStrongBinder2);
                }
                zzaxd.zzc(parcel);
                zzi(Z, zzazjVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdx zzf = zzf();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzf);
                return true;
            case 6:
                boolean zzg = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                zzg(zzg);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzh(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
