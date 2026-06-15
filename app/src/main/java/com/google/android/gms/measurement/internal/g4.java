package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class g4 implements zzgz {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzci f12971a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f12972b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.f12972b = appMeasurementDynamiteService;
        this.f12971a = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f12971a.zze(str, str2, bundle, j10);
        } catch (RemoteException e8) {
            zzfy zzfyVar = this.f12972b.f12829a;
            if (zzfyVar != null) {
                zzfyVar.zzay().r().b("Event listener threw exception", e8);
            }
        }
    }
}
