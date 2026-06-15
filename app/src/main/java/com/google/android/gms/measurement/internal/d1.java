package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class d1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f12899a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f12900b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(zzid zzidVar, long j10) {
        this.f12900b = zzidVar;
        this.f12899a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12900b.f13220a.A().f13237k.b(this.f12899a);
        this.f12900b.f13220a.zzay().l().b("Session timeout duration set", Long.valueOf(this.f12899a));
    }
}
