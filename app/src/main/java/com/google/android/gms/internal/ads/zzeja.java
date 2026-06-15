package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeja extends com.google.android.gms.ads.internal.client.zzbw {
    private final com.google.android.gms.ads.internal.client.zzr zza;
    private final Context zzb;
    private final zzexx zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzeis zzf;
    private final zzeyx zzg;
    private final zzauc zzh;
    private final zzdqf zzi;
    private zzddc zzj;
    private boolean zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaO)).booleanValue();

    public zzeja(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzexx zzexxVar, zzeis zzeisVar, zzeyx zzeyxVar, VersionInfoParcel versionInfoParcel, zzauc zzaucVar, zzdqf zzdqfVar) {
        this.zza = zzrVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzexxVar;
        this.zzf = zzeisVar;
        this.zzg = zzeyxVar;
        this.zze = versionInfoParcel;
        this.zzh = zzaucVar;
        this.zzi = zzdqfVar;
    }

    private final synchronized boolean zze() {
        boolean z10;
        zzddc zzddcVar = this.zzj;
        if (zzddcVar != null) {
            z10 = zzddcVar.zza() ? false : true;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzB() {
        Preconditions.f("resume must be called on the main UI thread.");
        zzddc zzddcVar = this.zzj;
        if (zzddcVar != null) {
            zzddcVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        Preconditions.f("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.f("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzF(com.google.android.gms.ads.internal.client.zzr zzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        Preconditions.f("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzazh zzazhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzn(zzcsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzL(boolean z10) {
        Preconditions.f("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzM(zzbsm zzbsmVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzO(zzbch zzbchVar) {
        Preconditions.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbchVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.f("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.zzf.zzl(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(zzbsp zzbspVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(zzbuv zzbuvVar) {
        this.zzg.zzm(zzbuvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzU(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfbq.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcU)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.t0(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzX() {
        Preconditions.f("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfbq.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcU)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzZ() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzaa() {
        Preconditions.f("isLoaded must be called on the main UI thread.");
        return zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z10;
        if (!zzmVar.zzb()) {
            if (((Boolean) zzbdk.zzi.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                    z10 = true;
                    if (this.zze.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzle)).intValue() || !z10) {
                        Preconditions.f("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z10 = false;
            if (this.zze.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzle)).intValue()) {
            }
            Preconditions.f("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zzb) && zzmVar.zzs == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            zzeis zzeisVar = this.zzf;
            if (zzeisVar != null) {
                zzeisVar.zzdz(zzfbq.zzd(4, null, null));
            }
        } else if (!zze()) {
            zzfbm.zza(this.zzb, zzmVar.zzf);
            this.zzj = null;
            return this.zzc.zzb(zzmVar, this.zzd, new zzexq(this.zza), new zzeiz(this));
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzac(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzd() {
        Preconditions.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzr zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzi() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzcl zzj() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzk() {
        zzddc zzddcVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgD)).booleanValue() && (zzddcVar = this.zzj) != null) {
            return zzddcVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzea zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzs() {
        zzddc zzddcVar = this.zzj;
        if (zzddcVar == null || zzddcVar.zzl() == null) {
            return null;
        }
        return zzddcVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzt() {
        zzddc zzddcVar = this.zzj;
        if (zzddcVar == null || zzddcVar.zzl() == null) {
            return null;
        }
        return zzddcVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzx() {
        Preconditions.f("destroy must be called on the main UI thread.");
        zzddc zzddcVar = this.zzj;
        if (zzddcVar != null) {
            zzddcVar.zzm().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
        this.zzf.zzk(zzbnVar);
        zzab(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzz() {
        Preconditions.f("pause must be called on the main UI thread.");
        zzddc zzddcVar = this.zzj;
        if (zzddcVar != null) {
            zzddcVar.zzm().zzb(null);
        }
    }
}
