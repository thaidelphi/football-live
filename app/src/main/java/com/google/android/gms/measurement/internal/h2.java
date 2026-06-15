package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f12982a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f12983b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzlc f12984c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzjs f12985d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h2(zzjs zzjsVar, zzq zzqVar, boolean z10, zzlc zzlcVar) {
        this.f12985d = zzjsVar;
        this.f12982a = zzqVar;
        this.f12983b = z10;
        this.f12984c = zzlcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f12985d;
        zzeeVar = zzjsVar.f13652d;
        if (zzeeVar == null) {
            zzjsVar.f13220a.zzay().m().a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.m(this.f12982a);
        this.f12985d.m(zzeeVar, this.f12983b ? null : this.f12984c, this.f12982a);
        this.f12985d.z();
    }
}
