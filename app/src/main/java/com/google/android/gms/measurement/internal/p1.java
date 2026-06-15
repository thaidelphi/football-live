package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class p1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13106a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f13107b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(zzid zzidVar, AtomicReference atomicReference) {
        this.f13107b = zzidVar;
        this.f13106a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f13106a) {
            this.f13106a.set(Integer.valueOf(this.f13107b.f13220a.u().j(this.f13107b.f13220a.w().n(), zzeb.O)));
            this.f13106a.notify();
        }
    }
}
