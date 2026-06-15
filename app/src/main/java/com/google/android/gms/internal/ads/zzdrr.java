package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdrr extends com.google.android.gms.ads.internal.client.zzbj {
    final /* synthetic */ zzdrl zza;
    final /* synthetic */ zzdrs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrr(zzdrs zzdrsVar, zzdrl zzdrlVar) {
        this.zza = zzdrlVar;
        this.zzb = zzdrsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() throws RemoteException {
        long j10;
        zzdrs zzdrsVar = this.zzb;
        zzdrl zzdrlVar = this.zza;
        j10 = zzdrsVar.zza;
        zzdrlVar.zzb(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzd() throws RemoteException {
        long j10;
        zzdrs zzdrsVar = this.zzb;
        zzdrl zzdrlVar = this.zza;
        j10 = zzdrsVar.zza;
        zzdrlVar.zzc(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zze(int i10) throws RemoteException {
        long j10;
        zzdrs zzdrsVar = this.zzb;
        zzdrl zzdrlVar = this.zza;
        j10 = zzdrsVar.zza;
        zzdrlVar.zzd(j10, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j10;
        zzdrs zzdrsVar = this.zzb;
        zzdrl zzdrlVar = this.zza;
        j10 = zzdrsVar.zza;
        zzdrlVar.zzd(j10, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzi() throws RemoteException {
        long j10;
        zzdrs zzdrsVar = this.zzb;
        zzdrl zzdrlVar = this.zza;
        j10 = zzdrsVar.zza;
        zzdrlVar.zze(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzj() throws RemoteException {
        long j10;
        zzdrs zzdrsVar = this.zzb;
        zzdrl zzdrlVar = this.zza;
        j10 = zzdrsVar.zza;
        zzdrlVar.zzg(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzk() {
    }
}
