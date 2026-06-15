package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class qc {

    /* renamed from: a  reason: collision with root package name */
    public static final qc f19885a = new qc();

    /* renamed from: b  reason: collision with root package name */
    public static final String f19886b = "ext_";

    private qc() {
    }

    public final Map<String, String> a(Bundle bundle) {
        int k10;
        int c10;
        int a10;
        Map<String, String> f10;
        Set<String> keySet = bundle != null ? bundle.keySet() : null;
        if (keySet == null) {
            f10 = j8.j0.f();
            return f10;
        }
        k10 = j8.r.k(keySet, 10);
        c10 = j8.i0.c(k10);
        a10 = y8.i.a(c10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (String str : keySet) {
            String str2 = f19886b + str;
            Object obj = bundle.get(str);
            i8.n a11 = i8.s.a(str2, obj instanceof Iterable ? j8.y.A((Iterable) obj, ", ", null, null, 0, null, null, 62, null) : obj == null ? null : obj.toString());
            linkedHashMap.put(a11.c(), a11.d());
        }
        return linkedHashMap;
    }
}
