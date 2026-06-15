package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzt {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11987a;

    /* renamed from: b  reason: collision with root package name */
    private int f11988b;

    /* renamed from: c  reason: collision with root package name */
    private int f11989c = 0;

    public zzt(Context context) {
        this.f11987a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f11988b == 0) {
            try {
                packageInfo = Wrappers.a(this.f11987a).f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e8) {
                String valueOf = String.valueOf(e8);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f11988b = packageInfo.versionCode;
            }
        }
        return this.f11988b;
    }

    public final synchronized int b() {
        int i10 = this.f11989c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f11987a.getPackageManager();
        if (Wrappers.a(this.f11987a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!PlatformVersion.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f11989c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f11989c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.i()) {
            this.f11989c = 2;
            i11 = 2;
        } else {
            this.f11989c = 1;
        }
        return i11;
    }
}
