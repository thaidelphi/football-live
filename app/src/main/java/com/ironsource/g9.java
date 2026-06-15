package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class g9 {

    /* renamed from: a  reason: collision with root package name */
    private String f17547a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f17548b;

    /* renamed from: c  reason: collision with root package name */
    private String f17549c;

    /* renamed from: d  reason: collision with root package name */
    private String f17550d;

    public g9(String str) {
        this.f17547a = str;
    }

    public g9(String str, String str2, String str3) {
        this.f17547a = str;
        this.f17549c = str2;
        this.f17550d = str3;
    }

    public g9(String str, JSONObject jSONObject) {
        this.f17547a = str;
        this.f17548b = jSONObject;
    }

    public g9(String str, JSONObject jSONObject, String str2, String str3) {
        this.f17547a = str;
        this.f17548b = jSONObject;
        this.f17549c = str2;
        this.f17550d = str3;
    }

    public String a() {
        return this.f17550d;
    }

    public String b() {
        return this.f17547a;
    }

    public JSONObject c() {
        return this.f17548b;
    }

    public String d() {
        return this.f17549c;
    }
}
