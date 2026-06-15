package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.f;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbxn;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzeu.zzf().zzp(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzeu.zzf().zze();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzeu.zzf().zzj();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzeu.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzeu.zzf();
        String[] split = TextUtils.split("24.0.0", "\\.");
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        zzeu.zzf().zzq(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzeu.zzf().zzr(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzeu.zzf().zzs(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z10) {
        return zzeu.zzf().zzz(z10);
    }

    public static f registerCustomTabsSession(Context context, c cVar, String str, b bVar) {
        zzeu.zzf();
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbxn zza = zzbsu.zza(context);
        if (zza == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (f) ObjectWrapper.t0(zza.zze(ObjectWrapper.u0(context), ObjectWrapper.u0(cVar), str, ObjectWrapper.u0(bVar)));
        } catch (RemoteException | IllegalArgumentException e8) {
            zzo.zzh("Unable to register custom tabs session. Error: ", e8);
            return null;
        }
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzeu.zzf().zzt(cls);
    }

    public static void registerWebView(WebView webView) {
        zzeu.zzf();
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzo.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzbxn zza = zzbsu.zza(webView.getContext());
        if (zza == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzj(ObjectWrapper.u0(webView));
        } catch (RemoteException e8) {
            zzo.zzh("", e8);
        }
    }

    public static void setAppMuted(boolean z10) {
        zzeu.zzf().zzu(z10);
    }

    public static void setAppVolume(float f10) {
        zzeu.zzf().zzv(f10);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzeu.zzf().zzw(str);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzeu.zzf().zzx(requestConfiguration);
    }

    public static void startPreload(Context context, List<PreloadConfiguration> list, PreloadCallback preloadCallback) {
        zzeu.zzf().zzh(context, list, preloadCallback);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzeu.zzf().zzq(context, null, onInitializationCompleteListener);
    }
}
