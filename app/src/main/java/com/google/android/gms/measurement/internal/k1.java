package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13044a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f13045b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(zzid zzidVar, AtomicReference atomicReference) {
        this.f13045b = zzidVar;
        this.f13044a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f13044a) {
            this.f13044a.set(Boolean.valueOf(this.f13045b.f13220a.u().w(this.f13045b.f13220a.w().n(), zzeb.L)));
            this.f13044a.notify();
        }
    }
}
