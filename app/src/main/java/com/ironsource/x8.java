package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class x8 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f21378a = "3g";

    /* renamed from: b  reason: collision with root package name */
    public static final String f21379b = "wifi";

    /* renamed from: c  reason: collision with root package name */
    public static final String f21380c = "none";

    /* renamed from: d  reason: collision with root package name */
    public static final String f21381d = "bluetooth";

    /* renamed from: e  reason: collision with root package name */
    public static final String f21382e = "ethernet";

    /* renamed from: f  reason: collision with root package name */
    public static final String f21383f = "vpn";

    /* renamed from: g  reason: collision with root package name */
    public static final String f21384g = "cellular";

    /* renamed from: h  reason: collision with root package name */
    public static final String f21385h = "wifiAware";

    /* renamed from: i  reason: collision with root package name */
    public static final String f21386i = "lowpan";

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        String str;
        StringBuilder sb = new StringBuilder();
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    String typeName = activeNetworkInfo.getTypeName();
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        str = f21378a;
                    } else if (type == 1) {
                        str = f21379b;
                    } else {
                        sb.append(typeName);
                    }
                    sb.append(str);
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }
        return sb.toString();
    }

    public static int b(Context context) {
        if (context != null) {
            try {
                return context.getResources().getConfiguration().mcc;
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                return -1;
            }
        }
        return -1;
    }

    public static int c(Context context) {
        if (context != null) {
            try {
                return context.getResources().getConfiguration().mnc;
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                return -1;
            }
        }
        return -1;
    }

    public static String d(Context context) {
        if (context != null) {
            try {
                return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                return "";
            }
        }
        return "";
    }

    @SuppressLint({"MissingPermission"})
    public static int e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT >= 24 && (packageManager.checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0 || packageManager.checkPermission("android.permission.READ_BASIC_PHONE_STATE", context.getPackageName()) == 0)) {
                return telephonyManager.getDataNetworkType();
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return -1;
    }

    public static int f(Context context) {
        if (context != null) {
            try {
                return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }
        return -1;
    }

    public static String g(Context context) {
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                return telephonyManager != null ? telephonyManager.getSimOperator() : "";
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                return "";
            }
        }
        return "";
    }

    public static boolean h(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return false;
        }
    }

    public static boolean i(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(0)) == null || !networkInfo.isConnected()) ? false : true;
    }

    public static boolean j(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected()) ? false : true;
    }
}
