package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    public static boolean a() {
        return true;
    }

    @KeepForSdk
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 16;
    }

    @KeepForSdk
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 18;
    }

    @KeepForSdk
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 19;
    }

    @KeepForSdk
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 20;
    }

    @KeepForSdk
    public static boolean f() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @KeepForSdk
    public static boolean g() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @KeepForSdk
    public static boolean h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @KeepForSdk
    public static boolean i() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    public static boolean j() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @KeepForSdk
    public static boolean k() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    public static boolean l() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    public static boolean m() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
