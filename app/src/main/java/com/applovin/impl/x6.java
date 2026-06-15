package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x6 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9612a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9613b;

    /* renamed from: c  reason: collision with root package name */
    private List f9614c;

    public x6(com.applovin.impl.sdk.j jVar) {
        this.f9612a = jVar;
        q4 q4Var = q4.J;
        this.f9613b = ((Boolean) jVar.a(q4Var, Boolean.FALSE)).booleanValue() || u.a(com.applovin.impl.sdk.j.m()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || jVar.x().M();
        jVar.c(q4Var);
    }

    private void e() {
        com.applovin.impl.sdk.i q10 = this.f9612a.q();
        if (this.f9613b) {
            q10.b(this.f9614c);
        } else {
            q10.a(this.f9614c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.f9614c;
    }

    public boolean c() {
        return this.f9613b;
    }

    public boolean d() {
        List list = this.f9614c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.f9614c == null) {
            return;
        }
        if (list == null || !list.equals(this.f9614c)) {
            this.f9614c = list;
            e();
        }
    }

    public void a() {
        this.f9612a.b(q4.J, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f9613b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.k x10 = this.f9612a.x();
        boolean M = x10.M();
        String a10 = x10.f().a();
        k.b C = x10.C();
        this.f9613b = M || JsonUtils.containsCaseInsensitiveString(a10, jSONArray) || JsonUtils.containsCaseInsensitiveString(C != null ? C.f8957a : null, jSONArray);
    }
}
