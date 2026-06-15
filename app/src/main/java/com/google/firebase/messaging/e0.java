package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Metadata.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14972a;

    /* renamed from: b  reason: collision with root package name */
    private String f14973b;

    /* renamed from: c  reason: collision with root package name */
    private String f14974c;

    /* renamed from: d  reason: collision with root package name */
    private int f14975d;

    /* renamed from: e  reason: collision with root package name */
    private int f14976e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(Context context) {
        this.f14972a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(c6.e eVar) {
        String d10 = eVar.m().d();
        if (d10 != null) {
            return d10;
        }
        String c10 = eVar.m().c();
        if (c10.startsWith("1:")) {
            String[] split = c10.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return c10;
    }

    private PackageInfo f(String str) {
        try {
            return this.f14972a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("FirebaseMessaging", "Failed to find package " + e8);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f14972a.getPackageName());
        if (f10 != null) {
            this.f14973b = Integer.toString(f10.versionCode);
            this.f14974c = f10.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        if (this.f14973b == null) {
            h();
        }
        return this.f14973b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        if (this.f14974c == null) {
            h();
        }
        return this.f14974c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f10;
        if (this.f14975d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f14975d = f10.versionCode;
        }
        return this.f14975d;
    }

    synchronized int e() {
        int i10 = this.f14976e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f14972a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f14976e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f14976e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.i()) {
            this.f14976e = 2;
        } else {
            this.f14976e = 1;
        }
        return this.f14976e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return e() != 0;
    }
}
