package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f4 f12868a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f12869b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a4(AppMeasurementDynamiteService appMeasurementDynamiteService, f4 f4Var) {
        this.f12869b = appMeasurementDynamiteService;
        this.f12868a = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12869b.f12829a.D().C(this.f12868a);
    }
}
