package com.startapp;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s1 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f22491a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f22492b;

    public s1(String str) {
        this.f22492b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "startapp-" + this.f22492b + "-" + this.f22491a.incrementAndGet());
    }
}
