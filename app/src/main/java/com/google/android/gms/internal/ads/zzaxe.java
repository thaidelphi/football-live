package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaxe extends zzaxb implements zzaxg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzaxg
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxg
    public final void zzf() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaxg
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxg
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxg
    public final void zzi(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxg
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzda(5, zza);
    }
}
