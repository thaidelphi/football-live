package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class d8 {

    /* renamed from: a  reason: collision with root package name */
    private static WebView f6823a;

    /* renamed from: b  reason: collision with root package name */
    private static String f6824b;

    /* renamed from: e  reason: collision with root package name */
    private static int f6827e;

    /* renamed from: f  reason: collision with root package name */
    private static String f6828f;

    /* renamed from: g  reason: collision with root package name */
    private static String f6829g;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f6825c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f6826d = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicBoolean f6830h = new AtomicBoolean();

    static {
        if (e()) {
            f6824b = (String) r4.a(q4.K, "", com.applovin.impl.sdk.j.m());
            return;
        }
        f6824b = "";
        r4.b(q4.K, (Object) null, com.applovin.impl.sdk.j.m());
        r4.b(q4.L, (Object) null, com.applovin.impl.sdk.j.m());
    }

    public static void a(final com.applovin.impl.sdk.j jVar) {
        if (f6826d.getAndSet(true)) {
            return;
        }
        if (l0.d()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.y9
                @Override // java.lang.Runnable
                public final void run() {
                    d8.d(com.applovin.impl.sdk.j.this);
                }
            });
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.z9
                @Override // java.lang.Runnable
                public final void run() {
                    d8.e(com.applovin.impl.sdk.j.this);
                }
            });
        }
    }

    public static String b() {
        return f6829g;
    }

    public static String c() {
        return f6828f;
    }

    public static int d() {
        return f6827e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.impl.sdk.j jVar) {
        try {
            f(jVar);
            synchronized (f6825c) {
                f6824b = f6823a.getSettings().getUserAgentString();
                r4.b(q4.K, f6824b, com.applovin.impl.sdk.j.m());
                r4.b(q4.L, Build.VERSION.RELEASE, com.applovin.impl.sdk.j.m());
            }
        } catch (Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            jVar.D().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static void f(com.applovin.impl.sdk.j jVar) {
    }

    public static void b(com.applovin.impl.sdk.j jVar) {
        if (f6830h.getAndSet(true)) {
            return;
        }
        PackageInfo c10 = c(jVar);
        if (c10 == null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("WebViewDataCollector", "Failed to get WebView package info");
                return;
            }
            return;
        }
        f6827e = c10.versionCode;
        f6828f = c10.versionName;
        f6829g = c10.packageName;
    }

    private static PackageInfo c(com.applovin.impl.sdk.j jVar) {
        PackageManager packageManager = com.applovin.impl.sdk.j.m().getPackageManager();
        if (l0.i()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = jVar.c(o4.f8183o4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.j jVar) {
        try {
            synchronized (f6825c) {
                f6824b = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.j.m());
                r4.b(q4.K, f6824b, com.applovin.impl.sdk.j.m());
                r4.b(q4.L, Build.VERSION.RELEASE, com.applovin.impl.sdk.j.m());
            }
        } catch (Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            jVar.D().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static String a() {
        String str;
        synchronized (f6825c) {
            str = f6824b;
        }
        return str;
    }

    public static boolean e() {
        boolean equals;
        synchronized (f6825c) {
            equals = Build.VERSION.RELEASE.equals((String) r4.a(q4.L, "", com.applovin.impl.sdk.j.m()));
        }
        return equals;
    }
}
