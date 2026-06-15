package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbuv;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbv extends zzaxb implements zzbx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzA() throws RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzB() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbhVar);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(zzbk zzbkVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbkVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(zzcb zzcbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzF(zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzrVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(zzcl zzclVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzclVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzazh zzazhVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzazhVar);
        zzda(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzcsVar);
        zzda(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(zzee zzeeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzL(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaxd.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzda(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzM(zzbsm zzbsmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzN(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaxd.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzO(zzbch zzbchVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzdqVar);
        zzda(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(zzbsp zzbspVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(zzbuv zzbuvVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzU(zzfx zzfxVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzfxVar);
        zzda(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzW(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzX() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzY() throws RemoteException {
        Parcel zzcZ = zzcZ(46, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzZ() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzaa() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzab(zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzmVar);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzac(zzcp zzcpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzr zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        zzr zzrVar = (zzr) zzaxd.zza(zzcZ, zzr.CREATOR);
        zzcZ.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzbk zzi() throws RemoteException {
        zzbk zzbiVar;
        Parcel zzcZ = zzcZ(33, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbiVar = queryLocalInterface instanceof zzbk ? (zzbk) queryLocalInterface : new zzbi(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzcl zzj() throws RemoteException {
        zzcl zzcjVar;
        Parcel zzcZ = zzcZ(32, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcjVar = queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcj(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzdx zzk() throws RemoteException {
        zzdx zzdvVar;
        Parcel zzcZ = zzcZ(41, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzdvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdvVar = queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzdvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzea zzl() throws RemoteException {
        zzea zzdyVar;
        Parcel zzcZ = zzcZ(26, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdyVar = queryLocalInterface instanceof zzea ? (zzea) queryLocalInterface : new zzdy(readStrongBinder);
        }
        zzcZ.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzr() throws RemoteException {
        Parcel zzcZ = zzcZ(31, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzx() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(zzm zzmVar, zzbn zzbnVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, zzbnVar);
        zzda(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz() throws RemoteException {
        zzda(5, zza());
    }
}
