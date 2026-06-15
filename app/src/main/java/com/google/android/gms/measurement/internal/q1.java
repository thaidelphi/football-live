package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class q1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13119a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f13120b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(zzid zzidVar, AtomicReference atomicReference) {
        this.f13120b = zzidVar;
        this.f13119a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f13119a) {
            this.f13119a.set(Double.valueOf(this.f13120b.f13220a.u().f(this.f13120b.f13220a.w().n(), zzeb.P)));
            this.f13119a.notify();
        }
    }
}
