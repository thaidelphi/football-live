package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.n2;
import com.applovin.impl.o4;
import com.ironsource.b9;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f8986b;

    /* renamed from: a  reason: collision with root package name */
    private final j f8987a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(j jVar) {
        this.f8987a = jVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z10) {
        f8986b = z10;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!f8986b || a()) {
            Log.e("AppLovinSdk", b9.i.f16696d + str + "] " + str2, th);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (!f8986b || a()) {
            Log.d("AppLovinSdk", b9.i.f16696d + str + "] " + str2);
        }
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (!f8986b || a()) {
            Log.i("AppLovinSdk", b9.i.f16696d + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!f8986b || a()) {
            Log.w("AppLovinSdk", b9.i.f16696d + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        j jVar = j.f8884u0;
        if (jVar == null) {
            return;
        }
        jVar.I();
        if (a()) {
            j.f8884u0.I().k(str, str2);
        }
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", b9.i.f16696d + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int intValue;
        if (a(this.f8987a) && !TextUtils.isEmpty(str2) && (intValue = ((Integer) this.f8987a.a(o4.f8210s)).intValue()) > 0) {
            int length = str2.length();
            int i10 = ((length + intValue) - 1) / intValue;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * intValue;
                a(str, str2.substring(i12, Math.min(length, i12 + intValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        n2 n2Var = new n2();
        n2Var.a().a(str).a();
        g("AppLovinSdk", n2Var.toString());
    }

    public static void b(String str, String str2, Throwable th) {
        j jVar = j.f8884u0;
        if (jVar == null) {
            return;
        }
        jVar.I();
        if (a()) {
            j.f8884u0.I().a(str, str2, th);
        }
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", b9.i.f16696d + str + "] " + str2, th);
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public void a(String str, Throwable th) {
        if (com.applovin.impl.l0.e()) {
            for (Throwable th2 : th.getSuppressed()) {
                b(str, th2.toString());
            }
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", b9.i.f16696d + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", b9.i.f16696d + str + "] " + str2, th);
    }

    public static boolean a() {
        return a(j.f8884u0);
    }

    public static boolean a(j jVar) {
        return jVar != null && jVar.g0().c();
    }
}
