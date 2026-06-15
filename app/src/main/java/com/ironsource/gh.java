package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class gh {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Object> f17571a = new HashMap<>();

    public gh a(String str, Object obj) {
        if (obj != null) {
            this.f17571a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }

    public HashMap<String, Object> a() {
        return this.f17571a;
    }
}
