package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzn {
    private final zzl zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    public /* synthetic */ zzn(zzl zzlVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzm zzmVar) {
        this.zza = zzlVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    public static /* bridge */ /* synthetic */ zzcf zza(zzn zznVar) {
        Bundle bundle;
        Application application;
        Application application2;
        List arrayList;
        zzam zzamVar;
        Application application3;
        Application application4;
        Application application5;
        List list;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        long j10;
        Application application9;
        zzcf zzcfVar = new zzcf();
        String zza = zznVar.zzd.zza();
        if (TextUtils.isEmpty(zza)) {
            try {
                application = zznVar.zza.zza;
                PackageManager packageManager = application.getPackageManager();
                application2 = zznVar.zza.zza;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                zza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(zza)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzcfVar.zza = zza;
        if (!zznVar.zzc.isTestDevice()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            int debugGeography = zznVar.zzc.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(zzca.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(zzca.GEO_OVERRIDE_NON_EEA);
            } else if (debugGeography == 3) {
                arrayList.add(zzca.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (debugGeography == 4) {
                arrayList.add(zzca.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzca.PREVIEWING_DEBUG_MESSAGES);
        }
        zzcfVar.zzi = arrayList;
        zzamVar = zznVar.zza.zzb;
        zzcfVar.zze = zzamVar.zzc();
        zzcfVar.zzd = Boolean.valueOf(zznVar.zzd.isTagForUnderAgeOfConsent());
        zzcfVar.zzc = Locale.getDefault().toLanguageTag();
        zzcb zzcbVar = new zzcb();
        int i10 = Build.VERSION.SDK_INT;
        zzcbVar.zzb = Integer.valueOf(i10);
        zzcbVar.zza = Build.MODEL;
        zzcbVar.zzc = 2;
        zzcfVar.zzb = zzcbVar;
        application3 = zznVar.zza.zza;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zznVar.zza.zza;
        application4.getResources().getConfiguration();
        zzcd zzcdVar = new zzcd();
        zzcdVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcdVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        application5 = zznVar.zza.zza;
        zzcdVar.zzc = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        if (i10 < 28) {
            list = Collections.emptyList();
        } else {
            Activity activity = zznVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzcc zzccVar = new zzcc();
                        zzccVar.zzb = Integer.valueOf(rect.left);
                        zzccVar.zzc = Integer.valueOf(rect.right);
                        zzccVar.zza = Integer.valueOf(rect.top);
                        zzccVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzccVar);
                    }
                }
                list = arrayList2;
            }
        }
        zzcdVar.zzd = list;
        zzcfVar.zzf = zzcdVar;
        zzl zzlVar = zznVar.zza;
        application6 = zzlVar.zza;
        try {
            application9 = zzlVar.zza;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzbz zzbzVar = new zzbz();
        zzbzVar.zza = application6.getPackageName();
        application7 = zznVar.zza.zza;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zznVar.zza.zza;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        zzbzVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j10 = packageInfo.getLongVersionCode();
            } else {
                j10 = packageInfo.versionCode;
            }
            zzbzVar.zzc = Long.toString(j10);
        }
        zzcfVar.zzg = zzbzVar;
        zzce zzceVar = new zzce();
        zzceVar.zza = "3.1.0";
        zzcfVar.zzh = zzceVar;
        return zzcfVar;
    }
}
