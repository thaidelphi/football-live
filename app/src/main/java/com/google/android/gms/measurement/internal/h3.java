package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class h3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f12986a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzki f12987b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h3(zzki zzkiVar, long j10) {
        this.f12987b = zzkiVar;
        this.f12986a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzki.m(this.f12987b, this.f12986a);
    }
}
