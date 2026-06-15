package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class hv {

    /* renamed from: a  reason: collision with root package name */
    private final q9 f17740a;

    public hv(q9 currentTimeProvider) {
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f17740a = currentTimeProvider;
    }

    public final boolean a(long j10, long j11) {
        long a10 = this.f17740a.a();
        return j11 <= 0 || j10 <= 0 || a10 < j10 || a10 - j10 > j11;
    }
}
