package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c7 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6758a;

    /* renamed from: b  reason: collision with root package name */
    private String f6759b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6760c = a(q4.f8446i, (String) r4.a(q4.f8445h, (Object) null, com.applovin.impl.sdk.j.m()));

    /* renamed from: d  reason: collision with root package name */
    private final String f6761d;

    public c7(com.applovin.impl.sdk.j jVar) {
        this.f6758a = jVar;
        this.f6761d = a(q4.f8447j, (String) jVar.a(o4.f8106f));
        a(d());
    }

    private String a(q4 q4Var, String str) {
        String str2 = (String) r4.a(q4Var, (Object) null, com.applovin.impl.sdk.j.m());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        r4.b(q4Var, str, com.applovin.impl.sdk.j.m());
        return str;
    }

    private String d() {
        if (!((Boolean) this.f6758a.a(o4.I3)).booleanValue()) {
            this.f6758a.c(q4.f8444g);
        }
        String str = (String) this.f6758a.a(q4.f8444g);
        if (StringUtils.isValidString(str)) {
            this.f6758a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f6758a.I();
                I.a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
            }
            return str;
        }
        return null;
    }

    public String b() {
        return this.f6760c;
    }

    public String c() {
        return this.f6759b;
    }

    public void a(String str) {
        if (((Boolean) this.f6758a.a(o4.I3)).booleanValue()) {
            this.f6758a.b(q4.f8444g, str);
        }
        this.f6759b = str;
        this.f6758a.q().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.j jVar) {
        q4 q4Var = q4.f8448k;
        String str = (String) jVar.a(q4Var);
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
            jVar.b(q4Var, valueOf);
            return valueOf;
        }
        return str;
    }

    public String a() {
        return this.f6761d;
    }
}
