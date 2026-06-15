package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbrs;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdLoader {

    /* renamed from: a  reason: collision with root package name */
    private final zzq f11064a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11065b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbq f11066c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final Context f11067a;

        /* renamed from: b  reason: collision with root package name */
        private final zzbt f11068b;

        public Builder(Context context, String str) {
            zzbt zzd = zzbb.zza().zzd(context, str, new zzbnz());
            this.f11067a = (Context) Preconditions.n(context, "context cannot be null");
            this.f11068b = zzd;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.f11067a, this.f11068b.zze(), zzq.zza);
            } catch (RemoteException e8) {
                zzo.zzh("Failed to build AdLoader.", e8);
                return new AdLoader(this.f11067a, new zzff().zzc(), zzq.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.f11068b.zzj(new zzbhb(onAdManagerAdViewLoadedListener), new zzr(this.f11067a, adSizeArr));
                } catch (RemoteException e8) {
                    zzo.zzk("Failed to add Google Ad Manager banner ad listener", e8);
                }
                return this;
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbrq zzbrqVar = new zzbrq(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.f11068b.zzh(str, zzbrqVar.zzb(), zzbrqVar.zza());
            } catch (RemoteException e8) {
                zzo.zzk("Failed to add custom format ad listener", e8);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.f11068b.zzk(new zzbrs(onNativeAdLoadedListener));
            } catch (RemoteException e8) {
                zzo.zzk("Failed to add google native ad listener", e8);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.f11068b.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e8) {
                zzo.zzk("Failed to set AdListener.", e8);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.f11068b.zzm(adManagerAdViewOptions);
            } catch (RemoteException e8) {
                zzo.zzk("Failed to specify Ad Manager banner ad options", e8);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.f11068b.zzo(new zzben(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfx(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
            } catch (RemoteException e8) {
                zzo.zzk("Failed to specify native ad options", e8);
            }
            return this;
        }

        @Deprecated
        public final Builder zza(String str, com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
            zzbgz zzbgzVar = new zzbgz(zzgVar, zzfVar);
            try {
                this.f11068b.zzh(str, zzbgzVar.zzd(), zzbgzVar.zzc());
            } catch (RemoteException e8) {
                zzo.zzk("Failed to add custom template ad listener", e8);
            }
            return this;
        }

        @Deprecated
        public final Builder zzb(com.google.android.gms.ads.formats.zzi zziVar) {
            try {
                this.f11068b.zzk(new zzbhc(zziVar));
            } catch (RemoteException e8) {
                zzo.zzk("Failed to add google native ad listener", e8);
            }
            return this;
        }

        @Deprecated
        public final Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.f11068b.zzo(new zzben(nativeAdOptions));
            } catch (RemoteException e8) {
                zzo.zzk("Failed to specify native ad options", e8);
            }
            return this;
        }
    }

    AdLoader(Context context, zzbq zzbqVar, zzq zzqVar) {
        this.f11065b = context;
        this.f11066c = zzbqVar;
        this.f11064a = zzqVar;
    }

    private final void a(final zzeh zzehVar) {
        zzbbm.zza(this.f11065b);
        if (((Boolean) zzbdk.zzc.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.zza(AdLoader.this, zzehVar);
                    }
                });
                return;
            }
        }
        try {
            this.f11066c.zzg(this.f11064a.zza(this.f11065b, zzehVar));
        } catch (RemoteException e8) {
            zzo.zzh("Failed to load ad.", e8);
        }
    }

    public static /* synthetic */ void zza(AdLoader adLoader, zzeh zzehVar) {
        try {
            adLoader.f11066c.zzg(adLoader.f11064a.zza(adLoader.f11065b, zzehVar));
        } catch (RemoteException e8) {
            zzo.zzh("Failed to load ad.", e8);
        }
    }

    public boolean isLoading() {
        try {
            return this.f11066c.zzi();
        } catch (RemoteException e8) {
            zzo.zzk("Failed to check if ad is loading.", e8);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        a(adRequest.f11069a);
    }

    public void loadAds(AdRequest adRequest, int i10) {
        try {
            this.f11066c.zzh(this.f11064a.zza(this.f11065b, adRequest.f11069a), i10);
        } catch (RemoteException e8) {
            zzo.zzh("Failed to load ads.", e8);
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        a(adManagerAdRequest.f11069a);
    }
}
