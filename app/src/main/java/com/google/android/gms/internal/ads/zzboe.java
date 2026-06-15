package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzboe extends zzaxb implements zzbog {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzmVar);
        zza.writeString(str);
        zzaxd.zzf(zza, zzbojVar);
        zzda(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzmVar);
        zza.writeString(str);
        zzaxd.zzf(zza, zzbojVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzE() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzF() throws RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzG(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaxd.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzI() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzL() throws RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final boolean zzM() throws RemoteException {
        Parcel zzcZ = zzcZ(22, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final boolean zzN() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzboo zzO() throws RemoteException {
        zzboo zzbooVar;
        Parcel zzcZ = zzcZ(15, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbooVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbooVar = queryLocalInterface instanceof zzboo ? (zzboo) queryLocalInterface : new zzboo(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbop zzP() throws RemoteException {
        zzbop zzbopVar;
        Parcel zzcZ = zzcZ(16, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbopVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbopVar = queryLocalInterface instanceof zzbop ? (zzbop) queryLocalInterface : new zzbop(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(26, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbfs zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbom zzj() throws RemoteException {
        zzbom zzbokVar;
        Parcel zzcZ = zzcZ(36, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbokVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbokVar = queryLocalInterface instanceof zzbom ? (zzbom) queryLocalInterface : new zzbok(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbos zzk() throws RemoteException {
        zzbos zzboqVar;
        Parcel zzcZ = zzcZ(27, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzboqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzboqVar = queryLocalInterface instanceof zzbos ? (zzbos) queryLocalInterface : new zzboq(readStrongBinder);
        }
        zzcZ.recycle();
        return zzboqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbqr zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(33, zza());
        zzbqr zzbqrVar = (zzbqr) zzaxd.zza(zzcZ, zzbqr.CREATOR);
        zzcZ.recycle();
        return zzbqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbqr zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(34, zza());
        zzbqr zzbqrVar = (zzbqr) zzaxd.zza(zzcZ, zzbqr.CREATOR);
        zzcZ.recycle();
        return zzbqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        IObjectWrapper Z = IObjectWrapper.Stub.Z(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzo() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbva zzbvaVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzmVar);
        zza.writeString(null);
        zzaxd.zzf(zza, zzbvaVar);
        zza.writeString(str2);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzq(IObjectWrapper iObjectWrapper, zzbkq zzbkqVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbkqVar);
        zza.writeTypedList(list);
        zzda(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzr(IObjectWrapper iObjectWrapper, zzbva zzbvaVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbvaVar);
        zza.writeStringList(list);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzmVar);
        zza.writeString(str);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzmVar);
        zza.writeString(str);
        zzaxd.zzf(zza, zzbojVar);
        zzda(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzrVar);
        zzaxd.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzf(zza, zzbojVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzrVar);
        zzaxd.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzf(zza, zzbojVar);
        zzda(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzf(zza, zzbojVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzboj zzbojVar, zzben zzbenVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzf(zza, zzbojVar);
        zzaxd.zzd(zza, zzbenVar);
        zza.writeStringList(list);
        zzda(14, zza);
    }
}
