package com.ironsource;

import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f17377a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f17378b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17379c;

    /* renamed from: d  reason: collision with root package name */
    private String f17380d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, ? extends Object> f17381e;

    /* renamed from: f  reason: collision with root package name */
    private com.ironsource.mediationsdk.h f17382f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f17383g;

    public f5(String name, boolean z10) {
        Map<String, ? extends Object> f10;
        kotlin.jvm.internal.n.f(name, "name");
        this.f17377a = name;
        this.f17378b = z10;
        this.f17380d = "";
        f10 = j8.j0.f();
        this.f17381e = f10;
        this.f17383g = new HashMap();
    }

    public static /* synthetic */ f5 a(f5 f5Var, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = f5Var.f17377a;
        }
        if ((i10 & 2) != 0) {
            z10 = f5Var.f17378b;
        }
        return f5Var.a(str, z10);
    }

    public final f5 a(String name, boolean z10) {
        kotlin.jvm.internal.n.f(name, "name");
        return new f5(name, z10);
    }

    public final String a() {
        return this.f17377a;
    }

    public final void a(com.ironsource.mediationsdk.h hVar) {
        this.f17382f = hVar;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f17380d = str;
    }

    public final void a(Map<String, Object> map) {
        kotlin.jvm.internal.n.f(map, "<set-?>");
        this.f17383g = map;
    }

    public final void a(boolean z10) {
        this.f17379c = z10;
    }

    public final void b(Map<String, ? extends Object> map) {
        kotlin.jvm.internal.n.f(map, "<set-?>");
        this.f17381e = map;
    }

    public final boolean b() {
        return this.f17378b;
    }

    public final Map<String, Object> c() {
        return this.f17383g;
    }

    public final com.ironsource.mediationsdk.h d() {
        return this.f17382f;
    }

    public final boolean e() {
        return this.f17378b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            return kotlin.jvm.internal.n.a(this.f17377a, f5Var.f17377a) && this.f17378b == f5Var.f17378b;
        }
        return false;
    }

    public final Map<String, Object> f() {
        return this.f17381e;
    }

    public final String g() {
        return this.f17377a;
    }

    public final String h() {
        return this.f17380d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f17377a.hashCode() * 31;
        boolean z10 = this.f17378b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean i() {
        return this.f17379c;
    }

    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f17377a + ", bidder=" + this.f17378b + ')';
    }
}
