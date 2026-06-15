package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfpt extends zzaxb implements zzfpv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpt(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfpv
    public final void zze(Bundle bundle, zzfpx zzfpxVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, bundle);
        zzaxd.zzf(zza, zzfpxVar);
        zzdb(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpv
    public final void zzf(String str, Bundle bundle, zzfpx zzfpxVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxd.zzd(zza, bundle);
        zzaxd.zzf(zza, zzfpxVar);
        zzdb(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpv
    public final void zzg(Bundle bundle, zzfpx zzfpxVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, bundle);
        zzaxd.zzf(zza, zzfpxVar);
        zzdb(3, zza);
    }
}
