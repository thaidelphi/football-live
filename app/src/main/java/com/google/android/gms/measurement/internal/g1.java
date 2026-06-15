package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f12958a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f12959b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(zzid zzidVar, long j10) {
        this.f12959b = zzidVar;
        this.f12958a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12959b.u(this.f12958a, true);
        this.f12959b.f13220a.G().N(new AtomicReference());
    }
}
