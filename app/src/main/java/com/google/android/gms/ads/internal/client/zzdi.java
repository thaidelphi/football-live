package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzdi extends zzaxb implements zzdk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zze(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzeVar);
        zzda(1, zza);
    }
}
