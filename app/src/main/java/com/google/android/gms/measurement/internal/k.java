package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f13037a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f13038b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzd f13039c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(zzd zzdVar, String str, long j10) {
        this.f13039c = zzdVar;
        this.f13037a = str;
        this.f13038b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.e(this.f13039c, this.f13037a, this.f13038b);
    }
}
