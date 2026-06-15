package com.adcolony.sdk;

import com.adcolony.sdk.e0;
import java.io.IOException;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 a(String str, String str2) {
        String str3;
        try {
            return new f1(str);
        } catch (JSONException e8) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2 + ": " + e8.toString();
            }
            new e0.a().a(str3).a(e0.f5981i);
            return new f1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 b() {
        return new f1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(f1 f1Var, String str) {
        return f1Var.a(str, 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(f1 f1Var, String str) {
        return f1Var.j(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e1 e(f1 f1Var, String str) {
        return f1Var.l(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 f(f1 f1Var, String str) {
        return f1Var.m(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object g(f1 f1Var, String str) {
        Object o10 = f1Var.o(str);
        return o10 == null ? Boolean.FALSE : o10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(f1 f1Var, String str) {
        return f1Var.p(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(f1 f1Var, String str) {
        return f1Var.q(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(f1 f1Var, String str) {
        try {
            a.b().p().a(str, f1Var.toString(), false);
            return true;
        } catch (IOException e8) {
            new e0.a().a("IOException in ADCJSON's saveObject: ").a(e8.toString()).a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 b(String str) {
        return a(str, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 c(String str) {
        try {
            String sb = a.b().p().a(str, false).toString();
            return a(sb, "loadObject from filepath " + str);
        } catch (IOException e8) {
            new e0.a().a("IOException in ADCJSON's loadObject: ").a(e8.toString()).a(e0.f5981i);
            return b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(e1 e1Var, int i10) {
        return e1Var.d(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(f1 f1Var, String str) {
        return f1Var.f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(f1 f1Var, String str, int i10) {
        try {
            f1Var.b(str, i10);
            return true;
        } catch (JSONException e8) {
            e0.a a10 = new e0.a().a("JSON error in ADCJSON putInteger(): ").a(e8.toString());
            e0.a a11 = a10.a(" with key: " + str);
            a11.a(" and value: " + i10).a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e1 a() {
        return new e1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e1 a(String str) {
        try {
            return new e1(str);
        } catch (JSONException e8) {
            new e0.a().a(e8.toString()).a(e0.f5981i);
            return new e1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(f1 f1Var, String str, long j10) {
        try {
            f1Var.b(str, j10);
            return true;
        } catch (JSONException e8) {
            e0.a a10 = new e0.a().a("JSON error in ADCJSON putLong(): ").a(e8.toString());
            e0.a a11 = a10.a(" with key: " + str);
            a11.a(" and value: " + j10).a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(f1 f1Var, String str, int i10) {
        return f1Var.a(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(f1 f1Var, String str, long j10) {
        return f1Var.a(str, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(f1 f1Var, String str, boolean z10) {
        return f1Var.a(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 a(e1 e1Var, int i10) {
        return e1Var.c(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e1 a(f1 f1Var, String str) {
        return f1Var.k(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(f1 f1Var, String str, String str2) {
        try {
            f1Var.a(str, str2);
            return true;
        } catch (JSONException e8) {
            e0.a a10 = new e0.a().a("JSON error in ADCJSON putString(): ").a(e8.toString());
            e0.a a11 = a10.a(" with key: " + str);
            a11.a(" and value: " + str2).a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(f1 f1Var, String str, boolean z10) {
        try {
            f1Var.b(str, z10);
            return true;
        } catch (JSONException e8) {
            e0.a a10 = new e0.a().a("JSON error in ADCJSON putBoolean(): ").a(e8.toString());
            e0.a a11 = a10.a(" with key: " + str);
            a11.a(" and value: " + z10).a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(f1 f1Var, String str, e1 e1Var) {
        try {
            f1Var.a(str, e1Var);
            return true;
        } catch (JSONException e8) {
            e0.a a10 = new e0.a().a("JSON error in ADCJSON putArray(): ").a(e8.toString());
            e0.a a11 = a10.a(" with key: " + str);
            a11.a(" and value: " + e1Var).a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1[] b(e1 e1Var) {
        return e1Var.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(f1 f1Var, String str, f1 f1Var2) {
        try {
            f1Var.a(str, f1Var2);
            return true;
        } catch (JSONException e8) {
            e0.a a10 = new e0.a().a("JSON error in ADCJSON putObject(): ").a(e8.toString());
            e0.a a11 = a10.a(" with key: " + str);
            a11.a(" and value: " + f1Var2).a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(f1 f1Var, String str, double d10) {
        try {
            f1Var.b(str, d10);
            return true;
        } catch (JSONException unused) {
            e0.a a10 = new e0.a().a("JSON error in ADCJSON putDouble(): ");
            e0.a a11 = a10.a(" with key: " + str);
            a11.a(" and value: " + d10).a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(e1 e1Var, String str) {
        e1Var.b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(e1 e1Var, f1 f1Var) {
        e1Var.a(f1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] a(e1 e1Var) {
        return e1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 a(f1... f1VarArr) {
        f1 f1Var = new f1();
        for (f1 f1Var2 : f1VarArr) {
            f1Var.a(f1Var2);
        }
        return f1Var;
    }
}
