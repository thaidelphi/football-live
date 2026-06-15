package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class m0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f13073a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13074b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f13075c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzgq f13076d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(zzgq zzgqVar, String str, String str2, String str3) {
        this.f13076d = zzgqVar;
        this.f13073a = str;
        this.f13074b = str2;
        this.f13075c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f13076d.f13582a;
        zzkzVar.a();
        zzkzVar2 = this.f13076d.f13582a;
        return zzkzVar2.R().V(this.f13073a, this.f13074b, this.f13075c);
    }
}
