package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComponentName f12866a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjr f12867b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3(zzjr zzjrVar, ComponentName componentName) {
        this.f12867b = zzjrVar;
        this.f12866a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs.H(this.f12867b.f13650c, this.f12866a);
    }
}
