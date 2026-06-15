package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class h {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f12973d;

    /* renamed from: a  reason: collision with root package name */
    private final z0 f12974a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f12975b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f12976c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(z0 z0Var) {
        Preconditions.m(z0Var);
        this.f12974a = z0Var;
        this.f12975b = new g(this, z0Var);
    }

    private final Handler f() {
        Handler handler;
        if (f12973d != null) {
            return f12973d;
        }
        synchronized (h.class) {
            if (f12973d == null) {
                f12973d = new com.google.android.gms.internal.measurement.zzby(this.f12974a.zzau().getMainLooper());
            }
            handler = f12973d;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f12976c = 0L;
        f().removeCallbacks(this.f12975b);
    }

    public abstract void c();

    public final void d(long j10) {
        b();
        if (j10 >= 0) {
            this.f12976c = this.f12974a.zzav().a();
            if (f().postDelayed(this.f12975b, j10)) {
                return;
            }
            this.f12974a.zzay().m().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean e() {
        return this.f12976c != 0;
    }
}
