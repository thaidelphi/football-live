package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k3 {

    /* renamed from: b  reason: collision with root package name */
    private static final Set f7390b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public static final k3 f7391c = a("ar");

    /* renamed from: d  reason: collision with root package name */
    public static final k3 f7392d = a("ttdasi_ms");

    /* renamed from: a  reason: collision with root package name */
    private String f7393a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        Object a(Object obj);
    }

    private k3(String str) {
        this.f7393a = str;
    }

    protected boolean a(Object obj) {
        return obj instanceof k3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k3) {
            k3 k3Var = (k3) obj;
            if (k3Var.a(this)) {
                String a10 = a();
                String a11 = k3Var.a();
                return a10 != null ? a10.equals(a11) : a11 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String a10 = a();
        return (a10 == null ? 43 : a10.hashCode()) + 59;
    }

    public String toString() {
        return this.f7393a;
    }

    public String a() {
        return this.f7393a;
    }

    private static k3 a(String str) {
        Set set = f7390b;
        if (!set.contains(str)) {
            set.add(str);
            return new k3(str);
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }
}
