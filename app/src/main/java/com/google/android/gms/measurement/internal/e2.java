package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzik f12922a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f12923b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzis f12924c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e2(zzis zzisVar, zzik zzikVar, long j10) {
        this.f12924c = zzisVar;
        this.f12922a = zzikVar;
        this.f12923b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12924c.k(this.f12922a, false, this.f12923b);
        zzis zzisVar = this.f12924c;
        zzisVar.f13640e = null;
        zzisVar.f13220a.G().p(null);
    }
}
