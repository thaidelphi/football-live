package com.ironsource;

import com.ironsource.ls;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class kr {

    /* renamed from: a  reason: collision with root package name */
    private final sr f18110a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kr(kr sdkConfig) {
        this(sdkConfig.f18110a);
        kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
    }

    public kr(sr sdkInitResponse) {
        kotlin.jvm.internal.n.f(sdkInitResponse, "sdkInitResponse");
        this.f18110a = sdkInitResponse;
    }

    public final k4 a() {
        return this.f18110a.a().b().c();
    }

    public final d4 b() {
        return this.f18110a.a().b().b();
    }

    public final mc c() {
        return this.f18110a.b();
    }

    public final ls d() {
        return this.f18110a.c();
    }

    public final gm e() {
        return this.f18110a.a().b().e();
    }

    public final ls.a f() {
        ls.a h10 = this.f18110a.c().h();
        kotlin.jvm.internal.n.e(h10, "sdkInitResponse.fullResponse.origin");
        return h10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final sr g() {
        return this.f18110a;
    }
}
