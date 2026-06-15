package com.applovin.impl;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k6 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f7401g;

    public k6(com.applovin.impl.sdk.j jVar, String str, Runnable runnable) {
        this(jVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7401g.run();
    }

    public k6(com.applovin.impl.sdk.j jVar, boolean z10, String str, Runnable runnable) {
        super("TaskRunnable:" + str, jVar, z10);
        this.f7401g = runnable;
    }
}
