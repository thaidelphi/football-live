package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbvr extends RewardedAd {
    private final String zza;
    private final zzbvi zzb;
    private final Context zzc;
    private final zzbwa zzd;
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;
    private final long zzh;

    public zzbvr(Context context, String str) {
        this(context, str, com.google.android.gms.ads.internal.client.zzbb.zza().zzs(context, str, new zzbnz()));
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzbvi zzbviVar = this.zzb;
            if (zzbviVar != null) {
                return zzbviVar.zzb();
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            zzbvi zzbviVar = this.zzb;
            if (zzbviVar != null) {
                zzdxVar = zzbviVar.zzc();
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
        return ResponseInfo.zzb(zzdxVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzbvi zzbviVar = this.zzb;
            zzbvf zzd = zzbviVar != null ? zzbviVar.zzd() : null;
            return zzd == null ? RewardItem.DEFAULT_REWARD : new zzbvs(zzd);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z10) {
        try {
            zzbvi zzbviVar = this.zzb;
            if (zzbviVar != null) {
                zzbviVar.zzh(z10);
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbvi zzbviVar = this.zzb;
            if (zzbviVar != null) {
                zzbviVar.zzi(new com.google.android.gms.ads.internal.client.zzfo(onAdMetadataChangedListener));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbvi zzbviVar = this.zzb;
            if (zzbviVar != null) {
                zzbviVar.zzj(new com.google.android.gms.ads.internal.client.zzfp(onPaidEventListener));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbvi zzbviVar = this.zzb;
                if (zzbviVar != null) {
                    zzbviVar.zzl(new zzbvw(serverSideVerificationOptions));
                }
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbvi zzbviVar = this.zzb;
            if (zzbviVar != null) {
                zzbviVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.u0(activity));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzeh zzehVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            if (this.zzb != null) {
                zzehVar.zzo(this.zzh);
                this.zzb.zzf(com.google.android.gms.ads.internal.client.zzq.zza.zza(this.zzc, zzehVar), new zzbvv(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public zzbvr(Context context, String str, zzbvi zzbviVar) {
        this.zzh = System.currentTimeMillis();
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzbviVar;
        this.zzd = new zzbwa();
    }
}
