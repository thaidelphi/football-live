package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbrx extends zzaxb implements zzbrz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbrz
    public final zzbrw zze(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) throws RemoteException {
        zzbrw zzbruVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbruVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbruVar = queryLocalInterface instanceof zzbrw ? (zzbrw) queryLocalInterface : new zzbru(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbruVar;
    }
}
