package com.startapp;

import android.content.Context;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z3 implements i2<l3, n3, q3, y3> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23660a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<b3> f23661b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<h7> f23662c;

    public z3(Context context, t4<b3> t4Var, t4<h7> t4Var2) {
        this.f23660a = context;
        this.f23661b = t4Var;
        this.f23662c = t4Var2;
    }

    @Override // com.startapp.i2
    public final y3 a(l3 l3Var, n3 n3Var, q3 q3Var) {
        l3 l3Var2 = l3Var;
        n3 n3Var2 = n3Var;
        q3 q3Var2 = q3Var;
        if (l3Var2 == null || n3Var2 == null) {
            return null;
        }
        if (m3.f22281k.equals(l3Var2.f22225a)) {
            return new a4(this.f23661b, this.f23662c, l3Var2, n3Var2, q3Var2);
        }
        return new x3(this.f23660a, l3Var2, n3Var2, q3Var2);
    }
}
