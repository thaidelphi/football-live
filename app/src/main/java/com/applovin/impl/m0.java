package com.applovin.impl;

import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final a f7488a = new a("Age Restricted User", q4.f8450m);

    /* renamed from: b  reason: collision with root package name */
    private static final a f7489b = new a("Has User Consent", q4.f8449l);

    /* renamed from: c  reason: collision with root package name */
    private static final a f7490c = new a("\"Do Not Sell\"", q4.f8451n);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f7491a;

        /* renamed from: b  reason: collision with root package name */
        private final q4 f7492b;

        a(String str, q4 q4Var) {
            this.f7491a = str;
            this.f7492b = q4Var;
        }

        public Boolean b(Context context) {
            if (context == null) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to get value for key: " + this.f7492b);
                return null;
            }
            return (Boolean) r4.a(this.f7492b, (Object) null, context);
        }

        public String a() {
            return this.f7491a;
        }

        public String a(Context context) {
            Boolean b10 = b(context);
            return b10 != null ? b10.toString() : "No value set";
        }
    }

    public static a a() {
        return f7490c;
    }

    public static a b() {
        return f7489b;
    }

    public static a c() {
        return f7488a;
    }

    public static boolean a(boolean z10, Context context) {
        return a(q4.f8451n, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(q4.f8449l, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f7489b, context) + a(f7490c, context);
    }

    private static boolean a(q4 q4Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to update compliance value for key: " + q4Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) r4.a(q4Var, (Object) null, context);
            r4.b(q4Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.f8884u0;
            if (jVar != null) {
                jVar.D().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f7491a + " - " + aVar.a(context);
    }
}
