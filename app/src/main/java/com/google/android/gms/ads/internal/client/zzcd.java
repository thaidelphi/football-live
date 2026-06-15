package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzcd extends zzaxc implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaxd.zzc(parcel);
            zze((zzfq) zzaxd.zza(parcel, zzfq.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            zzaxd.zzc(parcel);
            zzf((zzfq) zzaxd.zza(parcel, zzfq.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
