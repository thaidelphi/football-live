package com.ironsource;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ce {

    /* renamed from: b  reason: collision with root package name */
    public static final String f16885b = "userId";

    /* renamed from: c  reason: collision with root package name */
    public static final String f16886c = "appKey";

    /* renamed from: d  reason: collision with root package name */
    private static ce f16887d;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f16888a = new JSONObject();

    private ce() {
    }

    public static synchronized ce a() {
        ce ceVar;
        synchronized (ce.class) {
            if (f16887d == null) {
                f16887d = new ce();
            }
            ceVar = f16887d;
        }
        return ceVar;
    }

    public synchronized String a(String str) {
        return this.f16888a.optString(str);
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f16888a.put(str, obj);
        } catch (Exception e8) {
            o9.d().a(e8);
        }
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized JSONObject b() {
        return this.f16888a;
    }
}
