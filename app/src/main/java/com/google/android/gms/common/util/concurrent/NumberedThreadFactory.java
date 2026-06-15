package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.b9;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f12762a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f12763b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private final ThreadFactory f12764c = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(String str) {
        Preconditions.n(str, "Name must not be null");
        this.f12762a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f12764c.newThread(new a(runnable, 0));
        int andIncrement = this.f12763b.getAndIncrement();
        newThread.setName(this.f12762a + b9.i.f16696d + andIncrement + b9.i.f16698e);
        return newThread;
    }
}
