package com.ironsource;

import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f18364a = new m0();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, Long> f18365b = new HashMap<>();

    private m0() {
    }

    public final HashMap<String, Long> a() {
        return f18365b;
    }

    public final boolean a(String instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        HashMap<String, Long> hashMap = f18365b;
        if (hashMap.get(instance) != null) {
            hashMap.remove(instance);
            return true;
        }
        return false;
    }

    public final boolean a(String instance, long j10) {
        kotlin.jvm.internal.n.f(instance, "instance");
        if (!(instance.length() == 0)) {
            HashMap<String, Long> hashMap = f18365b;
            if (!hashMap.containsKey(instance)) {
                hashMap.put(instance, Long.valueOf(j10));
                return true;
            }
        }
        return false;
    }

    public final long b(String instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        Long l10 = f18365b.get(instance);
        if (l10 != null) {
            return System.currentTimeMillis() - l10.longValue();
        }
        return -1L;
    }

    public final long c(String instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        Long l10 = f18365b.get(instance);
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }
}
