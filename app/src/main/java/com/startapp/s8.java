package com.startapp;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s8 {

    /* renamed from: b  reason: collision with root package name */
    public static final s8 f22519b = new s8();

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f22520a;

    public s8() {
        this(new JSONObject());
    }

    public final void a(int i10, Object obj) {
        try {
            this.f22520a.put(String.valueOf(i10), obj);
        } catch (JSONException unused) {
        }
    }

    public s8(JSONObject jSONObject) {
        this.f22520a = jSONObject;
    }

    public final String a(int i10) {
        Object opt = this.f22520a.opt(String.valueOf(i10));
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }
}
