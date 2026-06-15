package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbxl extends zzaxb implements zzbxn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, iObjectWrapper2);
        zza.writeString(str);
        zzaxd.zzf(zza, iObjectWrapper3);
        Parcel zzcZ = zzcZ(11, zza);
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzf(IObjectWrapper iObjectWrapper, zzbxr zzbxrVar, zzbxk zzbxkVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzbxrVar);
        zzaxd.zzf(zza, zzbxkVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzg(zzbsv zzbsvVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbss zzbssVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbss zzbssVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbss zzbssVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbss zzbssVar) throws RemoteException {
        throw null;
    }
}
