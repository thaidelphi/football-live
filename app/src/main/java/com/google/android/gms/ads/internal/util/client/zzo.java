package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.ads.zzftk;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class zzo {

    /* renamed from: a  reason: collision with root package name */
    protected static final zzftk f11394a = zzftk.zza(4000);

    static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            return str + " @" + lineNumber;
        }
        return str;
    }

    public static void zze(String str) {
        if (zzm(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : f11394a.zzd(str)) {
                if (z10) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzm(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void zzg(String str) {
        if (zzm(6)) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : f11394a.zzd(str)) {
                    if (z10) {
                        Log.e("Ads", str2);
                    } else {
                        Log.e("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.e("Ads", str);
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void zzi(String str) {
        if (zzm(4)) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : f11394a.zzd(str)) {
                    if (z10) {
                        Log.i("Ads", str2);
                    } else {
                        Log.i("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.i("Ads", str);
        }
    }

    public static void zzj(String str) {
        if (zzm(5)) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : f11394a.zzd(str)) {
                    if (z10) {
                        Log.w("Ads", str2);
                    } else {
                        Log.w("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.w("Ads", str);
        }
    }

    public static void zzk(String str, Throwable th) {
        if (zzm(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void zzl(String str, Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzk(a(str), th);
            } else {
                zzj(a(str));
            }
        }
    }

    public static boolean zzm(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }
}
