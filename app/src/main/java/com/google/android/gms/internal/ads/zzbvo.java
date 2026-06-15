package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbvo extends zzaxc implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzg();
        } else if (i10 == 2) {
            int readInt = parcel.readInt();
            zzaxd.zzc(parcel);
            zze(readInt);
        } else if (i10 != 3) {
            return false;
        } else {
            zzaxd.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
