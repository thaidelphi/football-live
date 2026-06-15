package com.applovin.impl;

import com.applovin.impl.r;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final a f6986g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(r.a aVar);
    }

    public f5(com.applovin.impl.sdk.j jVar, a aVar) {
        super("TaskCollectAdvertisingId", jVar, true);
        this.f6986g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6986g.a(this.f9827a.x().f());
    }
}
