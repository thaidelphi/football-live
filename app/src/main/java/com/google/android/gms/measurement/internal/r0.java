package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class r0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzaw f13127a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13128b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzgq f13129c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(zzgq zzgqVar, zzaw zzawVar, String str) {
        this.f13129c = zzgqVar;
        this.f13127a = zzawVar;
        this.f13128b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f13129c.f13582a;
        zzkzVar.a();
        zzkzVar2 = this.f13129c.f13582a;
        zzkzVar2.f(this.f13127a, this.f13128b);
    }
}
