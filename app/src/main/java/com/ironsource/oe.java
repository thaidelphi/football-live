package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class oe implements pe {

    /* renamed from: a  reason: collision with root package name */
    private final long f19549a;

    /* renamed from: b  reason: collision with root package name */
    private final se f19550b;

    public oe(long j10, se recoveryStrategy) {
        kotlin.jvm.internal.n.f(recoveryStrategy, "recoveryStrategy");
        this.f19549a = j10;
        this.f19550b = recoveryStrategy;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oe(re feature) {
        this(feature.a(), feature.b());
        kotlin.jvm.internal.n.f(feature, "feature");
    }

    @Override // com.ironsource.pe
    public long a() {
        return this.f19549a;
    }

    @Override // com.ironsource.pe
    public se b() {
        return this.f19550b;
    }
}
