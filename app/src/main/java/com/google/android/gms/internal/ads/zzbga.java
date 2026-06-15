package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbga extends zzaxb implements zzbgc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zze(zzbfs zzbfsVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbfsVar);
        zza.writeString(str);
        zzda(1, zza);
    }
}
