package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13098a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Bundle f13099b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzjs f13100c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2(zzjs zzjsVar, zzq zzqVar, Bundle bundle) {
        this.f13100c = zzjsVar;
        this.f13098a = zzqVar;
        this.f13099b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f13100c;
        zzeeVar = zzjsVar.f13652d;
        if (zzeeVar == null) {
            zzjsVar.f13220a.zzay().m().a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.m(this.f13098a);
            zzeeVar.E(this.f13099b, this.f13098a);
        } catch (RemoteException e8) {
            this.f13100c.f13220a.zzay().m().b("Failed to send default event parameters to service", e8);
        }
    }
}
