package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f12760a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadFactory f12761b = Executors.defaultThreadFactory();

    @KeepForSdk
    public NamedThreadFactory(String str) {
        Preconditions.n(str, "Name must not be null");
        this.f12760a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f12761b.newThread(new a(runnable, 0));
        newThread.setName(this.f12760a);
        return newThread;
    }
}
