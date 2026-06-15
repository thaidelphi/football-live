package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbod;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzct extends zzaxb implements zzcv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzbod getAdapterCreator() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        zzbod zzf = zzboc.zzf(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzey getLiteSdkVersion() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        zzey zzeyVar = (zzey) zzaxd.zza(zzcZ, zzey.CREATOR);
        zzcZ.recycle();
        return zzeyVar;
    }
}
