package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class v2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13189a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f13190b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzac f13191c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzac f13192d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzjs f13193e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v2(zzjs zzjsVar, boolean z10, zzq zzqVar, boolean z11, zzac zzacVar, zzac zzacVar2) {
        this.f13193e = zzjsVar;
        this.f13189a = zzqVar;
        this.f13190b = z11;
        this.f13191c = zzacVar;
        this.f13192d = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f13193e;
        zzeeVar = zzjsVar.f13652d;
        if (zzeeVar == null) {
            zzjsVar.f13220a.zzay().m().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.m(this.f13189a);
        this.f13193e.m(zzeeVar, this.f13190b ? null : this.f13191c, this.f13189a);
        this.f13193e.z();
    }
}
