package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class p3 extends h {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzkl f13109e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(zzkl zzklVar, z0 z0Var) {
        super(z0Var);
        this.f13109e = zzklVar;
    }

    @Override // com.google.android.gms.measurement.internal.h
    public final void c() {
        this.f13109e.h();
        this.f13109e.f13220a.zzay().q().a("Starting upload from DelayedRunnable");
        this.f13109e.f13125b.x();
    }
}
