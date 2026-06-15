package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.eh;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Logger {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f20639a;

    public static void d(String str, String str2) {
        if (f20639a) {
            Log.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f20639a) {
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (f20639a) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f20639a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i10) {
        f20639a = eh.d.MODE_0.a() != i10;
    }

    public static void i(String str, String str2) {
        if (f20639a) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (!f20639a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th);
    }

    public static void v(String str, String str2) {
        if (f20639a) {
            Log.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (f20639a) {
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2) {
        if (f20639a) {
            Log.w(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (f20639a) {
            Log.w(str, str2, th);
        }
    }
}
