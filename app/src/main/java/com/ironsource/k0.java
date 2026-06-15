package com.ironsource;

import com.ironsource.q1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f17994a;

    /* renamed from: b  reason: collision with root package name */
    private final List<i0> f17995b = new CopyOnWriteArrayList();

    public k0(int i10) {
        this.f17994a = i10;
    }

    private final boolean a() {
        return c() && this.f17995b.size() >= this.f17994a;
    }

    private final boolean b() {
        return this.f17994a == 0;
    }

    private final boolean c() {
        return this.f17994a != -1;
    }

    public final void a(i0 i0Var) {
        if (b()) {
            return;
        }
        if (a()) {
            j8.v.o(this.f17995b);
        }
        if (i0Var == null) {
            i0Var = new i0(q1.a.NotPartOfWaterfall);
        }
        this.f17995b.add(i0Var);
    }

    public final String d() {
        int k10;
        String A;
        List<i0> list = this.f17995b;
        k10 = j8.r.k(list, 10);
        ArrayList arrayList = new ArrayList(k10);
        for (i0 i0Var : list) {
            arrayList.add(Integer.valueOf(i0Var.b().ordinal()));
        }
        A = j8.y.A(arrayList, ",", null, null, 0, null, null, 62, null);
        return A;
    }
}
