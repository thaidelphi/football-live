package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbqa extends zzaxb implements zzbqc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final com.google.android.gms.ads.internal.client.zzea zze() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final zzbqr zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        zzbqr zzbqrVar = (zzbqr) zzaxd.zza(zzcZ, zzbqr.CREATOR);
        zzcZ.recycle();
        return zzbqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final zzbqr zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        zzbqr zzbqrVar = (zzbqr) zzaxd.zza(zzcZ, zzbqr.CREATOR);
        zzcZ.recycle();
        return zzbqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbqf zzbqfVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaxd.zzd(zza, bundle);
        zzaxd.zzd(zza, bundle2);
        zzaxd.zzd(zza, zzrVar);
        zzaxd.zzf(zza, zzbqfVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbpnVar);
        zzaxd.zzf(zza, zzbojVar);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, zzboj zzbojVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbpqVar);
        zzaxd.zzf(zza, zzbojVar);
        zzaxd.zzd(zza, zzrVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, zzboj zzbojVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbpqVar);
        zzaxd.zzf(zza, zzbojVar);
        zzaxd.zzd(zza, zzrVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbpt zzbptVar, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbptVar);
        zzaxd.zzf(zza, zzbojVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbpw zzbpwVar, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbpwVar);
        zzaxd.zzf(zza, zzbojVar);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbpw zzbpwVar, zzboj zzbojVar, zzben zzbenVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbpwVar);
        zzaxd.zzf(zza, zzbojVar);
        zzaxd.zzd(zza, zzbenVar);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbpzVar);
        zzaxd.zzf(zza, zzbojVar);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzboj zzbojVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxd.zzd(zza, zzmVar);
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbpzVar);
        zzaxd.zzf(zza, zzbojVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(24, zza);
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(15, zza);
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
