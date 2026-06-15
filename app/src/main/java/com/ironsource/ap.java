package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ap implements yf {

    /* renamed from: a  reason: collision with root package name */
    private final g8 f16394a;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f16395b;

    public ap(g8 storage) {
        kotlin.jvm.internal.n.f(storage, "storage");
        this.f16394a = storage;
        this.f16395b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.yf
    public Long a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        Long l10 = this.f16395b.get(identifier);
        if (l10 != null) {
            return l10;
        }
        Long b10 = this.f16394a.b(identifier);
        if (b10 != null) {
            long longValue = b10.longValue();
            this.f16395b.put(identifier, Long.valueOf(longValue));
            return Long.valueOf(longValue);
        }
        return null;
    }

    @Override // com.ironsource.yf
    public void a(long j10, String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f16395b.put(identifier, Long.valueOf(j10));
        this.f16394a.b(identifier, j10);
    }
}
