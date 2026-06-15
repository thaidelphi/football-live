package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class u1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f13175a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f13176b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u1(zzid zzidVar, boolean z10) {
        this.f13176b = zzidVar;
        this.f13175a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean j10 = this.f13176b.f13220a.j();
        boolean i10 = this.f13176b.f13220a.i();
        this.f13176b.f13220a.f(this.f13175a);
        if (i10 == this.f13175a) {
            this.f13176b.f13220a.zzay().q().b("Default data collection state already set to", Boolean.valueOf(this.f13175a));
        }
        if (this.f13176b.f13220a.j() == j10 || this.f13176b.f13220a.j() != this.f13176b.f13220a.i()) {
            this.f13176b.f13220a.zzay().s().c("Default data collection is different than actual status", Boolean.valueOf(this.f13175a), Boolean.valueOf(j10));
        }
        this.f13176b.K();
    }
}
