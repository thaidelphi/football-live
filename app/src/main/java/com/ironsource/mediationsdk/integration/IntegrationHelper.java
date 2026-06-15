package com.ironsource.mediationsdk.integration;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.o9;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class IntegrationHelper {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18863a = "IntegrationHelper";

    /* renamed from: b  reason: collision with root package name */
    private static final String f18864b = "4.1";

    /* renamed from: c  reason: collision with root package name */
    private static final String f18865c = "4.3";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f18866a;

        a(Context context) {
            this.f18866a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(IntegrationHelper.f18863a, "--------------- Google Play Services --------------");
                if (this.f18866a.getPackageManager().getApplicationInfo(this.f18866a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.i(IntegrationHelper.f18863a, "Google Play Services - VERIFIED");
                    String b10 = p.m().b(this.f18866a);
                    if (!TextUtils.isEmpty(b10)) {
                        Log.i(IntegrationHelper.f18863a, "GAID is: " + b10 + " (use this for test devices)");
                    }
                } else {
                    Log.e(IntegrationHelper.f18863a, "Google Play Services - MISSING");
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                Log.e(IntegrationHelper.f18863a, "Google Play Services - MISSING");
            }
        }
    }

    private static IntegrationData a(Context context, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Context.class).invoke(null, context);
            Log.i(f18863a, "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException e8) {
            o9.d().a(e8);
            str2 = "Adapter - MISSING";
            Log.e(f18863a, str2);
            return null;
        } catch (Exception e10) {
            o9.d().a(e10);
            str2 = "Adapter version - NOT VERIFIED";
            Log.e(f18863a, str2);
            return null;
        }
    }

    private static void a(Context context) {
        new a(context).start();
    }

    private static void a(String str) {
        try {
            Log.i(f18863a, "SDK Version - " + ((String) Class.forName(str).getMethod("getAdapterSDKVersion", new Class[0]).invoke(null, new Object[0])));
        } catch (Exception e8) {
            o9.d().a(e8);
            Log.w("validateSDKVersion", "Unable to get SDK version");
        }
    }

    private static boolean a(IntegrationData integrationData) {
        if (integrationData.version.startsWith(f18864b) || integrationData.version.startsWith(f18865c)) {
            Log.i(f18863a, "Adapter - VERIFIED");
            return true;
        }
        Log.e(f18863a, integrationData.name + " adapter " + integrationData.version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to version " + f18864b + ".*");
        return false;
    }

    private static void b(Context context) {
        Log.i(f18863a, "*** Permissions ***");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            Log.i(f18863a, "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e(f18863a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            Log.i(f18863a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e(f18863a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r3 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r3 == 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r2 = "--------------- " + r9 + " --------------";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        r2 = "--------------- Liftoff Monetization --------------";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r2 = "--------------- Google (AdMob and Ad Manager) --------------";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "IntegrationHelper"
            r1 = 0
            java.lang.String r2 = com.ironsource.environment.StringUtils.toLowerCase(r9)     // Catch: java.lang.Exception -> L9f
            r3 = -1
            int r4 = r2.hashCode()     // Catch: java.lang.Exception -> L9f
            r5 = -805296079(0xffffffffd0002831, float:-8.6004705E9)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L32
            r5 = 92668925(0x58603fd, float:1.2602765E-35)
            if (r4 == r5) goto L28
            r5 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r4 == r5) goto L1e
            goto L3b
        L1e:
            java.lang.String r4 = "facebook"
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L9f
            if (r2 == 0) goto L3b
            r3 = r1
            goto L3b
        L28:
            java.lang.String r4 = "admob"
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L9f
            if (r2 == 0) goto L3b
            r3 = r7
            goto L3b
        L32:
            java.lang.String r4 = "vungle"
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L9f
            if (r2 == 0) goto L3b
            r3 = r6
        L3b:
            if (r3 == 0) goto L5e
            if (r3 == r7) goto L5b
            if (r3 == r6) goto L58
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9f
            r2.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r3 = "--------------- "
            r2.append(r3)     // Catch: java.lang.Exception -> L9f
            r2.append(r9)     // Catch: java.lang.Exception -> L9f
            java.lang.String r3 = " --------------"
            r2.append(r3)     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L9f
            goto L60
        L58:
            java.lang.String r2 = "--------------- Liftoff Monetization --------------"
            goto L60
        L5b:
            java.lang.String r2 = "--------------- Google (AdMob and Ad Manager) --------------"
            goto L60
        L5e:
            java.lang.String r2 = "--------------- Meta --------------"
        L60:
            android.util.Log.i(r0, r2)     // Catch: java.lang.Exception -> L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9f
            r2.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r3 = "com.ironsource.adapters."
            r2.append(r3)     // Catch: java.lang.Exception -> L9f
            java.lang.String r3 = com.ironsource.environment.StringUtils.toLowerCase(r9)     // Catch: java.lang.Exception -> L9f
            r2.append(r3)     // Catch: java.lang.Exception -> L9f
            java.lang.String r3 = "."
            r2.append(r3)     // Catch: java.lang.Exception -> L9f
            r2.append(r9)     // Catch: java.lang.Exception -> L9f
            java.lang.String r3 = "Adapter"
            r2.append(r3)     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L9f
            com.ironsource.mediationsdk.IntegrationData r8 = a(r8, r2)     // Catch: java.lang.Exception -> L9f
            if (r8 != 0) goto L8c
            return r1
        L8c:
            java.lang.String r3 = "IronSource"
            boolean r3 = r9.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L9f
            if (r3 != 0) goto L9b
            boolean r8 = a(r8)     // Catch: java.lang.Exception -> L9f
            if (r8 != 0) goto L9b
            return r1
        L9b:
            a(r2)     // Catch: java.lang.Exception -> L9f
            return r7
        L9f:
            r8 = move-exception
            com.ironsource.o9 r2 = com.ironsource.o9.d()
            r2.a(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isAdapterValid "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            android.util.Log.e(r0, r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.b(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
        if (r6.equals("facebook") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (r6.equals("facebook") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void validateIntegration(android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(android.content.Context):void");
    }
}
