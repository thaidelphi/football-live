package com.ironsource;

import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class n5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f19344a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f19345b;

    public n5(String serverData) {
        kotlin.jvm.internal.n.f(serverData, "serverData");
        this.f19344a = serverData;
        this.f19345b = com.ironsource.mediationsdk.d.b();
    }

    public static /* synthetic */ n5 a(n5 n5Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = n5Var.f19344a;
        }
        return n5Var.a(str);
    }

    private final String c() {
        return this.f19344a;
    }

    public final n5 a(String serverData) {
        kotlin.jvm.internal.n.f(serverData, "serverData");
        return new n5(serverData);
    }

    public final String a() {
        String a10 = this.f19345b.a(this.f19344a);
        kotlin.jvm.internal.n.e(a10, "auctionDataUtils.getAdmFromServerData(serverData)");
        return a10;
    }

    public final Map<String, String> b() {
        Map<String, String> b10 = this.f19345b.b(this.f19344a);
        kotlin.jvm.internal.n.e(b10, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return b10;
    }

    public final String d() {
        String c10 = this.f19345b.c(this.f19344a);
        kotlin.jvm.internal.n.e(c10, "auctionDataUtils.getDyna…romServerData(serverData)");
        return c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5) && kotlin.jvm.internal.n.a(this.f19344a, ((n5) obj).f19344a);
    }

    public int hashCode() {
        return this.f19344a.hashCode();
    }

    public String toString() {
        return "AuctionServerData(serverData=" + this.f19344a + ')';
    }
}
