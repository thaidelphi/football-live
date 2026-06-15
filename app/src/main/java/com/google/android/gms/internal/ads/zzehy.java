package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzehy extends com.google.android.gms.ads.internal.client.zzbw implements zzcwr {
    private final Context zza;
    private final zzewg zzb;
    private final String zzc;
    private final zzeis zzd;
    private com.google.android.gms.ads.internal.client.zzr zze;
    private final zzfan zzf;
    private final VersionInfoParcel zzg;
    private final zzdqf zzh;
    private zzcne zzi;

    public zzehy(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzewg zzewgVar, zzeis zzeisVar, VersionInfoParcel versionInfoParcel, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzb = zzewgVar;
        this.zze = zzrVar;
        this.zzc = str;
        this.zzd = zzeisVar;
        this.zzf = zzewgVar.zzf();
        this.zzg = versionInfoParcel;
        this.zzh = zzdqfVar;
        zzewgVar.zzo(this);
    }

    private final synchronized void zzf(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzf.zzs(zzrVar);
        this.zzf.zzy(this.zze.zzn);
    }

    private final synchronized boolean zzh(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        if (zzm()) {
            Preconditions.f("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zza) && zzmVar.zzs == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            zzeis zzeisVar = this.zzd;
            if (zzeisVar != null) {
                zzeisVar.zzdz(zzfbq.zzd(4, null, null));
            }
            return false;
        }
        zzfbm.zza(this.zza, zzmVar.zzf);
        return this.zzb.zzb(zzmVar, this.zzc, null, new zzehx(this));
    }

    private final boolean zzm() {
        boolean z10;
        if (((Boolean) zzbdk.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                z10 = true;
                return this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzle)).intValue() || !z10;
            }
        }
        z10 = false;
        if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzle)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzA() {
        Preconditions.f("recordManualImpression must be called on the main UI thread.");
        zzcne zzcneVar = this.zzi;
        if (zzcneVar != null) {
            zzcneVar.zzh();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzlf)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcw r0 = com.google.android.gms.internal.ads.zzbdk.zzh     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzkZ     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbd r1 = com.google.android.gms.internal.ads.zzbbm.zzlf     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.f(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcne r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzcve r0 = r0.zzm()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehy.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzm()) {
            Preconditions.f("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzn(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        if (zzm()) {
            Preconditions.f("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzbkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.f("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.f("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(zzrVar);
        this.zze = zzrVar;
        zzcne zzcneVar = this.zzi;
        if (zzcneVar != null) {
            zzcneVar.zzi(this.zzb.zzc(), zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        if (zzm()) {
            Preconditions.f("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzazh zzazhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzL(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzM(zzbsm zzbsmVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzN(boolean z10) {
        if (zzm()) {
            Preconditions.f("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzB(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzO(zzbch zzbchVar) {
        Preconditions.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzp(zzbchVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzm()) {
            Preconditions.f("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdqVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.zzd.zzl(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(zzbsp zzbspVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(zzbuv zzbuvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
        if (zzm()) {
            Preconditions.f("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzI(zzfxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzY() {
        boolean z10;
        zzcne zzcneVar = this.zzi;
        if (zzcneVar != null) {
            z10 = zzcneVar.zzr();
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    public final synchronized void zza() {
        if (this.zzb.zzs()) {
            com.google.android.gms.ads.internal.client.zzr zzh = this.zzf.zzh();
            if (this.zzi != null && this.zzf.zzT()) {
                zzh = zzfav.zza(this.zza, Collections.singletonList(this.zzi.zzg()));
            }
            zzf(zzh);
            this.zzf.zzx(true);
            try {
                zzh(this.zzf.zzf());
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to refresh the banner ad.");
            }
            this.zzf.zzx(false);
            return;
        }
        this.zzb.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        zzf(this.zze);
        return zzh(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        Preconditions.f("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzV(zzcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    public final synchronized void zzb() throws ExecutionException, InterruptedException {
        if (this.zzb.zzs()) {
            this.zzb.zzq();
        } else {
            this.zzb.zzm();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzd() {
        Preconditions.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzg() {
        Preconditions.f("getAdSize must be called on the main UI thread.");
        zzcne zzcneVar = this.zzi;
        if (zzcneVar != null) {
            return zzfav.zza(this.zza, Collections.singletonList(zzcneVar.zzf()));
        }
        return this.zzf.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzi() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzcl zzj() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzk() {
        zzcne zzcneVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgD)).booleanValue() && (zzcneVar = this.zzi) != null) {
            return zzcneVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzl() {
        Preconditions.f("getVideoController must be called from the main thread.");
        zzcne zzcneVar = this.zzi;
        if (zzcneVar != null) {
            return zzcneVar.zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzn() {
        if (zzm()) {
            Preconditions.f("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.u0(this.zzb.zzc());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzs() {
        zzcne zzcneVar = this.zzi;
        if (zzcneVar == null || zzcneVar.zzl() == null) {
            return null;
        }
        return zzcneVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzt() {
        zzcne zzcneVar = this.zzi;
        if (zzcneVar == null || zzcneVar.zzl() == null) {
            return null;
        }
        return zzcneVar.zzl().zzg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzlf)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcw r0 = com.google.android.gms.internal.ads.zzbdk.zze     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzla     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L47
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbbd r1 = com.google.android.gms.internal.ads.zzbbm.zzlf     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L47
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L47
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.f(r0)     // Catch: java.lang.Throwable -> L47
        L3c:
            com.google.android.gms.internal.ads.zzcne r0 = r3.zzi     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L45
            r0.zzb()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehy.zzx():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzlf)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcw r0 = com.google.android.gms.internal.ads.zzbdk.zzg     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzlb     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbd r1 = com.google.android.gms.internal.ads.zzbbm.zzlf     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.f(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcne r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzcve r0 = r0.zzm()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehy.zzz():void");
    }
}
