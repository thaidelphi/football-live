package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbok extends zzaxb implements zzbom {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbok(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zze() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
