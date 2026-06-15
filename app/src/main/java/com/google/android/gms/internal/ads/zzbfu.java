package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbfu extends zzaxb implements zzbfw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zze(zzbfn zzbfnVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbfnVar);
        zzda(1, zza);
    }
}
