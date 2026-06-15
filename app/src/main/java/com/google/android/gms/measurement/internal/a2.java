package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Bundle f12861a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzik f12862b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzik f12863c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f12864d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzis f12865e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(zzis zzisVar, Bundle bundle, zzik zzikVar, zzik zzikVar2, long j10) {
        this.f12865e = zzisVar;
        this.f12861a = bundle;
        this.f12862b = zzikVar;
        this.f12863c = zzikVar2;
        this.f12864d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzis.r(this.f12865e, this.f12861a, this.f12862b, this.f12863c, this.f12864d);
    }
}
