package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbpe extends zzbof {
    private final Object zza;
    private zzbpg zzb;
    private zzbva zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbpe(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzW(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzs();
    }

    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.t0(iObjectWrapper), "", zzW(str, zzmVar, null), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbpc(this, zzbojVar));
                return;
            } catch (Exception e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
                zzboa.zza(iObjectWrapper, e8, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzmVar, str, new zzbph((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.t0(iObjectWrapper), "", zzW(str, zzmVar, null), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbpc(this, zzbojVar));
                return;
            } catch (Exception e8) {
                zzboa.zza(iObjectWrapper, e8, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzG(boolean z10) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzk;
            if (mediationAppOpenAd != null) {
                try {
                    mediationAppOpenAd.showAd((Context) ObjectWrapper.t0(iObjectWrapper));
                    return;
                } catch (RuntimeException e8) {
                    zzboa.zza(iObjectWrapper, e8, "adapter.appOpen.showAd");
                    throw e8;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzI() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            zzI();
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                try {
                    mediationInterstitialAd.showAd((Context) ObjectWrapper.t0(iObjectWrapper));
                    return;
                } catch (RuntimeException e8) {
                    zzboa.zza(iObjectWrapper, e8, "adapter.interstitial.showAd");
                    throw e8;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.t0(iObjectWrapper));
                    return;
                } catch (RuntimeException e8) {
                    zzboa.zza(iObjectWrapper, e8, "adapter.rewarded.showAd");
                    throw e8;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzL() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.t0(this.zzd));
                    return;
                } catch (RuntimeException e8) {
                    zzboa.zza(this.zzd, e8, "adapter.showVideo");
                    throw e8;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final boolean zzN() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        Object obj2 = this.zza;
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzboo zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbop zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final com.google.android.gms.ads.internal.client.zzea zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbfs zzi() {
        zzbpg zzbpgVar = this.zzb;
        if (zzbpgVar != null) {
            zzbft zzc = zzbpgVar.zzc();
            if (zzc instanceof zzbft) {
                return zzc.zza();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbom zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbpf(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbos zzk() {
        UnifiedNativeAdMapper zza;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbpg zzbpgVar = this.zzb;
            if (zzbpgVar == null || (zza = zzbpgVar.zza()) == null) {
                return null;
            }
            return new zzbpk(zza);
        } else if (obj instanceof Adapter) {
            NativeAdMapper nativeAdMapper = this.zzh;
            if (nativeAdMapper != null) {
                return new zzbpi(nativeAdMapper);
            }
            UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
            if (unifiedNativeAdMapper != null) {
                return new zzbpk(unifiedNativeAdMapper);
            }
            return null;
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbqr zzl() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbqr.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final zzbqr zzm() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbqr.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.u0(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.u0(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbva zzbvaVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            Object obj2 = this.zza;
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj2.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        this.zzd = iObjectWrapper;
        this.zzc = zzbvaVar;
        zzbvaVar.zzl(ObjectWrapper.u0(this.zza));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzq(IObjectWrapper iObjectWrapper, zzbkq zzbkqVar, List list) throws RemoteException {
        char c10;
        if (this.zza instanceof Adapter) {
            zzbox zzboxVar = new zzbox(this, zzbkqVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbkw zzbkwVar = (zzbkw) it.next();
                String str = zzbkwVar.zza;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1052618729:
                        if (str.equals(IronSourceConstants.EVENTS_NATIVE)) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1167692200:
                        if (str.equals("app_open")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1778294298:
                        if (str.equals("app_open_ad")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                AdFormat adFormat = null;
                switch (c10) {
                    case 0:
                        adFormat = AdFormat.BANNER;
                        break;
                    case 1:
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    case 2:
                        adFormat = AdFormat.REWARDED;
                        break;
                    case 3:
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        adFormat = AdFormat.NATIVE;
                        break;
                    case 5:
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    case 6:
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlL)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                        break;
                }
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(adFormat, zzbkwVar.zzb));
                }
            }
            ((Adapter) this.zza).initialize((Context) ObjectWrapper.t0(iObjectWrapper), zzboxVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzr(IObjectWrapper iObjectWrapper, zzbva zzbvaVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        zzB(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) this.zza).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.t0(iObjectWrapper), "", zzW(str, zzmVar, null), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbpd(this, zzbojVar));
                return;
            } catch (Exception e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
                zzboa.zza(iObjectWrapper, e8, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        zzv(iObjectWrapper, zzrVar, zzmVar, str, null, zzbojVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzboj zzbojVar) throws RemoteException {
        AdSize zzc;
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting banner ad from adapter.");
        if (zzrVar.zzn) {
            zzc = com.google.android.gms.ads.zzc.zzd(zzrVar.zze, zzrVar.zzb);
        } else {
            zzc = com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
        }
        AdSize adSize = zzc;
        Object obj2 = this.zza;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzmVar.zze;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j10 = zzmVar.zzb;
                zzbov zzbovVar = new zzbov(j10 == -1 ? null : new Date(j10), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle = zzmVar.zzm;
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.t0(iObjectWrapper), new zzbpg(zzbojVar), zzW(str, zzmVar, str2), adSize, zzbovVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                zzboa.zza(iObjectWrapper, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        } else if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.t0(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), adSize, this.zzl), new zzboy(this, zzbojVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th2);
                zzboa.zza(iObjectWrapper, th2, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzboj zzbojVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                zzbow zzbowVar = new zzbow(this, zzbojVar, adapter);
                Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
                zzW(str, zzmVar, str2);
                zzV(zzmVar);
                zzX(zzmVar);
                Location location = zzmVar.zzk;
                zzY(str, zzmVar);
                com.google.android.gms.ads.zzc.zze(zzrVar.zze, zzrVar.zzb);
                zzbowVar.onFailure(new AdError(7, adapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
                return;
            } catch (Exception e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
                zzboa.zza(iObjectWrapper, e8, "adapter.loadInterscrollerAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzboj zzbojVar) throws RemoteException {
        zzy(iObjectWrapper, zzmVar, str, null, zzbojVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzboj zzbojVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = zzmVar.zze;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j10 = zzmVar.zzb;
                zzbov zzbovVar = new zzbov(j10 == -1 ? null : new Date(j10), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle = zzmVar.zzm;
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.t0(iObjectWrapper), new zzbpg(zzbojVar), zzW(str, zzmVar, str2), zzbovVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                zzboa.zza(iObjectWrapper, th, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        } else if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.t0(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl), new zzboz(this, zzbojVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th2);
                zzboa.zza(iObjectWrapper, th2, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzboj zzbojVar, zzben zzbenVar, List list) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = zzmVar.zze;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j10 = zzmVar.zzb;
                zzbpj zzbpjVar = new zzbpj(j10 == -1 ? null : new Date(j10), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzbenVar, list, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle = zzmVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbpg(zzbojVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.t0(iObjectWrapper), this.zzb, zzW(str, zzmVar, str2), zzbpjVar, bundle2);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                zzboa.zza(iObjectWrapper, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        } else if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.t0(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbenVar), new zzbpb(this, zzbojVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th2);
                zzboa.zza(iObjectWrapper, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                    try {
                        ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.t0(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbenVar), new zzbpa(this, zzbojVar));
                        return;
                    } catch (Throwable th3) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("", th3);
                        zzboa.zza(iObjectWrapper, th3, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
                throw new RemoteException();
            }
        }
    }

    public zzbpe(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
