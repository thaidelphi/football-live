package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzboo extends zzaxb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(15, zza());
        Bundle bundle = (Bundle) zzaxd.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(17, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzber zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(19, zza());
        zzber zzj = zzbeq.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final zzbey zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        zzbey zzg = zzbex.zzg(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzg;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(18, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(20, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    public final IObjectWrapper zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(21, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    public final String zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final List zzr() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzb = zzaxd.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(11, zza);
    }

    public final void zzt() throws RemoteException {
        zzda(10, zza());
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(12, zza);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, iObjectWrapper2);
        zzaxd.zzf(zza, iObjectWrapper3);
        zzda(22, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(16, zza);
    }

    public final boolean zzx() throws RemoteException {
        Parcel zzcZ = zzcZ(14, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzy() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
