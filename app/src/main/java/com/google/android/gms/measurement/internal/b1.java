package com.google.android.gms.measurement.internal;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b1 implements zzei {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzfy f12876a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(zzhb zzhbVar, zzfy zzfyVar) {
        this.f12876a = zzfyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzei
    public final boolean zza() {
        return this.f12876a.l() && Log.isLoggable(this.f12876a.zzay().x(), 3);
    }
}
