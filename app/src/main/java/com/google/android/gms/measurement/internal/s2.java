package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13144a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjs f13145b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s2(zzjs zzjsVar, zzq zzqVar) {
        this.f13145b = zzjsVar;
        this.f13144a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f13145b;
        zzeeVar = zzjsVar.f13652d;
        if (zzeeVar == null) {
            zzjsVar.f13220a.zzay().m().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.m(this.f13144a);
            zzeeVar.D(this.f13144a);
            this.f13145b.z();
        } catch (RemoteException e8) {
            this.f13145b.f13220a.zzay().m().b("Failed to send measurementEnabled to the service", e8);
        }
    }
}
