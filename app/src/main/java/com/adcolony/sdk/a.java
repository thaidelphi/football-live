package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.adcolony.sdk.e0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static Context f5748a = null;

    /* renamed from: b  reason: collision with root package name */
    private static k f5749b = null;

    /* renamed from: c  reason: collision with root package name */
    static boolean f5750c = false;

    /* renamed from: d  reason: collision with root package name */
    static boolean f5751d = false;

    /* renamed from: e  reason: collision with root package name */
    static boolean f5752e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(AdColonyAppOptions adColonyAppOptions) {
        f5752e = adColonyAppOptions.getIsChildDirectedApp() && (!adColonyAppOptions.isPrivacyFrameworkRequiredSet(AdColonyAppOptions.COPPA) || adColonyAppOptions.getPrivacyFrameworkRequired(AdColonyAppOptions.COPPA));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k b() {
        if (!d()) {
            Context a10 = a();
            if (a10 != null) {
                f5749b = new k();
                f5749b.a(new AdColonyAppOptions().a(c0.h(c0.c(a10.getFilesDir().getAbsolutePath() + "/adc3/AppInfo"), "appId")), false);
            } else {
                return new k();
            }
        }
        return f5749b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return f5748a != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d() {
        return f5749b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e() {
        return f5750c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f() {
        b().r().j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, AdColonyAppOptions adColonyAppOptions, boolean z10) {
        a((z10 && (context instanceof Activity)) ? ((Activity) context).getApplication() : context);
        f5751d = true;
        if (f5749b == null) {
            f5749b = new k();
            adColonyAppOptions.b(context);
            f5749b.a(adColonyAppOptions, z10);
        } else {
            adColonyAppOptions.b(context);
            f5749b.a(adColonyAppOptions);
        }
        a(adColonyAppOptions);
        q n10 = f5749b.n();
        n10.a(context);
        n10.b(context);
        new e0.a().a("Configuring AdColony").a(e0.f5976d);
        f5749b.c(false);
        f5749b.x().g(false);
        f5749b.d(true);
        f5749b.x().c(false);
        f5749b.x().d(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, j0 j0Var) {
        b().r().b(str, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        f5748a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context a() {
        return f5748a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, j0 j0Var) {
        b().r().a(str, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 a(String str, j0 j0Var, boolean z10) {
        b().r().a(str, j0Var);
        return j0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, f1 f1Var) {
        if (f1Var == null) {
            f1Var = c0.b();
        }
        c0.a(f1Var, "m_type", str);
        b().r().c(f1Var);
    }
}
