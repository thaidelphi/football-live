package com.startapp;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b5 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f21794a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final t4<Executor> f21795b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<w2> f21796c;

    public b5(t4<Executor> t4Var, t4<w2> t4Var2) {
        this.f21795b = t4Var;
        this.f21796c = t4Var2;
    }

    public final a5 a(String str) {
        if (this.f21794a.containsKey(str)) {
            return (a5) this.f21794a.get(str);
        }
        a5 a5Var = new a5(new j3(this.f21795b, this.f21796c));
        this.f21794a.put(str, a5Var);
        return a5Var;
    }
}
