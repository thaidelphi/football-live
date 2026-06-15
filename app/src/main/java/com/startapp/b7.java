package com.startapp;

import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b7 extends k7 {

    /* renamed from: a  reason: collision with root package name */
    public final int f21798a;

    public b7(int i10) {
        this.f21798a = i10;
    }

    @Override // com.startapp.k7
    public final boolean a(Object obj) {
        if (obj instanceof u0) {
            int i10 = ((u0) obj).Z;
            return (this.f21798a & i10) == i10;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b7.class == obj.getClass() && this.f21798a == ((b7) obj).f21798a;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f21798a)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
