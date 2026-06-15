package com.ironsource;

import com.ironsource.wh;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class lr implements wh, wh.a {

    /* renamed from: a  reason: collision with root package name */
    private kr f18262a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f18263b;

    @Override // com.ironsource.wh
    public el a() {
        kr krVar = this.f18262a;
        if (krVar != null) {
            return new el(krVar);
        }
        return null;
    }

    @Override // com.ironsource.wh.a
    public void a(kr sdkConfig) {
        kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
        this.f18262a = sdkConfig;
    }

    @Override // com.ironsource.wh
    public tj b() {
        kr krVar = this.f18262a;
        if (krVar != null) {
            return new tj(krVar);
        }
        return null;
    }

    @Override // com.ironsource.wh
    public boolean c() {
        return this.f18263b;
    }

    @Override // com.ironsource.wh.a
    public void d() {
        this.f18263b = true;
    }
}
