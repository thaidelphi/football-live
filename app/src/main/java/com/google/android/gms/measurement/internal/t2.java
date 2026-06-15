package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13163a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjs f13164b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(zzjs zzjsVar, zzq zzqVar) {
        this.f13164b = zzjsVar;
        this.f13163a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f13164b;
        zzeeVar = zzjsVar.f13652d;
        if (zzeeVar == null) {
            zzjsVar.f13220a.zzay().m().a("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.m(this.f13163a);
            zzeeVar.o(this.f13163a);
            this.f13164b.z();
        } catch (RemoteException e8) {
            this.f13164b.f13220a.zzay().m().b("Failed to send consent settings to the service", e8);
        }
    }
}
