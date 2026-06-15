package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13011a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjs f13012b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i2(zzjs zzjsVar, zzq zzqVar) {
        this.f13012b = zzjsVar;
        this.f13011a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f13012b;
        zzeeVar = zzjsVar.f13652d;
        if (zzeeVar == null) {
            zzjsVar.f13220a.zzay().m().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.m(this.f13011a);
            zzeeVar.s(this.f13011a);
        } catch (RemoteException e8) {
            this.f13012b.f13220a.zzay().m().b("Failed to reset data on the service: remote exception", e8);
        }
        this.f13012b.z();
    }
}
