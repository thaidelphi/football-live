package com.ironsource;

import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class y4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f21471a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21472b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21473c;

    /* renamed from: d  reason: collision with root package name */
    private String f21474d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, ? extends Object> f21475e;

    /* renamed from: f  reason: collision with root package name */
    private com.ironsource.mediationsdk.h f21476f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f21477g;

    public y4(String name, boolean z10) {
        Map<String, ? extends Object> f10;
        kotlin.jvm.internal.n.f(name, "name");
        this.f21471a = name;
        this.f21472b = z10;
        this.f21474d = "";
        f10 = j8.j0.f();
        this.f21475e = f10;
        this.f21477g = new HashMap();
    }

    public static /* synthetic */ y4 a(y4 y4Var, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = y4Var.f21471a;
        }
        if ((i10 & 2) != 0) {
            z10 = y4Var.f21472b;
        }
        return y4Var.a(str, z10);
    }

    public final y4 a(String name, boolean z10) {
        kotlin.jvm.internal.n.f(name, "name");
        return new y4(name, z10);
    }

    public final String a() {
        return this.f21471a;
    }

    public final void a(com.ironsource.mediationsdk.h hVar) {
        this.f21476f = hVar;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f21474d = str;
    }

    public final void a(Map<String, Object> map) {
        kotlin.jvm.internal.n.f(map, "<set-?>");
        this.f21477g = map;
    }

    public final void a(boolean z10) {
        this.f21473c = z10;
    }

    public final void b(Map<String, ? extends Object> map) {
        kotlin.jvm.internal.n.f(map, "<set-?>");
        this.f21475e = map;
    }

    public final boolean b() {
        return this.f21472b;
    }

    public final Map<String, Object> c() {
        return this.f21477g;
    }

    public final com.ironsource.mediationsdk.h d() {
        return this.f21476f;
    }

    public final boolean e() {
        return this.f21472b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y4) {
            y4 y4Var = (y4) obj;
            return kotlin.jvm.internal.n.a(this.f21471a, y4Var.f21471a) && this.f21472b == y4Var.f21472b;
        }
        return false;
    }

    public final Map<String, Object> f() {
        return this.f21475e;
    }

    public final String g() {
        return this.f21471a;
    }

    public final String h() {
        return this.f21474d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f21471a.hashCode() * 31;
        boolean z10 = this.f21472b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean i() {
        return this.f21473c;
    }

    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f21471a + ", bidder=" + this.f21472b + ')';
    }
}
