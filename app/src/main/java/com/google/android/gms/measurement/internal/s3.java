package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzla f13146a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzkz f13147b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s3(zzkz zzkzVar, zzla zzlaVar) {
        this.f13147b = zzkzVar;
        this.f13146a = zzlaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz.f0(this.f13147b, this.f13146a);
        this.f13147b.s();
    }
}
