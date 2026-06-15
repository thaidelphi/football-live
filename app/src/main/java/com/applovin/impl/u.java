package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u {

    /* renamed from: e  reason: collision with root package name */
    private static u f9312e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f9313f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f9314a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9315b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9316c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9317d;

    /* JADX WARN: Removed duplicated region for block: B:49:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private u(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "AndroidManifest"
            r9.<init>()
            r1 = 0
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L1f android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r3 = r10.getPackageName()     // Catch: java.lang.Throwable -> L1f android.content.pm.PackageManager.NameNotFoundException -> L23
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch: java.lang.Throwable -> L1f android.content.pm.PackageManager.NameNotFoundException -> L23
            android.os.Bundle r3 = r2.metaData     // Catch: java.lang.Throwable -> L1f android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r1 = r2.processName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d java.lang.Throwable -> La6
            r9.f9314a = r3
            r9.f9317d = r1
            goto L2e
        L1d:
            r2 = move-exception
            goto L25
        L1f:
            r10 = move-exception
            r3 = r1
            goto La7
        L23:
            r2 = move-exception
            r3 = r1
        L25:
            java.lang.String r4 = "Failed to get meta data."
            com.applovin.impl.sdk.n.c(r0, r4, r2)     // Catch: java.lang.Throwable -> La6
            r9.f9314a = r3
            r9.f9317d = r1
        L2e:
            r1 = 0
            android.content.res.AssetManager r10 = r10.getAssets()     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r10 = r10.openXmlResourceParser(r2)     // Catch: java.lang.Throwable -> L94
            int r2 = r10.getEventType()     // Catch: java.lang.Throwable -> L94
            r3 = r1
            r4 = r3
        L3f:
            r5 = 2
            r6 = 1
            if (r5 != r2) goto L86
            java.lang.String r2 = r10.getName()     // Catch: java.lang.Throwable -> L91
            java.lang.String r5 = "application"
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L86
            r2 = r1
        L50:
            int r5 = r10.getAttributeCount()     // Catch: java.lang.Throwable -> L91
            if (r2 >= r5) goto L86
            java.lang.String r5 = r10.getAttributeName(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.String r7 = r10.getAttributeValue(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.String r8 = "networkSecurityConfig"
            boolean r8 = r5.equals(r8)     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L73
            java.lang.String r5 = r7.substring(r6)     // Catch: java.lang.Throwable -> L91
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L91
            int r3 = r5.intValue()     // Catch: java.lang.Throwable -> L91
            goto L83
        L73:
            java.lang.String r8 = "usesCleartextTraffic"
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L83
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L91
            boolean r4 = r5.booleanValue()     // Catch: java.lang.Throwable -> L91
        L83:
            int r2 = r2 + 1
            goto L50
        L86:
            int r2 = r10.next()     // Catch: java.lang.Throwable -> L91
            if (r2 != r6) goto L3f
            r9.f9315b = r3
            r9.f9316c = r4
            goto L9f
        L91:
            r10 = move-exception
            r1 = r4
            goto L96
        L94:
            r10 = move-exception
            r3 = r1
        L96:
            java.lang.String r2 = "Failed to parse AndroidManifest.xml."
            com.applovin.impl.sdk.n.c(r0, r2, r10)     // Catch: java.lang.Throwable -> La0
            r9.f9315b = r3
            r9.f9316c = r1
        L9f:
            return
        La0:
            r10 = move-exception
            r9.f9315b = r3
            r9.f9316c = r1
            throw r10
        La6:
            r10 = move-exception
        La7:
            r9.f9314a = r3
            r9.f9317d = r1
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.u.<init>(android.content.Context):void");
    }

    public static u a(Context context) {
        u uVar;
        synchronized (f9313f) {
            if (f9312e == null) {
                f9312e = new u(context);
            }
            uVar = f9312e;
        }
        return uVar;
    }

    public boolean a(String str) {
        Bundle bundle = this.f9314a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public String a(String str, String str2) {
        Bundle bundle = this.f9314a;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f9314a;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }

    public String a() {
        return this.f9317d;
    }
}
