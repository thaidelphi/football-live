package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class q2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzaw f13121a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13122b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f13123c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzjs f13124d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q2(zzjs zzjsVar, zzaw zzawVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f13124d = zzjsVar;
        this.f13121a = zzawVar;
        this.f13122b = str;
        this.f13123c = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        zzee zzeeVar;
        byte[] bArr = null;
        try {
            try {
                zzjs zzjsVar = this.f13124d;
                zzeeVar = zzjsVar.f13652d;
                if (zzeeVar == null) {
                    zzjsVar.f13220a.zzay().m().a("Discarding data. Failed to send event to service to bundle");
                    zzfyVar = this.f13124d.f13220a;
                } else {
                    bArr = zzeeVar.J(this.f13121a, this.f13122b);
                    this.f13124d.z();
                    zzfyVar = this.f13124d.f13220a;
                }
            } catch (RemoteException e8) {
                this.f13124d.f13220a.zzay().m().b("Failed to send event to the service to bundle", e8);
                zzfyVar = this.f13124d.f13220a;
            }
            zzfyVar.I().B(this.f13123c, bArr);
        } catch (Throwable th) {
            this.f13124d.f13220a.I().B(this.f13123c, bArr);
            throw th;
        }
    }
}
