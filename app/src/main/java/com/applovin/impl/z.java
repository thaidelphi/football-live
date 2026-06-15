package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class z implements Callable {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f9797a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f9798b;

    /* renamed from: c  reason: collision with root package name */
    protected final com.applovin.impl.sdk.n f9799c;

    /* renamed from: e  reason: collision with root package name */
    protected final AtomicBoolean f9801e = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final Context f9800d = com.applovin.impl.sdk.j.m();

    public z(String str, com.applovin.impl.sdk.j jVar) {
        this.f9798b = str;
        this.f9797a = jVar;
        this.f9799c = jVar.I();
    }

    public Context a() {
        return this.f9800d;
    }

    public void a(boolean z10) {
        this.f9801e.set(z10);
    }
}
