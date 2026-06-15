package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class u2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13177a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f13178b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzaw f13179c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f13180d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzjs f13181e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u2(zzjs zzjsVar, boolean z10, zzq zzqVar, boolean z11, zzaw zzawVar, String str) {
        this.f13181e = zzjsVar;
        this.f13177a = zzqVar;
        this.f13178b = z11;
        this.f13179c = zzawVar;
        this.f13180d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f13181e;
        zzeeVar = zzjsVar.f13652d;
        if (zzeeVar == null) {
            zzjsVar.f13220a.zzay().m().a("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.m(this.f13177a);
        this.f13181e.m(zzeeVar, this.f13178b ? null : this.f13179c, this.f13177a);
        this.f13181e.z();
    }
}
