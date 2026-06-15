package com.startapp;

import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d7 extends k7 {

    /* renamed from: a  reason: collision with root package name */
    public final m3 f21890a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21891b;

    public d7(m3 m3Var, String str) {
        this.f21890a = m3Var;
        this.f21891b = str;
    }

    @Override // com.startapp.k7
    public final boolean a(Object obj) {
        if (obj instanceof w3) {
            m3 m3Var = this.f21890a;
            l3 l3Var = ((w3) obj).f23497j0;
            if (m3Var == l3Var.f22225a) {
                String str = this.f21891b;
                return str == null || str.equals(l3Var.f22228d);
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d7.class != obj.getClass()) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return o9.a(this.f21890a, d7Var.f21890a) && o9.a(this.f21891b, d7Var.f21891b);
    }

    public final int hashCode() {
        Object[] objArr = {this.f21890a, this.f21891b};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
