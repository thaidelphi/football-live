package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class n2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzik f13091a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjs f13092b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n2(zzjs zzjsVar, zzik zzikVar) {
        this.f13092b = zzjsVar;
        this.f13091a = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f13092b;
        zzeeVar = zzjsVar.f13652d;
        if (zzeeVar == null) {
            zzjsVar.f13220a.zzay().m().a("Failed to send current screen to service");
            return;
        }
        try {
            zzik zzikVar = this.f13091a;
            if (zzikVar == null) {
                zzeeVar.l(0L, null, null, zzjsVar.f13220a.zzau().getPackageName());
            } else {
                zzeeVar.l(zzikVar.f13634c, zzikVar.f13632a, zzikVar.f13633b, zzjsVar.f13220a.zzau().getPackageName());
            }
            this.f13092b.z();
        } catch (RemoteException e8) {
            this.f13092b.f13220a.zzay().m().b("Failed to send current screen to the service", e8);
        }
    }
}
