package com.ironsource;

import i8.o;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class na implements ef {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f19395a;

    public na(Boolean bool) {
        this.f19395a = bool;
    }

    @Override // com.ironsource.ef
    public Object a() {
        Object obj = this.f19395a;
        if (obj == null) {
            o.a aVar = i8.o.f26626b;
            obj = i8.p.a(new Exception("enabled flag is not provided or invalid"));
        } else {
            o.a aVar2 = i8.o.f26626b;
        }
        return i8.o.b(obj);
    }
}
