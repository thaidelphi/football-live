package com.ironsource;

import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class qp implements d2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f19897a;

    public qp(String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        this.f19897a = placementName;
    }

    @Override // com.ironsource.d2
    public Map<String, Object> a(b2 b2Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", this.f19897a);
        return hashMap;
    }
}
