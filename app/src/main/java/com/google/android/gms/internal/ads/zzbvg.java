package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbvg extends zzaxb implements zzbvi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final Bundle zzb() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzaxd.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final com.google.android.gms.ads.internal.client.zzdx zzc() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzdx zzb = com.google.android.gms.ads.internal.client.zzdw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvf zzd() throws RemoteException {
        zzbvf zzbvdVar;
        Parcel zzcZ = zzcZ(11, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbvdVar = queryLocalInterface instanceof zzbvf ? (zzbvf) queryLocalInterface : new zzbvd(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, zzbvpVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, zzbvpVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaxd.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzdnVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzdqVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk(zzbvl zzbvlVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbvlVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzl(zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzbvwVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzp(zzbvq zzbvqVar) throws RemoteException {
        throw null;
    }
}
