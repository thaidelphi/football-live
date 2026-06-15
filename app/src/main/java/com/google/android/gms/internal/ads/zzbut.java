package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbut extends zzaxb implements zzbuv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbut(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zze(zzbup zzbupVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbupVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzf() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzh() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzi() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzj() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzl() throws RemoteException {
        zzda(3, zza());
    }
}
