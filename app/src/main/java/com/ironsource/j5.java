package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f17930a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f17931b;

    /* renamed from: c  reason: collision with root package name */
    private final m5 f17932c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17933d;

    /* renamed from: e  reason: collision with root package name */
    private final String f17934e;

    public j5(String auctionId, JSONObject jSONObject, m5 m5Var, int i10, String auctionFallback) {
        kotlin.jvm.internal.n.f(auctionId, "auctionId");
        kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
        this.f17930a = auctionId;
        this.f17931b = jSONObject;
        this.f17932c = m5Var;
        this.f17933d = i10;
        this.f17934e = auctionFallback;
    }

    public static /* synthetic */ j5 a(j5 j5Var, String str, JSONObject jSONObject, m5 m5Var, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = j5Var.f17930a;
        }
        if ((i11 & 2) != 0) {
            jSONObject = j5Var.f17931b;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i11 & 4) != 0) {
            m5Var = j5Var.f17932c;
        }
        m5 m5Var2 = m5Var;
        if ((i11 & 8) != 0) {
            i10 = j5Var.f17933d;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str2 = j5Var.f17934e;
        }
        return j5Var.a(str, jSONObject2, m5Var2, i12, str2);
    }

    public final j5 a(String auctionId, JSONObject jSONObject, m5 m5Var, int i10, String auctionFallback) {
        kotlin.jvm.internal.n.f(auctionId, "auctionId");
        kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
        return new j5(auctionId, jSONObject, m5Var, i10, auctionFallback);
    }

    public final String a() {
        return this.f17930a;
    }

    public final JSONObject b() {
        return this.f17931b;
    }

    public final m5 c() {
        return this.f17932c;
    }

    public final int d() {
        return this.f17933d;
    }

    public final String e() {
        return this.f17934e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j5) {
            j5 j5Var = (j5) obj;
            return kotlin.jvm.internal.n.a(this.f17930a, j5Var.f17930a) && kotlin.jvm.internal.n.a(this.f17931b, j5Var.f17931b) && kotlin.jvm.internal.n.a(this.f17932c, j5Var.f17932c) && this.f17933d == j5Var.f17933d && kotlin.jvm.internal.n.a(this.f17934e, j5Var.f17934e);
        }
        return false;
    }

    public final String f() {
        return this.f17934e;
    }

    public final String g() {
        return this.f17930a;
    }

    public final JSONObject h() {
        return this.f17931b;
    }

    public int hashCode() {
        int hashCode = this.f17930a.hashCode() * 31;
        JSONObject jSONObject = this.f17931b;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        m5 m5Var = this.f17932c;
        return ((((hashCode2 + (m5Var != null ? m5Var.hashCode() : 0)) * 31) + this.f17933d) * 31) + this.f17934e.hashCode();
    }

    public final int i() {
        return this.f17933d;
    }

    public final m5 j() {
        return this.f17932c;
    }

    public String toString() {
        return "AuctionResponseData(auctionId=" + this.f17930a + ", auctionResponseGenericParam=" + this.f17931b + ", genericNotifications=" + this.f17932c + ", auctionTrial=" + this.f17933d + ", auctionFallback=" + this.f17934e + ')';
    }
}
