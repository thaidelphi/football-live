package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzki extends x {

    /* renamed from: c  reason: collision with root package name */
    private Handler f13673c;

    /* renamed from: d  reason: collision with root package name */
    protected final n3 f13674d;

    /* renamed from: e  reason: collision with root package name */
    protected final m3 f13675e;

    /* renamed from: f  reason: collision with root package name */
    protected final k3 f13676f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzki(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13674d = new n3(this);
        this.f13675e = new m3(this);
        this.f13676f = new k3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void l(zzki zzkiVar, long j10) {
        zzkiVar.c();
        zzkiVar.n();
        zzkiVar.f13220a.zzay().q().b("Activity paused, time", Long.valueOf(j10));
        zzkiVar.f13676f.a(j10);
        if (zzkiVar.f13220a.u().y()) {
            zzkiVar.f13675e.b(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void m(zzki zzkiVar, long j10) {
        zzkiVar.c();
        zzkiVar.n();
        zzkiVar.f13220a.zzay().q().b("Activity resumed, time", Long.valueOf(j10));
        if (zzkiVar.f13220a.u().y() || zzkiVar.f13220a.A().f13243q.b()) {
            zzkiVar.f13675e.c(j10);
        }
        zzkiVar.f13676f.b();
        n3 n3Var = zzkiVar.f13674d;
        n3Var.f13093a.c();
        if (n3Var.f13093a.f13220a.j()) {
            n3Var.b(n3Var.f13093a.f13220a.zzav().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        c();
        if (this.f13673c == null) {
            this.f13673c = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.x
    protected final boolean i() {
        return false;
    }
}
