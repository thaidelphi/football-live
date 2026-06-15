package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbxo extends zzaxb implements zzbxq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final zzbxn zze(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) throws RemoteException {
        zzbxn zzbxlVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbxlVar = queryLocalInterface instanceof zzbxn ? (zzbxn) queryLocalInterface : new zzbxl(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbxlVar;
    }
}
