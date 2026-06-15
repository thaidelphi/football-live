package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzr extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper Z(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, iObjectWrapper2);
        Parcel zzB = zzB(2, zza);
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzB.readStrongBinder());
        zzB.recycle();
        return Z;
    }

    public final IObjectWrapper t0(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, iObjectWrapper2);
        Parcel zzB = zzB(3, zza);
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzB.readStrongBinder());
        zzB.recycle();
        return Z;
    }
}
