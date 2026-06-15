package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class jk implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f17959a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r10) {
        kotlin.jvm.internal.n.f(r10, "r");
        kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.f27370a;
        String format = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.f17959a.incrementAndGet())}, 2));
        kotlin.jvm.internal.n.e(format, "format(locale, format, *args)");
        return new Thread(r10, format);
    }
}
