package com.ironsource;

import com.ironsource.q1;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private q1.a f17757a;

    public i0(q1.a performance) {
        kotlin.jvm.internal.n.f(performance, "performance");
        this.f17757a = performance;
    }

    public static /* synthetic */ i0 a(i0 i0Var, q1.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = i0Var.f17757a;
        }
        return i0Var.a(aVar);
    }

    public final i0 a(q1.a performance) {
        kotlin.jvm.internal.n.f(performance, "performance");
        return new i0(performance);
    }

    public final q1.a a() {
        return this.f17757a;
    }

    public final q1.a b() {
        return this.f17757a;
    }

    public final void b(q1.a aVar) {
        kotlin.jvm.internal.n.f(aVar, "<set-?>");
        this.f17757a = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f17757a == ((i0) obj).f17757a;
    }

    public int hashCode() {
        return this.f17757a.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.f17757a + ')';
    }
}
