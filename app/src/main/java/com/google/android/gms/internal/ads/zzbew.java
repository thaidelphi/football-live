package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbew extends zzaxb implements zzbey {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final double zzb() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final int zzc() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final int zzd() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final Uri zze() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzaxd.zza(zzcZ, Uri.CREATOR);
        zzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }
}
