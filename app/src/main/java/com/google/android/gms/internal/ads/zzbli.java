package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbli extends AdManagerInterstitialAd {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final com.google.android.gms.ads.internal.client.zzbx zzc;
    private final String zzd;
    private final zzbnz zze;
    private final long zzf;
    private AppEventListener zzg;
    private FullScreenContentCallback zzh;
    private OnPaidEventListener zzi;

    public zzbli(Context context, String str) {
        zzbnz zzbnzVar = new zzbnz();
        this.zze = zzbnzVar;
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzq.zza;
        this.zzc = com.google.android.gms.ads.internal.client.zzbb.zza().zzf(context, new com.google.android.gms.ads.internal.client.zzr(), str, zzbnzVar);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzdxVar = zzbxVar.zzk();
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
        return ResponseInfo.zzb(zzdxVar);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzg = appEventListener;
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzG(appEventListener != null ? new zzaxz(appEventListener) : null);
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzh = fullScreenContentCallback;
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzJ(new com.google.android.gms.ads.internal.client.zzbe(fullScreenContentCallback));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z10) {
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzL(z10);
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzi = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzP(new com.google.android.gms.ads.internal.client.zzfp(onPaidEventListener));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzW(ObjectWrapper.u0(activity));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzeh zzehVar, AdLoadCallback adLoadCallback) {
        try {
            if (this.zzc != null) {
                zzehVar.zzo(this.zzf);
                this.zzc.zzy(this.zzb.zza(this.zza, zzehVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    public zzbli(Context context, String str, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zze = new zzbnz();
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzq.zza;
        this.zzc = zzbxVar;
    }
}
