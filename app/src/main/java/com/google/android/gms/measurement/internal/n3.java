package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoz;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class n3 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzki f13093a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n3(zzki zzkiVar) {
        this.f13093a = zzkiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f13093a.c();
        if (this.f13093a.f13220a.A().q(this.f13093a.f13220a.zzav().a())) {
            this.f13093a.f13220a.A().f13238l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f13093a.f13220a.zzay().q().a("Detected application was in foreground");
                c(this.f13093a.f13220a.zzav().a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j10, boolean z10) {
        this.f13093a.c();
        this.f13093a.n();
        if (this.f13093a.f13220a.A().q(j10)) {
            this.f13093a.f13220a.A().f13238l.a(true);
            zzoz.zzc();
            if (this.f13093a.f13220a.u().w(null, zzeb.f13445u0)) {
                this.f13093a.f13220a.w().q();
            }
        }
        this.f13093a.f13220a.A().f13241o.b(j10);
        if (this.f13093a.f13220a.A().f13238l.b()) {
            c(j10, z10);
        }
    }

    @VisibleForTesting
    final void c(long j10, boolean z10) {
        this.f13093a.c();
        if (this.f13093a.f13220a.j()) {
            this.f13093a.f13220a.A().f13241o.b(j10);
            this.f13093a.f13220a.zzay().q().b("Session started, time", Long.valueOf(this.f13093a.f13220a.zzav().b()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f13093a.f13220a.D().H("auto", "_sid", valueOf, j10);
            this.f13093a.f13220a.A().f13238l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f13093a.f13220a.u().w(null, zzeb.f13407b0) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.f13093a.f13220a.D().q("auto", "_s", j10, bundle);
            zznv.zzc();
            if (this.f13093a.f13220a.u().w(null, zzeb.f13413e0)) {
                String a10 = this.f13093a.f13220a.A().f13246t.a();
                if (TextUtils.isEmpty(a10)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a10);
                this.f13093a.f13220a.D().q("auto", "_ssr", j10, bundle2);
            }
        }
    }
}
