package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbgd extends zzaxb implements zzbgf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zze(zzbfs zzbfsVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbfsVar);
        zzda(1, zza);
    }
}
