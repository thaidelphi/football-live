package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f4 implements zzgy {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzci f12952a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f12953b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.f12953b = appMeasurementDynamiteService;
        this.f12952a = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f12952a.zze(str, str2, bundle, j10);
        } catch (RemoteException e8) {
            zzfy zzfyVar = this.f12953b.f12829a;
            if (zzfyVar != null) {
                zzfyVar.zzay().r().b("Event interceptor threw exception", e8);
            }
        }
    }
}
