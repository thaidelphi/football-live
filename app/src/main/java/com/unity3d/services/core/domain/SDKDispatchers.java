package com.unity3d.services.core.domain;

import d9.f1;
import d9.j0;
/* compiled from: SDKDispatchers.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class SDKDispatchers implements ISDKDispatchers {
    private final j0 io = f1.b();

    /* renamed from: default  reason: not valid java name */
    private final j0 f1default = f1.a();
    private final j0 main = f1.c();

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public j0 getDefault() {
        return this.f1default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public j0 getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public j0 getMain() {
        return this.main;
    }
}
