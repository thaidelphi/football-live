package com.ironsource;

import com.ironsource.ff;
import i8.o;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class pa implements ff, ff.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, ma> f19699a = new ConcurrentHashMap<>();

    @Override // com.ironsource.ff
    public l8 a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        ma maVar = this.f19699a.get(identifier);
        return (maVar == null || maVar.a()) ? new l8(false, null, 2, null) : new l8(true, n8.Delivery);
    }

    @Override // com.ironsource.ff.a
    public Object a(String identifier, n8 cappingType, df cappingConfig) {
        Object a10;
        kotlin.jvm.internal.n.f(identifier, "identifier");
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
        Object a11 = cappingConfig.a();
        if (i8.o.g(a11)) {
            ma maVar = (ma) a11;
            if (maVar != null) {
                this.f19699a.put(identifier, maVar);
            }
        } else {
            Throwable d10 = i8.o.d(a11);
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

    @Override // com.ironsource.ff.a
    public void b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
    }
}
