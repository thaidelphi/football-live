package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzewa extends com.google.android.gms.ads.internal.client.zzbw implements com.google.android.gms.ads.internal.overlay.zzr, zzayy {
    protected zzcmy zza;
    private final zzcfq zzb;
    private final Context zzc;
    private final String zze;
    private final zzevu zzf;
    private final zzevs zzg;
    private final VersionInfoParcel zzh;
    private final zzdqf zzi;
    private zzcml zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzewa(zzcfq zzcfqVar, Context context, String str, zzevu zzevuVar, zzevs zzevsVar, VersionInfoParcel versionInfoParcel, zzdqf zzdqfVar) {
        this.zzb = zzcfqVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzevuVar;
        this.zzg = zzevsVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzdqfVar;
        zzevsVar.zzm(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzq(int i10) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcml zzcmlVar = this.zzk;
            if (zzcmlVar != null) {
                com.google.android.gms.ads.internal.zzv.zzb().zze(zzcmlVar);
            }
            if (this.zza != null) {
                long j10 = -1;
                if (this.zzj != -1) {
                    j10 = com.google.android.gms.ads.internal.zzv.zzC().b() - this.zzj;
                }
                this.zza.zze(j10, i10);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzB() {
        Preconditions.f("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.f("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzazh zzazhVar) {
        this.zzg.zzo(zzazhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzf.zzl(zzxVar);
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
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzO(zzbch zzbchVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
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
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final void zza() {
        zzq(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        boolean z10;
        if (!zzmVar.zzb()) {
            if (((Boolean) zzbdk.zzd.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                    z10 = true;
                    if (this.zzh.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzle)).intValue() || !z10) {
                        Preconditions.f("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z10 = false;
            if (this.zzh.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzle)).intValue()) {
            }
            Preconditions.f("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zzc) && zzmVar.zzs == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzg.zzdz(zzfbq.zzd(4, null, null));
            return false;
        }
        if (zzZ()) {
            return false;
        }
        this.zzd = new AtomicBoolean();
        return this.zzf.zzb(zzmVar, this.zze, new zzevy(this), new zzevz(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        if (this.zza != null) {
            this.zzj = com.google.android.gms.ads.internal.zzv.zzC().b();
            int zza = this.zza.zza();
            if (zza > 0) {
                zzcml zzcmlVar = new zzcml(this.zzb.zzD(), com.google.android.gms.ads.internal.zzv.zzC());
                this.zzk = zzcmlVar;
                zzcmlVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzevx
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevw
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzewa.this.zzq(5);
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        zzcmy zzcmyVar = this.zza;
        if (zzcmyVar != null) {
            zzcmyVar.zze(com.google.android.gms.ads.internal.zzv.zzC().b() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzq(2);
        } else if (i11 == 1) {
            zzq(4);
        } else if (i11 != 2) {
            zzq(6);
        } else {
            zzq(3);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzcl zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzx() {
        Preconditions.f("destroy must be called on the main UI thread.");
        zzcmy zzcmyVar = this.zza;
        if (zzcmyVar != null) {
            zzcmyVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzz() {
        Preconditions.f("pause must be called on the main UI thread.");
    }
}
