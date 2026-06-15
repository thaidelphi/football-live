package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f12954a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f12955b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(h hVar, z0 z0Var) {
        this.f12955b = hVar;
        this.f12954a = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12954a.zzaw();
        if (zzab.a()) {
            this.f12954a.zzaz().u(this);
            return;
        }
        boolean e8 = this.f12955b.e();
        this.f12955b.f12976c = 0L;
        if (e8) {
            this.f12955b.c();
        }
    }
}
