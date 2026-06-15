package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class n1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13089a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f13090b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(zzid zzidVar, AtomicReference atomicReference) {
        this.f13090b = zzidVar;
        this.f13089a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f13089a) {
            this.f13089a.set(this.f13090b.f13220a.u().s(this.f13090b.f13220a.w().n(), zzeb.M));
            this.f13089a.notify();
        }
    }
}
