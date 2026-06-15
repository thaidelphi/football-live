package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcmz extends zzazd {
    private final zzcmy zza;
    private final com.google.android.gms.ads.internal.client.zzbx zzb;
    private final zzevs zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaR)).booleanValue();
    private final zzdqf zze;

    public zzcmz(zzcmy zzcmyVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar, zzevs zzevsVar, zzdqf zzdqfVar) {
        this.zza = zzcmyVar;
        this.zzb = zzbxVar;
        this.zzc = zzevsVar;
        this.zze = zzdqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final com.google.android.gms.ads.internal.client.zzbx zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final com.google.android.gms.ads.internal.client.zzdx zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgD)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final void zzg(boolean z10) {
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final void zzh(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.f("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e8);
            }
            this.zzc.zzn(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final void zzi(IObjectWrapper iObjectWrapper, zzazl zzazlVar) {
        try {
            this.zzc.zzp(zzazlVar);
            this.zza.zzd((Activity) ObjectWrapper.t0(iObjectWrapper), zzazlVar, this.zzd);
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }
}
