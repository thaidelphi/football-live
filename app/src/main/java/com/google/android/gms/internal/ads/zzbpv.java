package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbpv extends zzaxc implements zzbpw {
    public zzbpv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzbos zzb = zzbor.zzb(parcel.readStrongBinder());
            zzaxd.zzc(parcel);
            zzg(zzb);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzaxd.zzc(parcel);
            zze(readString);
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
