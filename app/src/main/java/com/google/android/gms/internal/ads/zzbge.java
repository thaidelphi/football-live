package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbge extends zzaxc implements zzbgf {
    public zzbge() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static zzbgf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return queryLocalInterface instanceof zzbgf ? (zzbgf) queryLocalInterface : new zzbgd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbfs zzbfqVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbfqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                zzbfqVar = queryLocalInterface instanceof zzbfs ? (zzbfs) queryLocalInterface : new zzbfq(readStrongBinder);
            }
            zzaxd.zzc(parcel);
            zze(zzbfqVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
