package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CustomThreadFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadFactory f14794e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f14795a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final String f14796b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14797c;

    /* renamed from: d  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f14798d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f14796b = str;
        this.f14797c = i10;
        this.f14798d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f14797c);
        StrictMode.ThreadPolicy threadPolicy = this.f14798d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f14794e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f14796b, Long.valueOf(this.f14795a.getAndIncrement())));
        return newThread;
    }
}
