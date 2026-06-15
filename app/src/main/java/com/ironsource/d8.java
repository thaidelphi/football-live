package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d8 {

    /* renamed from: a  reason: collision with root package name */
    private String f16954a;

    /* renamed from: b  reason: collision with root package name */
    private String f16955b;

    /* renamed from: c  reason: collision with root package name */
    private String f16956c;

    public d8(String cachedAppKey, String cachedUserId, String cachedSettings) {
        kotlin.jvm.internal.n.f(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.n.f(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.n.f(cachedSettings, "cachedSettings");
        this.f16954a = cachedAppKey;
        this.f16955b = cachedUserId;
        this.f16956c = cachedSettings;
    }

    public static /* synthetic */ d8 a(d8 d8Var, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = d8Var.f16954a;
        }
        if ((i10 & 2) != 0) {
            str2 = d8Var.f16955b;
        }
        if ((i10 & 4) != 0) {
            str3 = d8Var.f16956c;
        }
        return d8Var.a(str, str2, str3);
    }

    public final d8 a(String cachedAppKey, String cachedUserId, String cachedSettings) {
        kotlin.jvm.internal.n.f(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.n.f(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.n.f(cachedSettings, "cachedSettings");
        return new d8(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final String a() {
        return this.f16954a;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f16954a = str;
    }

    public final String b() {
        return this.f16955b;
    }

    public final void b(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f16956c = str;
    }

    public final String c() {
        return this.f16956c;
    }

    public final void c(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f16955b = str;
    }

    public final String d() {
        return this.f16954a;
    }

    public final String e() {
        return this.f16956c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d8) {
            d8 d8Var = (d8) obj;
            return kotlin.jvm.internal.n.a(this.f16954a, d8Var.f16954a) && kotlin.jvm.internal.n.a(this.f16955b, d8Var.f16955b) && kotlin.jvm.internal.n.a(this.f16956c, d8Var.f16956c);
        }
        return false;
    }

    public final String f() {
        return this.f16955b;
    }

    public int hashCode() {
        return (((this.f16954a.hashCode() * 31) + this.f16955b.hashCode()) * 31) + this.f16956c.hashCode();
    }

    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.f16954a + ", cachedUserId=" + this.f16955b + ", cachedSettings=" + this.f16956c + ')';
    }
}
