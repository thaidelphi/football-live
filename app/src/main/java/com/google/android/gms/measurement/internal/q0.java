package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzaw f13116a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzq f13117b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzgq f13118c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(zzgq zzgqVar, zzaw zzawVar, zzq zzqVar) {
        this.f13118c = zzgqVar;
        this.f13116a = zzawVar;
        this.f13117b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13118c.v0(this.f13118c.t0(this.f13116a, this.f13117b), this.f13117b);
    }
}
