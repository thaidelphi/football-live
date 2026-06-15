package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h6 {
    @SuppressLint({"MissingPermission"})
    public static String a(Context context) {
        int dataNetworkType;
        String num;
        NetworkCapabilities networkCapabilities;
        int dataNetworkType2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                if (y.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                            if (!networkCapabilities.hasTransport(1)) {
                                if (networkCapabilities.hasTransport(0)) {
                                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                    if (telephonyManager != null) {
                                        if (i10 < 30) {
                                            dataNetworkType2 = telephonyManager.getNetworkType();
                                        } else {
                                            dataNetworkType2 = telephonyManager.getDataNetworkType();
                                        }
                                        num = Integer.toString(dataNetworkType2);
                                        return num;
                                    }
                                    return "e101";
                                }
                            }
                            return "WIFI";
                        }
                        return "e102";
                    }
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        if (typeName.toLowerCase().compareTo("WIFI".toLowerCase()) == 0) {
                            return "WIFI";
                        }
                        if (typeName.toLowerCase().compareTo("MOBILE".toLowerCase()) == 0) {
                            TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                            if (telephonyManager2 != null) {
                                if (i10 < 30) {
                                    dataNetworkType = telephonyManager2.getNetworkType();
                                } else {
                                    dataNetworkType = telephonyManager2.getDataNetworkType();
                                }
                                num = Integer.toString(dataNetworkType);
                                return num;
                            }
                            return "e101";
                        }
                    }
                    return "e102";
                }
                return "e105";
            }
            return "e100";
        } catch (Exception unused) {
            return "e105";
        }
    }
}
