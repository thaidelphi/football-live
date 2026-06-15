package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class k0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f13040a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13041b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f13042c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzgq f13043d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(zzgq zzgqVar, String str, String str2, String str3) {
        this.f13043d = zzgqVar;
        this.f13040a = str;
        this.f13041b = str2;
        this.f13042c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f13043d.f13582a;
        zzkzVar.a();
        zzkzVar2 = this.f13043d.f13582a;
        return zzkzVar2.R().Y(this.f13040a, this.f13041b, this.f13042c);
    }
}
