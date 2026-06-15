package com.startapp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e7 extends k7 {

    /* renamed from: a  reason: collision with root package name */
    public final List<m3> f21913a;

    public e7(LinkedList linkedList) {
        this.f21913a = linkedList;
    }

    @Override // com.startapp.k7
    public final boolean a(Object obj) {
        if (obj instanceof w3) {
            return this.f21913a.contains(((w3) obj).f23497j0.f22225a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e7.class != obj.getClass()) {
            return false;
        }
        return o9.a(this.f21913a, ((e7) obj).f21913a);
    }

    public final int hashCode() {
        Object[] objArr = {this.f21913a};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
