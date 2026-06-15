package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbcf extends zzaxb implements zzbch {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbch
    public final void zze(zzbce zzbceVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbceVar);
        zzda(1, zza);
    }
}
