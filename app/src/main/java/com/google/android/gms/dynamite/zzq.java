package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzq extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int Z(IObjectWrapper iObjectWrapper, String str, boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int t0(IObjectWrapper iObjectWrapper, String str, boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper u0(IObjectWrapper iObjectWrapper, String str, int i10) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzB.readStrongBinder());
        zzB.recycle();
        return Z;
    }

    public final IObjectWrapper v0(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, iObjectWrapper2);
        Parcel zzB = zzB(8, zza);
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzB.readStrongBinder());
        zzB.recycle();
        return Z;
    }

    public final IObjectWrapper w0(IObjectWrapper iObjectWrapper, String str, int i10) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzB.readStrongBinder());
        zzB.recycle();
        return Z;
    }

    public final IObjectWrapper x0(IObjectWrapper iObjectWrapper, String str, boolean z10, long j10) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzB.readStrongBinder());
        zzB.recycle();
        return Z;
    }

    public final int zze() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
