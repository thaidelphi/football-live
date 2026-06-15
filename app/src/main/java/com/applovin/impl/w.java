package com.applovin.impl;

import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Map f9504a;

    /* renamed from: b  reason: collision with root package name */
    private final List f9505b;

    public w(Map map, List list) {
        this.f9504a = map;
        this.f9505b = list;
    }

    protected boolean a(Object obj) {
        return obj instanceof w;
    }

    public List b() {
        return this.f9505b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (wVar.a(this)) {
                Map a10 = a();
                Map a11 = wVar.a();
                if (a10 != null ? a10.equals(a11) : a11 == null) {
                    List b10 = b();
                    List b11 = wVar.b();
                    return b10 != null ? b10.equals(b11) : b11 == null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Map a10 = a();
        int hashCode = a10 == null ? 43 : a10.hashCode();
        List b10 = b();
        return ((hashCode + 59) * 59) + (b10 != null ? b10.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.f9504a;
    }
}
