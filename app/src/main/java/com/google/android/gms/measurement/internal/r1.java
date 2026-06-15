package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class r1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Boolean f13130a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f13131b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r1(zzid zzidVar, Boolean bool) {
        this.f13131b = zzidVar;
        this.f13130a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13131b.J(this.f13130a, true);
    }
}
