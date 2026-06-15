package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class z2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzee f13269a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjr f13270b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z2(zzjr zzjrVar, zzee zzeeVar) {
        this.f13270b = zzjrVar;
        this.f13269a = zzeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f13270b) {
            this.f13270b.f13648a = false;
            if (!this.f13270b.f13650c.u()) {
                this.f13270b.f13650c.f13220a.zzay().q().a("Connected to service");
                this.f13270b.f13650c.s(this.f13269a);
            }
        }
    }
}
