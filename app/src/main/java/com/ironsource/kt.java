package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class kt implements ei {

    /* renamed from: a  reason: collision with root package name */
    private final g8 f18111a;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f18112b;

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f18113c;

    public kt(g8 storage) {
        kotlin.jvm.internal.n.f(storage, "storage");
        this.f18111a = storage;
        this.f18112b = new ConcurrentHashMap<>();
        this.f18113c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.ei
    public int a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        Integer num = this.f18112b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer c10 = this.f18111a.c(identifier);
        if (c10 == null) {
            this.f18112b.put(identifier, 0);
            return 0;
        }
        int intValue = c10.intValue();
        this.f18112b.put(identifier, Integer.valueOf(intValue));
        return intValue;
    }

    @Override // com.ironsource.ei
    public void a(int i10, String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f18112b.put(identifier, Integer.valueOf(i10));
        this.f18111a.a(identifier, i10);
    }

    @Override // com.ironsource.ei
    public void a(long j10, String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f18113c.put(identifier, Long.valueOf(j10));
        this.f18111a.a(identifier, j10);
    }

    @Override // com.ironsource.ei
    public Long b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        Long l10 = this.f18113c.get(identifier);
        if (l10 != null) {
            return l10;
        }
        Long a10 = this.f18111a.a(identifier);
        if (a10 != null) {
            long longValue = a10.longValue();
            this.f18113c.put(identifier, Long.valueOf(longValue));
            return Long.valueOf(longValue);
        }
        return null;
    }
}
