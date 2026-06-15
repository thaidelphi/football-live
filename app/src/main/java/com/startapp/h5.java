package com.startapp;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h5 {

    /* renamed from: a  reason: collision with root package name */
    public final String f22026a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22027b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22028c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f22029d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f22030e;

    /* renamed from: f  reason: collision with root package name */
    public final Boolean f22031f;

    public h5(Context context) {
        this.f22027b = true;
        this.f22028c = true;
        this.f22029d = true;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                return;
            }
            Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
            if (obj != null) {
                String obj2 = obj.toString();
                this.f22026a = obj2;
                Log.i("StartAppSDK", "appId is " + obj2);
            } else {
                Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
            }
            if (applicationInfo.metaData.containsKey("com.startapp.sdk.CONSENT_ENABLED")) {
                this.f22029d = applicationInfo.metaData.getBoolean("com.startapp.sdk.CONSENT_ENABLED");
            }
            if (applicationInfo.metaData.containsKey("com.startapp.sdk.RETURN_ADS_ENABLED")) {
                boolean z10 = applicationInfo.metaData.getBoolean("com.startapp.sdk.RETURN_ADS_ENABLED");
                this.f22027b = z10;
                Log.i("StartAppSDK", "returnAds enabled: " + z10);
            }
            if (applicationInfo.metaData.containsKey("com.startapp.sdk.SPLASH_ENABLED")) {
                boolean z11 = applicationInfo.metaData.getBoolean("com.startapp.sdk.SPLASH_ENABLED");
                this.f22028c = z11;
                Log.i("StartAppSDK", "splash enabled: " + z11);
            }
            if (applicationInfo.metaData.containsKey("com.startapp.sdk.MIXED_AUDIENCE")) {
                Boolean valueOf = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.MIXED_AUDIENCE"));
                this.f22030e = valueOf;
                Log.i("StartAppSDK", "is mixed audience: " + valueOf);
            }
            if (applicationInfo.metaData.containsKey("com.startapp.sdk.CHILD_DIRECTED")) {
                Boolean valueOf2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.CHILD_DIRECTED"));
                this.f22031f = valueOf2;
                Log.i("StartAppSDK", "is child directed: " + valueOf2);
            }
        } catch (Throwable th) {
            l3.a(th);
        }
    }
}
