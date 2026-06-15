package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfb {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final String f13511a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13512b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13513c;

    /* renamed from: d  reason: collision with root package name */
    private final long f13514d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ y f13515e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfb(y yVar, String str, long j10, zzfa zzfaVar) {
        this.f13515e = yVar;
        Preconditions.g("health_monitor");
        Preconditions.a(j10 > 0);
        this.f13511a = "health_monitor:start";
        this.f13512b = "health_monitor:count";
        this.f13513c = "health_monitor:value";
        this.f13514d = j10;
    }

    private final long c() {
        return this.f13515e.j().getLong(this.f13511a, 0L);
    }

    private final void d() {
        this.f13515e.c();
        long a10 = this.f13515e.f13220a.zzav().a();
        SharedPreferences.Editor edit = this.f13515e.j().edit();
        edit.remove(this.f13512b);
        edit.remove(this.f13513c);
        edit.putLong(this.f13511a, a10);
        edit.apply();
    }

    public final Pair a() {
        long abs;
        this.f13515e.c();
        this.f13515e.c();
        long c10 = c();
        if (c10 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c10 - this.f13515e.f13220a.zzav().a());
        }
        long j10 = this.f13514d;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            d();
            return null;
        }
        String string = this.f13515e.j().getString(this.f13513c, null);
        long j11 = this.f13515e.j().getLong(this.f13512b, 0L);
        d();
        if (string != null && j11 > 0) {
            return new Pair(string, Long.valueOf(j11));
        }
        return y.f13228x;
    }

    public final void b(String str, long j10) {
        this.f13515e.c();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f13515e.j().getLong(this.f13512b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f13515e.j().edit();
            edit.putString(this.f13513c, str);
            edit.putLong(this.f13512b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f13515e.f13220a.I().p().nextLong();
        long j12 = j11 + 1;
        SharedPreferences.Editor edit2 = this.f13515e.j().edit();
        if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j12) {
            edit2.putString(this.f13513c, str);
        }
        edit2.putLong(this.f13512b, j12);
        edit2.apply();
    }
}
