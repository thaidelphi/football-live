package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class b3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzee f12882a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjr f12883b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b3(zzjr zzjrVar, zzee zzeeVar) {
        this.f12883b = zzjrVar;
        this.f12882a = zzeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f12883b) {
            this.f12883b.f13648a = false;
            if (!this.f12883b.f13650c.u()) {
                this.f12883b.f13650c.f13220a.zzay().l().a("Connected to remote service");
                this.f12883b.f13650c.s(this.f12882a);
            }
        }
    }
}
