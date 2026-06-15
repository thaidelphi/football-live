package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class DeviceProperties {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f12733a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f12734b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f12735c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f12736d;

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f12737e;

    /* renamed from: f  reason: collision with root package name */
    private static Boolean f12738f;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f12737e == null) {
            boolean z10 = false;
            if (PlatformVersion.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f12737e = Boolean.valueOf(z10);
        }
        return f12737e.booleanValue();
    }

    @KeepForSdk
    public static boolean b(Context context) {
        if (f12738f == null) {
            boolean z10 = false;
            if (PlatformVersion.l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f12738f = Boolean.valueOf(z10);
        }
        return f12738f.booleanValue();
    }

    @KeepForSdk
    public static boolean c(Context context) {
        if (f12735c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f12735c = Boolean.valueOf(z10);
        }
        return f12735c.booleanValue();
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean d(Context context) {
        return h(context);
    }

    @KeepForSdk
    public static boolean e() {
        int i10 = GooglePlayServicesUtilLight.f12026a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @KeepForSdk
    @TargetApi(20)
    public static boolean f(Context context) {
        return j(context.getPackageManager());
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean g(Context context) {
        if (!f(context) || PlatformVersion.h()) {
            if (h(context)) {
                return !PlatformVersion.i() || PlatformVersion.l();
            }
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public static boolean h(Context context) {
        if (f12734b == null) {
            boolean z10 = false;
            if (PlatformVersion.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f12734b = Boolean.valueOf(z10);
        }
        return f12734b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f12736d == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f12736d = Boolean.valueOf(z10);
        }
        return f12736d.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean j(PackageManager packageManager) {
        if (f12733a == null) {
            boolean z10 = false;
            if (PlatformVersion.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f12733a = Boolean.valueOf(z10);
        }
        return f12733a.booleanValue();
    }
}
