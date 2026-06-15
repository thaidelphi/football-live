package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbo extends zzaxb implements zzbq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzmVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzm zzmVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzmVar);
        zza.writeInt(i10);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final boolean zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
