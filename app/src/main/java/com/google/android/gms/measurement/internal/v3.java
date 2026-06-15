package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class v3 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzq f13194a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzkz f13195b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v3(zzkz zzkzVar, zzq zzqVar) {
        this.f13195b = zzkzVar;
        this.f13194a = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzai Q = this.f13195b.Q((String) Preconditions.m(this.f13194a.f13720a));
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (Q.i(zzahVar) && zzai.b(this.f13194a.f13741v).i(zzahVar)) {
            return this.f13195b.N(this.f13194a).e0();
        }
        this.f13195b.zzay().q().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
