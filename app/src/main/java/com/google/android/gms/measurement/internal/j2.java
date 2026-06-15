package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13029a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzq f13030b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzjs f13031c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j2(zzjs zzjsVar, AtomicReference atomicReference, zzq zzqVar) {
        this.f13031c = zzjsVar;
        this.f13029a = atomicReference;
        this.f13030b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzee zzeeVar;
        synchronized (this.f13029a) {
            try {
            } catch (RemoteException e8) {
                this.f13031c.f13220a.zzay().m().b("Failed to get app instance id", e8);
                atomicReference = this.f13029a;
            }
            if (!this.f13031c.f13220a.A().l().i(zzah.ANALYTICS_STORAGE)) {
                this.f13031c.f13220a.zzay().s().a("Analytics storage consent denied; will not get app instance id");
                this.f13031c.f13220a.D().x(null);
                this.f13031c.f13220a.A().f13233g.b(null);
                this.f13029a.set(null);
                this.f13029a.notify();
                return;
            }
            zzjs zzjsVar = this.f13031c;
            zzeeVar = zzjsVar.f13652d;
            if (zzeeVar == null) {
                zzjsVar.f13220a.zzay().m().a("Failed to get app instance id");
                this.f13029a.notify();
                return;
            }
            Preconditions.m(this.f13030b);
            this.f13029a.set(zzeeVar.K(this.f13030b));
            String str = (String) this.f13029a.get();
            if (str != null) {
                this.f13031c.f13220a.D().x(str);
                this.f13031c.f13220a.A().f13233g.b(str);
            }
            this.f13031c.z();
            atomicReference = this.f13029a;
            atomicReference.notify();
        }
    }
}
