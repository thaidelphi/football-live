package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzac f13007a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzgq f13008b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(zzgq zzgqVar, zzac zzacVar) {
        this.f13008b = zzgqVar;
        this.f13007a = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkz zzkzVar3;
        zzkzVar = this.f13008b.f13582a;
        zzkzVar.a();
        if (this.f13007a.f13275c.X() == null) {
            zzkzVar3 = this.f13008b.f13582a;
            zzkzVar3.n(this.f13007a);
            return;
        }
        zzkzVar2 = this.f13008b.f13582a;
        zzkzVar2.t(this.f13007a);
    }
}
