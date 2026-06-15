package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class to {

    /* renamed from: a  reason: collision with root package name */
    private final String f20851a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20852b;

    public to(String url, String str) {
        kotlin.jvm.internal.n.f(url, "url");
        this.f20851a = url;
        this.f20852b = str;
    }

    public /* synthetic */ to(String str, String str2, int i10, kotlin.jvm.internal.h hVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ to a(to toVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = toVar.f20851a;
        }
        if ((i10 & 2) != 0) {
            str2 = toVar.f20852b;
        }
        return toVar.a(str, str2);
    }

    public final to a(String url, String str) {
        kotlin.jvm.internal.n.f(url, "url");
        return new to(url, str);
    }

    public final String a() {
        return this.f20851a;
    }

    public final String b() {
        return this.f20852b;
    }

    public final String c() {
        return this.f20852b;
    }

    public final String d() {
        return this.f20851a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof to) {
            to toVar = (to) obj;
            return kotlin.jvm.internal.n.a(this.f20851a, toVar.f20851a) && kotlin.jvm.internal.n.a(this.f20852b, toVar.f20852b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f20851a.hashCode() * 31;
        String str = this.f20852b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OpenUrl(url=" + this.f20851a + ", packageName=" + this.f20852b + ')';
    }
}
