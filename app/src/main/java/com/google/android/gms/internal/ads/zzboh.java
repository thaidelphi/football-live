package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzboh extends zzaxb implements zzboj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzeVar);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzi(int i10, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeString(str);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzj(int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzeVar);
        zzda(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzm() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzn() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzo() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzp() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzr(zzbfs zzbfsVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbfsVar);
        zza.writeString(str);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzs(zzbvb zzbvbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzt(zzbvf zzbvfVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbvfVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzu() throws RemoteException {
        zzda(25, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzv() throws RemoteException {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzw() throws RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzx() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzy() throws RemoteException {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzz() throws RemoteException {
        zzda(13, zza());
    }
}
