package com.ironsource;

import i8.o;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e8 implements df {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f17199a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f17200b;

    /* renamed from: c  reason: collision with root package name */
    private final m8 f17201c;

    public e8(Boolean bool, Integer num, m8 m8Var) {
        this.f17199a = bool;
        this.f17200b = num;
        this.f17201c = m8Var;
    }

    public /* synthetic */ e8(Boolean bool, Integer num, m8 m8Var, int i10, kotlin.jvm.internal.h hVar) {
        this(bool, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : m8Var);
    }

    private final Object a(m8 m8Var) {
        return new f8(this.f17199a, this.f17200b, m8Var).a();
    }

    @Override // com.ironsource.df
    public Object a() {
        ma maVar;
        Throwable d10 = i8.o.d(new na(this.f17199a).a());
        if (d10 != null) {
            o.a aVar = i8.o.f26626b;
            return i8.o.b(i8.p.a(d10));
        }
        o.a aVar2 = i8.o.f26626b;
        Boolean bool = this.f17199a;
        if (bool != null) {
            bool.booleanValue();
            maVar = new ma(this.f17199a.booleanValue());
        } else {
            maVar = null;
        }
        return i8.o.b(maVar);
    }

    @Override // com.ironsource.df
    public Object b() {
        yo yoVar;
        Integer num;
        m8 m8Var = m8.Second;
        Throwable d10 = i8.o.d(a(m8Var));
        if (d10 != null) {
            o.a aVar = i8.o.f26626b;
            return i8.o.b(i8.p.a(d10));
        }
        if (!kotlin.jvm.internal.n.a(this.f17199a, Boolean.TRUE) || (num = this.f17200b) == null) {
            yoVar = null;
        } else {
            num.intValue();
            yoVar = new yo(m8Var.a(this.f17200b), null, 2, null);
        }
        o.a aVar2 = i8.o.f26626b;
        return i8.o.b(yoVar);
    }

    @Override // com.ironsource.df
    public Object c() {
        jt jtVar;
        Integer num;
        Throwable d10 = i8.o.d(a(this.f17201c));
        if (d10 != null) {
            o.a aVar = i8.o.f26626b;
            return i8.o.b(i8.p.a(d10));
        }
        if (kotlin.jvm.internal.n.a(this.f17199a, Boolean.TRUE) && (num = this.f17200b) != null) {
            int intValue = num.intValue();
            m8 m8Var = this.f17201c;
            if (m8Var != null) {
                jtVar = new jt(intValue, m8Var);
                o.a aVar2 = i8.o.f26626b;
                return i8.o.b(jtVar);
            }
        }
        jtVar = null;
        o.a aVar22 = i8.o.f26626b;
        return i8.o.b(jtVar);
    }

    public final Boolean d() {
        return this.f17199a;
    }

    public final Integer e() {
        return this.f17200b;
    }

    public final m8 f() {
        return this.f17201c;
    }
}
