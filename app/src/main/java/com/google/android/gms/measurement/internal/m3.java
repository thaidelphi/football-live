package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzoe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class m3 {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    protected long f13082a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    protected long f13083b;

    /* renamed from: c  reason: collision with root package name */
    private final h f13084c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzki f13085d;

    public m3(zzki zzkiVar) {
        this.f13085d = zzkiVar;
        this.f13084c = new l3(this, zzkiVar.f13220a);
        long b10 = zzkiVar.f13220a.zzav().b();
        this.f13082a = b10;
        this.f13083b = b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f13084c.b();
        this.f13082a = 0L;
        this.f13083b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j10) {
        this.f13084c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j10) {
        this.f13085d.c();
        this.f13084c.b();
        this.f13082a = j10;
        this.f13083b = j10;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f13085d.c();
        this.f13085d.d();
        zzoe.zzc();
        if (this.f13085d.f13220a.u().w(null, zzeb.f13415f0)) {
            if (this.f13085d.f13220a.j()) {
                this.f13085d.f13220a.A().f13241o.b(this.f13085d.f13220a.zzav().a());
            }
        } else {
            this.f13085d.f13220a.A().f13241o.b(this.f13085d.f13220a.zzav().a());
        }
        long j11 = j10 - this.f13082a;
        if (!z10 && j11 < 1000) {
            this.f13085d.f13220a.zzay().q().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f13083b;
            this.f13083b = j10;
        }
        this.f13085d.f13220a.zzay().q().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        zzlh.t(this.f13085d.f13220a.F().n(!this.f13085d.f13220a.u().y()), bundle, true);
        if (!z11) {
            this.f13085d.f13220a.D().p("auto", "_e", bundle);
        }
        this.f13082a = j10;
        this.f13084c.b();
        this.f13084c.d(3600000L);
        return true;
    }
}
