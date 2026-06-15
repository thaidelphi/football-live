package com.ironsource;

import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class w4 implements x4 {

    /* renamed from: a  reason: collision with root package name */
    private final vi f21254a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f21255b;

    /* renamed from: c  reason: collision with root package name */
    private final c5 f21256c;

    public w4(vi instanceInfo, com.ironsource.mediationsdk.d auctionDataUtils, c5 c5Var) {
        kotlin.jvm.internal.n.f(instanceInfo, "instanceInfo");
        kotlin.jvm.internal.n.f(auctionDataUtils, "auctionDataUtils");
        this.f21254a = instanceInfo;
        this.f21255b = auctionDataUtils;
        this.f21256c = c5Var;
    }

    private final void a(List<String> list, String str) {
        for (String str2 : list) {
            this.f21255b.a(str, this.f21254a.e(), com.ironsource.mediationsdk.d.b().a(str2, this.f21254a.e(), this.f21254a.f(), this.f21254a.d(), "", "", "", ""));
        }
    }

    @Override // com.ironsource.x4
    public void a(String methodName) {
        List<String> d10;
        kotlin.jvm.internal.n.f(methodName, "methodName");
        c5 c5Var = this.f21256c;
        if (c5Var == null || (d10 = c5Var.b()) == null) {
            d10 = j8.q.d();
        }
        a(d10, methodName);
    }

    @Override // com.ironsource.x4
    public void b(String methodName) {
        List<String> d10;
        kotlin.jvm.internal.n.f(methodName, "methodName");
        c5 c5Var = this.f21256c;
        if (c5Var == null || (d10 = c5Var.c()) == null) {
            d10 = j8.q.d();
        }
        a(d10, methodName);
    }

    @Override // com.ironsource.x4
    public void c(String methodName) {
        List<String> d10;
        kotlin.jvm.internal.n.f(methodName, "methodName");
        c5 c5Var = this.f21256c;
        if (c5Var == null || (d10 = c5Var.a()) == null) {
            d10 = j8.q.d();
        }
        a(d10, methodName);
    }
}
