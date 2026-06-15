package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class w0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f13200a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13201b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f13202c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f13203d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzgq f13204e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(zzgq zzgqVar, String str, String str2, String str3, long j10) {
        this.f13204e = zzgqVar;
        this.f13200a = str;
        this.f13201b = str2;
        this.f13202c = str3;
        this.f13203d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        String str = this.f13200a;
        if (str == null) {
            zzkzVar2 = this.f13204e.f13582a;
            zzkzVar2.r(this.f13201b, null);
            return;
        }
        zzik zzikVar = new zzik(this.f13202c, str, this.f13203d);
        zzkzVar = this.f13204e.f13582a;
        zzkzVar.r(this.f13201b, zzikVar);
    }
}
