package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13096a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f13097b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o1(zzid zzidVar, AtomicReference atomicReference) {
        this.f13097b = zzidVar;
        this.f13096a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f13096a) {
            this.f13096a.set(Long.valueOf(this.f13097b.f13220a.u().m(this.f13097b.f13220a.w().n(), zzeb.N)));
            this.f13096a.notify();
        }
    }
}
