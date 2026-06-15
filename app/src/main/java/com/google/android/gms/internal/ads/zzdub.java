package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdub extends com.google.android.gms.ads.internal.client.zzds {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdtp zzd;
    private final zzgba zze;
    private zzdte zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdub(Context context, WeakReference weakReference, zzdtp zzdtpVar, zzduc zzducVar, zzgba zzgbaVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdtpVar;
        this.zze = zzgbaVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static AdRequest zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdx zzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else if (!(obj instanceof NativeAd)) {
            return "";
        } else {
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzc.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgap.zzr(this.zzf.zzb(str), new zzdtz(this, str2), this.zze);
        } catch (NullPointerException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgap.zzr(this.zzf.zzb(str), new zzdua(this, str2), this.zze);
        } catch (NullPointerException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.t0(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj != null) {
            this.zza.remove(str);
        }
        if (obj instanceof AdView) {
            zzduc.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzduc.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void zzf(zzdte zzdteVar) {
        this.zzf = zzdteVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        char c10;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            AppOpenAd.load(zzj(), str, zzk(), new zzdtt(this, str, str3));
        } else if (c10 == 1) {
            AdView adView = new AdView(zzj());
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(str);
            adView.setAdListener(new zzdtu(this, str, adView, str3));
            adView.loadAd(zzk());
        } else if (c10 == 2) {
            InterstitialAd.load(zzj(), str, zzk(), new zzdtv(this, str, str3));
        } else if (c10 == 3) {
            AdLoader.Builder builder = new AdLoader.Builder(zzj(), str);
            builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdtq
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    zzdub.this.zzg(str, nativeAd, str3);
                }
            });
            builder.withAdListener(new zzdty(this, str3));
            builder.build().loadAd(zzk());
        } else if (c10 == 4) {
            RewardedAd.load(zzj(), str, zzk(), new zzdtw(this, str, str3));
        } else if (c10 != 5) {
        } else {
            RewardedInterstitialAd.load(zzj(), str, zzk(), new zzdtx(this, str, str3));
        }
    }

    public final synchronized void zzi(String str, String str2) {
        Object obj;
        Activity zzg = this.zzd.zzg();
        if (zzg != null && (obj = this.zza.get(str)) != null) {
            zzbbd zzbbdVar = zzbbm.zzjp;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                this.zza.remove(str);
            }
            zzn(zzl(obj), str2);
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(zzg);
            } else if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(zzg);
            } else if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdtr
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
            } else if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdts
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context zzj = zzj();
                intent.setClassName(zzj, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra("adUnit", str);
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzT(zzj, intent);
            }
        }
    }
}
