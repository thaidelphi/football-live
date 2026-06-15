package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzaze;
import com.google.android.gms.internal.ads.zzazm;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbta;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class AppOpenAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    public static boolean isAdAvailable(Context context, String str) {
        try {
            return zzb.zza(context).zzj(str);
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
            return false;
        }
    }

    public static void load(final Context context, final String str, final AdRequest adRequest, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.n(context, "Context cannot be null.");
        Preconditions.n(str, "adUnitId cannot be null.");
        Preconditions.n(adRequest, "AdRequest cannot be null.");
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbbm.zza(context);
        if (((Boolean) zzbdk.zzd.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzazm(context2, str2, adRequest2.zza(), appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e8) {
                            zzbta.zza(context2).zzh(e8, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzazm(context, str, adRequest.zza(), appOpenAdLoadCallback).zza();
    }

    public static AppOpenAd pollAd(Context context, String str) {
        try {
            zzaze zze = zzb.zza(context).zze(str);
            if (zze == null) {
                zzo.zzl("Failed to obtain an App Open ad from the preloader.", null);
                return null;
            }
            return new zzaza(zze, str);
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
            return null;
        }
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);
}
