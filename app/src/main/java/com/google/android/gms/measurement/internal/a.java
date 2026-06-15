package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f12831a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f12832b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzd f12833c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(zzd zzdVar, String str, long j10) {
        this.f12833c = zzdVar;
        this.f12831a = str;
        this.f12832b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.d(this.f12833c, this.f12831a, this.f12832b);
    }
}
