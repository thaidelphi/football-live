package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbfq extends zzaxb implements zzbfs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final com.google.android.gms.ads.internal.client.zzea zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final zzbev zzf() throws RemoteException {
        zzbev zzbetVar;
        Parcel zzcZ = zzcZ(16, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbetVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbetVar = queryLocalInterface instanceof zzbev ? (zzbev) queryLocalInterface : new zzbet(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final zzbey zzg(String str) throws RemoteException {
        zzbey zzbewVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbewVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbewVar = queryLocalInterface instanceof zzbey ? (zzbey) queryLocalInterface : new zzbew(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final IObjectWrapper zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final String zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final String zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(1, zza);
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final List zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList<String> createStringArrayList = zzcZ.createStringArrayList();
        zzcZ.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzm() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzo() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final boolean zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(10, zza);
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final boolean zzt() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
