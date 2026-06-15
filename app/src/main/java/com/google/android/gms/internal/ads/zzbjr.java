package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbjr extends zzaxb implements zzbjt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbjt
    public final zzbjq zze(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10, zzbjn zzbjnVar) throws RemoteException {
        zzbjq zzbjoVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        zzaxd.zzf(zza, zzbjnVar);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbjoVar = queryLocalInterface instanceof zzbjq ? (zzbjq) queryLocalInterface : new zzbjo(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbjoVar;
    }
}
