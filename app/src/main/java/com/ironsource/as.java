package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class as {

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f16401b;

    /* renamed from: a  reason: collision with root package name */
    public static final as f16400a = new as();

    /* renamed from: c  reason: collision with root package name */
    private static zr f16402c = zr.NOT_INIT;

    private as() {
    }

    public final synchronized zr a() {
        return f16402c;
    }

    public final synchronized void a(zr zrVar) {
        kotlin.jvm.internal.n.f(zrVar, "<set-?>");
        f16402c = zrVar;
    }

    public final void a(boolean z10) {
        f16401b = Boolean.valueOf(z10);
    }

    public final zr b() {
        Boolean bool = f16401b;
        if (bool == null ? true : kotlin.jvm.internal.n.a(bool, Boolean.FALSE)) {
            return zr.NOT_INIT;
        }
        if (kotlin.jvm.internal.n.a(bool, Boolean.TRUE)) {
            return f16402c;
        }
        throw new i8.l();
    }
}
