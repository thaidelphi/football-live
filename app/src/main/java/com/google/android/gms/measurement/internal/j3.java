package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final long f13032a;

    /* renamed from: b  reason: collision with root package name */
    final long f13033b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k3 f13034c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j3(k3 k3Var, long j10, long j11) {
        this.f13034c = k3Var;
        this.f13032a = j10;
        this.f13033b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13034c.f13050b.f13220a.zzaz().u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
            @Override // java.lang.Runnable
            public final void run() {
                j3 j3Var = j3.this;
                k3 k3Var = j3Var.f13034c;
                long j10 = j3Var.f13032a;
                long j11 = j3Var.f13033b;
                k3Var.f13050b.c();
                k3Var.f13050b.f13220a.zzay().l().a("Application going to the background");
                k3Var.f13050b.f13220a.A().f13243q.a(true);
                Bundle bundle = new Bundle();
                if (!k3Var.f13050b.f13220a.u().y()) {
                    k3Var.f13050b.f13675e.b(j11);
                    k3Var.f13050b.f13675e.d(false, false, j11);
                }
                k3Var.f13050b.f13220a.D().q("auto", "_ab", j10, bundle);
            }
        });
    }
}
