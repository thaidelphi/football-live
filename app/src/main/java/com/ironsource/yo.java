package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class yo {

    /* renamed from: a  reason: collision with root package name */
    private final long f21565a;

    /* renamed from: b  reason: collision with root package name */
    private final m8 f21566b;

    public yo(long j10, m8 unit) {
        kotlin.jvm.internal.n.f(unit, "unit");
        this.f21565a = j10;
        this.f21566b = unit;
    }

    public /* synthetic */ yo(long j10, m8 m8Var, int i10, kotlin.jvm.internal.h hVar) {
        this(j10, (i10 & 2) != 0 ? m8.Second : m8Var);
    }

    public final long a() {
        return this.f21565a;
    }

    public final m8 b() {
        return this.f21566b;
    }

    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f21565a + " unit=" + this.f21566b + ')';
    }
}
