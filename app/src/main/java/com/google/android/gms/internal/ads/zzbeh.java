package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbeh extends zzaxb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbth zzbthVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbthVar);
        zzda(1, zza);
    }
}
