package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbuq extends zzaxb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbup zzbupVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbupVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}
