package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzde {
    public static void zza(boolean z10, String str) throws zzdd {
        if (!z10) {
            throw new zzdd(str);
        }
    }

    public static boolean zzb(Context context) {
        int i10 = zzeh.zza;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(zzeh.zzc) || "XT1650".equals(zzeh.zzd))) {
            if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                return zzd("EGL_EXT_protected_content");
            }
            return false;
        }
        return false;
    }

    public static boolean zzc() {
        return zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }
}
