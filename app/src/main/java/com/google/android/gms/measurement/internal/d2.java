package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f12901a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzis f12902b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d2(zzis zzisVar, long j10) {
        this.f12902b = zzisVar;
        this.f12901a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12902b.f13220a.t().i(this.f12901a);
        this.f12902b.f13640e = null;
    }
}
