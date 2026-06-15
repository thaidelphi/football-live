package com.ironsource;

import com.ironsource.ff;
import i8.o;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zo implements ff, ff.a {

    /* renamed from: a  reason: collision with root package name */
    private final q9 f21677a;

    /* renamed from: b  reason: collision with root package name */
    private final yf f21678b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, yo> f21679c;

    public zo(q9 currentTimeProvider, yf repository) {
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(repository, "repository");
        this.f21677a = currentTimeProvider;
        this.f21678b = repository;
        this.f21679c = new LinkedHashMap();
    }

    private final boolean a(yo yoVar, String str) {
        Long a10 = this.f21678b.a(str);
        if (a10 != null) {
            a10.longValue();
            return this.f21677a.a() - a10.longValue() < yoVar.a();
        }
        return false;
    }

    @Override // com.ironsource.ff
    public l8 a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        yo yoVar = this.f21679c.get(identifier);
        if (yoVar != null && a(yoVar, identifier)) {
            return new l8(true, n8.Pacing);
        }
        return new l8(false, null, 2, null);
    }

    @Override // com.ironsource.ff.a
    public Object a(String identifier, n8 cappingType, df cappingConfig) {
        Object a10;
        kotlin.jvm.internal.n.f(identifier, "identifier");
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
        Object b10 = cappingConfig.b();
        if (i8.o.g(b10)) {
            yo yoVar = (yo) b10;
            if (yoVar != null) {
                this.f21679c.put(identifier, yoVar);
            }
        } else {
            Throwable d10 = i8.o.d(b10);
            if (d10 != null) {
                o.a aVar = i8.o.f26626b;
                a10 = i8.p.a(d10);
                return i8.o.b(a10);
            }
        }
        o.a aVar2 = i8.o.f26626b;
        a10 = i8.w.f26638a;
        return i8.o.b(a10);
    }

    public final Map<String, yo> a() {
        return this.f21679c;
    }

    @Override // com.ironsource.ff.a
    public void b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        if (this.f21679c.get(identifier) == null) {
            return;
        }
        this.f21678b.a(this.f21677a.a(), identifier);
    }
}
