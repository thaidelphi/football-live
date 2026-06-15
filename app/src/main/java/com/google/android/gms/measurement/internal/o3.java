package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o3 {

    /* renamed from: a  reason: collision with root package name */
    private final Clock f13101a;

    /* renamed from: b  reason: collision with root package name */
    private long f13102b;

    public o3(Clock clock) {
        Preconditions.m(clock);
        this.f13101a = clock;
    }

    public final void a() {
        this.f13102b = 0L;
    }

    public final void b() {
        this.f13102b = this.f13101a.b();
    }

    public final boolean c(long j10) {
        return this.f13102b == 0 || this.f13101a.b() - this.f13102b >= 3600000;
    }
}
