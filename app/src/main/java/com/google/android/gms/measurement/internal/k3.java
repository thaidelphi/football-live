package com.google.android.gms.measurement.internal;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k3 {

    /* renamed from: a  reason: collision with root package name */
    private j3 f13049a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzki f13050b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k3(zzki zzkiVar) {
        this.f13050b = zzkiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j10) {
        Handler handler;
        this.f13049a = new j3(this, this.f13050b.f13220a.zzav().a(), j10);
        handler = this.f13050b.f13673c;
        handler.postDelayed(this.f13049a, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Handler handler;
        this.f13050b.c();
        j3 j3Var = this.f13049a;
        if (j3Var != null) {
            handler = this.f13050b.f13673c;
            handler.removeCallbacks(j3Var);
        }
        this.f13050b.f13220a.A().f13243q.a(false);
    }
}
