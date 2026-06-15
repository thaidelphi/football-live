package com.startapp;

import java.util.Comparator;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l4 implements Comparator<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final String f22236a;

    public l4(String str) {
        this.f22236a = str;
    }

    @Override // java.util.Comparator
    public final int compare(JSONObject jSONObject, JSONObject jSONObject2) {
        Object opt = jSONObject.opt(this.f22236a);
        Object opt2 = jSONObject2.opt(this.f22236a);
        if ((opt instanceof Comparable) && (opt2 instanceof Comparable)) {
            if (opt.getClass() == opt2.getClass()) {
                return ((Comparable) opt).compareTo(opt2);
            }
            if ((opt instanceof Number) && (opt2 instanceof Number)) {
                return Double.compare(((Number) opt).doubleValue(), ((Number) opt2).doubleValue());
            }
        }
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt2 == obj) {
            opt2 = null;
        }
        if (opt == null || opt2 == null) {
            if (opt != null) {
                return 1;
            }
            return opt2 != null ? -1 : 0;
        }
        return opt.toString().compareTo(opt2.toString());
    }
}
