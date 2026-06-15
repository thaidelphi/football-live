package com.google.android.gms.ads.internal.util.client;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zza implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f11371a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f11372b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(String str) {
        this.f11372b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f11371a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + this.f11372b + ") #" + andIncrement);
    }
}
