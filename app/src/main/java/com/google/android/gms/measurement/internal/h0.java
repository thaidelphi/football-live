package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class h0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzac f12977a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzq f12978b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzgq f12979c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(zzgq zzgqVar, zzac zzacVar, zzq zzqVar) {
        this.f12979c = zzgqVar;
        this.f12977a = zzacVar;
        this.f12978b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkz zzkzVar3;
        zzkzVar = this.f12979c.f13582a;
        zzkzVar.a();
        if (this.f12977a.f13275c.X() == null) {
            zzkzVar3 = this.f12979c.f13582a;
            zzkzVar3.o(this.f12977a, this.f12978b);
            return;
        }
        zzkzVar2 = this.f12979c.f13582a;
        zzkzVar2.u(this.f12977a, this.f12978b);
    }
}
