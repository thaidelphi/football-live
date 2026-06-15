package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbgq extends zzaxb implements zzbgs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzA() throws RemoteException {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, bundle);
        zzda(33, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzC(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, bundle);
        zzda(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzD() throws RemoteException {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzE(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzdcVar);
        zzda(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzF(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzdqVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzG(zzbgp zzbgpVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbgpVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzH() throws RemoteException {
        Parcel zzcZ = zzcZ(30, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzI() throws RemoteException {
        Parcel zzcZ = zzcZ(24, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, bundle);
        Parcel zzcZ = zzcZ(16, zza);
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final double zze() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final Bundle zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) zzaxd.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final com.google.android.gms.ads.internal.client.zzdx zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(31, zza());
        com.google.android.gms.ads.internal.client.zzdx zzb = com.google.android.gms.ads.internal.client.zzdw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzber zzi() throws RemoteException {
        zzber zzbepVar;
        Parcel zzcZ = zzcZ(14, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbepVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbepVar = queryLocalInterface instanceof zzber ? (zzber) queryLocalInterface : new zzbep(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbev zzj() throws RemoteException {
        zzbev zzbetVar;
        Parcel zzcZ = zzcZ(29, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbey zzk() throws RemoteException {
        zzbey zzbewVar;
        Parcel zzcZ = zzcZ(5, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final IObjectWrapper zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(19, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(18, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzo() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzs() throws RemoteException {
        Parcel zzcZ = zzcZ(10, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzt() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final List zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzb = zzaxd.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final List zzv() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        ArrayList zzb = zzaxd.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzw() throws RemoteException {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzx() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzy(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzdgVar);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, bundle);
        zzda(15, zza);
    }
}
