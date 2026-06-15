package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class f3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzkz f12950a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f12951b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f3(zzjz zzjzVar, zzkz zzkzVar, Runnable runnable) {
        this.f12950a = zzkzVar;
        this.f12951b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12950a.a();
        this.f12950a.g0(this.f12951b);
        this.f12950a.x();
    }
}
