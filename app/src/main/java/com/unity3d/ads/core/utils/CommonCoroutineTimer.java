package com.unity3d.ads.core.utils;

import d9.j0;
import d9.k;
import d9.o0;
import d9.p0;
import d9.u2;
import d9.z;
import d9.z1;
import i8.w;
import kotlin.jvm.internal.n;
import t8.a;
/* compiled from: CommonCoroutineTimer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final j0 dispatcher;
    private final z job;
    private final o0 scope;

    public CommonCoroutineTimer(j0 dispatcher) {
        n.f(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        z b10 = u2.b(null, 1, null);
        this.job = b10;
        this.scope = p0.a(dispatcher.plus(b10));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public z1 start(long j10, long j11, a<w> action) {
        z1 d10;
        n.f(action, "action");
        d10 = k.d(this.scope, this.dispatcher, null, new CommonCoroutineTimer$start$1(j10, action, j11, null), 2, null);
        return d10;
    }
}
