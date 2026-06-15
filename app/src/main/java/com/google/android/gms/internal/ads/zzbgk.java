package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbgk extends zzaxb implements zzbgm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zze(zzbgs zzbgsVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbgsVar);
        zzda(1, zza);
    }
}
