package com.ironsource;

import java.util.Calendar;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    private final ct f17522a;

    /* renamed from: b  reason: collision with root package name */
    private final ig f17523b;

    /* renamed from: c  reason: collision with root package name */
    private final String f17524c;

    /* renamed from: d  reason: collision with root package name */
    private final long f17525d;

    public g3(ct recordType, ig adProvider, String adInstanceId) {
        kotlin.jvm.internal.n.f(recordType, "recordType");
        kotlin.jvm.internal.n.f(adProvider, "adProvider");
        kotlin.jvm.internal.n.f(adInstanceId, "adInstanceId");
        this.f17522a = recordType;
        this.f17523b = adProvider;
        this.f17524c = adInstanceId;
        this.f17525d = Calendar.getInstance().getTimeInMillis() / 1000;
    }

    public final String a() {
        return this.f17524c;
    }

    public final ig b() {
        return this.f17523b;
    }

    public final Map<String, Object> c() {
        Map<String, Object> g10;
        g10 = j8.j0.g(i8.s.a(yk.f21553c, Integer.valueOf(this.f17523b.b())), i8.s.a("ts", String.valueOf(this.f17525d)));
        return g10;
    }

    public final Map<String, Object> d() {
        Map<String, Object> g10;
        g10 = j8.j0.g(i8.s.a(yk.f21552b, this.f17524c), i8.s.a(yk.f21553c, Integer.valueOf(this.f17523b.b())), i8.s.a("ts", String.valueOf(this.f17525d)), i8.s.a("rt", Integer.valueOf(this.f17522a.ordinal())));
        return g10;
    }

    public final ct e() {
        return this.f17522a;
    }

    public final long f() {
        return this.f17525d;
    }
}
