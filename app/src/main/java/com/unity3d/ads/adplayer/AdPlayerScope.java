package com.unity3d.ads.adplayer;

import d9.j0;
import d9.o0;
import d9.p0;
import kotlin.jvm.internal.n;
import m8.g;
/* compiled from: AdPlayerScope.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AdPlayerScope implements o0 {
    private final /* synthetic */ o0 $$delegate_0;
    private final j0 defaultDispatcher;

    public AdPlayerScope(j0 defaultDispatcher) {
        n.f(defaultDispatcher, "defaultDispatcher");
        this.defaultDispatcher = defaultDispatcher;
        this.$$delegate_0 = p0.a(defaultDispatcher);
    }

    @Override // d9.o0
    public g getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
