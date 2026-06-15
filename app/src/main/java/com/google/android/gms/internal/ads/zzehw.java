package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzehw extends com.google.android.gms.ads.internal.client.zzbp {
    private final zzejd zza;

    public zzehw(Context context, zzcfq zzcfqVar, zzfan zzfanVar, zzdhc zzdhcVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        zzejf zzejfVar = new zzejf(zzdhcVar, zzcfqVar.zzj());
        zzejfVar.zze(zzbkVar);
        this.zza = new zzejd(new zzejp(zzcfqVar, context, zzejfVar, zzfanVar), zzfanVar.zzL());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzd(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, int i10) throws RemoteException {
        this.zza.zzd(zzmVar, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
