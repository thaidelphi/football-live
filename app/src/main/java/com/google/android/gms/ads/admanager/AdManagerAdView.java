package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbta;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        Preconditions.n(context, "Context cannot be null");
    }

    public static /* synthetic */ void zza(AdManagerAdView adManagerAdView, AdManagerAdRequest adManagerAdRequest) {
        try {
            adManagerAdView.f11083a.zzm(adManagerAdRequest.zza());
        } catch (IllegalStateException e8) {
            zzbta.zza(adManagerAdView.getContext()).zzh(e8, "AdManagerAdView.loadAd");
        }
    }

    public AdSize[] getAdSizes() {
        return this.f11083a.zzC();
    }

    public AppEventListener getAppEventListener() {
        return this.f11083a.zzh();
    }

    public VideoController getVideoController() {
        return this.f11083a.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.f11083a.zzg();
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbbm.zza(getContext());
        if (((Boolean) zzbdk.zzf.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdView.zza(AdManagerAdView.this, adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.f11083a.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.f11083a.zzo();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr != null && adSizeArr.length > 0) {
            this.f11083a.zzt(adSizeArr);
            return;
        }
        throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f11083a.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.f11083a.zzw(z10);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.f11083a.zzy(videoOptions);
    }

    public final boolean zzb(zzbx zzbxVar) {
        return this.f11083a.zzz(zzbxVar);
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.n(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0, true);
        Preconditions.n(context, "Context cannot be null");
    }
}
