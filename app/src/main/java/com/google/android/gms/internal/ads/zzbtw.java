package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbtw extends zzaxb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzbbVar);
        zzda(2, zza);
    }

    public final void zzf(String str, zzbtn zzbtnVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxd.zzd(zza, zzbtnVar);
        zzda(1, zza);
    }
}
