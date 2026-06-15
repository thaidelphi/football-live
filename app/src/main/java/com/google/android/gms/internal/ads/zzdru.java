package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdru extends zzbvo {
    final /* synthetic */ zzdrw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdru(zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze(int i10) throws RemoteException {
        zzdrl zzdrlVar;
        long j10;
        zzdrw zzdrwVar = this.zza;
        zzdrlVar = zzdrwVar.zzb;
        j10 = zzdrwVar.zza;
        zzdrlVar.zzm(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdrl zzdrlVar;
        long j10;
        zzdrw zzdrwVar = this.zza;
        zzdrlVar = zzdrwVar.zzb;
        j10 = zzdrwVar.zza;
        zzdrlVar.zzm(j10, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg() throws RemoteException {
        zzdrl zzdrlVar;
        long j10;
        zzdrw zzdrwVar = this.zza;
        zzdrlVar = zzdrwVar.zzb;
        j10 = zzdrwVar.zza;
        zzdrlVar.zzp(j10);
    }
}
