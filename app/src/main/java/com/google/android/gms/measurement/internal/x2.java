package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class x2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f13222a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13223b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzq f13224c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f13225d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzjs f13226e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x2(zzjs zzjsVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f13226e = zzjsVar;
        this.f13222a = str;
        this.f13223b = str2;
        this.f13224c = zzqVar;
        this.f13225d = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        zzee zzeeVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjs zzjsVar = this.f13226e;
                zzeeVar = zzjsVar.f13652d;
                if (zzeeVar == null) {
                    zzjsVar.f13220a.zzay().m().c("Failed to get conditional properties; not connected to service", this.f13222a, this.f13223b);
                    zzfyVar = this.f13226e.f13220a;
                } else {
                    Preconditions.m(this.f13224c);
                    arrayList = zzlh.q(zzeeVar.c0(this.f13222a, this.f13223b, this.f13224c));
                    this.f13226e.z();
                    zzfyVar = this.f13226e.f13220a;
                }
            } catch (RemoteException e8) {
                this.f13226e.f13220a.zzay().m().d("Failed to get conditional properties; remote exception", this.f13222a, this.f13223b, e8);
                zzfyVar = this.f13226e.f13220a;
            }
            zzfyVar.I().z(this.f13225d, arrayList);
        } catch (Throwable th) {
            this.f13226e.f13220a.I().z(this.f13225d, arrayList);
            throw th;
        }
    }
}
