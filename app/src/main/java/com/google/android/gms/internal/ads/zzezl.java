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
public final class zzezl extends zzbvh {
    private final zzezh zza;
    private final zzeyx zzb;
    private final String zzc;
    private final zzfah zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzauc zzg;
    private final zzdqf zzh;
    private zzdmj zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaO)).booleanValue();

    public zzezl(String str, zzezh zzezhVar, Context context, zzeyx zzeyxVar, zzfah zzfahVar, VersionInfoParcel versionInfoParcel, zzauc zzaucVar, zzdqf zzdqfVar) {
        this.zzc = str;
        this.zza = zzezhVar;
        this.zzb = zzeyxVar;
        this.zzd = zzfahVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzaucVar;
        this.zzh = zzdqfVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbvp zzbvpVar, int i10) throws RemoteException {
        if (!zzmVar.zzb()) {
            boolean z10 = false;
            if (((Boolean) zzbdk.zzk.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                    z10 = true;
                }
            }
            if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzle)).intValue() || !z10) {
                Preconditions.f("#008 Must be called on the main UI thread.");
            }
        }
        this.zzb.zzk(zzbvpVar);
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zze) && zzmVar.zzs == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzdz(zzfbq.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        zzeyz zzeyzVar = new zzeyz(null);
        this.zza.zzj(i10);
        this.zza.zzb(zzmVar, this.zzc, zzeyzVar, new zzezk(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final Bundle zzb() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzdmj zzdmjVar = this.zzi;
        return zzdmjVar != null ? zzdmjVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final com.google.android.gms.ads.internal.client.zzdx zzc() {
        zzdmj zzdmjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgD)).booleanValue() && (zzdmjVar = this.zzi) != null) {
            return zzdmjVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvf zzd() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzdmj zzdmjVar = this.zzi;
        if (zzdmjVar != null) {
            return zzdmjVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized String zze() throws RemoteException {
        zzdmj zzdmjVar = this.zzi;
        if (zzdmjVar == null || zzdmjVar.zzl() == null) {
            return null;
        }
        return zzdmjVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbvp zzbvpVar) throws RemoteException {
        zzu(zzmVar, zzbvpVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbvp zzbvpVar) throws RemoteException {
        zzu(zzmVar, zzbvpVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzh(boolean z10) {
        Preconditions.f("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        if (zzdnVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzezj(this, zzdnVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.f("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.zzb.zzi(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk(zzbvl zzbvlVar) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzl(zzbvw zzbvwVar) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzfah zzfahVar = this.zzd;
        zzfahVar.zza = zzbvwVar.zza;
        zzfahVar.zzb = zzbvwVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzq(zzfbq.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcU)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z10, (Activity) ObjectWrapper.t0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zzo() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzdmj zzdmjVar = this.zzi;
        return (zzdmjVar == null || zzdmjVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzp(zzbvq zzbvqVar) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbvqVar);
    }
}
