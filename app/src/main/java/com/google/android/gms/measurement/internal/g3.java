package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class g3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f12966a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f12967b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f12968c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f12969d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f12970e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z10) {
        this.f12970e = appMeasurementDynamiteService;
        this.f12966a = zzcfVar;
        this.f12967b = str;
        this.f12968c = str2;
        this.f12969d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12970e.f12829a.G().Q(this.f12966a, this.f12967b, this.f12968c, this.f12969d);
    }
}
