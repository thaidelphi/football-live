package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.ug;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s6 {

    /* renamed from: a  reason: collision with root package name */
    private final a f8609a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f8610b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8611c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8612d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f8613e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return OTHER;
                }
                return ATP_NETWORK;
            }
            return TCF_VENDOR;
        }
    }

    public s6(JSONObject jSONObject, String str) {
        this.f8612d = str;
        this.f8609a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f8610b = JsonUtils.getInteger(jSONObject, ug.f21009x, null);
        this.f8611c = JsonUtils.getString(jSONObject, "name", null);
    }

    public void a(Boolean bool) {
        this.f8613e = bool;
    }

    public String b() {
        return this.f8612d;
    }

    public String c() {
        return this.f8611c;
    }

    public Integer d() {
        return this.f8610b;
    }

    public String e() {
        Boolean bool = this.f8613e;
        String valueOf = bool != null ? String.valueOf(bool) : m0.b().a(com.applovin.impl.sdk.j.m());
        return "\n" + this.f8612d + " - " + valueOf;
    }

    public a f() {
        return this.f8609a;
    }

    public Boolean a() {
        return this.f8613e;
    }
}
