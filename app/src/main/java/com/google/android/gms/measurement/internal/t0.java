package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class t0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzlc f13154a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzq f13155b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzgq f13156c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(zzgq zzgqVar, zzlc zzlcVar, zzq zzqVar) {
        this.f13156c = zzgqVar;
        this.f13154a = zzlcVar;
        this.f13155b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkz zzkzVar3;
        zzkzVar = this.f13156c.f13582a;
        zzkzVar.a();
        if (this.f13154a.X() == null) {
            zzkzVar3 = this.f13156c.f13582a;
            zzkzVar3.p(this.f13154a, this.f13155b);
            return;
        }
        zzkzVar2 = this.f13156c.f13582a;
        zzkzVar2.w(this.f13154a, this.f13155b);
    }
}
