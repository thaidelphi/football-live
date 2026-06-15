package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzedz extends zzbpv {
    final /* synthetic */ zzeeb zza;
    private final zzebj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzedz(zzeeb zzeebVar, zzebj zzebjVar, zzeea zzeeaVar) {
        this.zza = zzeebVar;
        this.zzb = zzebjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zze(String str) throws RemoteException {
        ((zzecx) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzecx) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzg(zzbos zzbosVar) throws RemoteException {
        zzeeb.zzc(this.zza, zzbosVar);
        ((zzecx) this.zzb.zzc).zzo();
    }
}
