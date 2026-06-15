package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class e4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f12928a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f12929b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f12929b = appMeasurementDynamiteService;
        this.f12928a = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12929b.f12829a.I().y(this.f12928a, this.f12929b.f12829a.i());
    }
}
