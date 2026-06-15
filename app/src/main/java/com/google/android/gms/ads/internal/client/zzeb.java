package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzeb extends zzaxb implements zzed {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaxd.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzh() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzi() throws RemoteException {
        zzda(1, zza());
    }
}
