package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class y3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f21470a;

    public y3() {
        this(null, 1, null);
    }

    public y3(String auctionData) {
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        this.f21470a = auctionData;
    }

    public /* synthetic */ y3(String str, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ y3 a(y3 y3Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = y3Var.f21470a;
        }
        return y3Var.a(str);
    }

    public final y3 a(String auctionData) {
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        return new y3(auctionData);
    }

    public final String a() {
        return this.f21470a;
    }

    public final String b() {
        return this.f21470a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3) && kotlin.jvm.internal.n.a(this.f21470a, ((y3) obj).f21470a);
    }

    public int hashCode() {
        return this.f21470a.hashCode();
    }

    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f21470a + ')';
    }
}
