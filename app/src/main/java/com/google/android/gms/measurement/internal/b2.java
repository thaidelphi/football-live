package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzik f12877a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzik f12878b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f12879c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f12880d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzis f12881e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b2(zzis zzisVar, zzik zzikVar, zzik zzikVar2, long j10, boolean z10) {
        this.f12881e = zzisVar;
        this.f12877a = zzikVar;
        this.f12878b = zzikVar2;
        this.f12879c = j10;
        this.f12880d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12881e.j(this.f12877a, this.f12878b, this.f12879c, this.f12880d, null);
    }
}
