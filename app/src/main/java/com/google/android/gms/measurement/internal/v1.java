package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class v1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f13187a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f13188b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f13188b = appMeasurementDynamiteService;
        this.f13187a = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13188b.f12829a.G().M(this.f13187a);
    }
}
