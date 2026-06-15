package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class c3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzjr f12893a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c3(zzjr zzjrVar) {
        this.f12893a = zzjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f12893a.f13650c;
        Context zzau = zzjsVar.f13220a.zzau();
        this.f12893a.f13650c.f13220a.zzaw();
        zzjs.H(zzjsVar, new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
