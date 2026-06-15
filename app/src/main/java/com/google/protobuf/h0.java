package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Protobuf.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h0 {

    /* renamed from: c  reason: collision with root package name */
    private static final h0 f15429c = new h0();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, m0<?>> f15431b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final n0 f15430a = new s();

    private h0() {
    }

    public static h0 a() {
        return f15429c;
    }

    public m0<?> b(Class<?> cls, m0<?> m0Var) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(m0Var, "schema");
        return this.f15431b.putIfAbsent(cls, m0Var);
    }

    public <T> m0<T> c(Class<T> cls) {
        Internal.checkNotNull(cls, "messageType");
        m0<T> m0Var = (m0<T>) this.f15431b.get(cls);
        if (m0Var == null) {
            m0<T> a10 = this.f15430a.a(cls);
            m0<T> m0Var2 = (m0<T>) b(cls, a10);
            return m0Var2 != null ? m0Var2 : a10;
        }
        return m0Var;
    }

    public <T> m0<T> d(T t10) {
        return c(t10.getClass());
    }
}
