package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class p0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13104a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzgq f13105b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(zzgq zzgqVar, zzq zzqVar) {
        this.f13105b = zzgqVar;
        this.f13104a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f13105b.f13582a;
        zzkzVar.a();
        zzkzVar2 = this.f13105b.f13582a;
        zzq zzqVar = this.f13104a;
        zzkzVar2.zzaz().c();
        zzkzVar2.b();
        Preconditions.g(zzqVar.f13720a);
        zzai b10 = zzai.b(zzqVar.f13741v);
        zzai Q = zzkzVar2.Q(zzqVar.f13720a);
        zzkzVar2.zzay().q().c("Setting consent, package, consent", zzqVar.f13720a, b10);
        zzkzVar2.v(zzqVar.f13720a, b10);
        if (b10.k(Q)) {
            zzkzVar2.q(zzqVar);
        }
    }
}
