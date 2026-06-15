package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeht extends com.google.android.gms.ads.internal.client.zzbw {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzbk zzb;
    private final zzfap zzc;
    private final zzcne zzd;
    private final ViewGroup zze;
    private final zzdqf zzf;

    public zzeht(Context context, com.google.android.gms.ads.internal.client.zzbk zzbkVar, zzfap zzfapVar, zzcne zzcneVar, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzb = zzbkVar;
        this.zzc = zzfapVar;
        this.zzd = zzcneVar;
        this.zzf = zzdqfVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzd = zzcneVar.zzd();
        com.google.android.gms.ads.internal.zzv.zzq();
        frameLayout.addView(zzd, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzA() throws RemoteException {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzB() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(com.google.android.gms.ads.internal.client.zzbh zzbhVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(com.google.android.gms.ads.internal.client.zzbk zzbkVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(com.google.android.gms.ads.internal.client.zzcb zzcbVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzF(com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Preconditions.f("setAdSize must be called on the main UI thread.");
        zzcne zzcneVar = this.zzd;
        if (zzcneVar != null) {
            zzcneVar.zzi(this.zze, zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(com.google.android.gms.ads.internal.client.zzcl zzclVar) throws RemoteException {
        zzeis zzeisVar = this.zzc.zzc;
        if (zzeisVar != null) {
            zzeisVar.zzm(zzclVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzazh zzazhVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(com.google.android.gms.ads.internal.client.zzee zzeeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzL(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzM(zzbsm zzbsmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzN(boolean z10) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzO(zzbch zzbchVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlw)).booleanValue()) {
            zzeis zzeisVar = this.zzc.zzc;
            if (zzeisVar != null) {
                try {
                    if (!zzdqVar.zzf()) {
                        this.zzf.zze();
                    }
                } catch (RemoteException e8) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e8);
                }
                zzeisVar.zzl(zzdqVar);
                return;
            }
            return;
        }
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(zzbsp zzbspVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(zzbuv zzbuvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzU(com.google.android.gms.ads.internal.client.zzfx zzfxVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzX() throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzY() throws RemoteException {
        zzcne zzcneVar = this.zzd;
        return zzcneVar != null && zzcneVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzaa() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzac(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzd() throws RemoteException {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzr zzg() {
        Preconditions.f("getAdSize must be called on the main UI thread.");
        return zzfav.zza(this.zza, Collections.singletonList(this.zzd.zzf()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzi() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzcl zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzdx zzk() {
        return this.zzd.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzea zzl() throws RemoteException {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.u0(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzs() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzt() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzx() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb(null);
    }
}
