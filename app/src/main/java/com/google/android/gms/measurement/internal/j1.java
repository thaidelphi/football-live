package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13025a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13026b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f13027c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzid f13028d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(zzid zzidVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f13028d = zzidVar;
        this.f13025a = atomicReference;
        this.f13026b = str2;
        this.f13027c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13028d.f13220a.G().P(this.f13025a, null, this.f13026b, this.f13027c);
    }
}
