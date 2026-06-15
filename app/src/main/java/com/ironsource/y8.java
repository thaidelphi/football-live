package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class y8 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f21481a = "NETWORK_TYPE_WIFI";

    /* renamed from: b  reason: collision with root package name */
    public static final String f21482b = "NETWORK_TYPE_VPN";

    /* renamed from: c  reason: collision with root package name */
    public static final String f21483c = "NETWORK_TYPE_ETHERNET";

    /* renamed from: d  reason: collision with root package name */
    public static final String f21484d = "NETWORK_TYPE_UNKNOWN";

    /* renamed from: e  reason: collision with root package name */
    public static final String f21485e = "notReachable";

    /* renamed from: f  reason: collision with root package name */
    public static final String f21486f = "PHONE_TYPE_NONE";

    /* renamed from: g  reason: collision with root package name */
    public static final String f21487g = "NETWORK_TYPE_GPRS";

    /* renamed from: h  reason: collision with root package name */
    public static final String f21488h = "NETWORK_TYPE_EDGE";

    /* renamed from: i  reason: collision with root package name */
    public static final String f21489i = "NETWORK_TYPE_UMTS";

    /* renamed from: j  reason: collision with root package name */
    public static final String f21490j = "NETWORK_TYPE_CDMA";

    /* renamed from: k  reason: collision with root package name */
    public static final String f21491k = "NETWORK_TYPE_EVDO_0";

    /* renamed from: l  reason: collision with root package name */
    public static final String f21492l = "NETWORK_TYPE_EVDO_A";

    /* renamed from: m  reason: collision with root package name */
    public static final String f21493m = "NETWORK_TYPE_1xRTT";

    /* renamed from: n  reason: collision with root package name */
    public static final String f21494n = "NETWORK_TYPE_HSDPA";

    /* renamed from: o  reason: collision with root package name */
    public static final String f21495o = "NETWORK_TYPE_HSUPA";

    /* renamed from: p  reason: collision with root package name */
    public static final String f21496p = "NETWORK_TYPE_HSPA";

    /* renamed from: q  reason: collision with root package name */
    public static final String f21497q = "NETWORK_TYPE_IDEN";

    /* renamed from: r  reason: collision with root package name */
    public static final String f21498r = "NETWORK_TYPE_EVDO_B";

    /* renamed from: s  reason: collision with root package name */
    public static final String f21499s = "NETWORK_TYPE_LTE";

    /* renamed from: t  reason: collision with root package name */
    public static final String f21500t = "NETWORK_TYPE_EHRPD";

    /* renamed from: u  reason: collision with root package name */
    public static final String f21501u = "NETWORK_TYPE_HSPAP";

    /* renamed from: v  reason: collision with root package name */
    public static final String f21502v = "NETWORK_TYPE_GSM";

    /* renamed from: w  reason: collision with root package name */
    public static final String f21503w = "NETWORK_TYPE_TD_SCDMA";

    /* renamed from: x  reason: collision with root package name */
    public static final String f21504x = "NETWORK_TYPE_IWLAN";

    /* renamed from: y  reason: collision with root package name */
    public static final String f21505y = "NETWORK_TYPE_LTE_CA";

    /* renamed from: z  reason: collision with root package name */
    public static final String f21506z = "NETWORK_TYPE_NR";

    @SuppressLint({"MissingPermission"})
    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    private static Network a(ConnectivityManager connectivityManager) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return connectivityManager.getActiveNetwork();
            }
            return null;
        } catch (Throwable th) {
            o9.d().a(th);
            return null;
        }
    }

    private static String a(int i10) {
        switch (i10) {
            case 0:
                return f21486f;
            case 1:
                return f21487g;
            case 2:
                return f21488h;
            case 3:
                return f21489i;
            case 4:
                return f21490j;
            case 5:
                return f21491k;
            case 6:
                return f21492l;
            case 7:
                return f21493m;
            case 8:
                return f21494n;
            case 9:
                return f21495o;
            case 10:
                return f21496p;
            case 11:
                return f21497q;
            case 12:
                return f21498r;
            case 13:
                return f21499s;
            case 14:
                return f21500t;
            case 15:
                return f21501u;
            case 16:
                return f21502v;
            case 17:
                return f21503w;
            case 18:
                return f21504x;
            case 19:
                return f21505y;
            case 20:
                return f21506z;
            default:
                return f21484d;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 21 && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                return networkCapabilities.hasTransport(1) ? x8.f21379b : networkCapabilities.hasTransport(0) ? x8.f21378a : c(context);
            }
            return c(context);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return "none";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(b9.i.f16729v, e(context));
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }
        return jSONObject;
    }

    public static String b(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? a(a(context), context) : c(context);
    }

    @SuppressLint({"MissingPermission"})
    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT >= 23 && network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return x8.f21379b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return x8.f21384g;
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return x8.f21382e;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return x8.f21385h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return x8.f21386i;
                }
                if (networkCapabilities.hasTransport(2)) {
                    return x8.f21381d;
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }
        return "";
    }

    private static String c(Context context) {
        String a10 = x8.a(context);
        return TextUtils.isEmpty(a10) ? "none" : a10;
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && Build.VERSION.SDK_INT >= 21) {
            Network a10 = a(connectivityManager);
            if (a10 == null) {
                return f21485e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(a10);
                if (networkCapabilities == null) {
                    return f21484d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f21481a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th) {
                o9.d().a(th);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("Error getting network capabilities: " + th);
            }
        }
        return f21484d;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }
}
