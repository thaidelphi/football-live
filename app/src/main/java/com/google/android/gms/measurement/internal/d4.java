package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class d4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f12904a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f12905b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f12906c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f12907d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        this.f12907d = appMeasurementDynamiteService;
        this.f12904a = zzcfVar;
        this.f12905b = str;
        this.f12906c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12907d.f12829a.G().O(this.f12904a, this.f12905b, this.f12906c);
    }
}
