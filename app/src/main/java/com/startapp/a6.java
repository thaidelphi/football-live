package com.startapp;

import com.ironsource.b9;
import java.util.Arrays;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a6 {

    /* renamed from: a  reason: collision with root package name */
    public String f21760a;

    /* renamed from: b  reason: collision with root package name */
    public String f21761b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f21762c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a6.class != obj.getClass()) {
            return false;
        }
        return this.f21760a.equals(((a6) obj).f21760a);
    }

    public final int hashCode() {
        Object[] objArr = {this.f21760a};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final String toString() {
        return "NameValueObject [name=" + this.f21760a + ", value=" + this.f21761b + ", valueSet=" + this.f21762c + b9.i.f16698e;
    }
}
