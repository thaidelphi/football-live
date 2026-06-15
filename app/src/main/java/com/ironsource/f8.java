package com.ironsource;

import i8.o;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f8 implements ef {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f17388a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f17389b;

    /* renamed from: c  reason: collision with root package name */
    private final m8 f17390c;

    public f8(Boolean bool, Integer num, m8 m8Var) {
        this.f17388a = bool;
        this.f17389b = num;
        this.f17390c = m8Var;
    }

    @Override // com.ironsource.ef
    public Object a() {
        Exception exc;
        Object obj;
        Boolean bool = this.f17388a;
        if (bool != null) {
            if (bool.booleanValue()) {
                Integer num = this.f17389b;
                if (num == null || num.intValue() <= 0) {
                    o.a aVar = i8.o.f26626b;
                    exc = new Exception("limit flag is not provided or invalid");
                } else if (this.f17390c == null) {
                    o.a aVar2 = i8.o.f26626b;
                    exc = new Exception("unit flag is not provided or invalid");
                } else {
                    o.a aVar3 = i8.o.f26626b;
                    obj = Boolean.TRUE;
                }
            } else {
                o.a aVar4 = i8.o.f26626b;
                obj = Boolean.FALSE;
            }
            return i8.o.b(obj);
        }
        o.a aVar5 = i8.o.f26626b;
        exc = new Exception("enabled flag is not provided or invalid");
        obj = i8.p.a(exc);
        return i8.o.b(obj);
    }
}
