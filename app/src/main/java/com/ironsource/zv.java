package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zv {

    /* renamed from: a  reason: collision with root package name */
    private final List<a0> f21717a;

    /* JADX WARN: Multi-variable type inference failed */
    public zv(List<? extends a0> instances) {
        kotlin.jvm.internal.n.f(instances, "instances");
        this.f21717a = instances;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zv a(zv zvVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = zvVar.f21717a;
        }
        return zvVar.a(list);
    }

    private final String a(m5 m5Var, int i10) {
        kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.f27370a;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), m5Var.c()}, 2));
        kotlin.jvm.internal.n.e(format, "format(format, *args)");
        return format;
    }

    public final zv a(List<? extends a0> instances) {
        kotlin.jvm.internal.n.f(instances, "instances");
        return new zv(instances);
    }

    public final List<a0> a() {
        return this.f21717a;
    }

    public final List<a0> b() {
        return this.f21717a;
    }

    public final int c() {
        return this.f21717a.size();
    }

    public final String d() {
        String A;
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var : this.f21717a) {
            arrayList.add(a(a0Var.h(), a0Var.q()));
        }
        A = j8.y.A(arrayList, ",", null, null, 0, null, null, 62, null);
        return A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv) && kotlin.jvm.internal.n.a(this.f21717a, ((zv) obj).f21717a);
    }

    public int hashCode() {
        return this.f21717a.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.f21717a + ')';
    }
}
