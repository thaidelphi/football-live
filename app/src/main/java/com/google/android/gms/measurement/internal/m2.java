package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class m2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f13078a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzaw f13079b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f13080c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f13081d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        this.f13081d = appMeasurementDynamiteService;
        this.f13078a = zzcfVar;
        this.f13079b = zzawVar;
        this.f13080c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13081d.f12829a.G().k(this.f13078a, this.f13079b, this.f13080c);
    }
}
