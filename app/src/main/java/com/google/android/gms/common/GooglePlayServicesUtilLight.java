package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ironsource.dp;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GooglePlayServicesUtilLight {
    @KeepForSdk
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f12026a = 12451000;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f12028c = false;

    /* renamed from: d  reason: collision with root package name */
    static boolean f12029d = false;
    @KeepForSdk
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f12027b = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f12030e = new AtomicBoolean();

    @KeepForSdk
    @Deprecated
    public static void a(Context context) {
        if (f12027b.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException e8) {
            Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e8);
        }
    }

    @KeepForSdk
    @Deprecated
    public static void b(Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int j10 = GoogleApiAvailabilityLight.h().j(context, i10);
        if (j10 != 0) {
            Intent d10 = GoogleApiAvailabilityLight.h().d(context, j10, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + j10);
            if (d10 == null) {
                throw new GooglePlayServicesNotAvailableException(j10);
            }
            throw new GooglePlayServicesRepairableException(j10, "Google Play Services not available", d10);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @KeepForSdk
    @Deprecated
    public static String d(int i10) {
        return ConnectionResult.C0(i10);
    }

    @KeepForSdk
    public static Context e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @KeepForSdk
    public static Resources f(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static boolean g(Context context) {
        try {
            if (!f12029d) {
                PackageInfo f10 = Wrappers.a(context).f("com.google.android.gms", 64);
                GoogleSignatureVerifier.a(context);
                if (f10 == null || GoogleSignatureVerifier.e(f10, false) || !GoogleSignatureVerifier.e(f10, true)) {
                    f12028c = false;
                } else {
                    f12028c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e8);
        } finally {
            f12029d = true;
        }
        return f12028c || !DeviceProperties.e();
    }

    @KeepForSdk
    @Deprecated
    public static int h(Context context, int i10) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(R.string.f12034a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f12030e.get()) {
            int a10 = zzah.a(context);
            if (a10 != 0) {
                if (a10 != f12026a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(a10);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        boolean z10 = (DeviceProperties.g(context) || DeviceProperties.i(context)) ? false : true;
        Preconditions.a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo(dp.f17077b, 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            GoogleSignatureVerifier.a(context);
            if (!GoogleSignatureVerifier.e(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z10) {
                    Preconditions.m(packageInfo);
                    if (!GoogleSignatureVerifier.e(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z10 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else if (com.google.android.gms.common.util.zza.a(packageInfo2.versionCode) < com.google.android.gms.common.util.zza.a(i10)) {
                    int i11 = packageInfo2.versionCode;
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i11);
                    return 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e8) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e8);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean i(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return m(context, "com.google.android.gms");
        }
        return false;
    }

    @KeepForSdk
    @TargetApi(18)
    public static boolean j(Context context) {
        if (PlatformVersion.c()) {
            Object systemService = context.getSystemService("user");
            Preconditions.m(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            return applicationRestrictions != null && com.ironsource.mediationsdk.metadata.a.f18924g.equals(applicationRestrictions.getString("restricted_profile"));
        }
        return false;
    }

    @KeepForSdk
    @Deprecated
    public static boolean k(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @KeepForSdk
    @TargetApi(19)
    @Deprecated
    public static boolean l(Context context, int i10, String str) {
        return UidVerifier.b(context, i10, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public static boolean m(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (PlatformVersion.f()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        return applicationInfo.enabled && !j(context);
    }
}
