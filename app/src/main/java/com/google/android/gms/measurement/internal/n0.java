package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13087a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzgq f13088b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(zzgq zzgqVar, zzq zzqVar) {
        this.f13088b = zzgqVar;
        this.f13087a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f13088b.f13582a;
        zzkzVar.a();
        zzkzVar2 = this.f13088b.f13582a;
        zzkzVar2.q(this.f13087a);
    }
}
