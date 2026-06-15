package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbet extends zzaxb implements zzbev {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbet(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final float zze() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final float zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final float zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final IObjectWrapper zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(10, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void zzm(zzbgg zzbggVar) throws RemoteException {
        throw null;
    }
}
