package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f12944a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f12945b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f12946c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f12947d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzid f12948e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(zzid zzidVar, String str, String str2, Object obj, long j10) {
        this.f12948e = zzidVar;
        this.f12944a = str;
        this.f12945b = str2;
        this.f12946c = obj;
        this.f12947d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12948e.H(this.f12944a, this.f12945b, this.f12946c, this.f12947d);
    }
}
