package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13046a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f13047b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzjs f13048c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2(zzjs zzjsVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f13048c = zzjsVar;
        this.f13046a = zzqVar;
        this.f13047b = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        zzee zzeeVar;
        String str = null;
        try {
            try {
                if (this.f13048c.f13220a.A().l().i(zzah.ANALYTICS_STORAGE)) {
                    zzjs zzjsVar = this.f13048c;
                    zzeeVar = zzjsVar.f13652d;
                    if (zzeeVar == null) {
                        zzjsVar.f13220a.zzay().m().a("Failed to get app instance id");
                        zzfyVar = this.f13048c.f13220a;
                    } else {
                        Preconditions.m(this.f13046a);
                        str = zzeeVar.K(this.f13046a);
                        if (str != null) {
                            this.f13048c.f13220a.D().x(str);
                            this.f13048c.f13220a.A().f13233g.b(str);
                        }
                        this.f13048c.z();
                        zzfyVar = this.f13048c.f13220a;
                    }
                } else {
                    this.f13048c.f13220a.zzay().s().a("Analytics storage consent denied; will not get app instance id");
                    this.f13048c.f13220a.D().x(null);
                    this.f13048c.f13220a.A().f13233g.b(null);
                    zzfyVar = this.f13048c.f13220a;
                }
            } catch (RemoteException e8) {
                this.f13048c.f13220a.zzay().m().b("Failed to get app instance id", e8);
                zzfyVar = this.f13048c.f13220a;
            }
            zzfyVar.I().E(this.f13047b, str);
        } catch (Throwable th) {
            this.f13048c.f13220a.I().E(this.f13047b, null);
            throw th;
        }
    }
}
