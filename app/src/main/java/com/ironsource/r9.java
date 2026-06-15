package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class r9 {

    /* renamed from: a  reason: collision with root package name */
    private final String f19933a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19934b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19935c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19936d;

    public r9() {
        this(null, null, null, null, 15, null);
    }

    public r9(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        kotlin.jvm.internal.n.f(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.n.f(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.n.f(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.n.f(customBannerAdapterName, "customBannerAdapterName");
        this.f19933a = customNetworkAdapterName;
        this.f19934b = customRewardedVideoAdapterName;
        this.f19935c = customInterstitialAdapterName;
        this.f19936d = customBannerAdapterName;
    }

    public /* synthetic */ r9(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ r9 a(r9 r9Var, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r9Var.f19933a;
        }
        if ((i10 & 2) != 0) {
            str2 = r9Var.f19934b;
        }
        if ((i10 & 4) != 0) {
            str3 = r9Var.f19935c;
        }
        if ((i10 & 8) != 0) {
            str4 = r9Var.f19936d;
        }
        return r9Var.a(str, str2, str3, str4);
    }

    public final r9 a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        kotlin.jvm.internal.n.f(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.n.f(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.n.f(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.n.f(customBannerAdapterName, "customBannerAdapterName");
        return new r9(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public final String a() {
        return this.f19933a;
    }

    public final String b() {
        return this.f19934b;
    }

    public final String c() {
        return this.f19935c;
    }

    public final String d() {
        return this.f19936d;
    }

    public final String e() {
        return this.f19936d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r9) {
            r9 r9Var = (r9) obj;
            return kotlin.jvm.internal.n.a(this.f19933a, r9Var.f19933a) && kotlin.jvm.internal.n.a(this.f19934b, r9Var.f19934b) && kotlin.jvm.internal.n.a(this.f19935c, r9Var.f19935c) && kotlin.jvm.internal.n.a(this.f19936d, r9Var.f19936d);
        }
        return false;
    }

    public final String f() {
        return this.f19935c;
    }

    public final String g() {
        return this.f19933a;
    }

    public final String h() {
        return this.f19934b;
    }

    public int hashCode() {
        return (((((this.f19933a.hashCode() * 31) + this.f19934b.hashCode()) * 31) + this.f19935c.hashCode()) * 31) + this.f19936d.hashCode();
    }

    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f19933a + ", customRewardedVideoAdapterName=" + this.f19934b + ", customInterstitialAdapterName=" + this.f19935c + ", customBannerAdapterName=" + this.f19936d + ')';
    }
}
