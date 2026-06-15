package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class u0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f13173a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzgq f13174b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(zzgq zzgqVar, String str) {
        this.f13174b = zzgqVar;
        this.f13173a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f13174b.f13582a;
        zzkzVar.a();
        zzkzVar2 = this.f13174b.f13582a;
        return zzkzVar2.R().X(this.f13173a);
    }
}
