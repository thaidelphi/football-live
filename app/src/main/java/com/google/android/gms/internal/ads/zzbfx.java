package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbfx extends zzaxb implements zzbfz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final void zze(zzbfp zzbfpVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbfpVar);
        zzda(1, zza);
    }
}
