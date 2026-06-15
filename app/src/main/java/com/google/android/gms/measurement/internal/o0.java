package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class o0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13094a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzgq f13095b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(zzgq zzgqVar, zzq zzqVar) {
        this.f13095b = zzgqVar;
        this.f13094a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f13095b.f13582a;
        zzkzVar.a();
        zzkzVar2 = this.f13095b.f13582a;
        zzq zzqVar = this.f13094a;
        zzkzVar2.zzaz().c();
        zzkzVar2.b();
        Preconditions.g(zzqVar.f13720a);
        zzkzVar2.N(zzqVar);
    }
}
