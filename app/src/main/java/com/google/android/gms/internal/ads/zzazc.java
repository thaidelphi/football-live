package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazc extends zzaxb implements zzaze {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final com.google.android.gms.ads.internal.client.zzdx zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzdx zzb = com.google.android.gms.ads.internal.client.zzdw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final void zzg(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaxd.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final void zzh(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzdqVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final void zzi(IObjectWrapper iObjectWrapper, zzazl zzazlVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzazlVar);
        zzda(4, zza);
    }
}
