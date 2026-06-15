package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class l2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13068a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjs f13069b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2(zzjs zzjsVar, zzq zzqVar) {
        this.f13069b = zzjsVar;
        this.f13068a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f13069b;
        zzeeVar = zzjsVar.f13652d;
        if (zzeeVar == null) {
            zzjsVar.f13220a.zzay().m().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.m(this.f13068a);
            zzeeVar.j(this.f13068a);
            this.f13069b.f13220a.x().o();
            this.f13069b.m(zzeeVar, null, this.f13068a);
            this.f13069b.z();
        } catch (RemoteException e8) {
            this.f13069b.f13220a.zzay().m().b("Failed to send app launch to the service", e8);
        }
    }
}
