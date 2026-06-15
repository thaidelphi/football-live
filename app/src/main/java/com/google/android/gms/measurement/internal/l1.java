package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class l1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13063a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13064b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f13065c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f13066d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzid f13067e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(zzid zzidVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f13067e = zzidVar;
        this.f13063a = atomicReference;
        this.f13064b = str2;
        this.f13065c = str3;
        this.f13066d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13067e.f13220a.G().R(this.f13063a, null, this.f13064b, this.f13065c, this.f13066d);
    }
}
