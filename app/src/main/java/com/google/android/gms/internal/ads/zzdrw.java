package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdrw implements zzdrg {
    private final long zza;
    private final zzdrl zzb;
    private final zzezl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrw(long j10, Context context, zzdrl zzdrlVar, zzcfq zzcfqVar, String str) {
        this.zza = j10;
        this.zzb = zzdrlVar;
        zzezn zzw = zzcfqVar.zzw();
        zzw.zzb(context);
        zzw.zza(str);
        this.zzc = zzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdrg
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdrg
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzf(zzmVar, new zzdru(this));
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrg
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdrv(this));
            this.zzc.zzm(ObjectWrapper.u0(null));
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }
}
